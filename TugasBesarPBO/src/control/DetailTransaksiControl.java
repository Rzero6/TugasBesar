/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.Detail_TransaksiDAO;
import java.util.List;
import model.DetailTransaksi;
import table.TableDetailTransaksi;

/**
 *
 * Jean Alexsander Caesar | 210711427 | C Gloria Estefania Yaspis | 210711481 |
 * C
 *
 * @author USER
 */
public class DetailTransaksiControl {

    private Detail_TransaksiDAO dtDAO = new Detail_TransaksiDAO();

    public void insertDetailTransaksi(DetailTransaksi dt) {
        dtDAO.insertDetailTransaksi(dt);
    }

    public void deleteDetailTransaksi(int id) {
        dtDAO.deleteDetailTransaksi(id);
    }

    public List<DetailTransaksi> showListDetailTransaksi(String query, int id) {
        List<DetailTransaksi> dataDetailTransaksi = dtDAO.showDetailTransaksi(query, id);
        return dataDetailTransaksi;
    }

    public TableDetailTransaksi showDataDetailTransaksi(String query, int id) {
        List<DetailTransaksi> dataDetailTransaksi = dtDAO.showDetailTransaksi(query, id);
        TableDetailTransaksi tableDetailTransaksi = new TableDetailTransaksi(dataDetailTransaksi);
        return tableDetailTransaksi;
    }

}
