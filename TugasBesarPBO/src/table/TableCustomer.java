/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Customer;

/**
 *
 * @author VICTUS
 */
public class TableCustomer extends AbstractTableModel {
    private List<Customer> list;
    
    public TableCustomer(List<Customer> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getNo_telepon();
            case 3:
                return list.get(rowIndex).getAlamat();
            case 4:
                return list.get(rowIndex).getTanggal_lahir();
            case 5:
                return list.get(rowIndex).getTanggal_bergabung();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "No. Telepon";
            case 3: 
                return "Alamat";
            case 4:
                return "Tanggal Lahir";
            case 5:
                return "Tanggal Bergabung";
            default:
                return null;
        }
    }
    
}
