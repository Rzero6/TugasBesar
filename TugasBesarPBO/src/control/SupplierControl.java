/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.SupplierDAO;
import java.util.List;
import model.Supplier;
import table.TableSupplier;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class SupplierControl {
    private SupplierDAO sDao = new SupplierDAO();

    public void insertDataSupplier(Supplier s) {
        sDao.insertSupplier(s);
    }

    public void updateDataSupplier(Supplier s) {
        sDao.updateSupplier(s);
    }

    public void deleteSupplier(int id) {
        sDao.deleteSupplier(id);
    }
    
    public Supplier searchSupplier(String query){
        return sDao.searchSupplier(query);
    }

    public List<Supplier> getListSupplier(String query) {
        List<Supplier> dataSupplier = sDao.getListSupplier(query);
        return dataSupplier;
    }

    public TableSupplier getTableSuplier(String query) {
        List<Supplier> dataSupplier = sDao.getListSupplier(query);
        TableSupplier tableSupplier = new TableSupplier(dataSupplier);
        return tableSupplier;
    }
}
