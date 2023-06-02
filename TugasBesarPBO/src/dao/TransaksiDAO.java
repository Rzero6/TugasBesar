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
import model.Customer;
import model.DetailTransaksi;
import model.Staf;
import model.Transaksi;

/**
 *
 * @author VICTUS
 */
public class TransaksiDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertTransaksi(Transaksi t){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO transaksi(id_customer, id_dokter, tanggal_transaksi, biaya_klinik, status, keluhan, diagnosis)"
                + "VALUES ('"+t.getPasien().getId()
                + "', '"+t.getDokter().getId()
                + "', '"+t.getTanggalTransaksi()
                + "', '"+t.getBiaya_klinik()
                + "', '"+t.getStatus()
                + "', '"+t.getKeluhan()
                + "', '"+t.getDiagnosis()+"')";
        System.out.println("Adding Transaksi");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Transaksi");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Transaksi");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    public List<Transaksi> showTransaksi(String query, String status){
        con = dbcon.makeConnection();
        String sql = "SELECT t.*,s.*,c.* FROM transaksi as t"
                + " JOIN staf as s ON t.id_dokter = s.id_staf"
                + " JOIN customer as c ON t.id_customer = c.id_customer"
                + " WHERE (t.id_transaksi LIKE '%" + query + "%'"
                + " OR c.nama_customer LIKE '%" + query + "%'"
                + " OR s.nama_staf LIKE '%" + query + "%'"
                + " OR t.tanggal_transaksi LIKE '%" + query + "%'"
                + " OR t.keluhan LIKE '%" + query + "%'"
                + " OR t.diagnosis LIKE '%" + query + "%'"
                + " OR t.biaya_klinik LIKE '%" + query + "%')"
                + " AND t.status LIKE '%" + status + "%'"
                + " ORDER BY t.tanggal_transaksi ASC";
        System.out.println("Mengambil data Transaksi ...");
        
        List<Transaksi> list = new ArrayList();
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           if(rs!=null){
               while(rs.next()){
                   Customer c = new Customer(
                           rs.getInt("c.id_customer"), 
                           rs.getString("c.nama_customer"),
                           rs.getString("c.no_telepon_customer"),
                           rs.getString("c.tanggal_bergabung"), 
                           rs.getString("c.tanggal_lahir_customer"), 
                           rs.getString("c.alamat_customer"));
                   Staf s = new Staf(
                           rs.getInt("s.id_staf"), 
                           rs.getString("s.nama_staf"),
                           rs.getString("s.no_telepon_staf"),
                           rs.getString("s.tanggal_mulai_kerja"), 
                           rs.getString("s.jabatan_staf"), 
                           rs.getString("s.username_staf"),
                           rs.getString("s.password_staf"));
                   Transaksi t = new Transaksi(
                           rs.getInt("t.id_transaksi"),
                           c,
                           s,
                           rs.getString("t.tanggal_transaksi"),
                           rs.getDouble("t.biaya_klinik"),
                           rs.getString("t.status"),
                           rs.getString("t.keluhan"),
                           rs.getString("t.diagnosis")
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
    public void updateStatusTransaksi(Transaksi t){
        con = dbcon.makeConnection();
        String sql = "UPDATE transaksi SET status = '"+t.getStatus()+"', "
                + "biaya_klinik = '"+t.getBiaya_klinik()+"', "
                + "diagnosis = '"+t.getDiagnosis()+"', "
                + "tanggal_transaksi = '"+t.getTanggalTransaksi()+"' "
                + "WHERE id_transaksi = '"+t.getId()+"'";
        System.out.println("Editing transaksi ...");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Transaksi "+t.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing transaksi ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public Transaksi searchTransaksi(int id){
        con = dbcon.makeConnection();
        String sql = "SELECT t.*,s.*,c.* FROM transaksi as t"
                + " JOIN staf as s ON t.id_dokter = s.id_staf"
                + " JOIN customer as c ON t.id_customer = c.id_customer"
                + " WHERE (t.id_transaksi = "+id+")";
        System.out.println("Mengambil data Transaksi ...");
        
        Transaksi transaksi = null;
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           if(rs.next()){
                Customer c = new Customer(
                        rs.getInt("c.id_customer"), 
                        rs.getString("c.nama_customer"),
                        rs.getString("c.no_telepon_customer"),
                        rs.getString("c.tanggal_bergabung"), 
                        rs.getString("c.tanggal_lahir_customer"), 
                        rs.getString("c.alamat_customer"));
                Staf s = new Staf(
                        rs.getInt("s.id_staf"), 
                        rs.getString("s.nama_staf"),
                        rs.getString("s.no_telepon_staf"),
                        rs.getString("s.tanggal_mulai_kerja"), 
                        rs.getString("s.jabatan_staf"), 
                        rs.getString("s.username_staf"),
                        rs.getString("s.password_staf"));
                Transaksi t = new Transaksi(
                        rs.getInt("t.id_transaksi"),
                        c,
                        s,
                        rs.getString("t.tanggal_transaksi"),
                        rs.getDouble("t.biaya_klinik"),
                        rs.getString("t.status"),
                        rs.getString("t.keluhan"),
                        rs.getString("t.diagnosis")
                );
                transaksi = t;
               
           }
           rs.close();
           statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return transaksi;
    }
    public String checkTransaksiForMultipleUndoneTransaction(int id){//Untuk mengecek tidak terdapat multi pasien dalam transaksi
        con = dbcon.makeConnection();
        String sql = "SELECT t.*,c.* FROM transaksi as t"
                + " JOIN customer as c ON t.id_customer = c.id_customer"
                + " WHERE (t.id_customer = "+id+" AND t.status <> 'selesai')"
                + " ORDER BY t.tanggal_transaksi DESC";
        System.out.println("Mengambil data Transaksi ...");
        String result="aman";
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           if(rs.next()){
                result = "Tidak dapat menambah "+rs.getString("c.nama_customer")+". Dikarenakan memiliki Transaksi dalam Status "+rs.getString("t.status"); 
           }
           rs.close();
           statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return result;
    }
}
