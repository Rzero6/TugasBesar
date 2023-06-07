/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;


/**
 *
 * @author VICTUS
 */
public class Supplier {
    private int idSupplier;
    private String nama;
    private String no_telepon;
    private String email;

    public Supplier(int idSupplier, String nama, String no_telepon, String email) {
        this.idSupplier = idSupplier;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.email = email;
    }

    public Supplier(String nama, String no_telepon, String email) {
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.email = email;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return nama;
    }
}
