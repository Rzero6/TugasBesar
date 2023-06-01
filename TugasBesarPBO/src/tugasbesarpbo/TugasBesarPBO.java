/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbesarpbo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.Customer;
import model.DetailTransaksi;
import model.Obat;
import model.Staf;
import model.Tindakan;
import model.Transaksi;

/**
 *
 *
 * @author VICTUS
 */
public class TugasBesarPBO {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String sqlDateTime = currentDateTime.format(formatter);
        System.out.println("Current date and time: " + sqlDateTime);
        Customer customer = new Customer(1, "Jean", "08222350", "2017-06-29", "2003-04-26", "jalan sukabumi");
        Staf staf = new Staf(1, "Dendy", "90088647", "2015-08-29", "dokter", "dendy", "dendy");
        Transaksi transaksi = new Transaksi(0, customer, staf, "2015-08-29 20:19:29", 50000, "selesai", "pusing", "migran");
        Obat obat = new Obat(1, "Paracetamol", 5000, 2);
        Tindakan tindakan = new Tindakan(1, "suntik", 10000);
        DetailTransaksi detailtransaksi = new DetailTransaksi(1, transaksi, obat, tindakan, 2);
        transaksi.showNota(2);

    }

}
