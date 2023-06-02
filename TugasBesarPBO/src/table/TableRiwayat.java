/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Transaksi;
 
public class TableRiwayat extends AbstractTableModel {
   private List<Transaksi> list;
    
    public TableRiwayat(List<Transaksi> list){
        this.list = list;
    }
    
   @Override
    public int getRowCount(){
        return list.size();
    }
    
   @Override
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
            case 2 :
                return list.get(rowIndex).getTanggalTransaksi();
            case 3:
                return list.get(rowIndex).getStatus();
            case 4:
                return list.get(rowIndex).getKeluhan();
            case 5:
                return list.get(rowIndex).getDiagnosis();
            default:
                return null;
        }
    }
   @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID Transaksi";
            case 1:
                return "Pasien";
            case 2 :
                return "Tanggal Transaksi";
            case 3:
                return "Status";
            case 4: 
                return "Keluhan";
            case 5 :
                return "Diagnosis";
            default:
                return null;
        }
    } 
}

