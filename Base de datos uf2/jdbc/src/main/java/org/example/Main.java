package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/practica_jdbc";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String... param) throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Conectado baby mua");
        Statement conex= conn.createStatement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix l'opcio qur vulguis:");
        System.out.println("a. AGREGAR UN NUEVO BOMBERO");
        System.out.println("b. MOSTRAR LOS DATOS DE LOS ALIMENTOS");
        System.out.println("c. ELIMINAR UN BOMBERO");
        System.out.println("d. MODIFICAR LOS DATOS DE UN BOMBERO");
        System.out.println("e. SALIR");
        System.out.println();
        System.out.print("Introdueix una lletra: ");
        String lletra = sc.next();
        sc.nextLine();


            if (lletra.equals("a")) {

                System.out.println("Ingresa el id del bombero");
                String id = sc.nextLine();
                System.out.println("Ingresa el id del parqueadero 1, 2, 3");
                String parque_id = sc.nextLine();
                System.out.println("Ingresa el apellido del bombero");
                String apellidos = sc.nextLine();
                System.out.println("Ingresa el nombre del bombero");
                String nombre = sc.nextLine();
                System.out.println("Ingresa el dni del bombero");
                String dni = sc.nextLine();
                System.out.println("Ingresa la fecha de nacimiento del bombero");
                String fecha_nacimiento = sc.nextLine();
                System.out.println("Ingresa la direccion del bombero");
                String direccion = sc.nextLine();
                System.out.println("Ingresa el telefono del bombero");
                String telefono = sc.nextLine();
                System.out.println("Ingresa la edad del bombero");
                String edad = sc.nextLine();
                String sql = "INSERT INTO `bombero`(`id`, `parque_id`, `apellidos`, `nombre`, `dni`, `fecha_nacimiento`, `direccion`, `telefono`, `edad`) " +
                        "VALUES (id+, +parque_id+, +apellidos+, +nombre+, +dni+, +fecha_nacimiento+, +direccion+, +telefono+, +edad+)";
                conex.executeUpdate(sql);

            } else if (lletra.equals("b")) {

                String sql = "SELECT id FROM bombero";
                ResultSet resul = conex.executeQuery(sql);

                while (resul.next())
                {
                    int id = resul.getInt("id");
                    System.out.println("Codi_Alimento: " +id);
                    System.out.println();
                }
            } else if (lletra.equals("c")) {

            } else if (lletra.equals("d")) {

            } else if (lletra.equals("e")) {
                System.out.println("Adeu");
            } else {
                System.out.println("Introduix una lletra valida");
            }

        }
    }
