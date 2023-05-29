/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DetailTransaksi;
import java.sql.ResultSet;
import model.Obat;
import model.Tindakan;
import model.Transaksi;

/**
 *
 * @author dendy
 * Kelompok 14
 * Ryan Pratama Wijaya     | 210711008 | C
 * I Kadek Dendy Pramartha | 210711095 | C
 */
public class Detail_TransaksiDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertDetailTransaksi (DetailTransaksi dt){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO detail_transaksi (id_detail_transaksi, id_transaksi, id_obat, id_tindakan, jumlah_obat)"
                + "VALUES ('"+dt.getId_detail_transaksi()
                + "', '"+dt.getTransaksi().getId()
                + "', '"+dt.getObat().getId()
                + "', '"+dt.getTindakan().getId()
                + "', '"+dt.getJumlah_obat()+"')";
        System.out.println("Adding Transaksi");
         try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Detail Transaksi");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Detail Transaksi");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void deleteDetailTransaksi(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM detail_transaksi WHERE id_transaksi = '" + id + "'";
        System.out.println("Deleting Detail Transaksi ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Detail Transaksi " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Detail Transaksi...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public List<DetailTransaksi> showDetailTransaksi(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT dt.*, t.*, o.*, td.* FROM transaksi as t LEFT JOIN detail_transaksi as dt ON t.id_transaksi = dt.id_transaksi"
                + "LEFT JOIN obat as o ON dt.id_obat = o.id_obat LEFT JOIN tindakan as td on dt.id_tindakan = td.id_tindakan "
                + "WHERE (t.id_transaksi LIKE '%" + query + "%'"
                + "OR o.nama_obat LIKE '%" + query + "%'"
                + "OR td.nama_tindakan '%" + query + "%'"
                + "OR dt.jumlah_obat LIKE '%" + query + "%')";
        System.out.println("Mengambil data Detail Transaksi...");       
        List<DetailTransaksi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs!=null){
                while(rs.next()){
                    Transaksi t = new Transaksi(
                            Integer.parseInt(rs.getString("t.id_transaksi")), 
                            rs.getString("t.tanggal_transaksi"), 
                            Double.parseDouble(rs.getString("t.biaya_klinik")), 
                            rs.getString("t.status"), 
                            rs.getString("t.diagnosis")
                    );
                    
                    Obat o = new Obat(Integer.parseInt(rs.getString("o.id_obat")),
                            rs.getString("o.nama_obat"), Double.parseDouble(rs.getString("o.harga_obat")),
                            Integer.parseInt(rs.getString("o.stok_obat"))
                            
                    );
                    
                    Tindakan td = new Tindakan (Integer.parseInt(rs.getString("td.id_tindakan")),
                            rs.getString("td.nama_tindakan"), 
                            Double.parseDouble(rs.getString("td.harga_tindakan"))
                    );
                    
                    DetailTransaksi dt = new DetailTransaksi(Integer.parseInt(rs.getString("dt.id_detail_transaksi"))
                            , t, 
                            o, 
                            td, 
                            Integer.parseInt(rs.getString("dt.jumlah_obat")));
                    list.add(dt);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        
        return list;
    }
    
    
    
        
    
    
}
