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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getPasien().getNama();
            case 1:
                return list.get(rowIndex).getDokter().getNama();
            case 2:
                return list.get(rowIndex).getStatus();
            case 3:
                return list.get(rowIndex).getTime();
            case 4:
                return list.get(rowIndex).getDate();
            default:
                return null;
        }
    }
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Pasien";
            case 1:
                return "Dokter";
            case 2:
                return "Status";
            case 3: 
                return "Jam";
            case 4:
                return "Tanggal";
            default:
                return null;
        }
    }
}
