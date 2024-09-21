package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_Juego_De_Preguntas";
    static final String USER = "freedb_holala";
    static final String PASS = "pVK7T!uc$rVJrn&";

    public static void main(String... param) {

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement conexion = conn.createStatement();
            Scanner reader = new Scanner(System.in);

            boolean inicio = false;
            char letra;
            String nombreUsuario = " ";

            System.out.println("**************************************************");
            System.out.println("********** BIENVENIDO A ¿ERES UN GENIO? **********");
            System.out.println("**************************************************");

            System.out.println("\t\tPANEL DE INICIO");
            System.out.println("1) INICIAR SESION");
            System.out.println("2) REGISTRARTE");

            while (!inicio) {
            System.out.print("CUAL ES TU ELECCION: ");
            int boton = reader.nextInt();
                if (boton == 1) {
                    nombreUsuario = sesion();
                    inicio = true;
                } else if (boton == 2) {
                    usuario_nuevo();
                    inicio = true;
                } else {
                    System.out.println("\t OPCION INVALIDA");
                }
            }

            do{
                int categoria = categoria();
                int nivel = nivel();

                if(categoria == 1 && nivel == 1) {
                    int cont = nivel1();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 1 && nivel == 2) {
                    int cont = nivel2();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 1 && nivel == 3) {
                    int cont = nivel3();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 2 && nivel == 1) {
                    int cont = nivel4();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 2 && nivel == 2) {
                    int cont = nivel5();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 2 && nivel == 3) {
                    int cont = nivel6();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 3 && nivel == 1) {
                    int cont = nivel7();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 3 && nivel == 2) {
                    int cont = nivel8();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 3 && nivel == 3) {
                    int cont = nivel9();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 4 && nivel == 1) {
                    int cont = nivel10();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 4 && nivel == 2) {
                    int cont = nivel11();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }else if(categoria == 4 && nivel == 3) {
                    int cont = nivel12();
                    String ranking = "INSERT INTO ranking (`Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES ('"+cont+"','"+nivel+"', '"+categoria+"','"+nombreUsuario+"')";
                    conexion.executeUpdate(ranking);
                }
                System.out.println("QUIERE VOLVER A JUGAR S/N:");
                letra = reader.next().charAt(0);
            }while(letra == 's' || letra == 'S' );

            System.out.println("\n" +
                    "░██████╗░██████╗░░█████╗░░█████╗░██╗░█████╗░░██████╗  ██████╗░░█████╗░██████╗░\n" +
                    "██╔════╝░██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██╗\n" +
                    "██║░░██╗░██████╔╝███████║██║░░╚═╝██║███████║╚█████╗░  ██████╔╝██║░░██║██████╔╝\n" +
                    "██║░░╚██╗██╔══██╗██╔══██║██║░░██╗██║██╔══██║░╚═══██╗  ██╔═══╝░██║░░██║██╔══██╗\n" +
                    "╚██████╔╝██║░░██║██║░░██║╚█████╔╝██║██║░░██║██████╔╝  ██║░░░░░╚█████╔╝██║░░██║\n" +
                    "░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝\n" +
                    "\n" +
                    "░░░░░██╗██╗░░░██╗░██████╗░░█████╗░██████╗░  ░█████╗░░█████╗░███╗░░██╗\n" +
                    "░░░░░██║██║░░░██║██╔════╝░██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗████╗░██║\n" +
                    "░░░░░██║██║░░░██║██║░░██╗░███████║██████╔╝  ██║░░╚═╝██║░░██║██╔██╗██║\n" +
                    "██╗░░██║██║░░░██║██║░░╚██╗██╔══██║██╔══██╗  ██║░░██╗██║░░██║██║╚████║\n" +
                    "╚█████╔╝╚██████╔╝╚██████╔╝██║░░██║██║░░██║  ╚█████╔╝╚█████╔╝██║░╚███║\n" +
                    "░╚════╝░░╚═════╝░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝  ░╚════╝░░╚════╝░╚═╝░░╚══╝\n" +
                    "\n" +
                    "███╗░░██╗░█████╗░░██████╗░█████╗░████████╗██████╗░░█████╗░░██████╗\n" +
                    "████╗░██║██╔══██╗██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██╔════╝\n" +
                    "██╔██╗██║██║░░██║╚█████╗░██║░░██║░░░██║░░░██████╔╝██║░░██║╚█████╗░\n" +
                    "██║╚████║██║░░██║░╚═══██╗██║░░██║░░░██║░░░██╔══██╗██║░░██║░╚═══██╗\n" +
                    "██║░╚███║╚█████╔╝██████╔╝╚█████╔╝░░░██║░░░██║░░██║╚█████╔╝██████╔╝\n" +
                    "╚═╝░░╚══╝░╚════╝░╚═════╝░░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░╚═════╝░");
        }
            catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void usuario_nuevo() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("\t\t\tVAMOS A CREAR TU USUARIO");
        System.out.println("INGRESA TU NOMBRE: ");
        String nombre = reader.nextLine();
        System.out.println("INGRESA TU APELLIDO: ");
        String apellido = reader.nextLine();
        System.out.println("INGRESA TU CORREO ELECTRONICO: ");
        String email = reader.nextLine();
        String usuario = "INSERT INTO usuario (Nombre, Apellido, Correo) VALUES('" + nombre + "','" + apellido + "','" + email + "') ";
        conexion.executeUpdate(usuario);
        System.out.println("\t INGRESO EXITOSO");
        System.out.println("************************************************");
        sesion();
    }
    public static String sesion() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("\t\t\t\tINICIAR SESION");
        System.out.println("INGRESA TU NOMBRE: ");
        String nombre = reader.nextLine();
        System.out.println("INGRESA TU APELLIDO: ");
        String apellido = reader.nextLine();
        System.out.println("************************************************");
        String buscarUsuario = "SELECT * FROM usuario WHERE Nombre = '" + nombre + "' AND Apellido = '" + apellido + "'";
        ResultSet resultado = conexion.executeQuery(buscarUsuario);
        if (resultado.next()) {
            System.out.println("INICIASTE SESION CON: " + nombre);
        } else {
            System.out.println("NO SE ENCUTRA TU NOMBRE, PROCEDEREMOS A REGISTRATE:") ;
            usuario_nuevo();
        }
        return nombre;
    }
    public static int categoria() throws SQLException
    {
        Scanner reader = new Scanner(System.in);
        boolean numero = false;
        int cate = 0;
        System.out.println("************************************************");
        System.out.println("\t ESCOJE LA CATEGORIA QUE TE GUSTARIA JUGAR") ;
        System.out.println("1) Harry Potter");
        System.out.println("2) Videojuegos");
        System.out.println("3) Deportes");
        System.out.println("4) Figuras");
        do
        {
            System.out.println("SELECCIONA TU CATEGORIA:");
            if (reader.hasNextInt()) {
                cate = reader.nextInt();
                if (cate >= 1 && cate <= 4){
                    numero = true;
                }else
                {
                    System.out.println("*****************");
                    System.out.println("OPCION INCORRECTA");
                    System.out.println("*****************");
                }
            }else{
                System.out.println("*****************");
                System.out.println("CARACTER INVALIDO");
                System.out.println("*****************");
                reader.next();
            }
        } while (!numero);
        System.out.println("************************************************");
        return cate;
    }
    public static int nivel() throws SQLException
    {
        int Nivel = 0;
        boolean num = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("\t ESCOJE EL NIVEL QUE TE GUSTARIA INTENTAR");
        System.out.println("1) FACIL");
        System.out.println("2) NORMAL");
        System.out.println("3) DIFICIL");
        do
        {
            System.out.println("SELECCIONA TU NIVEL:");
            if (reader.hasNextInt()) {
                Nivel = reader.nextInt();
                if (Nivel >= 1 && Nivel <= 3){
                    num = true;
                }else {
                    System.out.println("*****************");
                    System.out.println("OPCION INCORRECTA");
                    System.out.println("*****************");
                }
            }else{
                System.out.println("*****************");
                System.out.println("CARACTER INVALIDO");
                System.out.println("*****************");
                reader.next();
            }
        } while (!num);
        System.out.println("************************************************");
        return Nivel;
    }
    public static int nivel1() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 1" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas =" + i ;
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
                if ((respuesta >= 'a' && respuesta <= 'd'))
                {
                    if ((i == 1 && (respuesta == 'a' || respuesta == 'c')) ||
                            (i == 2 && (respuesta == 'a' || respuesta == 'd')) ||
                            (i == 3 && (respuesta == 'b' || respuesta == 'd')) ||
                            (i == 4 && (respuesta == 'c' || respuesta == 'd')) ||
                            (i == 5 && (respuesta == 'b' || respuesta == 'd')))
                    {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");

                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel2() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 2" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+5) ;
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
                    if (respuesta >= 'a' && respuesta <= 'd') {
                        if (((i + 5) == 6 && (respuesta == 'c')) ||
                                ((i + 5) == 7 && (respuesta == 'c' || respuesta == 'd')) ||
                                ((i + 5) == 8 && (respuesta == 'b')) ||
                                ((i + 5) == 9 && (respuesta == 'a')) ||
                                ((i + 5) == 10 && (respuesta == 'a' || respuesta == 'b'))) {
                            cont++;
                            System.out.println("RESPUESTA CORRECTA");
                        }
                        else
                        {
                            System.out.println("RESPUESTA INCORRECTA");
                        }
                    }
                    else
                    {
                        System.out.println("CARACETER INVALIDO");
                    }
                }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel3() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 3" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+10) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 10) == 11 && (respuesta == 'b')) ||
                            ((i + 10) == 12 && (respuesta == 'b')) ||
                            ((i + 10) == 13 && (respuesta == 'd')) ||
                            ((i + 10) == 14 && (respuesta == 'a')) ||
                            ((i + 10) == 15 && (respuesta == 'c'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel4() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 4" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+15) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 15) == 16 && (respuesta == 'a' || respuesta == 'b')) ||
                            ((i + 15) == 17 && (respuesta == 'a' || respuesta == 'd')) ||
                            ((i + 15) == 18 && (respuesta == 'b' || respuesta == 'c')) ||
                            ((i + 15) == 19 && (respuesta == 'b' || respuesta == 'd')) ||
                            ((i + 15) == 20 && (respuesta == 'a' || respuesta == 'b'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel5() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 5" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+20) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 20) == 21 && (respuesta == 'b')) ||
                            ((i + 20) == 22 && (respuesta == 'b' || respuesta == 'c')) ||
                            ((i + 20) == 23 && (respuesta == 'c')) ||
                            ((i + 20) == 24 && (respuesta == 'c' || respuesta == 'd')) ||
                            ((i + 20) == 25 && (respuesta == 'b'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }
        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel6() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 6" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+25) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 25) == 26 && (respuesta == 'b')) ||
                            ((i + 25) == 27 && (respuesta == 'c')) ||
                            ((i + 25) == 28 && (respuesta == 'c')) ||
                            ((i + 25) == 29 && (respuesta == 'a')) ||
                            ((i + 25) == 30 && (respuesta == 'd'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }
        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel7() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 7" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+30) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 30) == 31 && (respuesta == 'a' || respuesta == 'd')) ||
                            ((i + 30) == 32 && (respuesta == 'b' || respuesta == 'c')) ||
                            ((i + 30) == 33 && (respuesta == 'a' || respuesta == 'd')) ||
                            ((i + 30) == 34 && (respuesta == 'b' || respuesta == 'c')) ||
                            ((i + 30) == 35 && (respuesta == 'a' || respuesta == 'c'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel8() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 8" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+35) ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 35) == 36 && (respuesta == 'c')) ||
                            ((i + 35) == 37 && (respuesta == 'a' || respuesta == 'b')) ||
                            ((i + 35) == 38 && (respuesta == 'c')) ||
                            ((i + 35) == 39 && (respuesta == 'c')) ||
                            ((i + 35) == 40 && (respuesta == 'a' || respuesta == 'd'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }
        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel9() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Pregunta_1, Pregunta_2, Pregunta_3, Pregunta_4, Pregunta_5 FROM preguntas WHERE ID_Preguntas = 9" ;
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 40) == 41 && (respuesta == 'b')) ||
                            ((i + 40) == 42 && (respuesta == 'a')) ||
                            ((i + 40) == 43 && (respuesta == 'a')) ||
                            ((i + 40) == 44 && (respuesta == 'd')) ||
                            ((i + 40) == 45 && (respuesta == 'c'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }
        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel10() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Imagen_1, Imagen_2, Imagen_3, Imagen_4, Imagen_5 FROM imagenes WHERE ID_Imagenes = 1" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+45) ;
            ResultSet pr = conexion.executeQuery(preguntaQuery);
            while (pr.next()) {
                System.out.println("*********************************************************");
                System.out.println("\tCUAL EL ES NOMBRE DE LA FIGURA");
                System.out.println(pr.getString("Imagen_"+i));
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 45) == 46 && (respuesta == 'a')) ||
                            ((i + 45) == 47 && (respuesta == 'b')) ||
                            ((i + 45) == 48 && (respuesta == 'd')) ||
                            ((i + 45) == 49 && (respuesta == 'c')) ||
                            ((i + 45) == 50 && (respuesta == 'a'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel11() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Imagen_1, Imagen_2, Imagen_3, Imagen_4, Imagen_5 FROM imagenes WHERE ID_Imagenes = 2" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+50) ;
            ResultSet pr = conexion.executeQuery(preguntaQuery);
            while (pr.next()) {
                System.out.println("*********************************************************");
                System.out.println("\tCUAL EL ES NOMBRE DE LA FIGURA");
                System.out.println(pr.getString("Imagen_"+i));
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 50) == 51 && (respuesta == 'b')) ||
                            ((i + 50) == 52 && (respuesta == 'a')) ||
                            ((i + 50) == 53 && (respuesta == 'a')) ||
                            ((i + 50) == 54 && (respuesta == 'a')) ||
                            ((i + 50) == 55 && (respuesta == 'c'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }
    public static int nivel12() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            String preguntaQuery = "SELECT Imagen_1, Imagen_2, Imagen_3, Imagen_4, Imagen_5 FROM imagenes WHERE ID_Imagenes = 3" ;
            String respuestaQuery = "SELECT Respuesta_1, Respuesta_2, Respuesta_3, Respuesta_4 FROM respuestas WHERE ID_Respuestas = " + (i+55) ;
            ResultSet pr = conexion.executeQuery(preguntaQuery);
            while (pr.next()) {
                System.out.println("*********************************************************");
                System.out.println("\tCUAL EL ES NOMBRE DE LA FIGURA");
                System.out.println(pr.getString("Imagen_"+i));
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
                if (respuesta >= 'a' && respuesta <= 'd') {
                    if (((i + 55) == 56 && (respuesta == 'a')) ||
                            ((i + 55) == 57 && (respuesta == 'c')) ||
                            ((i + 55) == 58 && (respuesta == 'a')) ||
                            ((i + 55) == 59 && (respuesta == 'b')) ||
                            ((i + 55) == 60 && (respuesta == 'd'))) {
                        cont++;
                        System.out.println("RESPUESTA CORRECTA");
                    }
                    else
                    {
                        System.out.println("RESPUESTA INCORRECTA");
                    }
                }
                else
                {
                    System.out.println("CARACETER INVALIDO");
                }
            }

        }
        System.out.println("*********************************************************");
        System.out.println("TU PUNTUACION FINAL ES: "+cont);
        System.out.println("*********************************************************");
        return cont;
    }

}