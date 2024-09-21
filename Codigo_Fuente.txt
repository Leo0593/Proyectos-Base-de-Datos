package org.example;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.lt;
import com.mongodb.client.*;
import org.bson.Document;
import com.mongodb.client.model.Updates;
import com.mongodb.client.model.Filters;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);
        boolean fin = false;

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            do {
                int menu_principal = Menu_Principal();

                if (menu_principal == 1) {
                    int consultas = Menu_Consultas();

                    if (consultas == 1) {
                        consulta1();
                    } else if (consultas == 2) {
                        consulta2();
                    } else if (consultas == 3) {
                        consulta3();
                    } else if (consultas == 4) {
                        consulta4();
                    } else if (consultas == 5) {
                        consulta5();
                    } else if (consultas == 6) {
                        consulta6();
                    }
                } else if (menu_principal == 2) {
                    int insert = Menu_Actualizaciones();

                    if (insert == 1) {
                        actualizar1();
                    } else if (insert == 2) {
                        actualizar2();
                    } else if (insert == 3) {
                        actualizar3();
                    }
                } else if (menu_principal == 3) {
                    int busqueda = Menu_Busqueda();

                    if (busqueda == 1) {
                        busqueda1();
                    } else if (busqueda == 2) {
                        busqueda2();
                    } else if (busqueda == 3) {
                        busqueda3();
                    }else if (busqueda == 4) {
                        busqueda4();
                    } else if (busqueda == 5) {
                        busqueda5();
                    }

                } else if (menu_principal == 4) {
                    int eliminar = Menu_Eliminar();

                    if (eliminar == 1) {
                        eliminar1();
                    }else if (eliminar == 2) {
                        eliminar2();
                    }
                }
                System.out.println("DESEA CONTINUAR S/N");
                String opciones = reader.nextLine();
                char inicial = opciones.charAt(0);

                if(inicial == 'S'||inicial == 's') {
                    fin = false;
                }
                else if (inicial == 'N' || inicial == 'n'){
                    fin = true;
                }
            }while(!fin);
    }
}

    public static int Menu_Principal() {
        Scanner reader = new Scanner(System.in);
        int opciones = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENU PRINCIPAL");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) INFORMACION SOBRE LAS CONSULTAS");
        System.out.println("2) INFORMACION SOBRE LAS ACTUALIZACIONES");
        System.out.println("3) INFORMACION SOBRE LAS BUSQUEDAS DE TEXTO");
        System.out.println("4) INFORMACION SOBRE ELIMINAR");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                opciones = reader.nextInt();
                if (opciones >= 1 && opciones <= 4) {
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
    public static int Menu_Consultas() {
        Scanner reader = new Scanner(System.in);
        int consulta = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENU DE CONSULTAS");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) OBTENER TODOS LOS DOCUMENTOS");
        System.out.println("2) OBTENER DOCUMENTOS CUYO |write| ES IGUAL A |Quentin Tarantino|");
        System.out.println("3) OBTENER DOCUMENTOS CUYO |actors| INCLUYE A |Brad Pitt|");
        System.out.println("4) OBTENER DOCUMENTOS CUYO |franchise| ES IGUAL A |El Hobbit|");
        System.out.println("5) OBTENER TODAS LAS PELICULAS DE LOS AÑOS 90 ");
        System.out.println("6) OBTENER LAS PELICULAS ESTRENADAS ENTRE EL AÑO 2000 Y 2010");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                consulta = reader.nextInt();
                if (consulta >= 1 && consulta <= 6) {
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
        return consulta;
    }
    public static int Menu_Actualizaciones() {
        Scanner reader = new Scanner(System.in);
        int agregar = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENU DE ACTUALIZACIONES");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) AGREGAR UNA SINOPSIS A |The Hobbit: An Unexpected Journey|");
        System.out.println("2) AGREGAR UNA SINOPSIS A |The Hobbit: The Desolation of Smaug|");
        System.out.println("3) AGREGAR UN ACTOR A |Pulp Fiction|");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                agregar = reader.nextInt();
                if (agregar >= 1 && agregar <= 3) {
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
        return agregar;
    }
    public static int Menu_Busqueda() {
        Scanner reader = new Scanner(System.in);
        int buscar = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENU DE BUSQUEDA");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) ENCONTRAR LAS PELÍCULAS QUE HAY EN LA |sinopsi| CONTIENE LA PALABRA |Bilbo|");
        System.out.println("2) ENCONTRAR LAS PELÍCULAS QUE EN LA |sinopsi| CONTIENE LA PALABRA |Gandalf|");
        System.out.println("3) ENCONTRAR LAS PELÍCULAS QUE EN LA |sinopsi| CONTIENE LA PALABRA |Bilbo| Y NO LA PALABRA |Gandalf|");
        System.out.println("4) ENCONTRAR LAS PELÍCULAS QUE EN LA |sinopsi| CONTIENDAN LA PALABRA |dwarves| O |hobbit|");
        System.out.println("5) ENCONTRAR LAS PELÍCULAS QUE EN LA |sinopsi| CONTIENE LA PALABRA |gold| Y |dragon|");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                buscar = reader.nextInt();
                if (buscar >= 1 && buscar <= 5) {
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
        return buscar;
    }
    public static int Menu_Eliminar() {
        Scanner reader = new Scanner(System.in);
        int eliminar = 0;
        boolean fin = false;

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tBIENVENIDO AL MENU DE BUSQUEDA");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("1) ELIMINAR LA PELICULA |Pee Wee Herman's Big Adventure|");
        System.out.println("2) ELIMINAR LA PELICULA |Avatar|");
        System.out.print("CUAL ES TU ELECCION: ");
        do {
            if (reader.hasNextInt()) {
                eliminar = reader.nextInt();
                if (eliminar >= 1 && eliminar <= 2) {
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
        return eliminar;
    }

    //CONSULTAS//
    public static void consulta1() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable<Document> documento = collection.find();
            for (Document doc : documento) {
                System.out.println(doc.toJson());
            }
        }
    }
    public static void consulta2() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> write = collection.find(eq("writer", "Quentin Tarantino"));
            for (Document document : write) {
                System.out.println(document.toJson());
            }
        }
    }
    public static void consulta3() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> actors = collection.find(eq("actors", "Brad Pitt"));
            for (Document document : actors) {
                System.out.println(document.toJson());
            }
        }
    }
    public static void consulta4() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> franchise = collection.find(eq("franchise", "The Hobbit"));
            for (Document document : franchise) {
                System.out.println(document.toJson());
            }
        }
    }
    public static void consulta5() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> noventa = collection.find(and(gt("year",1900),lt("year",2000)));
            for (Document document : noventa) {
                System.out.println(document.toJson());
            }
        }
    }
    public static void consulta6() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> estreno = collection.find(and(gt("year",2000),lt("year",2010)));
            for (Document document : estreno) {
                System.out.println(document.toJson());
            }
        }
    }

    //ACTUALIZAR//
    public static void actualizar1() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            String titulo = "The Hobbit: An Unexpected Journey";
            String opinion;
            System.out.println("ESCRIBE TU RESEÑA SOBRE |The Hobbit: An Unexpected Journey|");
            opinion = reader.nextLine();
            collection.updateOne(Filters.eq("title", titulo),Updates.set("synopsis", opinion));
            System.out.println("Sinopsis actualizada correctamente para " + titulo);
        }

    }
    public static void actualizar2() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            String titulo = "The Hobbit: The Desolation of Smaug";
            String opinion;
            System.out.println("ESCRIBE TU RESEÑA SOBRE |The Hobbit: The Desolation of Smaug|");
            opinion = reader.nextLine();
            collection.updateOne(Filters.eq("title", titulo),Updates.set("synopsis", opinion));
            System.out.println("Sinopsis actualizada correctamente para " + titulo);
        }

    }
    public static void actualizar3() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            Scanner reader = new Scanner(System.in);
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            String titulo = "Pulp Fiction";
            String actor;
            System.out.println("AGREGA UN ACTOR A LA PELICULA DEL |Pulp Fiction|");
            actor = reader.nextLine();
            collection.updateOne(Filters.eq("title", titulo),Updates.push("actors", actor));
            System.out.println("Actor agregado correctamente para " + titulo);
        }

    }

    //BUSQUEDA//
    public static void busqueda1() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> synopsis = collection.find(Filters.regex("synopsis", "Bilbo","i"));
            for (Document resultado : synopsis) {
                System.out.println(resultado.toJson());
            }
        }

    }
    public static void busqueda2() {
    String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

    try (MongoClient mongoClient = MongoClients.create(uri))
    {
        MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
        MongoCollection<Document> collection = database.getCollection("Practic");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        FindIterable <Document> synopsis = collection.find(Filters.regex("synopsis", "Gandalf","i"));
        for (Document resultado : synopsis) {
            System.out.println(resultado.toJson());
        }
    }

}
    public static void busqueda3() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> synopsis = collection.find(Filters.and(
                    Filters.regex("synopsis", "Bilbo", "i"),
                    Filters.not(Filters.regex("synopsis", "Gandalf", "i"))
            ));
            for (Document resultado : synopsis) {
                System.out.println(resultado.toJson());
            }
        }

    }
    public static void busqueda4() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> synopsis = collection.find(Filters.or(
                    Filters.regex("synopsis", "dwarves", "i"),
                    Filters.regex("synopsis", "hobbit", "i")));
            for (Document resultado : synopsis) {
                System.out.println(resultado.toJson());
            }
        }

    }
    public static void busqueda5() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            FindIterable <Document> synopsis = collection.find(Filters.and(
                    Filters.regex("synopsis", "gold", "i"),
                    Filters.regex("synopsis", "dragon", "i")));
            for (Document resultado : synopsis) {
                System.out.println(resultado.toJson());
            }
        }

    }

    //ELIMINAR//
    public static void eliminar1() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            String titulo = "Pee Wee Herman's Big Adventure";
            collection.deleteOne(Filters.eq("title", titulo));
            System.out.println("Película eliminada con éxito.");
        }

    }
    public static void eliminar2() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Practica_MongoDB_1");
            MongoCollection<Document> collection = database.getCollection("Practic");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            String titulo = "Avatar";
            collection.deleteOne(Filters.eq("title", titulo));
            System.out.println("Película eliminada con éxito.");
        }

    }

}