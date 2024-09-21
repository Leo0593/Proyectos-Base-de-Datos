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
//
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
//
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;


public class servidor {

    public static void main(String[] args) {
        Random rand = new Random();
        int numeroTicket = rand.nextInt(900000) + 100000;
        Date fechaActual = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaActual = formatoHora.format(fechaActual);

        ServerSocket servidor = null;
        Socket sc = null;
        int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;
        String eleccionesJson;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("SERVIDOR INICIADO");

            while(true)
            {
                sc = servidor.accept();
                System.out.println("SU PEDIDO ES:");
                in =new DataInputStream(sc.getInputStream());
                out =new DataOutputStream(sc.getOutputStream());

                int numeroMesa = in.readInt();
                System.out.println("Número de mesa recibido: " + numeroMesa);


                eleccionesJson = in.readUTF();
                Type listType = new TypeToken<List<String>>(){}.getType();
                List<String> elecciones = new Gson().fromJson(eleccionesJson, listType);
                for (String eleccion : elecciones) {
                    System.out.println(eleccion);
                }

                String mensaje = in.readUTF();//recepta el total del pedido
                System.out.println("el total es: "+mensaje);


                String ticket = "--------------------------------\n" +
                        "     BIENVENIDO A LEO&IBRA\n" +
                        "--------------------------------\n" +
                        "       TICKET DE PEDIDO #" + numeroTicket + "\n" +
                        "--------------------------------\n" +
                        "Fecha y hora de impresion: " + horaActual + "\n" +
                        "--------------------------------\n" +
                        "Mesa: " + numeroMesa + "\n" +
                        "--------------------------------\n" +
                        "Elecciones:\n";

// Agregar cada elección en una nueva línea

                for (String eleccion : elecciones) {
                    eleccion = eleccion.replace("á", "\u00E1");
                    eleccion = eleccion.replace("é", "\u00E9");
                    eleccion = eleccion.replace("í", "\u00ED");
                    eleccion = eleccion.replace("ó", "\u00F3");
                    eleccion = eleccion.replace("ú", "\u00FA");
                    eleccion = eleccion.replace("ñ", "\u00F1");

                    ticket += eleccion + "\n"; //Imprime todos los pedidos
                }

                ticket += "--------------------------------\n";
                ticket += String.format("Total: $%.2f\n", Double.parseDouble(mensaje));
                ticket += "--------------------------------\n";

// Crear el documento para imprimir
                DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
                Doc doc = new SimpleDoc(ticket.getBytes(), flavor, null);

// Configurar la impresión
                PrintService service = PrintServiceLookup.lookupDefaultPrintService();
                DocPrintJob job = service.createPrintJob();
                PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
                attrs.add(new Copies(1)); // Número de copias

// Imprimir el documento
                try {
                    job.print(doc, attrs);
                } catch (PrintException e) {
                    e.printStackTrace();
                }

                out.writeUTF("SU PEDIDO A SIDO RECIBIDO");
                System.out.println("**************************************");


                sc.close();
            }

        }
        catch (IOException ex)
        {
            Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

