/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.TindakanDAO;
import model.Tindakan;
import java.util.List;
import table.TableTindakan;


public class TindakanControl {
    private TindakanDAO tDao = new TindakanDAO();
    
    public void insertTindakan(Tindakan t){
        tDao.insertTindakan(t);
    }
    
    public void updateTindakan(Tindakan t){
        tDao.updateTindakan(t);
    }
    
    public void deleteTindakan(int id){
        tDao.deleteTindakan(id);
    }
    
    public List showListTindakan(String query){
        List<Tindakan> dataTindakan = tDao.showTindakanBySearch(query);
        return dataTindakan;
    }
    
    public TableTindakan showDataTindakan(String query) {
        List<Tindakan> dataTindakan = tDao.showTindakanBySearch(query);
        dataTindakan.remove(0);
        TableTindakan tableTindakan = new TableTindakan(dataTindakan);
        return tableTindakan;
    }
}
