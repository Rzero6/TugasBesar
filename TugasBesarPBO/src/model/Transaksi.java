/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 *
 * @author VICTUS
 */
public class Transaksi {
    private int id;
    private Customer pasien;
    private Staf dokter;
    private String tanggalTransaksi;
    private double biaya_klinik;
    private String status;
    
    public Transaksi(Customer pasien, Staf dokter) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggalTransaksi = dateTimeNowinString();
        this.biaya_klinik = 0;
        this.status = "Menunggu";
    }

    public Transaksi(int id, Customer pasien, Staf dokter, String tanggalTransaksi, double biaya_klinik, String status) {
        this.id = id;
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggalTransaksi = tanggalTransaksi;
        this.biaya_klinik = biaya_klinik;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Customer getPasien() {
        return pasien;
    }

    public Staf getDokter() {
        return dokter;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public double getBiaya_klinik() {
        return biaya_klinik;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPasien(Customer pasien) {
        this.pasien = pasien;
    }

    public void setDokter(Staf dokter) {
        this.dokter = dokter;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public void setBiaya_klinik(double biaya_klinik) {
        this.biaya_klinik = biaya_klinik;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String dateTimeNowinString(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }
    public String getDate(){
        return tanggalTransaksi.substring(0,10);
    }
    public String getTime(){
        return tanggalTransaksi.substring(11);
    }
}
