/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.TransaksiDAO;
import java.util.List;
import model.Transaksi;
import table.TableBayar;
import table.TablePasien;
import table.TablePeriksa;
import table.TableRiwayat;

/**
 *
 * @author VICTUS
 */
public class TransaksiControl {
    private TransaksiDAO tDao = new TransaksiDAO();
    private DetailTransaksiControl detailTransaksiControl = new DetailTransaksiControl();
    public void insertDataTransaksi(Transaksi t){
        tDao.insertTransaksi(t);
    }
    public void updateStatusDataTransaksi(Transaksi t){
        tDao.updateStatusTransaksi(t);
    }
    public void deleteTransaksi(int id){
        tDao.deleteTransaksi(id);
    }
    public TablePeriksa showDataPeriksa(String query){
        List<Transaksi> dataPeriksa = tDao.showTransaksi(query, "Menunggu");
        TablePeriksa tablePeriksa = new TablePeriksa(dataPeriksa);
        return tablePeriksa;
    }
    
    public TablePasien showDataPasienPerDokter(int idDokter, String status){
        List<Transaksi> dataPasien = tDao.showTransaksiPerDokter(idDokter, status);
        TablePasien tablePasien = new TablePasien(dataPasien);
        return tablePasien;
    }
    
    public TableBayar showDataPembayaranCustomer (String query, String status){
        List<Transaksi> dataPembayaran = tDao.showTransaksi(query, status);
        for(int i=0;i<dataPembayaran.size();i++){
            dataPembayaran.get(i).setDetailTransaksiList(detailTransaksiControl.getListDetailTransaksiByTransaksiID("", dataPembayaran.get(i).getId()));
        }
        TableBayar tablePembayaran = new TableBayar(dataPembayaran);
        return tablePembayaran;
    }
    
    public TableRiwayat showRiwayatTransaksiDokter (String query, String status){
        List<Transaksi> dataRiwayat = tDao.showTransaksi(query, status);
        TableRiwayat tableRiwayatDokter = new TableRiwayat(dataRiwayat);
        return tableRiwayatDokter;
    }
        
    public Transaksi searchTransaksi(int id){
        return tDao.searchTransaksi(id);
    }
    public String checkTransaksiForMultipleUndoneTransaction(int id){//Untuk mengecek tidak terdapat multi pasien dalam transaksi
        return tDao.checkTransaksiForMultipleUndoneTransaction(id);
    }
}
