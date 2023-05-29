/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailTransaksi;

/**
 *
 * @author dendy
 * Kelompok 14
 * Ryan Pratama Wijaya     | 210711008 | C
 * I Kadek Dendy Pramartha | 210711095 | C
 */
public class TableDetailTransaksi extends AbstractTableModel {
    
    private List<DetailTransaksi> list;

    public TableDetailTransaksi(List<DetailTransaksi> list) {
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount() {
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0 :
                return list.get(rowIndex).getTindakan().getNama();
            case 1 :
                return list.get(rowIndex).getObat().getNama();
            case 2 :
                return list.get(rowIndex).getJumlah_obat();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Nama Tindakan";
            case 1:
                return "Nama Obat";
            case 2:
                return "Jumlah Obat";
            default :
               return null;
        }
    }
    
    

}
