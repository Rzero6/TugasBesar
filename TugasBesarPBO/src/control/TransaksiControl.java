/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.TransaksiDAO;
import java.util.List;
import model.Transaksi;
import table.TablePasien;
import table.TablePeriksa;

/**
 *
 * @author VICTUS
 */
public class TransaksiControl {
    private TransaksiDAO tDao = new TransaksiDAO();
    
    public void insertDataTransaksi(Transaksi t){
        tDao.insertTransaksi(t);
    }
    public void updateStatusDataTransaksi(Transaksi t){
        tDao.updateStatusTransaksi(t);
    }
    public TablePeriksa showDataPeriksa(String query, String status){
        List<Transaksi> dataPeriksa = tDao.showTransaksi(query, status);
        TablePeriksa tablePeriksa = new TablePeriksa(dataPeriksa);
        return tablePeriksa;
    }
    
    public TablePasien showDataPasienPerDokter(String query, String status){
        List<Transaksi> dataPasien = tDao.showTransaksi(query, status);
        TablePasien tablePasien = new TablePasien(dataPasien);
        return tablePasien;
    }
}
