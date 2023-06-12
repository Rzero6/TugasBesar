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
        return 6;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getTanggal().substring(0, 10);
            case 1:
                return list.get(rowIndex).getTanggal().substring(11, 19);
            case 2:
                return list.get(rowIndex).getTipe();
            case 3:
                return list.get(rowIndex).getNominal();
            case 4:
                return list.get(rowIndex).getSaldo();
            case 5:
                return list.get(rowIndex).getDetail();
            case 6:
                return list.get(rowIndex).getIdMutasi();
            case 7:
                return list.get(rowIndex).getIdPengadaan();
            case 8:
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
                return "Jam";
            case 2:
                return "Tipe";
            case 3:
                return "Nominal";
            case 4:
                return "Saldo";
            case 5:
                return "Detail";
            default:
                return null;
        }
    }
}
