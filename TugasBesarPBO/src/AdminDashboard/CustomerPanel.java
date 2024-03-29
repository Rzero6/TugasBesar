/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.CustomerControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import model.Customer;

/**
 *
 * @author VICTUS
 */
public class CustomerPanel extends javax.swing.JPanel implements IPanelAdmin{

    /**
     * Creates new form CustomerPanel
     */
    private CustomerControl customerControl;
    int selectedID=0;
    public CustomerPanel() {
        initComponents();
        customerControl = new CustomerControl();
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        setBorderandFocus(searchTxt);
        setTableCustomer("");
        setListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableCustomer = new KasirDashboard.TableCustom();
        searchTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableCustomer);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 820, 400));
        add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 360, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchTxt;
    private KasirDashboard.TableCustom tableCustomer;
    // End of variables declaration//GEN-END:variables

    private void setBorderandFocus(JComponent comp){
        comp.putClientProperty(FlatClientProperties.STYLE, ""
                +"borderWidth:1;"
                + "focusWidth:0");
    }


    private void setTableCustomer(String string) {
        tableCustomer.setModel(customerControl.showDataCustomer(string));
    }

    private void setListener() {
        
        searchTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTableCustomer(searchTxt.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTableCustomer(searchTxt.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTableCustomer(searchTxt.getText());
            }
        });
    }

    private void clearAll() {
        searchTxt.setText("");
        tableCustomer.clearSelection();
    }

    @Override
    public void refreshData() {
        setTableCustomer("");
        clearAll();
    }

//    @Override
//    public void refreshDataTable() {
//        setTableCustomer("");
//    }
}
