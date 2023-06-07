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
import model.Obat;
/**
 *
 * @author VICTUS
 */
public class ObatDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertObat(Obat o){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO obat(nama_obat, harga_obat, stok_obat) "
                + "VALUES ('" 
                + o.getNama()+ "', '"
                + o.getHarga() + "', '" 
                + o.getStok() + "')";
        
        System.out.println("Adding Obat ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Obat");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Obat ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void updateObat(Obat o) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE obat SET nama_obat = '" + o.getNama()+ "', "
                + "harga_obat = '" + o.getHarga() + "', "
                + "stok_obat = '" + o.getStok() + "'"
                + "WHERE (id_obat = '" + o.getId() + "')"; 
           System.out.println("Editing Obat ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Obat " + o.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Obat ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteObat(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM obat WHERE id_obat = '" + id + "'";
        System.out.println("Deleting Obat ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Obat " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Obat...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public Obat searchObat(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM obat WHERE "
                + "(nama_obat LIKE '"+query+"')"
                ;
        Obat o = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                o = new Obat(
                            rs.getInt("id_obat"),
                            rs.getString("nama_obat"),
                            rs.getDouble("harga_obat"),
                            rs.getInt("stok_obat")
                    );
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        return o;
    }
    
    public List<Obat> showObatBySearch(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM obat WHERE "
                + "(id_obat LIKE '%"+query+"%'"
                + "OR nama_obat LIKE '%"+query+"%'"
                + "OR harga_obat LIKE '%"+query+"%'"
                + "OR stok_obat LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data obat ...");
        
        List<Obat> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Obat o = new Obat(
                            rs.getInt("id_obat"),
                            rs.getString("nama_obat"),
                            rs.getDouble("harga_obat"),
                            rs.getInt("stok_obat")
                    );
                    list.add(o);
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
