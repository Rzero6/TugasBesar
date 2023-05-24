/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public class Staf extends Orang {
    
    private String jabatan;
    private String username;
    private String password;

    public Staf(int id, String nama, String no_telepon, String tanggal_bergabung,String jabatan,  String username, String password) {
        super(id, nama, no_telepon, tanggal_bergabung);
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    public Staf(String nama, String no_telepon, String tanggal_bergabung,String jabatan, String username, String password) {
        super(nama, no_telepon, tanggal_bergabung);
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJabatan() {
        return jabatan;
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

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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
