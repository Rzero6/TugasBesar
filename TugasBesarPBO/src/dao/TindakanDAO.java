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
import model.Tindakan;
/**
 *
 * @author VICTUS
 */
public class TindakanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertTindakan(Tindakan t){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO tindakan(nama_tindakan, harga_tindakan) "
                + "VALUES ('" 
                + t.getNama()+ "', '"
                + t.getHarga() + "')";
        
        System.out.println("Adding Tindakan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Tindakan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Tindakan ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void updateTindakan(Tindakan t) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE tindakan SET nama_tindakan = '" + t.getNama()+ "', "
                + "harga_tindakan = '" + t.getHarga() + "'"
                + "WHERE (id_tindakan = '" + t.getId() + "')"; 
           System.out.println("Editing Tindakan ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Tindakan " + t.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Tindakan ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteTindakan(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM tindakan WHERE id_tindakan = '" + id + "'";
        System.out.println("Deleting Tindakan ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Tindakan " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Tindakan...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public List<Tindakan> showTindakanBySearch(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM tindakan WHERE "
                + "(id_tindakan LIKE '%"+query+"%'"
                + "OR nama_tindakan LIKE '%"+query+"%'"
                + "OR harga_tindakan LIKE '%"+query+"%'"
                + "OR stok_tindakan LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data tindakan ...");
        
        List<Tindakan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Tindakan t = new Tindakan(
                            rs.getInt("id_tindakan"),
                            rs.getString("nama_tindakan"),
                            rs.getDouble("harga_tindakan")
                    );
                    list.add(t);
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
