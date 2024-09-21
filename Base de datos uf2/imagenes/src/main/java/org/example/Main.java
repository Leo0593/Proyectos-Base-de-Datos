package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/juego_de_preguntas";
    static final String USER = "root";
    static final String PASS = "";

    public static int nivel9() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT arte_ascii FROM imagenes_ascii WHERE ID_Preguntas = 1" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+40) ;
            ResultSet pr = conexion.executeQuery(preguntaQuery);
            while (pr.next()) {
                System.out.println("*********************************************************");
                System.out.println(i + ": " + pr.getString("Pregunta_" + i));
            }
            ResultSet res = conexion.executeQuery(respuestaQuery);
            while (res.next()) {
                System.out.println("a: " + res.getString("Respuesta_1"));
                System.out.println("b: " + res.getString("Respuesta_2"));
                System.out.println("c: " + res.getString("Respuesta_3"));
                System.out.println("d: " + res.getString("Respuesta_4"));
                System.out.println("Cual es tu respuesta: ");
                String arl = reader.next();
                System.out.println("*********************************************************");
                char respuesta = arl.charAt(0);
                if (((i+40) == 41 && (respuesta == 'b')) ||
                        ((i+40) == 42 && (respuesta == 'a')) ||
                        ((i+40) == 43 && (respuesta == 'a')) ||
                        ((i+40) == 44 && (respuesta == 'd')) ||
                        ((i+40) == 45 && (respuesta == 'c'))) {
                    cont++;
                }
            }
        }
        return cont;
    }

}