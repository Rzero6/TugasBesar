/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 *
 * @author VICTUS
 */
public abstract class Perawatan {
    protected int id;
    protected String nama;
    protected double harga;

    public Perawatan(int id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public Perawatan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String toString(){
        return nama;
    }
}
