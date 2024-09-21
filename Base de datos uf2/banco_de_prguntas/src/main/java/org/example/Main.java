package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/juego_de_preguntas";
    static final String USER = "root";
    static final String PASS = "";


    //Preguntas i respuestas 1
    static final String PR1 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 1";
    static final String RES1 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 1";
    static final String RES2 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 2";
    static final String RES3 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 3";
    static final String RES4 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 4";
    static final String RES5 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 5";


    //Preguntas i respuestas 2
    static final String PR2 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 2";
    static final String RES6 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 6";
    static final String RES7 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 7";
    static final String RES8 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 8";
    static final String RES9 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 9";
    static final String RES10 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 10";


    //Preguntas i respuestas 3
    static final String PR3 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 3";
    static final String RES11 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 11";
    static final String RES12 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 12";
    static final String RES13 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 13";
    static final String RES14 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 14";
    static final String RES15 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 15";


    //Preguntas i respuestas 4
    static final String PR4 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 4";
    static final String RES16 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 16";
    static final String RES17 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 17";
    static final String RES18 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 18";
    static final String RES19 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 19";
    static final String RES20 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 20";


    //Preguntas i respuestas 5
    static final String PR5 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 5";
    static final String RES21 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 21";
    static final String RES22 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 22";
    static final String RES23 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 23";
    static final String RES24 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 24";
    static final String RES25 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 25";


    //Preguntas i respuestas 6
    static final String PR6 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 6";
    static final String RES26 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 26";
    static final String RES27 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 27";
    static final String RES28 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 28";
    static final String RES29 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 29";
    static final String RES30 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 30";


    //Preguntas i respuestas 7
    static final String PR7 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 7";
    static final String RES31 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 31";
    static final String RES32 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 32";
    static final String RES33 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 33";
    static final String RES34 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 34";
    static final String RES35 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 35";


    //Preguntas i respuestas 8
    static final String PR8 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 8";
    static final String RES36 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 36";
    static final String RES37 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 37";
    static final String RES38 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 38";
    static final String RES39 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 39";
    static final String RES40 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 40";


    //Preguntas i respuestas 9
    static final String PR9 = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 9";
    static final String RES41 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 41";
    static final String RES42 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 42";
    static final String RES43 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 43";
    static final String RES44 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 44";
    static final String RES45 = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = 45";








    public static void main(String... param) {

        try
        {


            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement conexion = conn.createStatement();
            Scanner reader = new Scanner(System.in);


            int cont = 0;
            int boton;
            int categoria = 0;
            int nivel = 0;
            char respuesta;
            String nombre = inicio ();
            String apellido = null;
            String email = null;


            do
            {
                System.out.println("1) Harry Potter");
                System.out.println("2) Videojuegos");
                System.out.println("3) Deportes");
                System.out.println("CUAL ES LA OPCION QUE ESCOGES:");
                categoria = reader.nextInt();
                System.out.println("\n Acontinuacion seleciona la dificultad que te gustaria participar");
                System.out.println("1) FACIL");
                System.out.println("2) NORMAL");
                System.out.println("3) DIFICIL");
                System.out.println("CUAL ES LA OPCION QUE ESCOGES:");
                nivel = reader.nextInt();
                String usu = "INSERT INTO usuario (ID_Categoria, ID_Nivel) VALUES ('"+categoria+"','"+nivel+"') ";
                conexion.executeUpdate(usu);


                //Pregtuntas i respuestas 1
                if ((categoria == 1) && ( nivel == 1))
                {


                    ResultSet pr1 = conexion.executeQuery(PR1);
                    while (pr1.next()) {


                        System.out.println("1: " + pr1.getString("Pregunta_1"));
                    }
                    ResultSet res1 = conexion.executeQuery(RES1);
                    while (res1.next()) {


                        System.out.println("a: " + res1.getString("Respuesta_1"));
                        System.out.println("b: " + res1.getString("Respuesta_2"));
                        System.out.println("c: " + res1.getString("Respuesta_3"));
                        System.out.println("d: " + res1.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r1 = arl.charAt(0);
                        if (r1 == 'a' || r1 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr2 = conexion.executeQuery(PR1);
                    while (pr2.next()) {


                        System.out.println("2: " + pr2.getString("Pregunta_2"));
                    }
                    ResultSet res2 = conexion.executeQuery(RES2);
                    while (res2.next()) {


                        System.out.println("a: " + res2.getString("Respuesta_1"));
                        System.out.println("b: " + res2.getString("Respuesta_2"));
                        System.out.println("c: " + res2.getString("Respuesta_3"));
                        System.out.println("d: " + res2.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r2 = arl.charAt(0);
                        if (r2 == 'a' || r2 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr3 = conexion.executeQuery(PR1);
                    while (pr3.next()) {


                        System.out.println("3: " + pr3.getString("Pregunta_3"));
                    }
                    ResultSet res3 = conexion.executeQuery(RES3);
                    while (res3.next()) {


                        System.out.println("a: " + res3.getString("Respuesta_1"));
                        System.out.println("b: " + res3.getString("Respuesta_2"));
                        System.out.println("c: " + res3.getString("Respuesta_3"));
                        System.out.println("d: " + res3.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r3 = arl.charAt(0);
                        if (r3 == 'b' || r3 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr4 = conexion.executeQuery(PR1);
                    while (pr4.next()) {


                        System.out.println("4: " + pr4.getString("Pregunta_4"));
                    }
                    ResultSet res4 = conexion.executeQuery(RES4);
                    while (res4.next()) {


                        System.out.println("a: " + res4.getString("Respuesta_1"));
                        System.out.println("b: " + res4.getString("Respuesta_2"));
                        System.out.println("c: " + res4.getString("Respuesta_3"));
                        System.out.println("d: " + res4.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r4 = arl.charAt(0);
                        if (r4 == 'c' || r4 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr5 = conexion.executeQuery(PR1);
                    while (pr5.next()) {


                        System.out.println("5: " + pr5.getString("Pregunta_5"));
                    }
                    ResultSet res5 = conexion.executeQuery(RES5);
                    while (res5.next()) {


                        System.out.println("a: " + res5.getString("Respuesta_1"));
                        System.out.println("b: " + res5.getString("Respuesta_2"));
                        System.out.println("c: " + res5.getString("Respuesta_3"));
                        System.out.println("d: " + res5.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r5 = arl.charAt(0);
                        if (r5 == 'b' || r5 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 2
                if ((categoria == 1) && ( nivel == 2))
                {


                    ResultSet pr6 = conexion.executeQuery(PR2);
                    while (pr6.next()) {


                        System.out.println("1: " + pr6.getString("Pregunta_1"));
                    }
                    ResultSet res6 = conexion.executeQuery(RES6);
                    while (res6.next()) {


                        System.out.println("a: " + res6.getString("Respuesta_1"));
                        System.out.println("b: " + res6.getString("Respuesta_2"));
                        System.out.println("c: " + res6.getString("Respuesta_3"));
                        System.out.println("d: " + res6.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r6 = arl.charAt(0);
                        if (r6 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr7 = conexion.executeQuery(PR2);
                    while (pr7.next()) {


                        System.out.println("2: " + pr7.getString("Pregunta_2"));
                    }
                    ResultSet res7 = conexion.executeQuery(RES7);
                    while (res7.next()) {


                        System.out.println("a: " + res7.getString("Respuesta_1"));
                        System.out.println("b: " + res7.getString("Respuesta_2"));
                        System.out.println("c: " + res7.getString("Respuesta_3"));
                        System.out.println("d: " + res7.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r7 = arl.charAt(0);
                        if (r7 == 'c' || r7 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr8 = conexion.executeQuery(PR2);
                    while (pr8.next()) {


                        System.out.println("3: " + pr8.getString("Pregunta_3"));
                    }
                    ResultSet res8 = conexion.executeQuery(RES8);
                    while (res8.next()) {


                        System.out.println("a: " + res8.getString("Respuesta_1"));
                        System.out.println("b: " + res8.getString("Respuesta_2"));
                        System.out.println("c: " + res8.getString("Respuesta_3"));
                        System.out.println("d: " + res8.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r8 = arl.charAt(0);
                        if (r8 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr9 = conexion.executeQuery(PR2);
                    while (pr9.next()) {


                        System.out.println("4: " + pr9.getString("Pregunta_4"));
                    }
                    ResultSet res9 = conexion.executeQuery(RES9);
                    while (res9.next()) {


                        System.out.println("a: " + res9.getString("Respuesta_1"));
                        System.out.println("b: " + res9.getString("Respuesta_2"));
                        System.out.println("c: " + res9.getString("Respuesta_3"));
                        System.out.println("d: " + res9.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r9 = arl.charAt(0);
                        if (r9 == 'a')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr10 = conexion.executeQuery(PR2);
                    while (pr10.next()) {


                        System.out.println("5: " + pr10.getString("Pregunta_5"));
                    }
                    ResultSet res10 = conexion.executeQuery(RES10);
                    while (res10.next()) {


                        System.out.println("a: " + res10.getString("Respuesta_1"));
                        System.out.println("b: " + res10.getString("Respuesta_2"));
                        System.out.println("c: " + res10.getString("Respuesta_3"));
                        System.out.println("d: " + res10.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r10 = arl.charAt(0);
                        if (r10 == 'a' || r10 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 3
                if ((categoria == 1) && ( nivel == 3))
                {


                    ResultSet pr11 = conexion.executeQuery(PR3);
                    while (pr11.next()) {


                        System.out.println("1: " + pr11.getString("Pregunta_1"));
                    }
                    ResultSet res11 = conexion.executeQuery(RES11);
                    while (res11.next()) {


                        System.out.println("a: " + res11.getString("Respuesta_1"));
                        System.out.println("b: " + res11.getString("Respuesta_2"));
                        System.out.println("c: " + res11.getString("Respuesta_3"));
                        System.out.println("d: " + res11.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r11 = arl.charAt(0);
                        if (r11 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr12 = conexion.executeQuery(PR3);
                    while (pr12.next()) {


                        System.out.println("2: " + pr12.getString("Pregunta_2"));
                    }
                    ResultSet res12 = conexion.executeQuery(RES12);
                    while (res12.next()) {


                        System.out.println("a: " + res12.getString("Respuesta_1"));
                        System.out.println("b: " + res12.getString("Respuesta_2"));
                        System.out.println("c: " + res12.getString("Respuesta_3"));
                        System.out.println("d: " + res12.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r12 = arl.charAt(0);
                        if (r12 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr13 = conexion.executeQuery(PR3);
                    while (pr13.next()) {


                        System.out.println("3: " + pr13.getString("Pregunta_3"));
                    }
                    ResultSet res13 = conexion.executeQuery(RES13);
                    while (res13.next()) {


                        System.out.println("a: " + res13.getString("Respuesta_1"));
                        System.out.println("b: " + res13.getString("Respuesta_2"));
                        System.out.println("c: " + res13.getString("Respuesta_3"));
                        System.out.println("d: " + res13.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r13 = arl.charAt(0);
                        if (r13 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr14 = conexion.executeQuery(PR3);
                    while (pr14.next()) {


                        System.out.println("4: " + pr14.getString("Pregunta_4"));
                    }
                    ResultSet res14 = conexion.executeQuery(RES14);
                    while (res14.next()) {


                        System.out.println("a: " + res14.getString("Respuesta_1"));
                        System.out.println("b: " + res14.getString("Respuesta_2"));
                        System.out.println("c: " + res14.getString("Respuesta_3"));
                        System.out.println("d: " + res14.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r14 = arl.charAt(0);
                        if (r14 == 'a')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr15 = conexion.executeQuery(PR3);
                    while (pr15.next()) {


                        System.out.println("5: " + pr15.getString("Pregunta_5"));
                    }
                    ResultSet res15 = conexion.executeQuery(RES15);
                    while (res15.next()) {


                        System.out.println("a: " + res15.getString("Respuesta_1"));
                        System.out.println("b: " + res15.getString("Respuesta_2"));
                        System.out.println("c: " + res15.getString("Respuesta_3"));
                        System.out.println("d: " + res15.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r15 = arl.charAt(0);
                        if (r15 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 4
                if ((categoria == 2) && ( nivel == 1))
                {


                    ResultSet pr16 = conexion.executeQuery(PR4);
                    while (pr16.next()) {


                        System.out.println("1: " + pr16.getString("Pregunta_1"));
                    }
                    ResultSet res16 = conexion.executeQuery(RES16);
                    while (res16.next()) {


                        System.out.println("a: " + res16.getString("Respuesta_1"));
                        System.out.println("b: " + res16.getString("Respuesta_2"));
                        System.out.println("c: " + res16.getString("Respuesta_3"));
                        System.out.println("d: " + res16.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r16 = arl.charAt(0);
                        if (r16 == 'a' || r16 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr17 = conexion.executeQuery(PR4);
                    while (pr17.next()) {


                        System.out.println("2: " + pr17.getString("Pregunta_2"));
                    }
                    ResultSet res17 = conexion.executeQuery(RES17);
                    while (res17.next()) {


                        System.out.println("a: " + res17.getString("Respuesta_1"));
                        System.out.println("b: " + res17.getString("Respuesta_2"));
                        System.out.println("c: " + res17.getString("Respuesta_3"));
                        System.out.println("d: " + res17.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r17 = arl.charAt(0);
                        if (r17 == 'a' || r17 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr18 = conexion.executeQuery(PR4);
                    while (pr18.next()) {


                        System.out.println("3: " + pr18.getString("Pregunta_3"));
                    }
                    ResultSet res18 = conexion.executeQuery(RES17);
                    while (res18.next()) {


                        System.out.println("a: " + res18.getString("Respuesta_1"));
                        System.out.println("b: " + res18.getString("Respuesta_2"));
                        System.out.println("c: " + res18.getString("Respuesta_3"));
                        System.out.println("d: " + res18.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r18 = arl.charAt(0);
                        if (r18 == 'b' || r18 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr19 = conexion.executeQuery(PR4);
                    while (pr19.next()) {


                        System.out.println("4: " + pr19.getString("Pregunta_4"));
                    }
                    ResultSet res19 = conexion.executeQuery(RES19);
                    while (res19.next()) {


                        System.out.println("a: " + res19.getString("Respuesta_1"));
                        System.out.println("b: " + res19.getString("Respuesta_2"));
                        System.out.println("c: " + res19.getString("Respuesta_3"));
                        System.out.println("d: " + res19.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r19 = arl.charAt(0);
                        if (r19 == 'b' || r19 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr20 = conexion.executeQuery(PR4);
                    while (pr20.next()) {


                        System.out.println("5: " + pr20.getString("Pregunta_5"));
                    }
                    ResultSet res20 = conexion.executeQuery(RES20);
                    while (res20.next()) {


                        System.out.println("a: " + res20.getString("Respuesta_1"));
                        System.out.println("b: " + res20.getString("Respuesta_2"));
                        System.out.println("c: " + res20.getString("Respuesta_3"));
                        System.out.println("d: " + res20.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r20 = arl.charAt(0);
                        if (r20 == 'a' || r20 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 5
                if ((categoria == 2) && ( nivel == 2))
                {


                    ResultSet pr21 = conexion.executeQuery(PR5);
                    while (pr21.next()) {


                        System.out.println("1: " + pr21.getString("Pregunta_1"));
                    }
                    ResultSet res21 = conexion.executeQuery(RES21);
                    while (res21.next()) {


                        System.out.println("a: " + res21.getString("Respuesta_1"));
                        System.out.println("b: " + res21.getString("Respuesta_2"));
                        System.out.println("c: " + res21.getString("Respuesta_3"));
                        System.out.println("d: " + res21.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r21 = arl.charAt(0);
                        if (r21 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr22 = conexion.executeQuery(PR5);
                    while (pr22.next()) {


                        System.out.println("2: " + pr22.getString("Pregunta_2"));
                    }
                    ResultSet res22 = conexion.executeQuery(RES22);
                    while (res22.next()) {


                        System.out.println("a: " + res22.getString("Respuesta_1"));
                        System.out.println("b: " + res22.getString("Respuesta_2"));
                        System.out.println("c: " + res22.getString("Respuesta_3"));
                        System.out.println("d: " + res22.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r22 = arl.charAt(0);
                        if (r22 == 'b' || r22 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr23 = conexion.executeQuery(PR5);
                    while (pr23.next()) {


                        System.out.println("3: " + pr23.getString("Pregunta_3"));
                    }
                    ResultSet res23 = conexion.executeQuery(RES23);
                    while (res23.next()) {


                        System.out.println("a: " + res23.getString("Respuesta_1"));
                        System.out.println("b: " + res23.getString("Respuesta_2"));
                        System.out.println("c: " + res23.getString("Respuesta_3"));
                        System.out.println("d: " + res23.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r23 = arl.charAt(0);
                        if (r23 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr24 = conexion.executeQuery(PR5);
                    while (pr24.next()) {


                        System.out.println("4: " + pr24.getString("Pregunta_4"));
                    }
                    ResultSet res24 = conexion.executeQuery(RES24);
                    while (res24.next()) {


                        System.out.println("a: " + res24.getString("Respuesta_1"));
                        System.out.println("b: " + res24.getString("Respuesta_2"));
                        System.out.println("c: " + res24.getString("Respuesta_3"));
                        System.out.println("d: " + res24.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r24 = arl.charAt(0);
                        if (r24 == 'c' || r24 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr25 = conexion.executeQuery(PR5);
                    while (pr25.next()) {


                        System.out.println("5: " + pr25.getString("Pregunta_5"));
                    }
                    ResultSet res25 = conexion.executeQuery(RES25);
                    while (res25.next()) {


                        System.out.println("a: " + res25.getString("Respuesta_1"));
                        System.out.println("b: " + res25.getString("Respuesta_2"));
                        System.out.println("c: " + res25.getString("Respuesta_3"));
                        System.out.println("d: " + res25.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r25 = arl.charAt(0);
                        if (r25 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 6
                if ((categoria == 2) && ( nivel == 3))
                {


                    ResultSet pr26 = conexion.executeQuery(PR6);
                    while (pr26.next()) {


                        System.out.println("1: " + pr26.getString("Pregunta_1"));
                    }
                    ResultSet res26 = conexion.executeQuery(RES26);
                    while (res26.next()) {


                        System.out.println("a: " + res26.getString("Respuesta_1"));
                        System.out.println("b: " + res26.getString("Respuesta_2"));
                        System.out.println("c: " + res26.getString("Respuesta_3"));
                        System.out.println("d: " + res26.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r26 = arl.charAt(0);
                        if (r26 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr27 = conexion.executeQuery(PR6);
                    while (pr27.next()) {


                        System.out.println("2: " + pr27.getString("Pregunta_2"));
                    }
                    ResultSet res27 = conexion.executeQuery(RES27);
                    while (res27.next()) {


                        System.out.println("a: " + res27.getString("Respuesta_1"));
                        System.out.println("b: " + res27.getString("Respuesta_2"));
                        System.out.println("c: " + res27.getString("Respuesta_3"));
                        System.out.println("d: " + res27.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r27 = arl.charAt(0);
                        if (r27 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr28 = conexion.executeQuery(PR6);
                    while (pr28.next()) {


                        System.out.println("3: " + pr28.getString("Pregunta_3"));
                    }
                    ResultSet res28 = conexion.executeQuery(RES28);
                    while (res28.next()) {


                        System.out.println("a: " + res28.getString("Respuesta_1"));
                        System.out.println("b: " + res28.getString("Respuesta_2"));
                        System.out.println("c: " + res28.getString("Respuesta_3"));
                        System.out.println("d: " + res28.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r28 = arl.charAt(0);
                        if (r28 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr29 = conexion.executeQuery(PR6);
                    while (pr29.next()) {


                        System.out.println("4: " + pr29.getString("Pregunta_4"));
                    }
                    ResultSet res29 = conexion.executeQuery(RES29);
                    while (res29.next()) {


                        System.out.println("a: " + res29.getString("Respuesta_1"));
                        System.out.println("b: " + res29.getString("Respuesta_2"));
                        System.out.println("c: " + res29.getString("Respuesta_3"));
                        System.out.println("d: " + res29.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r29 = arl.charAt(0);
                        if (r29 == 'a')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr30 = conexion.executeQuery(PR6);
                    while (pr30.next()) {


                        System.out.println("5: " + pr30.getString("Pregunta_5"));
                    }
                    ResultSet res30 = conexion.executeQuery(RES30);
                    while (res30.next()) {


                        System.out.println("a: " + res30.getString("Respuesta_1"));
                        System.out.println("b: " + res30.getString("Respuesta_2"));
                        System.out.println("c: " + res30.getString("Respuesta_3"));
                        System.out.println("d: " + res30.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r30 = arl.charAt(0);
                        if (r30 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 7
                if ((categoria == 3) && ( nivel == 1))
                {


                    ResultSet pr31 = conexion.executeQuery(PR7);
                    while (pr31.next()) {


                        System.out.println("1: " + pr31.getString("Pregunta_1"));
                    }
                    ResultSet res31 = conexion.executeQuery(RES16);
                    while (res31.next()) {


                        System.out.println("a: " + res31.getString("Respuesta_1"));
                        System.out.println("b: " + res31.getString("Respuesta_2"));
                        System.out.println("c: " + res31.getString("Respuesta_3"));
                        System.out.println("d: " + res31.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r31 = arl.charAt(0);
                        if (r31 == 'a' || r31 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr32 = conexion.executeQuery(PR7);
                    while (pr32.next()) {


                        System.out.println("2: " + pr32.getString("Pregunta_2"));
                    }
                    ResultSet res32 = conexion.executeQuery(RES32);
                    while (res32.next()) {


                        System.out.println("a: " + res32.getString("Respuesta_1"));
                        System.out.println("b: " + res32.getString("Respuesta_2"));
                        System.out.println("c: " + res32.getString("Respuesta_3"));
                        System.out.println("d: " + res32.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r32 = arl.charAt(0);
                        if (r32 == 'b' || r32 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr33 = conexion.executeQuery(PR7);
                    while (pr33.next()) {


                        System.out.println("3: " + pr33.getString("Pregunta_3"));
                    }
                    ResultSet res33 = conexion.executeQuery(RES33);
                    while (res33.next()) {


                        System.out.println("a: " + res33.getString("Respuesta_1"));
                        System.out.println("b: " + res33.getString("Respuesta_2"));
                        System.out.println("c: " + res33.getString("Respuesta_3"));
                        System.out.println("d: " + res33.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r33 = arl.charAt(0);
                        if (r33 == 'a' || r33 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr34 = conexion.executeQuery(PR7);
                    while (pr34.next()) {


                        System.out.println("4: " + pr34.getString("Pregunta_4"));
                    }
                    ResultSet res34 = conexion.executeQuery(RES34);
                    while (res34.next()) {


                        System.out.println("a: " + res34.getString("Respuesta_1"));
                        System.out.println("b: " + res34.getString("Respuesta_2"));
                        System.out.println("c: " + res34.getString("Respuesta_3"));
                        System.out.println("d: " + res34.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r34 = arl.charAt(0);
                        if (r34 == 'b' || r34 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr35 = conexion.executeQuery(PR7);
                    while (pr35.next()) {


                        System.out.println("5: " + pr35.getString("Pregunta_5"));
                    }
                    ResultSet res35 = conexion.executeQuery(RES35);
                    while (res35.next()) {


                        System.out.println("a: " + res35.getString("Respuesta_1"));
                        System.out.println("b: " + res35.getString("Respuesta_2"));
                        System.out.println("c: " + res35.getString("Respuesta_3"));
                        System.out.println("d: " + res35.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r35 = arl.charAt(0);
                        if (r35 == 'a' || r35 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 8
                if ((categoria == 3) && ( nivel == 2))
                {


                    ResultSet pr36 = conexion.executeQuery(PR8);
                    while (pr36.next()) {


                        System.out.println("1: " + pr36.getString("Pregunta_1"));
                    }
                    ResultSet res36 = conexion.executeQuery(RES21);
                    while (res36.next()) {


                        System.out.println("a: " + res36.getString("Respuesta_1"));
                        System.out.println("b: " + res36.getString("Respuesta_2"));
                        System.out.println("c: " + res36.getString("Respuesta_3"));
                        System.out.println("d: " + res36.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r36 = arl.charAt(0);
                        if (r36 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr37 = conexion.executeQuery(PR8);
                    while (pr37.next()) {


                        System.out.println("2: " + pr37.getString("Pregunta_2"));
                    }
                    ResultSet res37 = conexion.executeQuery(RES37);
                    while (res37.next()) {


                        System.out.println("a: " + res37.getString("Respuesta_1"));
                        System.out.println("b: " + res37.getString("Respuesta_2"));
                        System.out.println("c: " + res37.getString("Respuesta_3"));
                        System.out.println("d: " + res37.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r37 = arl.charAt(0);
                        if (r37 == 'a' || r37 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr38 = conexion.executeQuery(PR8);
                    while (pr38.next()) {


                        System.out.println("3: " + pr38.getString("Pregunta_3"));
                    }
                    ResultSet res38 = conexion.executeQuery(RES38);
                    while (res38.next()) {


                        System.out.println("a: " + res38.getString("Respuesta_1"));
                        System.out.println("b: " + res38.getString("Respuesta_2"));
                        System.out.println("c: " + res38.getString("Respuesta_3"));
                        System.out.println("d: " + res38.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r38 = arl.charAt(0);
                        if (r38 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr39 = conexion.executeQuery(PR8);
                    while (pr39.next()) {


                        System.out.println("4: " + pr39.getString("Pregunta_4"));
                    }
                    ResultSet res39 = conexion.executeQuery(RES24);
                    while (res39.next()) {


                        System.out.println("a: " + res39.getString("Respuesta_1"));
                        System.out.println("b: " + res39.getString("Respuesta_2"));
                        System.out.println("c: " + res39.getString("Respuesta_3"));
                        System.out.println("d: " + res39.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r39 = arl.charAt(0);
                        if (r39 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr40 = conexion.executeQuery(PR8);
                    while (pr40.next()) {


                        System.out.println("5: " + pr40.getString("Pregunta_5"));
                    }
                    ResultSet res40 = conexion.executeQuery(RES40);
                    while (res40.next()) {


                        System.out.println("a: " + res40.getString("Respuesta_1"));
                        System.out.println("b: " + res40.getString("Respuesta_2"));
                        System.out.println("c: " + res40.getString("Respuesta_3"));
                        System.out.println("d: " + res40.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r40 = arl.charAt(0);
                        if (r40 == 'a' || r40 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                //Pregtuntas i respuestas 9
                if ((categoria == 3) && ( nivel == 3))
                {


                    ResultSet pr41 = conexion.executeQuery(PR9);
                    while (pr41.next()) {


                        System.out.println("1: " + pr41.getString("Pregunta_1"));
                    }
                    ResultSet res41 = conexion.executeQuery(RES41);
                    while (res41.next()) {


                        System.out.println("a: " + res41.getString("Respuesta_1"));
                        System.out.println("b: " + res41.getString("Respuesta_2"));
                        System.out.println("c: " + res41.getString("Respuesta_3"));
                        System.out.println("d: " + res41.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r41 = arl.charAt(0);
                        if (r41 == 'b')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr42 = conexion.executeQuery(PR9);
                    while (pr42.next()) {


                        System.out.println("2: " + pr42.getString("Pregunta_2"));
                    }
                    ResultSet res42 = conexion.executeQuery(RES27);
                    while (res42.next()) {


                        System.out.println("a: " + res42.getString("Respuesta_1"));
                        System.out.println("b: " + res42.getString("Respuesta_2"));
                        System.out.println("c: " + res42.getString("Respuesta_3"));
                        System.out.println("d: " + res42.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r42 = arl.charAt(0);
                        if (r42 == 'a')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }
                    }


                    ResultSet pr43 = conexion.executeQuery(PR9);
                    while (pr43.next()) {


                        System.out.println("3: " + pr43.getString("Pregunta_3"));
                    }
                    ResultSet res43 = conexion.executeQuery(RES28);
                    while (res43.next()) {


                        System.out.println("a: " + res43.getString("Respuesta_1"));
                        System.out.println("b: " + res43.getString("Respuesta_2"));
                        System.out.println("c: " + res43.getString("Respuesta_3"));
                        System.out.println("d: " + res43.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r43 = arl.charAt(0);
                        if (r43 == 'a')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr44 = conexion.executeQuery(PR9);
                    while (pr44.next()) {


                        System.out.println("4: " + pr44.getString("Pregunta_4"));
                    }
                    ResultSet res44 = conexion.executeQuery(RES44);
                    while (res44.next()) {


                        System.out.println("a: " + res44.getString("Respuesta_1"));
                        System.out.println("b: " + res44.getString("Respuesta_2"));
                        System.out.println("c: " + res44.getString("Respuesta_3"));
                        System.out.println("d: " + res44.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r44 = arl.charAt(0);
                        if (r44 == 'd')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    ResultSet pr45 = conexion.executeQuery(PR9);
                    while (pr45.next()) {


                        System.out.println("5: " + pr45.getString("Pregunta_5"));
                    }
                    ResultSet res45 = conexion.executeQuery(RES45);
                    while (res45.next()) {


                        System.out.println("a: " + res45.getString("Respuesta_1"));
                        System.out.println("b: " + res45.getString("Respuesta_2"));
                        System.out.println("c: " + res45.getString("Respuesta_3"));
                        System.out.println("d: " + res45.getString("Respuesta_4"));
                        System.out.println("Cual es tu respuesta: ");
                        String arl = reader.next();
                        char r45 = arl.charAt(0);
                        if (r45 == 'c')
                        {
                            cont++;
                        }
                        else
                        {
                            cont--;
                        }


                    }
                    if(cont > 0)
                    {
                        System.out.println("Tu puntuacion es: " + cont);
                        String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+categoria+"', '"+nivel+"','"+nombre+"')";
                        conexion.executeUpdate(ranking);
                    }
                    else
                    {
                        System.out.println("Tu puntuacion es 0");
                    }


                }


                System.out.println("Desea jugar otra partida S/N");
                respuesta = reader.next().charAt(0);
                if(respuesta == 'N' || respuesta == 'n')
                {
                    System.out.print("Gracias por jugar");
                }

                cont = 0;

            } while (respuesta == 'S' || respuesta == 's');


            reader.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static String inicio () throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        String vacio = " ";

        System.out.println("Deseas iniciar sesión o registrarte:");
        System.out.println("1) Iniciar sesión");
        System.out.println("2) Registrarte");
        int boton = reader.nextInt();
        reader.nextLine();

        if(boton == 1)
        {
            String nombre = Sesion();
            return nombre;
        }
        else if (boton == 2)
        {
            String nombre = regsitro();
            return nombre;
        }
        return vacio;
    }

    public static String regsitro() throws SQLException
    {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement conexion = conn.createStatement();
            Scanner reader = new Scanner(System.in);

            System.out.println("\t VAMOS A CREAR TU USUARIO \n");
            System.out.println("INGRESA TU NOMBRE: ");
            String nombre = reader.nextLine();
            System.out.println("INGRESA TU APELLIDO: ");
            String apellido = reader.nextLine();
            System.out.println("INGRESA TU CORREO ELECTRONICO: ");
            String email = reader.nextLine();

            String usu = "INSERT INTO usuario (Nombre, Apellido, Correo) VALUES('" + nombre + "','" + apellido + "','" + email + "') ";
            conexion.executeUpdate(usu);

            return nombre;
    }

    public static String Sesion()throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE: ");
        String nombre = reader.nextLine();
        System.out.println("INGRESA TU APELLIDO: ");
        String apellido = reader.nextLine();
        String buscarUsuario = "SELECT * FROM usuario WHERE Nombre = '" + nombre + "' AND Apellido = '" + apellido + "'";
        ResultSet resultado = conexion.executeQuery(buscarUsuario);

        if (resultado.next())
        {
            System.out.println("Iniciaste sesión como " + nombre);
        }
        else
        {
            System.out.println("NO SE ENCUTRA TU NOMBRE REGISTRATE:") ;
            regsitro();
        }
        return nombre;
    }



}
