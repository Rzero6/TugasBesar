/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Mutasi;

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
public class TableMutasi extends AbstractTableModel{
    private List<Mutasi> list;
    public TableMutasi(List<Mutasi> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getTanggal();
            case 1:
                return list.get(rowIndex).getTipe();
            case 2:
                return list.get(rowIndex).getNominal();
            case 3:
                return list.get(rowIndex).getSaldo();
            case 4:
                return list.get(rowIndex).getDetail();
            case 5:
                return list.get(rowIndex).getIdMutasi();
            case 6:
                return list.get(rowIndex).getIdPengadaan();
            case 7:
                return list.get(rowIndex).getIdTransaksi();
            default: 
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Tanggal";
            case 1:
                return "Tipe";
            case 2:
                return "Nominal";
            case 3:
                return "Saldo";
            case 4:
                return "Detail";
            default:
                return null;
        }
    }
}
