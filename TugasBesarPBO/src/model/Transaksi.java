/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.Detail_TransaksiDAO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
    private List<DetailTransaksi> detailTransaksiList;
    
    
    //String stringBuilder = "";

    public Transaksi(Customer pasien, Staf dokter, String keluhan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggalTransaksi = dateTimeNowinString();
        this.biaya_klinik = 50000;
        this.status = "Menunggu";
        this.keluhan = keluhan;
        this.diagnosis = "Belum ada";
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

    public List<DetailTransaksi> getDetailTransaksiList() {
        return detailTransaksiList;
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

    public void setDetailTransaksiList(List<DetailTransaksi> detailTransaksiList) {
        this.detailTransaksiList = detailTransaksiList;
    }

    public String dateTimeNowinString() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }

    public String getDate() {
        return tanggalTransaksi.substring(0, 10);
    }

    public String getTime() {
        return tanggalTransaksi.substring(11);
    }

    public double totalHarga() {
        double total = biaya_klinik;
        for (DetailTransaksi temp : detailTransaksiList) {
            if (temp.getTransaksi().getId() == id && temp.getObat().getId() != 1 && temp.getTindakan().getId() != 1) {
                total += (temp.getObat().getHarga() * temp.getJumlah_obat()) + temp.getTindakan().getHarga();
            } else if (temp.getTransaksi().getId() == id && temp.getObat().getId() == 1) {
                total += (0 * temp.getJumlah_obat()) + temp.getTindakan().getHarga();
            } else if (temp.getTransaksi().getId() == id && temp.getTindakan().getId() == 1) {
                total += (temp.getObat().getHarga() * temp.getJumlah_obat()) + 0;
            }
        }
        return total;
    }

    public String showNota() {
        String text = "";
        text+="===========================================================\n";
        text+="\t\tAtma Universal Clinic\n";
        text+="\tJl.Seturan Raya 0567, Kab. Sleman, DI Yogyakarta\n";
        text+="\t\tTelp: 081227212892\n";
        text+="===========================================================\n";
        text+="Tanggal\t: " + getDate() + "  " + getTime().substring(0,8) + "\n";
        text+="===========================================================\n";
        text+="Pelanggan\t: " + getPasien().getNama() + "\n";
        text+="Dokter\t: " + getDokter() + "\n";
        text+="Diagnosis\t: " + getDiagnosis() + "\n";
        text+="===========================================================\n";
        text+="\n------------------------------------------------------------------------------------------------";
        text+="\nObat\tHarga\tTotal\n\n";
        
        for (DetailTransaksi temp : detailTransaksiList) {
            if(temp.getObat().getId() != 1){
                text+=temp.getObat().getNama() + "\t" + temp.getJumlah_obat() + " x " + temp.getObat().getHarga() + "\tRp " + temp.getObat().getHarga() * temp.getJumlah_obat() +"\n";
                //text+="------------------------------------------------------------------------------------------------\n";
            }
        }
        text+="\n------------------------------------------------------------------------------------------------";
        text+="\nTindakan\t\t\t\n\n";
        
        for (DetailTransaksi temp : detailTransaksiList) {
            if(temp.getTindakan().getId() != 1){
                text+=temp.getTindakan().getNama() + "\t\tRp " + temp.getTindakan().getHarga()+ "\n";
                //text+="------------------------------------------------------------------------------------------------\n";
            }
        }
        text+="\n------------------------------------------------------------------------------------------------";
        text+= "\nBiaya Klinik \t\tRp "+biaya_klinik;
        text+="\n===========================================================\n";
        text+= "\nTotal Harga \t\tRp "+totalHarga();
        return text;
    }
}
