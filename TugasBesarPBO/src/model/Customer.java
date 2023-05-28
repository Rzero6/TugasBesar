/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author VICTUS
 */
public class Customer extends Orang {
    private String tanggal_lahir;
    private String alamat;

    public Customer(int id, String nama, String no_telepon, String tanggal_bergabung,String tanggal_lahir, String alamat) {
        super(id, nama, no_telepon, tanggal_bergabung);
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
    }

    public Customer(String nama, String no_telepon, String tanggal_bergabung,String tanggal_lahir, String alamat) {
        super(nama, no_telepon, tanggal_bergabung);
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public String getTanggal_bergabung() {
        return tanggal_bergabung;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public void setTanggal_bergabung(String tanggal_bergabung) {
        this.tanggal_bergabung = tanggal_bergabung;
    }
    
    public int getUmur(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate born;
        LocalDate current = LocalDate.now();
        born = LocalDate.parse(tanggal_lahir,format);
        Period age = Period.between(born, current);
        return (int) age.getYears();
    }
    
}
