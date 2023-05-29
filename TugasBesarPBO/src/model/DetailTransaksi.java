/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;




public class DetailTransaksi {
    private int id_detail_transaksi;
    private int id_transaksi;
    private int id_obat;
    private int id_tindakan;
    private int jumlah_obat;

    public DetailTransaksi(int id_detail_transaksi, int id_transaksi, int id_obat, int id_tindakan, int jumlah_obat) {
        this.id_detail_transaksi = id_detail_transaksi;
        this.id_transaksi = id_transaksi;
        this.id_obat = id_obat;
        this.id_tindakan = id_tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public DetailTransaksi(int id_transaksi, int id_obat, int id_tindakan, int jumlah_obat) {
        this.id_transaksi = id_transaksi;
        this.id_obat = id_obat;
        this.id_tindakan = id_tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public int getId_detail_transaksi() {
        return id_detail_transaksi;
    }

    public void setId_detail_transaksi(int id_detail_transaksi) {
        this.id_detail_transaksi = id_detail_transaksi;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public int getId_tindakan() {
        return id_tindakan;
    }

    public void setId_tindakan(int id_tindakan) {
        this.id_tindakan = id_tindakan;
    }
    
    public int getJumlah_obat() {
        return jumlah_obat;
    }

    public void setJumlah_obat(int jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }
    
}
