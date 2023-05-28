/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.CustomerDAO;
import java.util.List;
import model.Customer;
import table.TableCustomer;


/**
 *
 * @author VICTUS
 */
public class CustomerControl {
    private CustomerDAO cDao = new CustomerDAO();
    
    public void insertDataCustomer(Customer c){
        cDao.insertCustomer(c);
    }
    public void updateDataCustomer(Customer c){
        cDao.updateCustomer(c);
    }
    public void deleteCustomer(int id){
        cDao.deleteCustomer(id);
    }
    public List<Customer> showListCustomer(String query){
        List<Customer> dataCustomer = cDao.showCustomerBySearch(query);
        return dataCustomer;
    }
    public TableCustomer showDataCustomer(String query){
        List<Customer> dataCustomer = cDao.showCustomerBySearch(query);
        TableCustomer tableCustomer = new TableCustomer(dataCustomer);
        return tableCustomer;
    }
}
