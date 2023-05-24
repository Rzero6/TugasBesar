/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Staf;

/**
 *
 * @author VICTUS
 */
public class TableStaf extends AbstractTableModel {
        
    private List<Staf> list;
    
    public TableStaf(List<Staf> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 7;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getJabatan(); 
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                return list.get(rowIndex).getNo_telepon();
            case 4:
                return list.get(rowIndex).getTanggal_bergabung();
            case 5:
                return list.get(rowIndex).getUsername();
            case 6:
                return list.get(rowIndex).getPassword();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Jabatan";
            case 2:
                return "Nama";
            case 3:
                return "No Telepon";
            case 4:
                return "Tanggal Bergabung";
            case 5:
                return "Username";
            case 6:
                return "Password";
            default:
                return null;
        }
    }
}
