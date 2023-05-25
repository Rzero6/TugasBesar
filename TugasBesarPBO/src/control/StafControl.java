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
    private StafDAO sDao = new StafDAO();
    
    public void insertDataStaf(Staf s){
        sDao.insertStaf(s);
    }
    
    public void updateDataStaf(Staf s){
        sDao.updateStaf(s);
    }
    
    public void deleteStaf(int id){
        sDao.deleteStaf(id);
    }
    
    public List<Staf> showListStaf(String query){
        List<Staf> dataStaf = sDao.showStafBySearch(query);
        return dataStaf;
    }
    public TableStaf showDataStaf(String query){
        List<Staf> dataStaf = sDao.showStafBySearch(query);
        TableStaf tableStaf = new TableStaf(dataStaf);
        return tableStaf;
    }
    
    public Staf loginStaf(String username, String password){
        return sDao.loginStaf(username, password);
    }
}
