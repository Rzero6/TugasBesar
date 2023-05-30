/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.Detail_TransaksiDAO;
import java.util.ArrayList;
import java.util.List;
import model.DetailTransaksi;
import table.TableDetailTransaksi;
import table.TableKeranjangObat;
import table.TableKeranjangTindakan;

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

    public void deleteAllDetailTransaksiFromIDTransaksi(int idTransaksi) {
        dtDAO.deleteAllDetailTransaksiFromIDTransaksi(idTransaksi);
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
    
    public TableKeranjangObat showDataKeranjangObat(String query, int id){
        List<DetailTransaksi> dataDetailTransaksiObat = dtDAO.showDetailTransaksi(query, id);
        List<DetailTransaksi> filteredData = new ArrayList<>();
        for (DetailTransaksi detailTransaksi : dataDetailTransaksiObat) {
            if (detailTransaksi.getObat().getId() != 1) {
                filteredData.add(detailTransaksi);
            }
        }
        TableKeranjangObat tableDetailTransaksiObat = new TableKeranjangObat(filteredData);
        return tableDetailTransaksiObat;
    }
    public TableKeranjangTindakan showDataKeranjangTindakan(String query, int id){
        List<DetailTransaksi> dataDetailTransaksiTindakan = dtDAO.showDetailTransaksi(query, id);
        List<DetailTransaksi> filteredData = new ArrayList<>();
        for (DetailTransaksi detailTransaksi : dataDetailTransaksiTindakan) {
            if (detailTransaksi.getTindakan().getId() != 1) {
                filteredData.add(detailTransaksi);
            }
        }
        TableKeranjangTindakan tableDetailTransaksiTindakan = new TableKeranjangTindakan(filteredData);
        return tableDetailTransaksiTindakan;
    }

}
