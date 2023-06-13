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
    public void updateDetailTransaksi(DetailTransaksi dt) {
        dtDAO.updateDetailTransaksi(dt);
    }
    public void deleteDetailTransaksi(int idDetailTransaksi){
        dtDAO.deleteDetailTransaksi(idDetailTransaksi);
    }
    
    public List<DetailTransaksi> getListDetailTransaksiByTransaksiID(String query, int id) {
        List<DetailTransaksi> dataDetailTransaksi = dtDAO.getListDetailTransaksiByTransaksiID(query, id);
        return dataDetailTransaksi;
    }

    public TableDetailTransaksi getTableDetailTransaksiByTransaksiID(String query, int id) {
        List<DetailTransaksi> dataDetailTransaksi = dtDAO.getListDetailTransaksiByTransaksiID(query, id);
        TableDetailTransaksi tableDetailTransaksi = new TableDetailTransaksi(dataDetailTransaksi);
        return tableDetailTransaksi;
    }
    
    public TableKeranjangObat showDataKeranjangObat(String query, int id){
        List<DetailTransaksi> dataDetailTransaksiObat = dtDAO.getListDetailTransaksiByTransaksiID(query, id);
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
        List<DetailTransaksi> dataDetailTransaksiTindakan = dtDAO.getListDetailTransaksiByTransaksiID(query, id);
        List<DetailTransaksi> filteredData = new ArrayList<>();
        for (DetailTransaksi detailTransaksi : dataDetailTransaksiTindakan) {
            if (detailTransaksi.getTindakan().getId() != 1) {
                filteredData.add(detailTransaksi);
            }
        }
        TableKeranjangTindakan tableDetailTransaksiTindakan = new TableKeranjangTindakan(filteredData);
        return tableDetailTransaksiTindakan;
    }
    
    //Digunain waktu beli obat/tindakan agar bisa ngecek apakah sudah ada detail transaksi yang memiliki id obat / id tindakan yang sama
    public int checkDetailSama(int idTransaksi, int idPerawatan,String jenis){
        return dtDAO.checkDetailSama(idTransaksi, idPerawatan, jenis);
    }
    public void updateJumlahObat(int id, int jumlah){
        dtDAO.updateJumlahObat(id, jumlah);
    }
}
