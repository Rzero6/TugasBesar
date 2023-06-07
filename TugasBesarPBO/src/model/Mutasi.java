/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public class Mutasi {
    private int idMutasi;
    private int idTransaksi;
    private int idPengadaan;
    private double nominal;
    private double saldo;
    private String detail;
    private String tipe;

    public Mutasi(int idMutasi, int idTransaksi, int idPengadaan, double nominal, double saldo, String detail, String tipe) {
        this.idMutasi = idMutasi;
        this.idTransaksi = idTransaksi;
        this.nominal = nominal;
        this.saldo = saldo;
        this.detail = detail;
        this.tipe = tipe;
    }

    public Mutasi(int idTransaksi, int idPengadaan, double nominal, double saldo, String detail, String tipe) {
        this.idTransaksi = idTransaksi;
        this.idPengadaan = idPengadaan;
        this.nominal = nominal;
        this.saldo = saldo;
        this.detail = detail;
        this.tipe = tipe;
    }

    public int getIdMutasi() {
        return idMutasi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getIdPengadaan() {
        return idPengadaan;
    }

    public double getNominal() {
        return nominal;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDetail() {
        return detail;
    }

    public String getTipe() {
        return tipe;
    }

    public void setIdMutasi(int idMutasi) {
        this.idMutasi = idMutasi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setIdPengadaan(int idPengadaan) {
        this.idPengadaan = idPengadaan;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
}
