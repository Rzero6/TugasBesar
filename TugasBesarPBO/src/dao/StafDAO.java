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
import model.Staf;
/**
 *
 * @author VICTUS
 */
public class StafDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertStaf(Staf s){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO staf "
                + "(nama_staf, no_telepon_staf, tanggal_mulai_kerja, jabatan_staf) "
                + "VALUES ('" 
                + s.getNama()+ "', '"
                + s.getNo_telepon() + "', '"
                + s.getTanggal_bergabung() + "', '"
                + s.getJabatan() + "')";
        
        System.out.println("Adding Staf ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Staf");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Staf ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void updateStaf(Staf s) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE staf SET nama_staf = '" + s.getNama()+ "', "
                + "no_telepon_staf = '" + s.getNo_telepon() + "', "
                + "tanggal_mulai_kerja = '" + s.getTanggal_bergabung() + "', "
                + "jabatan_staf = '" + s.getJabatan() + "'"
                + "WHERE (id_staf = '" + s.getId() + "')"; 
           System.out.println("Editing Staf ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Staf " + s.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Staf ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteStaf(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM staf WHERE id_staf = '" + id + "'";
        System.out.println("Deleting Staf ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Staf " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Staf...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public List<Staf> showStafBySearch(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM staf WHERE "
                + "(id_staf LIKE '%"+query+"%'"
                + "OR nama_staf LIKE '%"+query+"%'"
                + "OR harga_staf LIKE '%"+query+"%'"
                + "OR stok_staf LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data staf ...");
        
        List<Staf> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Staf s = new Staf(
                            rs.getInt("id_staf"),
                            rs.getString("nama_staf"),
                            rs.getString("no_telepon_staf"),
                            rs.getString("tanggal_mulai_kerja"),
                            rs.getString("jabatan_staf")
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
