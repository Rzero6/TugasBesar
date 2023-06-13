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
public class TableRiwayatPeriksaDokter extends AbstractTableModel {
    public List<Transaksi> list;
    public TableRiwayatPeriksaDokter(List<Transaksi> list){
        this.list = list;
    }
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getDate();
            case 2:
                return list.get(rowIndex).getPasien().getNama();
            case 3:
                return list.get(rowIndex).getPasien().getUmur();
            case 4:
                return list.get(rowIndex).getKeluhan();
            case 5:
                return list.get(rowIndex).getDiagnosis();
            case 6:
                return list.get(rowIndex).getStatus();
            case 7:
                return list.get(rowIndex).getId();
            case 8:
                return list.get(rowIndex).getTanggalTransaksi();
            case 9:
                return list.get(rowIndex).getPasien().getId();
            case 10:
                return list.get(rowIndex).getDokter().getId();
            case 11:
                return list.get(rowIndex).getBiaya_klinik();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Tanggal Transaksi";
            case 2:
                return "Nama";
            case 3:
                return "Umur";
            case 4:
                return "Keluhan";
            case 5:
                return "Diagnosis";
            case 6:
                return "Total Harga";    
            case 7:
                return "Status";
            
            default:
                return null;
        }
    }
    
}
