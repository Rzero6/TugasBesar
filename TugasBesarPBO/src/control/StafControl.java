/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.StafDAO;
import java.util.List;
import model.Staf;
import table.TableStaf;

/**
 *
 * @author VICTUS
 */
public class StafControl {
    private StafDAO oDao = new StafDAO();
    
    public void insertDataStaf(Staf s){
        oDao.insertStaf(s);
    }
    
    public void updateDataStaf(Staf s){
        oDao.updateStaf(s);
    }
    
    public void deleteStaf(int id){
        oDao.deleteStaf(id);
    }
    
    public List<Staf> showListStaf(String query){
        List<Staf> dataStaf = oDao.showStafBySearch(query);
        return dataStaf;
    }
    public TableStaf showDataStaf(String query){
        List<Staf> dataStaf = oDao.showStafBySearch(query);
        TableStaf tableStaf = new TableStaf(dataStaf);
        return tableStaf;
    }
}
