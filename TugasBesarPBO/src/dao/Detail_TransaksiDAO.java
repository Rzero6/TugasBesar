/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public void updateDetailTransaksi(DetailTransaksi dt){
        con = dbcon.makeConnection();
        String sql = "UPDATE detail_transaksi set id_obat = "+dt.getObat().getId()
                + ", id_tindakan = "+dt.getTindakan().getId()
                + ", jumlah_obat = "+dt.getJumlah_obat()
                + " WHERE (id_detail_transaksi = "+dt.getId_detail_transaksi()+")";
        System.out.println("Editing Detail Transaksi ...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " DetailTransaksi " + dt.getId_detail_transaksi());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Detail Transaksi ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void deleteDetailTransaksi(int idDetailTransaksi){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM detail_transaksi WHERE id_detail_transaksi = '" + idDetailTransaksi + "'";
        System.out.println("Deleting Detail Transaksi ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Detail Transaksi " + idDetailTransaksi);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Detail Transaksi...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteAllDetailTransaksiFromIDTransaksi(int idTransaksi) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM detail_transaksi WHERE id_transaksi = '" + idTransaksi + "'";
        System.out.println("Deleting Detail Transaksi ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Detail Transaksi dengan ID Transaksi " + idTransaksi);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Detail Transaksi...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public List<DetailTransaksi> getListDetailTransaksiByTransaksiID(String query, int id){
        con = dbcon.makeConnection();
        
        String sql = "SELECT dt.*, t.*, o.*, td.* FROM transaksi AS t " +
             "LEFT JOIN detail_transaksi AS dt ON t.id_transaksi = dt.id_transaksi " +
             "LEFT JOIN obat AS o ON dt.id_obat = o.id_obat " +
             "LEFT JOIN tindakan AS td ON dt.id_tindakan = td.id_tindakan " +
             "WHERE t.id_transaksi = " + id + " AND " +
             "(o.nama_obat LIKE '%" + query + "%' " +
             "OR td.nama_tindakan LIKE '%" + query + "%' " +
             "OR dt.jumlah_obat LIKE '%" + query + "%')";
        System.out.println("Mengambil data Detail Transaksi...");       
        List<DetailTransaksi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs!=null){
                while(rs.next()){
                    Transaksi t = new Transaksi(
                            rs.getInt("t.id_transaksi"),
                            rs.getString("t.tanggal_transaksi"),
                            rs.getDouble("t.biaya_klinik"),
                            rs.getString("t.status"),
                            rs.getString("t.diagnosis")
                    );
                    Obat o = new Obat(
                            rs.getInt("o.id_obat"),
                            rs.getString("o.nama_obat"),
                            rs.getDouble("o.harga_obat"),
                            rs.getInt("o.stok_obat")
                    );

                    Tindakan td = new Tindakan(
                            rs.getInt("td.id_tindakan"),
                            rs.getString("td.nama_tindakan"),
                            rs.getDouble("td.harga_tindakan")
                    );

                    DetailTransaksi dt = new DetailTransaksi(
                            rs.getInt("dt.id_detail_transaksi"),
                            t,
                            o,
                            td,
                            rs.getInt("dt.jumlah_obat")
                    );
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
    
    public int checkDetailSama(int idTransaksi, int idPerawatan,String jenis){
        con = dbcon.makeConnection();
        String sql;
        int idDetailTransaksi=0; //return 0 jika tidak ketemu
        if(jenis.equalsIgnoreCase("obat")){
            sql = "SELECT * FROM `detail_transaksi`"
                + "WHERE id_transaksi = "+idTransaksi
                + " AND (id_tindakan = 1 AND id_obat = "+idPerawatan+")";
        }else {
            sql = "SELECT * FROM `detail_transaksi`"
                + "WHERE id_transaksi = "+idTransaksi
                + " AND (id_obat = 1 AND id_tindakan = "+idPerawatan+")";
        }
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                idDetailTransaksi = rs.getInt("id_detail_transaksi");
            }
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return idDetailTransaksi; 
    }
    
    
}
