/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Supplier;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class SupplierDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertSupplier(Supplier s){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO supplier(nama_supplier, no_telepon_supplier, email_supplier) "
                + "VALUES ('" 
                + s.getNama()+ "', '"
                + s.getNo_telepon() + "', '" 
                + s.getEmail() + "')";
        
        System.out.println("Adding Supplier ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Supplier");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Supplier ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void updateSupplier(Supplier s) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE supplier SET nama_supplier = '" + s.getNama()+ "', "
                + "no_telepon_supplier = '" + s.getNo_telepon()+ "', "
                + "email_supplier = '" + s.getEmail() + "'"
                + "WHERE (id_supplier = '" + s.getIdSupplier() + "')"; 
           System.out.println("Editing Supplier ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Supplier " + s.getIdSupplier());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Supplier ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteSupplier(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM supplier WHERE id_supplier = '" + id + "'";
        System.out.println("Deleting Supplier ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Supplier " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Supplier...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public Supplier searchSupplier(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM supplier WHERE "
                + "(nama_supplier LIKE '"+query+"'"
                + "OR no_telepon_supplier LIKE '"+query+"'"
                + "OR email_supplier LIKE '"+query+"')"
                ;
        Supplier s = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                s = new Supplier(
                            rs.getInt("id_supplier"),
                            rs.getString("nama_supplier"),
                            rs.getString("no_telepon_supplier"),
                            rs.getString("email_supplier")
                    );
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        return s;
    }
    
    public List<Supplier> getListSupplier(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM supplier WHERE "
                + "(id_supplier LIKE '%"+query+"%'"
                + "OR nama_supplier LIKE '%"+query+"%'"
                + "OR no_telepon_supplier LIKE '%"+query+"%'"
                + "OR email_supplier LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data supplier ...");
        
        List<Supplier> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Supplier s = new Supplier(
                            rs.getInt("id_supplier"),
                            rs.getString("nama_supplier"),
                            rs.getString("no_telepon_supplier"),
                            rs.getString("email_supplier")
                    );
                    list.add(s);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        
        return list;
    }
}
