/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public class Customer extends Orang {
    private int usia;
    private String alamat;

    public Customer(int id, String nama, String no_telepon, String tanggal_bergabung,int usia, String alamat) {
        super(id, nama, no_telepon, tanggal_bergabung);
        this.usia = usia;
        this.alamat = alamat;
    }

    public Customer(String nama, String no_telepon, String tanggal_bergabung,int usia, String alamat) {
        super(nama, no_telepon, tanggal_bergabung);
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getUsia() {
        return usia;
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

    public void setUsia(int usia) {
        this.usia = usia;
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

    
}
