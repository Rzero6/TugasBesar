/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public class Obat extends Perawatan {
    private int stok;

    public Obat(int id, String nama, double harga,int stok) {
        super(id, nama, harga);
        this.stok = stok;
    }

    public Obat(String nama, double harga,int stok) {
        super(nama, harga);
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
