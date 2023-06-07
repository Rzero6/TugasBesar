/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public class Pengadaan {
    private int idPengadaan;
    private int idObat;
    private int idSupplier;
    private int jumlah_obat;
    private Supplier supplier;
    private Obat obat;
    private String tanggal;

    public Pengadaan(int idPengadaan, int idObat, int idSupplier, int jumlah_obat, String tanggal) {
        this.idPengadaan = idPengadaan;
        this.idObat = idObat;
        this.idSupplier = idSupplier;
        this.jumlah_obat = jumlah_obat;
        this.tanggal = tanggal;
    }

    public Pengadaan(int idObat, int idSupplier, int jumlah_obat,String tanggal) {
        this.idObat = idObat;
        this.idSupplier = idSupplier;
        this.jumlah_obat = jumlah_obat;
        this.tanggal = tanggal;
    }

    public int getIdPengadaan() {
        return idPengadaan;
    }

    public Obat getObat() {
        return obat;
    }

    public int getIdSupplier() {
        return idSupplier;
    }
    
    public int getIdObat() {
        return idObat;
    }

    public int getJumlah_obat() {
        return jumlah_obat;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setIdPengadaan(int idPengadaan) {
        this.idPengadaan = idPengadaan;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public void setJumlah_obat(int jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    public void setIdObat(int idObat) {
        this.idObat = idObat;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
}
