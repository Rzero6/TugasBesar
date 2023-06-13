/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package KasirDashboard;

/**
 *
 * @author dendy
 * Kelompok 14
 * Ryan Pratama Wijaya     | 210711008 | C
 * I Kadek Dendy Pramartha | 210711095 | C
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCustom extends JTable {

    public TableCustom() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
               TableHeader header = new TableHeader(o + "");
                header.setBackground(new Color(76, 172, 188));
                header.setForeground(new Color(255,255,255));
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
//                System.out.println("column : "+(jtable.getColumnCount()-1));
                if (i1 != jtable.getColumnCount()-1) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                     if (selected) {
                        com.setBackground(new Color(3,104,218));
                        com.setForeground(new Color(255,255,255));
                    } else {
                         if (i % 2 == 0) {
                             com.setBackground(new Color(255, 255, 255));
                        } else {
                            com.setBackground(new Color(198,231,255));
                        }
                          com.setForeground(new Color(3,104,218));
                    }
                    return com;
                }else {
                   Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                     if (selected) {
                        com.setBackground(new Color(3,104,218));
                        com.setForeground(new Color(255,255,255));
                    } else {
                         if (i % 2 == 0) {
                             com.setBackground(new Color(255, 255, 255));
                        } else {
                            com.setBackground(new Color(198,231,255));
                        }
                          com.setForeground(new Color(3,104,218));
                    }
                    return com;
//                     StatusType type = (StatusType) o;
//                    if (i % 2 == 0) {
//                        CellStatus cell = new CellStatus(type,new Color(255, 255, 255));
//                         return cell;
//                    }else{
//                        CellStatus cell = new CellStatus(type,new Color(198,231,255));
//                        return cell;
//                    }
                }
            }
        });    
    }
        

}