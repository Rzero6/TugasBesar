/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.MutasiDAO;
import java.util.List;
import model.Mutasi;
import table.TableMutasi;


/**
 *
 * @author VICTUS
 */
public class MutasiControl {
    private MutasiDAO mDao = new MutasiDAO();
    public void insertDataMutasi(Mutasi m){
        mDao.insertMutasi(m);
    }
    public Double getSaldo(){
        return mDao.getSaldo();
    }
    public List getListMutasi(String query){
        return mDao.getListMutasi(query);
    }
    public TableMutasi getTableMutasi(String query){
        List<Mutasi> dataMutasi = mDao.getListMutasi(query);
        TableMutasi tableMutasi = new TableMutasi(dataMutasi);
        return tableMutasi;
    }
}
