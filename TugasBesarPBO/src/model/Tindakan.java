/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
/**
 *
 * @author VICTUS
 */
public class Tindakan extends Perawatan {

    public Tindakan(int id, String nama, double harga) {
        super(id, nama, harga);
    }

    public Tindakan(String nama, double harga) {
        super(nama, harga);
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
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
