/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pengadaan;

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
public class TablePengadaan extends AbstractTableModel{
    private List<Pengadaan> list;
    public TablePengadaan(List<Pengadaan> list){
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
                return list.get(rowIndex).getTanggal();
            case 1:
                return list.get(rowIndex).getObat().getNama();
            case 2:
                return list.get(rowIndex).getObat().getHarga();
            case 3:
                return list.get(rowIndex).getJumlah_obat();
            case 4:
                return (list.get(rowIndex).getObat().getHarga() * list.get(rowIndex).getJumlah_obat());
            case 5:
                return list.get(rowIndex).getObat().getStok();
            case 6:
                return list.get(rowIndex).getSupplier().getNama();
            case 7:
                return list.get(rowIndex).getSupplier().getNo_telepon();
            case 8:
                return list.get(rowIndex).getSupplier().getEmail();
            case 9:
                return list.get(rowIndex).getIdPengadaan();
            case 10:
                return list.get(rowIndex).getIdObat();
            case 11:
                return list.get(rowIndex).getIdSupplier();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Tanggal";
            case 1:
                return "Nama Obat";
            case 2:
                return "Harga";
            case 3:
                return "Jumlah";
            case 4:
                return "Total";
            case 5:
                return "Stok";
            case 6:
                return "Nama Supplier";
            case 7:
                return "No Telepon";
            case 8:
                return "Email";
            default:
                return null;
        }
    }
}
