/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.PengadaanDAO;
import java.util.List;
import model.Pengadaan;
import table.TablePengadaan;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class PengadaanControl {
    private PengadaanDAO pDao = new PengadaanDAO();

    public void insertDataPengadaan(Pengadaan p) {
        pDao.insertPengadaan(p);
    }

    public List<Pengadaan> getListPengadaan(String query) {
        List<Pengadaan> dataPengadaan = pDao.getListPengadaan(query);
        return dataPengadaan;
    }

    public TablePengadaan getTableSuplier(String query) {
        List<Pengadaan> dataPengadaan = pDao.getListPengadaan(query);
        TablePengadaan tablePengadaan = new TablePengadaan(dataPengadaan);
        return tablePengadaan;
    }
}
