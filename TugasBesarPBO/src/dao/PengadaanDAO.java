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
import model.Pengadaan;
import model.Supplier;

/**
 *
 * @author VICTUS
 */
public class PengadaanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertPengadaan(Pengadaan p){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO pengadaan "
                + "(id_obat, id_supplier, jumlah_obat, tanggal_pengadaan) "
                + "VALUES ('" 
                + p.getIdObat()+ "', '"
                + p.getIdSupplier() + "', '"
                + p.getJumlah_obat() + "', '"
                + p.getTanggal() + "')";
        
        System.out.println("Adding Pengadaan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Pengadaan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Pengadaan ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public List<Pengadaan> getListPengadaan(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT p.*,s.*,o.* FROM pengadaan as p"
                + " JOIN supplier as s on p.id_supplier = s.id_supplier"
                + " JOIN obat as o on p.id_obat = o.id_obat"
                + " WHERE "
                + "(id_pengadaan LIKE '%"+query+"%'"
                + "OR p.id_obat LIKE '%"+query+"%'"
                + "OR p.id_supplier LIKE '%"+query+"%'"
                + "OR s.nama_supplier LIKE '%"+query+"%'"
                + "OR s.email_supplier LIKE '%"+query+"%'"
                + "OR s.no_telepon_supplier LIKE '%"+query+"%'"
                + "OR o.nama_obat LIKE '%"+query+"%'"
                + "OR o.harga_obat LIKE '%"+query+"%'"
                + "OR p.jumlah_obat LIKE '%"+query+"%'"
                + "OR p.tanggal_pengadaan LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data pengadaan ...");
        
        List<Pengadaan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Supplier s = new Supplier(
                            rs.getInt("s.id_supplier"),
                            rs.getString("s.nama_supplier"),
                            rs.getString("s.no_telepon_supplier"),
                            rs.getString("s.email_supplier")
                    );
                    Obat o = new Obat(
                            rs.getInt("o.id_obat"),
                            rs.getString("o.nama_obat"),
                            rs.getDouble("o.harga_obat"),
                            rs.getInt("o.stok_obat")
                    );
                    Pengadaan p = new Pengadaan(
                            rs.getInt("p.id_pengadaan"),
                            rs.getInt("p.id_obat"),
                            rs.getInt("p.id_supplier"),
                            rs.getInt("p.jumlah_obat"),
                            rs.getString("p.tanggal_pengadaan")
                    );
                    p.setObat(o);
                    p.setSupplier(s);
                    list.add(p);
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
