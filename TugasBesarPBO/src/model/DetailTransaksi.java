/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class DetailTransaksi {

    private int id_detail_transaksi;
    private int idTransaksi;
    private Transaksi transaksi;
    private Obat obat;
    private Tindakan tindakan;
    private int jumlah_obat;

    public DetailTransaksi(int idTransaksi, Obat obat, Tindakan tindakan, int jumlah_obat) {
        this.idTransaksi = idTransaksi;
        this.obat = obat;
        this.tindakan = tindakan;
        this.jumlah_obat = jumlah_obat;
    }
    
    
    public DetailTransaksi(int id_detail_transaksi, Transaksi transaksi, Obat obat, Tindakan tindakan, int jumlah_obat) {
        this.id_detail_transaksi = id_detail_transaksi;
        this.transaksi = transaksi;
        this.obat = obat;
        this.tindakan = tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public DetailTransaksi(Transaksi transaksi, Obat obat, Tindakan tindakan, int jumlah_obat) {
        this.transaksi = transaksi;
        this.obat = obat;
        this.tindakan = tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public int getId_detail_transaksi() {
        return id_detail_transaksi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setId_detail_transaksi(int id_detail_transaksi) {
        this.id_detail_transaksi = id_detail_transaksi;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public Tindakan getTindakan() {
        return tindakan;
    }

    public void setTindakan(Tindakan tindakan) {
        this.tindakan = tindakan;
    }

    public int getJumlah_obat() {
        return jumlah_obat;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setJumlah_obat(int jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }

}
