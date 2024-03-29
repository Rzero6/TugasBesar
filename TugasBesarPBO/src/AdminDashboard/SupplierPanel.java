/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.SupplierControl;
import exception.InputKosongException;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import model.Supplier;

/**
 *
 * @author VICTUS
 */
public class SupplierPanel extends javax.swing.JPanel implements IPanelAdmin{

    /**
     * Creates new form SupplierPanel
     */
    private SupplierControl supplierControl;
    private List<Supplier> listSupplier;
    private Supplier supplier;
    private int selectedID=0;
    
    
    public SupplierPanel() {
        initComponents();
        supplierControl = new SupplierControl();
//        namaTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Supplier");
//        noTeleponTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "No Telepon");
//        emailTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Email");
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
//        setBorderandFocus(namaTxt1);
//        setBorderandFocus(noTeleponTxt1);
//        setBorderandFocus(emailTxt1);
        setBorderandFocus(searchTxt);
        setSupplierTable("");
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

        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        emailTxt = new KasirDashboard.CustomePalette.TextField();
        noTeleponTxt = new KasirDashboard.CustomePalette.TextField();
        namaTxt = new KasirDashboard.CustomePalette.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierTable = new KasirDashboard.TableCustom();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setText("Add");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, -1, 30));

        editBtn.setText("Edit");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 20, -1, 30));

        delBtn.setText("Delete");
        delBtn.setEnabled(false);
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 20, -1, 30));

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 20, 390, -1));

        emailTxt.setLabelText("Email");
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, -1));

        noTeleponTxt.setLabelText("Nomor Telepon");
        add(noTeleponTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, -1));

        namaTxt.setLabelText("Nama");
        add(namaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 290, -1));

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
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
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(supplierTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 500, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        supplier = new Supplier(namaTxt.getText(), noTeleponTxt.getText(), emailTxt.getText());
        if(checkSama(supplier)){
            JOptionPane.showConfirmDialog(this, "Supplier sudah terdaftar","Error",JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
            
            searchTxt.setText(supplier.getNama());
        }else{
            supplierControl.insertDataSupplier(supplier);
            setSupplierTable("");
            clearAll();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
        supplier = new Supplier(selectedID, namaTxt.getText(), noTeleponTxt.getText(), emailTxt.getText());
        supplierControl.updateDataSupplier(supplier);
        setSupplierTable("");
        clearAll();

    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Delete Data ?", "Confirm",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            supplierControl.deleteSupplier(selectedID);
            setSupplierTable("");
            clearAll();
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        // TODO add your handling code here:
        int clickedRow = supplierTable.getSelectedRow();
        TableModel tableModel = supplierTable.getModel();
        selectedID = Integer.parseInt(tableModel.getValueAt(clickedRow, 3).toString());
        namaTxt.setText(tableModel.getValueAt(clickedRow, 0).toString());
        noTeleponTxt.setText(tableModel.getValueAt(clickedRow, 1).toString());
        emailTxt.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_supplierTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private KasirDashboard.CustomePalette.TextField emailTxt;
    private javax.swing.JScrollPane jScrollPane2;
    private KasirDashboard.CustomePalette.TextField namaTxt;
    private KasirDashboard.CustomePalette.TextField noTeleponTxt;
    private javax.swing.JTextField searchTxt;
    private KasirDashboard.TableCustom supplierTable;
    // End of variables declaration//GEN-END:variables
    private void setSupplierTable(String query) {
        supplierTable.setModel(supplierControl.getTableSuplier(query));
        listSupplier=supplierControl.getListSupplier("");
    }
    private void inputKosongException() throws InputKosongException{
        if(namaTxt.getText().isEmpty() || noTeleponTxt.getText().isEmpty() || emailTxt.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    private void clearAll() {
        namaTxt.setText("");
        noTeleponTxt.setText("");
        emailTxt.setText("");
        searchTxt.setText("");
        supplierTable.clearSelection();
        addBtn.setEnabled(false);
    }

    @Override
    public void refreshData() {
        setSupplierTable("");
        clearAll();
    }

    private void setListener() {
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    addBtn.setEnabled(supplierTable.getSelectedRow() == -1);
                    editBtn.setEnabled(supplierTable.getSelectedRow() != -1);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                    editBtn.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    addBtn.setEnabled(supplierTable.getSelectedRow() == -1);
                    editBtn.setEnabled(supplierTable.getSelectedRow() != -1);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                    editBtn.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    addBtn.setEnabled(supplierTable.getSelectedRow() == -1);
                    editBtn.setEnabled(supplierTable.getSelectedRow() != -1);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                    editBtn.setEnabled(false);
                }
            }
        };
        namaTxt.getDocument().addDocumentListener(docListener);
        emailTxt.getDocument().addDocumentListener(docListener);
        noTeleponTxt.getDocument().addDocumentListener(docListener);
        supplierTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    delBtn.setEnabled(supplierTable.getSelectedRow() != -1);
                    editBtn.setEnabled(supplierTable.getSelectedRow() != -1);
                    addBtn.setEnabled(supplierTable.getSelectedRow() == -1);
                }
            }
        });
        
        searchTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setSupplierTable(searchTxt.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setSupplierTable(searchTxt.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setSupplierTable(searchTxt.getText());
            }
        });
    }
    private boolean checkSama(Supplier supplier){
        for(Supplier s: listSupplier){
            if(supplier.getNama().equalsIgnoreCase(s.getNama())){
                return true;
            }
        }
        return false;
    }
    private void setBorderandFocus(JComponent comp){
        comp.putClientProperty(FlatClientProperties.STYLE, ""
                +"borderWidth:1;"
                + "focusWidth:0");
    }
}
