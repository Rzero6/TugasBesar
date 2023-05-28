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
/**
 *
 * @author VICTUS
 */
public class CustomerDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertCustomer(Customer c){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO customer(nama_customer, no_telepon_customer, tanggal_bergabung, tanggal_lahir_customer, alamat_customer) "
                + "VALUES ('" 
                + c.getNama()+ "', '"
                + c.getNo_telepon() + "', '"
                + c.getTanggal_bergabung() + "', '"
                + c.getTanggal_lahir()+ "', '"
                + c.getAlamat() + "')";
        
        System.out.println("Adding Customer ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Customer");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Customer ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void updateCustomer(Customer c) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE customer SET nama_customer = '" + c.getNama()+ "', "
                + "no_telepon_customer = '" + c.getNo_telepon() + "', "
                + "tanggal_lahir_customer = '" + c.getTanggal_lahir()+ "', "
                + "alamat_customer = '" + c.getAlamat() + "'"
                + "WHERE (id_customer = '" + c.getId() + "')"; 
           System.out.println("Editing Customer ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Customer " + c.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Customer ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteCustomer(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM customer WHERE id_customer = '" + id + "'";
        System.out.println("Deleting Customer ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Customer " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Customer...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public List<Customer> showCustomerBySearch(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM customer WHERE "
                + "(id_customer LIKE '%"+query+"%'"
                + "OR nama_customer LIKE '%"+query+"%'"
                + "OR no_telepon_customer LIKE '%"+query+"%'"
                + "OR tanggal_lahir_customer LIKE '%"+query+"%'"
                + "OR alamat_customer LIKE '%"+query+"%')"
                ;
        System.out.println("Mengambil data customer ...");
        
        List<Customer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Customer c = new Customer(
                            rs.getInt("id_customer"),
                            rs.getString("nama_customer"),
                            rs.getString("no_telepon_customer"),
                            rs.getString("tanggal_bergabung"),
                            rs.getString("tanggal_lahir_customer"),
                            rs.getString("alamat_customer")
                    );
                    list.add(c);
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
    
    public Customer searchCustomerByID(int id){
        con = dbcon.makeConnection();
        String sql = "SELECT * FROM customer WHERE id_customer = '" + id + "'";
        System.out.println("Mengambil data Customer ....");
        Customer data = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                Customer c = new Customer(
                            rs.getInt("id_customer"),
                            rs.getString("nama_customer"),
                            rs.getString("no_telepon_customer"),
                            rs.getString("tanggal_bergabung"),
                            rs.getString("tanggal_lahir_customer"),
                            rs.getString("alamat_customer")
                    );
                data = c;
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return data;
    }
}
