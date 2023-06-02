package table;


import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Tindakan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class TableTindakan extends AbstractTableModel {
    private List<Tindakan> list;
    public TableTindakan(List<Tindakan> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getHarga();
//            case 3:
//                return list.get(rowIndex).getStok();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Harga";
//            case 3:
//                return "Stok";
            default:
                return null;
        }
    }
}
