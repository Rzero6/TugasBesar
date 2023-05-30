/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import dao.Detail_TransaksiDAO;


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
    private String keluhan;
    private String diagnosis;
    private Detail_TransaksiDAO dtDAO;
    
    public Transaksi(Customer pasien, Staf dokter,String keluhan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggalTransaksi = dateTimeNowinString();
        this.biaya_klinik = 50000;
        this.status = "Menunggu";
        this.keluhan = keluhan;
        this.diagnosis = "Belum";
    }

    public Transaksi(int id, Customer pasien, Staf dokter, String tanggalTransaksi, double biaya_klinik, String status, String keluhan, String diagnosis) {
        this.id = id;
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggalTransaksi = tanggalTransaksi;
        this.biaya_klinik = biaya_klinik;
        this.status = status;
        this.keluhan = keluhan;
        this.diagnosis = diagnosis;
    }

    public Transaksi(int id, String tanggalTransaksi, double biaya_klinik, String status, String diagnosis) {
        this.id = id;
        this.tanggalTransaksi = tanggalTransaksi;
        this.biaya_klinik = biaya_klinik;
        this.status = status;
        this.diagnosis = diagnosis;
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

    public String getKeluhan() {
        return keluhan;
    }

    public String getDiagnosis() {
        return diagnosis;
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

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
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
    
    public double totalHarga (int id){
        double total=50000; 
        List<DetailTransaksi> list = dtDAO.showDetailTransaksi("",id);
        for(DetailTransaksi temp : list){
            if(temp.getTransaksi().getId() == id && temp.getObat().getId() != 1 && temp.getTindakan().getId()!=1){
                total += (temp.getObat().getHarga()*temp.getJumlah_obat()) + temp.getTindakan().getHarga();
            }else if (temp.getTransaksi().getId() == id && temp.getObat().getId() == 1){
                total += (0*temp.getJumlah_obat()) + temp.getTindakan().getHarga();
            }else if (temp.getTransaksi().getId() == id && temp.getTindakan().getId()==1){
                total += (temp.getObat().getHarga()*temp.getJumlah_obat()) + 0;
            }else{
                total = total;
            }
        }
        return total;
    }
}
