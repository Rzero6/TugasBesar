/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author VICTUS
 */
public abstract class Orang {
    protected int id;
    protected String nama;
    protected String no_telepon;
    protected String tanggal_bergabung;

    public Orang(int id, String nama, String no_telepon, String tanggal_bergabung) {
        this.id = id;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.tanggal_bergabung = tanggal_bergabung;
    }
    
    public Orang(String nama, String no_telepon) {
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.tanggal_bergabung = setTanggalBergabung();
    }
    @Override
    public String toString(){
        return nama;
    }
    private String setTanggalBergabung(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return (String) sdf.format(new Date());
    }
}
