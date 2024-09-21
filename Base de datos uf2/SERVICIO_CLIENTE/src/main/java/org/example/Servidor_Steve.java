package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;

public class Servidor_Steve {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket socket = null;
        int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;
        String eleccionesJson;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("SERVIDOR INICIADO STEVE");

            while (true) {
                socket = servidor.accept();
                System.out.println("SU PEDIDO ES:");
                in =new DataInputStream(socket.getInputStream());
                out =new DataOutputStream(socket.getOutputStream());

                // Recibir nombre y fecha del cliente
                String nombre = in.readUTF();
                String fecha = in.readUTF();
                System.out.println("Nombre del cliente: " + nombre);
                System.out.println("Fecha del pedido: " + fecha);

                // Recibir elecciones del cliente
                eleccionesJson = in.readUTF();
                Type listType = new TypeToken<List<String>>(){}.getType();
                List<String> elecciones = new Gson().fromJson(eleccionesJson, listType);

                System.out.println("Elecciones del cliente:");
                for (String eleccion : elecciones) {
                    System.out.println(eleccion);
                }

                String mensaje = in.readUTF();//recepta el total del pedido
                System.out.println("El total del pedido es: " + mensaje);


                String ticket = "--------------------------------\n" +
                        "           TICKET DE PEDIDO      \n" +
                        "--------------------------------\n" +
                        "Elecciones:\n";
                // Agregar cada elección en una nueva línea

                for (String eleccion : elecciones) {
                    ticket += eleccion + "\n";
                }

                ticket += "--------------------------------\n";
                ticket += String.format("Total: $%.2f\n", Double.parseDouble(mensaje));
                ticket += "--------------------------------\n";

                System.out.println("Ticket de pedido:");
                System.out.println(ticket);

                // Configurar la impresión del ticket
                DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
                Doc doc = new SimpleDoc(ticket.getBytes(), flavor, null);
                PrintService service = PrintServiceLookup.lookupDefaultPrintService();
                DocPrintJob job = service.createPrintJob();
                PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
                attrs.add(new Copies(1));

                // Imprimir el documento
                try {
                    job.print(doc, attrs);
                } catch (PrintException e) {
                    e.printStackTrace();
                }

                out.writeUTF("SU PEDIDO A SIDO RECIBIDO");
                System.out.println("******");

                socket.close();
            }

        }
        catch (IOException ex)
        {
            Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
