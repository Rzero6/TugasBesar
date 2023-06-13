/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prototype;

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
        namaTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Supplier");
        noTeleponTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "No Telepon");
        emailTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Email");
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        setBorderandFocus(namaTxt);
        setBorderandFocus(noTeleponTxt);
        setBorderandFocus(emailTxt);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        namaTxt = new javax.swing.JTextField();
        noTeleponTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 402));

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
        jScrollPane1.setViewportView(supplierTable);

        addBtn.setText("Add");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.setEnabled(false);
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailTxt)
                                .addComponent(namaTxt)
                                .addComponent(noTeleponTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn)
                        .addComponent(editBtn)
                        .addComponent(delBtn))
                    .addComponent(searchTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noTeleponTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        int clickedRow = supplierTable.getSelectedRow();
        TableModel tableModel = supplierTable.getModel();
        selectedID = Integer.parseInt(tableModel.getValueAt(clickedRow, 3).toString());
        namaTxt.setText(tableModel.getValueAt(clickedRow, 0).toString());
        noTeleponTxt.setText(tableModel.getValueAt(clickedRow, 1).toString());
        emailTxt.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_supplierTableMouseClicked

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
        if(checkSama(supplier)){
            JOptionPane.showConfirmDialog(this, "Supplier sudah terdaftar","Error",JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
            
            searchTxt.setText(supplier.getNama());
        }else{
            supplierControl.updateDataSupplier(supplier);
            setSupplierTable("");
            clearAll();
        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTextField noTeleponTxt;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable supplierTable;
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
                searchTxt.setText(namaTxt.getText());
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
                searchTxt.setText(namaTxt.getText());
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
                searchTxt.setText(namaTxt.getText());
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
