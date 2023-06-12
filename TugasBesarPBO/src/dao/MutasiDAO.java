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
import model.Mutasi;


/**
 *
 * @author VICTUS
 */
public class MutasiDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertMutasi(Mutasi m){
        con = dbcon.makeConnection();
        String sql="";
        if(m.getTipe().equalsIgnoreCase("pemasukan")){
            sql = "INSERT INTO mutasi_dana "
                + "(id_transaksi, nominal, saldo, detail, tipe, tanggal_mutasi) "
                + "VALUES ('" 
                + m.getIdTransaksi()+ "', '"
                + m.getNominal() + "', '"
                + m.getSaldo() + "', '"
                + m.getDetail() + "', '"
                + m.getTipe() + "', '"
                + m.getTanggal() + "')";
        }else{
            sql = "INSERT INTO mutasi_dana "
                + "(id_pengadaan, nominal, saldo, detail, tipe, tanggal_mutasi) "
                + "VALUES ('" 
                + m.getIdPengadaan()+ "', '"
                + m.getNominal() + "', '"
                + m.getSaldo() + "', '"
                + m.getDetail() + "', '"
                + m.getTipe() + "', '"
                + m.getTanggal() + "')"; 
        }
        
        
        System.out.println("Adding Mutasi ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Mutasi");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Mutasi ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    public Double getSaldo(){
        con = dbcon.makeConnection();
        String sql = "SELECT saldo FROM mutasi_dana"
                + " ORDER BY tanggal_mutasi DESC LIMIT 1";
        System.out.println("Mengambil data mutasi ...");
        double saldo = 0;
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                saldo = rs.getDouble("saldo");
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return saldo;
    }
    public List<Mutasi> getListMutasi(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM mutasi_dana WHERE "
                + "(id_mutasi LIKE '%"+query+"%'"
                + "OR id_pengadaan LIKE '%"+query+"%'"
                + "OR id_transaksi LIKE '%"+query+"%'"
                + "OR tanggal_mutasi LIKE '%"+query+"%'"
                + "OR nominal LIKE '%"+query+"%'"
                + "OR saldo LIKE '%"+query+"%'"
                + "OR detail LIKE '%"+query+"%'"
                + "OR tipe LIKE '%"+query+"%')"
                + "ORDER BY id_mutasi DESC"
                ;
        System.out.println("Mengambil data mutasi ...");
        
        List<Mutasi> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Mutasi m = null;
                    if(rs.getString("tipe").equalsIgnoreCase("Pemasukan")){
                        m = new Mutasi(
                            rs.getInt("id_mutasi"),
                            rs.getInt("id_transaksi"),
                            0,
                            rs.getDouble("nominal"),
                            rs.getDouble("saldo"),
                            rs.getString("detail"),
                            rs.getString("tipe"),
                            rs.getString("tanggal_mutasi")
                        );
                    }else{
                        m = new Mutasi(
                            rs.getInt("id_mutasi"),
                            0,
                            rs.getInt("id_pengadaan"),
                            rs.getDouble("nominal"),
                            rs.getDouble("saldo"),
                            rs.getString("detail"),
                            rs.getString("tipe"),
                            rs.getString("tanggal_mutasi")
                        );
                    }
                    
                    list.add(m);
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
