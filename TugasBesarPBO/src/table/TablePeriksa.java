/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Transaksi;


/**
 *
 * @author VICTUS
 */
public class TablePeriksa extends AbstractTableModel {
    private List<Transaksi> list;
    
    public TablePeriksa(List<Transaksi> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getPasien().getNama();
            case 2:
                return list.get(rowIndex).getDokter().getNama();
            case 3:
                return list.get(rowIndex).getKeluhan();
            case 4:
                return list.get(rowIndex).getStatus();
            case 5:
                return list.get(rowIndex).getId();
            default:
                return null;
        }
    }
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Pasien";
            case 2:
                return "Dokter";
            case 3:
                return "Keluhan";
            case 4: 
                return "Status";
            default:
                return null;
        }
    }
}
