/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection CON;
    public static final String URL = "jdbc:mysql://";
    public static final String PATH = "localhost:3306/tugas_besar_klinik";
    
//    public static final String URL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12621975";
//    public static final String username = "sql12621975";
//    public static final String password = "9Qgl7daCkx";
//    
//    public Connection makeConnection(){
//        System.out.println("Opening database..");
//        try {
//            CON = DriverManager.getConnection(URL, username, password);
//            System.out.println("success!");
//        } catch (Exception e) {
//            System.out.println("Error opening database..");
//            System.out.println(e);
//        }
//        
//        return CON;
//    }
    
    public Connection makeConnection(){
        System.out.println("Opening database..");
        try {
            CON = DriverManager.getConnection(URL + PATH, "root", "");
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error opening database..");
            System.out.println(e);
        }
        
        return CON;
    }
    
    public void closeConnection() {
        System.out.println("Closing database..");
        try {
            CON.close();
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error closing database..");
            System.out.println(e);
        }
    }
}