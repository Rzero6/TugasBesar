/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ObatDAO;
import java.util.List;
import model.Obat;
import table.TableObat;

/**
 * Nama : Reynold Kunarto NPM : 210711015
 *
 * Nama : Febiola Ika Putri Wibowo NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class ObatControl {

    private ObatDAO oDao = new ObatDAO();

    public void insertDataObat(Obat o) {
        oDao.insertObat(o);
    }

    public void updateDataObat(Obat o) {
        oDao.updateObat(o);
    }

    public void deleteObat(int id) {
        oDao.deleteObat(id);
    }
    public Obat searchObat(String query){
        return oDao.searchObat(query);
    }
    public List<Obat> showListObat(String query) {
        List<Obat> dataObat = oDao.showObatBySearch(query);
        return dataObat;
    }

    public TableObat showDataObat(String query) {
        List<Obat> dataObat = oDao.showObatBySearch(query);
        if(!dataObat.isEmpty()){
            if(dataObat.get(0).getId()==1){
                dataObat.remove(0);
            }
        }
        TableObat tableObat = new TableObat(dataObat);
        return tableObat;
    }
    public void updateJumlahObat(int id, int jumlah, String tipe){
        oDao.updateJumlahObat(id, jumlah, tipe);
    }
}
