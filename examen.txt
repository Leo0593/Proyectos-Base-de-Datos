package org.example;


import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String DB_URL = "jdbc:mysql://localhost:3306/prueba_jbc";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String... param)
    {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Statement conexion = conn.createStatement();

            Scanner reader = new Scanner(System.in);
            int opciones;


            System.out.println("QUE LE GUSTARIA INGRESAR");
            System.out.println("1) REVISAR SU TIKED");
            System.out.println("2) EXTRAER BENEFICIOS DE LA EMPRESAS");
            System.out.println("3) SIMULAR QUE VA A COMPRAR UN PRODUCTO");
            System.out.print("Cual es tu eleccion:");
            opciones = reader.nextInt();

            if (opciones == 1)
            {
                opcion1();
            }
            else if (opciones == 2)
            {
                opcion2();
            }
            else if (opciones == 3)
            {
                opcion3();
            }else
            {
                System.out.println("OPCION INCORRECTA");
            }


        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void opcion1() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int numero;
        System.out.println("INGRESE SU ORDERNUMBER");
        numero = reader.nextInt();
        String buscarTiked = "SELECT orders.orderNumber, products.productName, orderdetails.quantityOrdered, orderdetails.priceEach,(orderdetails.quantityOrdered * orderdetails.priceEach) AS TOTAL\n" +
                "FROM orders \n" +
                "INNER JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber\n" +
                "INNER JOIN products ON orderdetails.productCode = products.productCode\n" +
                "WHERE  orders.orderNumber = '"+ numero +"'";
        ResultSet resultado = conexion.executeQuery(buscarTiked);
        while (resultado.next()) {

            System.out.print(resultado.getString("orderNumber"));
            System.out.print(" | ");
            System.out.print(resultado.getString("productName"));
            System.out.print(" | ");
            System.out.print(resultado.getString("priceEach"));
            System.out.print(" | ");
            System.out.print(resultado.getString("quantityOrdered"));
            System.out.print(" | ");
            System.out.print(resultado.getString("TOTAL"));
            System.out.print(" | ");
            System.out.println();
        }

    }

    public static void opcion2() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int dato;
        System.out.println("INGRESE EL AÑO QUE LE GUSTARIA SABER:");
        dato = reader.nextInt();
        String beneficios = "SELECT \n" +
                "SUM(products.buyPrice * products.quantityInStock) AS precios_de_productos,\n" +
                "SUM(orderdetails.priceEach * orderdetails.quantityOrdered) AS precio_de_venta,\n" +
                "SUM(products.buyPrice * products.quantityInStock - orderdetails.priceEach * orderdetails.quantityOrdered) AS TOTAL\n" +
                "FROM \n" +
                "orders\n" +
                "INNER JOIN\n" +
                "orderdetails ON orders.orderNumber = orderdetails.orderNumber\n" +
                "INNER JOIN \n" +
                "products ON products.productCode = orderdetails.productCode\n" +
                "WHERE YEAR(orders.requiredDate) = '"+ dato +"'";
        ResultSet resultado = conexion.executeQuery(beneficios);
        while (resultado.next())
        {
            System.out.println(resultado.getString("precios_de_productos"));
            System.out.println(resultado.getString("precio_de_venta"));
            System.out.println("--------------------");
            System.out.println(resultado.getString("TOTAL"));
        }

    }

    public static void opcion3() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement conexion = conn.createStatement();
        Scanner reader = new Scanner(System.in);
        int custumer;
        System.out.println("Ingresa tu custumerNumber");
        custumer = reader.nextInt();


    }

}