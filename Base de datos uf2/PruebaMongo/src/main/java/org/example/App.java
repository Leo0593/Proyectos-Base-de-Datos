package org.example;


import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;
import java.util.Scanner;
import static com.mongodb.client.model.Sorts.*;
import java.util.Arrays;
import java.util.List;
import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class App {
    public static void main(String[] args) {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);
        System.out.println("BIENVENIDO AL MENU PRINCIPLA");
        System.out.println("1) Ingresar Datos predeterminados");
        System.out.println("2) Ingresar Datos predeterminados");
        System.out.println("3) Ingresar Datos predeterminados");
        System.out.println("4) Averigua el libro por su descripcion");
        System.out.println("5) Averigua el libro por su pageCount");
        System.out.println("6) Averigua los 10 libros con mas paginas");
        System.out.println("7) Actualizar Datos");
        System.out.println("8) Actualizar palabra Android");
        System.out.println("9) Borrar datos con 0 en pagecount");
        System.out.println("10) Eliminar libros antes del 2010");
        System.out.print("AL ES TU ELECCION:");

        int eleccion = reader.nextInt();

        if (eleccion == 1) {
            pregunta1();
        } else if (eleccion == 2) {
            pregunta2();
        }else if (eleccion == 3) {
            pregunta3();
        }else if (eleccion == 4) {
            pregunta4();
        }else if (eleccion == 5) {
            pregunta5();
        }else if (eleccion == 6) {
            pregunta6();
        }
        else if (eleccion == 7) {
            pregunta7();
        }else if (eleccion == 8) {
            pregunta8();
        }else if (eleccion == 9) {
            pregunta9();
        }else if (eleccion == 10) {
            pregunta10();
        }


    }

    public static void pregunta1() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("mi_base_de_datos");
            MongoCollection<Document> collection = database.getCollection("mi_coleccion");
            List<String> charactersList = Arrays.asList("Denna", "Ambrose Jakis", "Kvothe", "Devan Lochees", "Bast");

            Document nuevoDocumento = new Document("Published", "March 27, 2007")
                    .append("Title", "The Name of the Wind")
                    .append("Author", "Patrick Rothfuss")
                    .append("Series", "The Kingkileer Choronicle")
                    .append("Followed", "The Wise Man's Fear")
                    .append("Pages", "662 pp (hardcaver)")
                    .append("Characters", charactersList);


            collection.insertOne(nuevoDocumento);

            System.out.println("Documento insertado correctamente.");
        }
    }


    public static void pregunta2() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("mi_base_de_datos");
            MongoCollection<Document> collection = database.getCollection("mi_coleccion");
            List<String> charactersList = Arrays.asList("Adventure fiction", "Dark Fantasy", "Occult Fiction");

            Document nuevoDocumento = new Document("Author", "Gge Akutami")
                    .append("Title", "Jjjutsu Kaisen")
                    .append("Episodio", 26)
                    .append("English publisher", "NA Viz Media")
                    .append("eNGLIS MAGAZINE", "NA wEEKLY sHONEN jUMP")
                    .append("Studio", "MAOOA")
                    .append("Genres", charactersList);
            collection.insertOne(nuevoDocumento);

            System.out.println("Documento insertado correctamente.");
        }
    }


    public static void pregunta3() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("mi_base_de_datos");
            MongoCollection<Document> collection = database.getCollection("mi_coleccion");
            List<String> charactersList = Arrays.asList("Winston Smith", "Big Brother", "Julia","Emmaneulk Goldstein","O´Brien","Syne");

            Document nuevoDocumento = new Document("Published", "June 8, 1949")
                    .append("Title", 1984)
                    .append("Author", "Geoger Orwell")
                    .append("Cover artist", "Michael Kennar")
                    .append("Pages", 328)
                    .append("Awards", "NPR Top 100 Science Fiction and Fantasy Books")
                    .append("Characters", charactersList);
            collection.insertOne(nuevoDocumento);

            System.out.println("Documento insertado correctamente.");
        }
    }


    public static void pregunta4() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            System.out.println("Ingrese la expresión regular para buscar en la descripción:");
            String regex = reader.nextLine();
            FindIterable<Document> title = collection.find(or(regex("shortDescription", regex, "i"), regex("longDescription", regex, "i")));

            System.out.println("Resultados de la búsqueda:");
            for (Document document : title) {
                System.out.println(document.toJson());
            }
        }
    }

    public static void pregunta5() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            FindIterable<Document> libros = collection.find(and(gt("pageCount", 300), lt("pageCount", 500)));
            libros.sort(ascending("title"));
            System.out.println("Libros con pageCount entre 300 y 500, ordenados por título:");

            for (Document document : libros) {
                System.out.println(document.toJson());
            }
        }
    }

    public static void pregunta6() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            FindIterable<Document> documentos = collection.find().sort(new Document("Pages", -1)).limit(10);
            System.out.println("Primeros 10 documentos con más páginas:");
            for (Document documento : documentos) {
                System.out.println(documento.toJson());
            }
        }
    }

    public static void pregunta7() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            collection.updateMany(eq("status", "MEAP"), set("status", "Publish"));
            System.out.println("Documentos actualizados correctamente.");
        }
    }

    public static void pregunta8() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            collection.updateMany(and(regex("shortDescription", "android"), regex("longDescription", "android")), addToSet("categoria", "Android"));
            System.out.println("Libros actualizados correctamente.");
        }
    }

    public static void pregunta9() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            collection.deleteMany(new Document("pageCount", 0));
            System.out.println("Documentos eliminados correctamente.");
        }
    }

    public static void pregunta10() {
        String uri = "mongodb+srv://administrador:pFh46blAjbaH1aAw@cluster0.x4jmrz0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        Scanner reader = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examen");
            MongoCollection<Document> collection = database.getCollection("books");
            collection.deleteMany(new Document("fechaPublicacion", new Document("$lt", "2010-01-01")));
            System.out.println("Libros eliminados correctamente.");
        }
    }
}

