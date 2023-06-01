/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class DetailTransaksi {

    private int id_detail_transaksi;
    private Transaksi transaksi;
    private Obat obat;
    private Tindakan tindakan;
    private int jumlah_obat;

    public DetailTransaksi(int id_detail_transaksi, Transaksi transaksi, Obat obat, Tindakan tindakan, int jumlah_obat) {
        this.id_detail_transaksi = id_detail_transaksi;
        this.transaksi = transaksi;
        this.obat = obat;
        this.tindakan = tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public DetailTransaksi(Transaksi transaksi, Obat obat, Tindakan tindakan, int jumlah_obat) {
        this.transaksi = transaksi;
        this.obat = obat;
        this.tindakan = tindakan;
        this.jumlah_obat = jumlah_obat;
    }

    public int getId_detail_transaksi() {
        return id_detail_transaksi;
    }

    public void setId_detail_transaksi(int id_detail_transaksi) {
        this.id_detail_transaksi = id_detail_transaksi;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public Tindakan getTindakan() {
        return tindakan;
    }

    public void setTindakan(Tindakan tindakan) {
        this.tindakan = tindakan;
    }

    public int getJumlah_obat() {
        return jumlah_obat;
    }

    public void setJumlah_obat(int jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }

    public void showNota() {
        System.out.println("===============================");
        System.out.println("Atma Universal Clinic");
        System.out.println("Jl.Seturan Raya 0567, Kab. Sleman, DI Yogyakarta");
        System.out.println("Telp: 081227212892");
        System.out.println("===============================");
//        System.out.println("No. Struk: " + receiptNumber);
        System.out.println("Tanggal: " + transaksi.getDate() + "\t\t\t" + transaksi.getTime());
        System.out.println(transaksi.getId());
        System.out.println("===============================");
        System.out.println("Pelanggan: " + transaksi.getPasien().getNama());
        System.out.println("Dokter: " + transaksi.getDokter());
        System.out.println("Diagnosis: " + transaksi.getDiagnosis());
        System.out.println("===============================");
        System.out.println("Tindaka");
        System.out.println("Obat\t\tJumlah\tHarga\t\tTotal");
        System.out.println("-----------------------------");
        System.out.println(obat.getNama() + "\t" + getJumlah_obat() + "\t" + obat.getHarga() + "\t\t" + obat.getHarga() * getJumlah_obat());
        System.out.println("-----------------------------");
        System.out.println("Tindakan\t\t\t");
        System.out.println("-----------------------------");
        System.out.println(getTindakan().getNama() + "\t\t\t\t\t" + getTindakan().getHarga());
        System.out.println("Total:\t\t\t" + transaksi.totalHarga(transaksi.getId()));
        System.out.println("===============================");

    }

}
