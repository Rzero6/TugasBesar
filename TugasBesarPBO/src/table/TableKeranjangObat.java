/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailTransaksi;

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
public class TableKeranjangObat extends AbstractTableModel {
    private List<DetailTransaksi> list;

    public TableKeranjangObat(List<DetailTransaksi> list) {
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
                return list.get(rowIndex).getObat().getNama();
            case 1 :
                return list.get(rowIndex).getJumlah_obat();
            case 2: 
                return list.get(rowIndex).getObat().getHarga();
            case 3 :
                return list.get(rowIndex).getId_detail_transaksi();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Nama Obat";
            case 1:
                return "Jumlah Obat";
            case 2:
                return "Harga Obat";
            default :
               return null;
        }
    }
}
