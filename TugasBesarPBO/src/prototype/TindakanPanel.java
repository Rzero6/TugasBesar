/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prototype;

import com.formdev.flatlaf.FlatClientProperties;
import control.TindakanControl;
import exception.InputKosongException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import model.Tindakan;

/**
 *
 * @author VICTUS
 */
public class TindakanPanel extends javax.swing.JPanel implements IPanelAdmin {

    /**
     * Creates new form TindakanPanel
     */
    private TindakanControl tindakanControl;
    private int selectedId=0;
    public TindakanPanel() {
        initComponents();
        tindakanControl = new TindakanControl();
        namaTindakanInput.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama tindakan");
        hargaTindakanInput.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga Tindakan");
        searchInput.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        setTableTindakan("");
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
        tindakanTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        namaTindakanInput = new javax.swing.JTextField();
        hargaTindakanInput = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();

        tindakanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tindakanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tindakanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tindakanTable);

        addBtn.setText("Tambah");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Ubah");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Hapus");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn))
                    .addComponent(hargaTindakanInput)
                    .addComponent(namaTindakanInput)
                    .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(namaTindakanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaTindakanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tindakanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tindakanTableMouseClicked
        // TODO add your handling code here:
        int clickRow = tindakanTable.getSelectedRow();
        TableModel tableModel = tindakanTable.getModel();

        selectedId= Integer.parseInt(tableModel.getValueAt(clickRow, 0).toString());
        namaTindakanInput.setText(tableModel.getValueAt(clickRow, 1).toString());
        hargaTindakanInput.setText(tableModel.getValueAt(clickRow, 2).toString());

    }//GEN-LAST:event_tindakanTableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try{
            Tindakan tindakan = new Tindakan(namaTindakanInput.getText(), Double.parseDouble(hargaTindakanInput.getText()));
            tindakanControl.insertTindakan(tindakan);
            clearAll();
            setTableTindakan("");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try{
            Tindakan tindakan = new Tindakan(selectedId,namaTindakanInput.getText(), Double.parseDouble(hargaTindakanInput.getText()));
            tindakanControl.updateTindakan(tindakan);
            clearAll();
            setTableTindakan("");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(this, "Apakah yakin ingin menghapus data? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch (getAnswer) {
            case 0:
            try {
                tindakanControl.deleteTindakan(selectedId);
                clearAll();
                setTableTindakan("");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            break;
            case 1:
            break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField hargaTindakanInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaTindakanInput;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable tindakanTable;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
        namaTindakanInput.setText("");
        hargaTindakanInput.setText("");
        tindakanTable.clearSelection();
        deleteBtn.setEnabled(false);
    }

    private void setTableTindakan(String query) {
        tindakanTable.setModel(tindakanControl.showDataTindakan(query));
    }

    private void setListener() {
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    Double.parseDouble(hargaTindakanInput.getText());
                    addBtn.setEnabled(tindakanTable.getSelectedRow()==-1);
                }catch(NumberFormatException nfe){
                    addBtn.setEnabled(false);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                }catch(Exception ex1){
                    addBtn.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    Double.parseDouble(hargaTindakanInput.getText());
                    addBtn.setEnabled(tindakanTable.getSelectedRow()==-1);
                }catch(NumberFormatException nfe){
                    addBtn.setEnabled(false);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                }catch(Exception ex1){
                    addBtn.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try{
                    inputKosongException();
                    Double.parseDouble(hargaTindakanInput.getText());
                    addBtn.setEnabled(tindakanTable.getSelectedRow()==-1);
                    editBtn.setEnabled(tindakanTable.getSelectedRow()!=-1);
                }catch(NumberFormatException nfe){
                    addBtn.setEnabled(false);
                }catch(InputKosongException ex){
                    addBtn.setEnabled(false);
                }catch(Exception ex1){
                    addBtn.setEnabled(false);
                }
            }
        };
        namaTindakanInput.getDocument().addDocumentListener(docListener);
        hargaTindakanInput.getDocument().addDocumentListener(docListener);
        
        searchInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTableTindakan(searchInput.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTableTindakan(searchInput.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTableTindakan(searchInput.getText());
            }
        });
        
        tindakanTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    editBtn.setEnabled(tindakanTable.getSelectedRow()!=-1);
                    deleteBtn.setEnabled(tindakanTable.getSelectedRow()!=-1);
                }
            }
        });
    }
    
    private void inputKosongException()throws InputKosongException{
        if(namaTindakanInput.getText().isEmpty() || hargaTindakanInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }

    @Override
    public void refreshData() {
        setTableTindakan("");
    }
}
