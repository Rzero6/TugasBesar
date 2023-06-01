/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailTransaksi;
import model.Transaksi;

/**
 *
 * @author dendy
 * Kelompok 14
 * Ryan Pratama Wijaya     | 210711008 | C
 * I Kadek Dendy Pramartha | 210711095 | C
 */
public class TableBayar extends AbstractTableModel {
    private List<Transaksi> list;
    
    public TableBayar(List<Transaksi> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getPasien().getNama();
            case 2:
                return list.get(rowIndex).getDokter().getNama();
            case 3 :
                return list.get(rowIndex).getTanggalTransaksi();
            case 4:
                return list.get(rowIndex).getStatus();
            case 5:
                return list.get(rowIndex).getKeluhan();
            case 6 :
                return list.get(rowIndex).getDiagnosis();
            case 7 :
                return list.get(rowIndex).totalHarga(list.get(rowIndex).getId());
            default:
                return null;
        }
    }
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID Transaksi";
            case 1:
                return "Pasien";
            case 2:
                return "Dokter";
            case 3 :
                return "Tanggal Transaksi";
            case 4:
                return "Status";
            case 5: 
                return "Keluhan";
            case 6 :
                return "Diagnosis";
            case 7:
                return "Total Harga";
            default:
                return null;
        }
    }

}
