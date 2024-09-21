package org.example;

import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.*;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;

public class App
{
    public static void main( String[] args ) {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        double total = 0;
        List<String> eleccionesRealizadas = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(uri))

        {
            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> hamburguesasCollection = database.getCollection("Hamburguesas");
            MongoCollection<Document> bebidasCollection = database.getCollection("Bebidas");
            MongoCollection<Document> complementosCollection = database.getCollection("Complementos");
            MongoCollection<Document> postrescollection = database.getCollection("Postres");
            MongoCollection<Document> comboscollection = database.getCollection("McCombos");

            boolean fin;
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Ingresa el numero de tu mesa: ");
            int mesa = reader.nextInt();

            do{
                int seleccion = Menu_Principal();

                if (seleccion == 1) {
                    int opciones = Menu_Hamburguesas();
                    FindIterable<Document> id = hamburguesasCollection.find(eq("id", opciones));
                    for (Document document : id) {
                        String nombre = document.getString("nombre");
                        double precio = document.getDouble("precio");
                        eleccionesRealizadas.add(nombre + " " + precio);
                        total += precio;
                    }
                }else  if (seleccion == 2) {
                    int opciones = Menu_Bebidas();
                    FindIterable<Document> id = bebidasCollection.find(eq("id", opciones));
                    for (Document document : id) {
                        String nombre = document.getString("nombre");
                        double precio = document.getDouble("precio");
                        eleccionesRealizadas.add(nombre + " " + precio);
                        total += precio;
                    }
                }else  if (seleccion == 3) {
                    int opciones = Menu_Postres();
                    FindIterable<Document> id = postrescollection.find(eq("id", opciones));
                    for (Document document : id) {
                        String nombre = document.getString("nombre");
                        double precio = document.getDouble("precio");
                        eleccionesRealizadas.add(nombre + " " + precio);
                        total += precio;
                    }
                }else  if (seleccion == 4) {
                    int opciones = Menu_Complementos();
                    FindIterable<Document> id = complementosCollection.find(eq("id", opciones));
                    for (Document document : id) {
                        String nombre = document.getString("nombre");
                        double precio = document.getDouble("precio");
                        eleccionesRealizadas.add(nombre + " " + precio);
                        total += precio;
                    }
                }
                else  if (seleccion == 5) {
                    int opciones = Menu_Combos();
                    FindIterable<Document> id = comboscollection.find(eq("id", opciones));
                    for (Document document : id) {
                        String nombre = document.getString("nombre");
                        double precio = document.getDouble("precio");
                        eleccionesRealizadas.add(nombre + " " + precio);
                        total += precio;
                    }
                }
                fin = Agregar();

            }while(!fin);

            String HOST = "192.0.1.200";
            int PUERTO = 5000;
            DataInputStream in;
            DataOutputStream out;

            try {
                Socket sc = new Socket(HOST, PUERTO);

                in =new DataInputStream(sc.getInputStream());
                out =new DataOutputStream(sc.getOutputStream());

                Gson gson = new Gson();

                out.writeInt(mesa);

                String eleccionesJson = gson.toJson(eleccionesRealizadas);
                out.writeUTF(eleccionesJson);

                out.writeUTF(String.valueOf(total)); //envia el total del pedido

                String mensaje = in.readUTF();
                System.out.println(mensaje);
                sc.close();

            }catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public static int Menu_Principal() {
        Scanner reader = new Scanner(System.in);
        int opciones = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ PRINCIPAL");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) MENÚ HAMBURGUESAS");
        System.out.println("2) MENÚ BEBIDAS");
        System.out.println("3) MENÚ POSTRES");
        System.out.println("4) MENÚ COMPLEMENTOS");
        System.out.println("5) MENÚ PACKS COMBOS");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                opciones = reader.nextInt();
                if (opciones >= 1 && opciones <= 5) {
                    fin = true;
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                }
            } else {
                System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                reader.next();
            }
        } while (!fin);

        return opciones;
    }
    public static int Menu_Hamburguesas() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            int opciones = 0;
            boolean fin = false;
            int id = 0;
            double precio;
            String nombre;

            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> collection = database.getCollection("Hamburguesas");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ DE HAMBURGUESAS");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            FindIterable<Document> documento = collection.find();

            for (Document doc : documento)
            {
                id = doc.getInteger("id");
                nombre = doc.getString("nombre");
                precio = doc.getDouble("precio");

                System.out.println(id+")" + nombre);
                System.out.println("Precio:" + precio);
                System.out.println("--------------------------------");
            }

            System.out.print("CUAL ES TU ELEECION DE HAMBURGUESA:");
            do {
                if (reader.hasNextInt()) {
                    opciones = reader.nextInt();
                    if (opciones >= 1 && opciones <= id) {
                        fin = true;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------");
                        System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    }
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    reader.next();
                }
            } while (!fin);
            System.out.println("--------------------------------");
            System.out.println("TU PEDIDO HA SIDO AGREDADA AL CARRITO");

            return opciones;
        }
    }
    public static int Menu_Bebidas() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            int opciones = 0;
            boolean fin = false;
            int id = 0;
            double precio;
            String nombre;

            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> collection = database.getCollection("Bebidas");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ DE BEBIDAS");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            FindIterable<Document> documento = collection.find();

            for (Document doc : documento)
            {
                id = doc.getInteger("id");
                nombre = doc.getString("nombre");
                precio = doc.getDouble("precio");

                System.out.println(id+")" + nombre);
                System.out.println("Precio:" + precio);
                System.out.println("--------------------------------");
            }

            System.out.print("CUAL ES TU ELEECION DE BEBIDA:");
            do {
                if (reader.hasNextInt()) {
                    opciones = reader.nextInt();
                    if (opciones >= 1 && opciones <= id) {
                        fin = true;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------");
                        System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    }
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    reader.next();
                }
            } while (!fin);
            System.out.println("--------------------------------");
            System.out.println("TU PEDIDO HA SIDO AGREDADA AL CARRITO");
            return opciones;
        }
    }
    public static int Menu_Postres() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            int opciones = 0;
            boolean fin = false;
            int id = 0;
            double precio;
            String nombre;

            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> collection = database.getCollection("Postres");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ DE POSTRES");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            FindIterable<Document> documento = collection.find();

            for (Document doc : documento)
            {
                id = doc.getInteger("id");
                nombre = doc.getString("nombre");
                precio = doc.getDouble("precio");

                System.out.println(id+")" + nombre);
                System.out.println("Precio:" + precio);
                System.out.println("--------------------------------");
            }

            System.out.print("CUAL ES TU ELEECION DE BEBIDA:");
            do {
                if (reader.hasNextInt()) {
                    opciones = reader.nextInt();
                    if (opciones >= 1 && opciones <= id) {
                        fin = true;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------");
                        System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    }
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    reader.next();
                }
            } while (!fin);
            System.out.println("--------------------------------");
            System.out.println("TU PEDIDO HA SIDO AGREDADA AL CARRITO");
            return opciones;
        }
    }
    public static int Menu_Complementos() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            int opciones = 0;
            boolean fin = false;
            int id = 0;
            double precio;
            String nombre;

            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> collection = database.getCollection("Complementos");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ DE COMPLEMENTOS");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            FindIterable<Document> documento = collection.find();

            for (Document doc : documento)
            {
                id = doc.getInteger("id");
                nombre = doc.getString("nombre");
                precio = doc.getDouble("precio");

                System.out.println(id+")" + nombre);
                System.out.println("Precio:" + precio);
                System.out.println("--------------------------------");
            }

            System.out.print("CUAL ES TU ELEECION DE COMPLEMENTO:");
            do {
                if (reader.hasNextInt()) {
                    opciones = reader.nextInt();
                    if (opciones >= 1 && opciones <= id) {
                        fin = true;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------");
                        System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    }
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    reader.next();
                }
            } while (!fin);
            System.out.println("--------------------------------");
            System.out.println("TU PEDIDO HA SIDO AGREDADA AL CARRITO");
            return opciones;
        }
    }
    public static int Menu_Combos() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            int opciones = 0;
            boolean fin = false;
            int id = 0;
            double precio;
            String nombre;
            List<String> productos = new ArrayList<>();

            MongoDatabase database = mongoClient.getDatabase("PRACTICA-UF4");
            MongoCollection<Document> collection = database.getCollection("McCombos");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENÚ DE COMPLEMENTOS");
            System.out.println("-------------------------------------------------------------------------------------------------------");

            FindIterable<Document> documento = collection.find();

            for (Document doc : documento) {
                id = doc.getInteger("id");
                nombre = doc.getString("nombre");
                precio = doc.getDouble("precio");

                List<Document> productosDoc = (List<Document>) doc.get("productos");
                productos.clear();
                for (Document productoDoc : productosDoc) {
                    String nombreProducto = productoDoc.getString("nombre");
                    productos.add(nombreProducto);
                }

                System.out.println(id + ") " + nombre);
                System.out.println("   Precio: " + precio);
                System.out.println("   Productos: ");
                for (String producto : productos) {
                    System.out.println("      - " + producto);
                }
                System.out.println("--------------------------------");
            }

            System.out.print("CUAL ES TU ELEECION DE COMPLEMENTO:");
            do {
                if (reader.hasNextInt()) {
                    opciones = reader.nextInt();
                    if (opciones >= 1 && opciones <= id) {
                        fin = true;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------");
                        System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    }
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.print("ERROR, VUELVA A INGRESAR LA OPCION: ");
                    reader.next();
                }
            } while (!fin);
            System.out.println("--------------------------------");
            System.out.println("TU PEDIDO HA SIDO AGREDADA AL CARRITO");
            return opciones;
        }
    }
    public static boolean Agregar(){
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        boolean cierre = false;
        do {
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("DESEA AGREGAR ALGO MAS AL MENU S/N");
            String eleccion = reader.nextLine();
            if (eleccion.equalsIgnoreCase("N") || eleccion.equalsIgnoreCase("n")) {
                fin = true;
                cierre = true;
            } else if (eleccion.equalsIgnoreCase("S") || eleccion.equalsIgnoreCase("s")) {
                cierre = true;
            } else {
                System.out.println("-------------------------------------------------------------------------------------------------------");
                System.out.println("CARACTER INVALIDO, VOLVER A INGRESAR");
            }
        }while(!cierre);

        return fin;
    }

}