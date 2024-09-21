package org.example;

import java.sql.*;
import java.util.Scanner;


public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/juego_jdbc1";
    static final String USER = "root";
    static final String PASS = "";

    //CLASE SELEC//
    static final String PUNTUACION =
            "SELECT usuario.Usuario, SUM(partida.Puntuacion) AS PUNTOS_FINALES\n" +
                    "FROM personaje\n" +
                    "INNER JOIN partida ON personaje.Id_del_personaje = partida.ID_partida\n" +
                    "INNER JOIN usuario ON usuario.ID_del_usuario = personaje.Id_del_personaje\n" +
                    "GROUP BY usuario.Usuario\n" +
                    "ORDER BY PUNTOS_FINALES DESC;";
    static final String ATAQUE =
            "SELECT usuario.Usuario, SUM(estadisticas.XP_Ataque) AS ESTADISTICAS_ATAQUE\n" +
                    "FROM personaje \n" +
                    "INNER JOIN usuario ON personaje.Id_del_personaje = usuario.ID_del_usuario\n" +
                    "INNER JOIN estadisticas ON personaje.XP_TOTAL = estadisticas.XP_Total\n" +
                    "GROUP BY usuario.Usuario\n" +
                    "ORDER BY ESTADISTICAS_ATAQUE DESC;";

    static final String DEFENSA =
            "SELECT usuario.Usuario, SUM(estadisticas.XP_Defensa) AS ESTADISTICAS_DEFENSA\n" +
                    "FROM personaje \n" +
                    "INNER JOIN usuario ON personaje.Id_del_personaje = usuario.ID_del_usuario\n" +
                    "INNER JOIN estadisticas ON personaje.XP_TOTAL = estadisticas.XP_Total\n" +
                    "GROUP BY usuario.Usuario\n" +
                    "ORDER BY ESTADISTICAS_DEFENSA DESC;";

    //CLASE UPDATE//
    static final String PARTIDA = "SELECT ID_partida, Puntuacion FROM partida";

    //CLASE DELETE//
    static final String DELETEPARTIDA = "SELECT ID_partida, Puntuacion FROM partida;";

    static final String USU = "SELECT ID_del_usuario, Usuario FROM usuario;";

    public static void main(String... param) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Statement conexion = conn.createStatement();

            Scanner reader = new Scanner(System.in);

            System.out.println("Ingrese la opcion de su preferencia");
            System.out.println("a) INGRESO DE UN NUEVO USUARIO");
            System.out.println("b) VERIFICAR MEJORES PUNTUACIONES");
            System.out.println("c) CONSULTA DE LOS JUGADORES CON MEJORES ESTADISTICAS DE ATAQUE");
            System.out.println("d) CONSULTA DE LOS JUGADORES CON MEJORES ESTADISTICAS DE DEFENSA");
            System.out.println("e) RESETEAR TODAS LAS PARTIDAS");
            System.out.println("f) BORRAR LAS PARTIDAS CON SUS PUNTUACIONES");
            System.out.println("g) BORRAR USUARIOS");
            System.out.println("h) INGRESAR PUNTUACION Y FECHA DE LA PARTIDA");
            System.out.println("i) INGRESAR TU XP DE ATAQUE Y TU XP DE DEFENSA");
            System.out.println("CUAL ES LA OPCION QUE PREFIER: ");
            String respos = reader.next();
            reader.nextLine();

            if (respos.length() == 1) {
                char letra = respos.charAt(0);
                if ((letra >= 'a' && letra <= 'i') || (letra >= 'A' && letra <= 'I')) {

                        if (letra == 'a' || letra == 'A') {
                            System.out.println("INGRESA TU NOMBRE");
                            String nombre = reader.nextLine();
                            System.out.println("INGRESA TU APELLIDO");
                            String apellido = reader.nextLine();
                            System.out.println("INGRESA TU NOMBRE DE USUARIO");
                            String uso = reader.nextLine();
                            System.out.println("INGRESA TU CORREO ELECTRONICO");
                            String email = reader.nextLine();
                            System.out.println("INGRESA TU CONTRASEÑA");
                            String contra = reader.nextLine();
                            String sql = "INSERT INTO usuario (Nombre, Apellido, Usuario,Correo_electronico, Contraseña) " +
                                    "VALUES (' "+nombre+" ', ' "+apellido+" ', ' "+uso+" ', '"+email+"','"+contra+"')";
                            conexion.executeUpdate(sql);
                            System.out.println("INGRESO EXITOSO");
                        }
                    try (ResultSet PUNTO = (letra == 'b' || letra == 'B') ? conexion.executeQuery(PUNTUACION) : null;
                         ResultSet ATA = (letra == 'c' || letra == 'C') ? conexion.executeQuery(ATAQUE) : null;
                         ResultSet DEF = (letra == 'd' || letra == 'D') ? conexion.executeQuery(DEFENSA) : null) {

                        if (letra == 'b' || letra == 'B') {
                            while (PUNTO != null && PUNTO.next()) {
                                System.out.println("USUARIO: " + PUNTO.getString("Usuario"));
                                System.out.println("PUNTOS TOTALES: " + PUNTO.getInt("PUNTOS_FINALES"));
                            }
                        }
                        if (letra == 'c' || letra == 'C') {
                            while (ATA != null && ATA.next()) {
                                System.out.println("USUARIO: " + ATA.getString("Usuario"));
                                System.out.println("ESTADISTICA ATAQUE: " + ATA.getInt("ESTADISTICAS_ATAQUE"));
                            }
                        }
                        if (letra == 'd' || letra == 'D') {
                            while (DEF != null && DEF.next()) {
                                System.out.println("USUARIO: " + DEF.getString("Usuario"));
                                System.out.println("ESTADISTICA DEFENSA: " + DEF.getInt("ESTADISTICAS_DEFENSA"));
                            }
                        }
                        if (letra == 'e' || letra == 'E') {

                            String CAMBIO = "UPDATE partida\n" +
                                    "SET Puntuacion = 750\n" +
                                    "WHERE ID_partida = 7;" ;
                            conexion.executeUpdate(CAMBIO);
                            ResultSet rs = conexion.executeQuery(PARTIDA);
                            while(rs.next())
                            {
                                System.out.println("ID de la Partida " + rs.getInt("ID_partida"));
                                System.out.println("PUNTUACION " + rs.getInt("Puntuacion"));
                            }
                            rs.close();
                        }
                        if (letra == 'f' || letra == 'F')
                        {
                            String sql = "DELETE FROM partida\n" +
                                    "WHERE Puntuacion = 0;";
                            conexion.executeUpdate(sql);
                            ResultSet rs = conexion.executeQuery(DELETEPARTIDA);
                            while(rs.next())
                            {
                                System.out.println("ID de la Partida " + rs.getInt("ID_partida"));
                                System.out.println("PUNTUACION " + rs.getInt("Puntuacion"));
                            }
                            rs.close();
                        }
                        if (letra == 'g' || letra == 'G')
                        {
                            String sql = "DELETE FROM usuario\n" +
                                    "WHERE ID_del_usuario = 6;";
                            conexion.executeUpdate(sql);
                            ResultSet rs = conexion.executeQuery(USU);
                            while(rs.next())
                            {
                                System.out.println("ID DEL USUARIO: " + rs.getInt("ID_del_usuario"));
                                System.out.println("USUARIO: " + rs.getString("Usuario"));
                            }
                            rs.close();
                        }
                        if (letra == 'h' || letra == 'H') {
                            System.out.println("INGRESA TU PUNTUACION");
                            String puntuacion = reader.nextLine();
                            System.out.println("INGRESA LA FECHA DE TU PARTIDA AA/MM/DD ");
                            String fecha = reader.nextLine();
                            String sql = "INSERT INTO partida (Puntuacion, fecha_partida)" +
                                    "VALUES ('"+puntuacion+" ', ' "+fecha+"')";
                            conexion.executeUpdate(sql);
                            System.out.println("INGRESO EXITOSO");
                        }
                        if (letra == 'i' || letra == 'I') {
                            System.out.println("INGRESA TU XP DE ATAQUE");
                            int ata = reader.nextInt();
                            System.out.println("INGRESA TU XP DE DEFENSA");
                            int defe = reader.nextInt();
                            int total = ata + defe;
                            String sql = "INSERT INTO estadisticas(XP_Total, XP_Ataque, XP_Defensa)" +
                                    "VALUES ('"+total+" ','"+ata+" ', ' "+defe+"')";
                            conexion.executeUpdate(sql);
                            System.out.println("INGRESO EXITOSO");
                        }
                    }

                } else {
                    System.out.println("LA OPCION ESCOGIDA NO EXISTE");
                }
            } else {
                System.out.println("LA OPCION ESCOGIDA NO EXISTE");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}