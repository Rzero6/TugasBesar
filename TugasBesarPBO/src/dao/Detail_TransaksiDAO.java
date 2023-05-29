/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import model.DetailTransaksi;

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
                + "', '"+dt.getId_transaksi()
                + "', '"+dt.getId_obat()
                + "', '"+dt.getId_tindakan()
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
    
    
}
