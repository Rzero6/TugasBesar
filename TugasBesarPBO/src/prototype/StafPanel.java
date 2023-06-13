/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prototype;

import com.formdev.flatlaf.FlatClientProperties;
import control.StafControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import model.Staf;

/**
 *
 * @author VICTUS
 */
public class StafPanel extends javax.swing.JPanel implements IPanelAdmin {

    /**
     * Creates new form StafPanel
     */
    private StafControl stafControl = new StafControl();
    List<Staf> listStaf;
    int selectedId = 0;
    
    public StafPanel() {
        initComponents();
        stafControl = new StafControl();
        searchInput.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        setTableStaf("");
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
        stafTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        jabatanLabel = new javax.swing.JLabel();
        jabatanDropDown = new javax.swing.JComboBox<>();
        namaLabel = new javax.swing.JLabel();
        namaStafInput = new javax.swing.JTextField();
        hargaLabel = new javax.swing.JLabel();
        noTeleponInput = new javax.swing.JTextField();
        tanggalMulaiKerjaLabel = new javax.swing.JLabel();
        tanggalMulaiKerja = new com.toedter.calendar.JDateChooser();
        usernameLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();

        stafTable.setBackground(new java.awt.Color(255, 255, 255));
        stafTable.setModel(new javax.swing.table.DefaultTableModel(
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
        stafTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stafTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(stafTable);

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

        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInputKeyPressed(evt);
            }
        });

        jabatanLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jabatanLabel.setForeground(new java.awt.Color(51, 51, 51));
        jabatanLabel.setText("Jabatan");

        jabatanDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokter", "Kasir", "Admin" }));
        jabatanDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanDropDownActionPerformed(evt);
            }
        });

        namaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(51, 51, 51));
        namaLabel.setText("Nama");

        namaStafInput.setForeground(new java.awt.Color(51, 51, 51));
        namaStafInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaStafInputActionPerformed(evt);
            }
        });

        hargaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(51, 51, 51));
        hargaLabel.setText("No Telepon");

        noTeleponInput.setForeground(new java.awt.Color(51, 51, 51));
        noTeleponInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTeleponInputActionPerformed(evt);
            }
        });

        tanggalMulaiKerjaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tanggalMulaiKerjaLabel.setForeground(new java.awt.Color(51, 51, 51));
        tanggalMulaiKerjaLabel.setText("Tanggal Mulai Kerja");

        tanggalMulaiKerja.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setText("Username");

        usernameInput.setForeground(new java.awt.Color(51, 51, 51));
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password");

        passwordInput.setForeground(new java.awt.Color(51, 51, 51));
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggalMulaiKerjaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noTeleponInput)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanggalMulaiKerja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameInput)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordInput)
                            .addComponent(jabatanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaStafInput)
                            .addComponent(hargaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jabatanDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(clearBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jabatanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jabatanDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaStafInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hargaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noTeleponInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggalMulaiKerjaLabel)
                        .addGap(12, 12, 12)
                        .addComponent(tanggalMulaiKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stafTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stafTableMouseClicked
        // TODO add your handling code here:

        int clickedRow = stafTable.getSelectedRow();
        TableModel tableModel = stafTable.getModel();

        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());

        
        switch(tableModel.getValueAt(clickedRow, 1).toString().toLowerCase()){
            case "Kasir":
                jabatanDropDown.setSelectedIndex(1);
                break;
            case "Dokter":
                jabatanDropDown.setSelectedIndex(0);
                break;
            case "Admin":
                jabatanDropDown.setSelectedIndex(2);
                break;
        }
        namaStafInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        noTeleponInput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        String sqlDate = tableModel.getValueAt(clickedRow, 4).toString();
        tanggalMulaiKerja.setDate(stringToDate(sqlDate));
        usernameInput.setText(tableModel.getValueAt(clickedRow, 5).toString());
        passwordInput.setText(tableModel.getValueAt(clickedRow, 6).toString());
    }//GEN-LAST:event_stafTableMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Staf staf = new Staf(namaStafInput.getText(), noTeleponInput.getText(), (String)jabatanDropDown.getSelectedItem(), usernameInput.getText(), passwordInput.getText());
        staf.setTanggal_bergabung(dateToString(tanggalMulaiKerja.getDate()));
        stafControl.insertDataStaf(staf);
        JOptionPane.showConfirmDialog(null, "Berhasil menambahkan "+staf.getNama()+" sebagai "+staf.getJabatan(),"Success",JOptionPane.PLAIN_MESSAGE);
        setTableStaf("");
        clearAll();
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        Staf staf = new Staf(selectedId, namaStafInput.getText(), noTeleponInput.getText(), dateToString(tanggalMulaiKerja.getDate()), (String) jabatanDropDown.getSelectedItem(), usernameInput.getText(), passwordInput.getText());
        stafControl.updateDataStaf(staf);
        JOptionPane.showConfirmDialog(null, "Berhasil memperbaharui "+staf.getNama()+" sebagai "+staf.getJabatan(),"Success",JOptionPane.PLAIN_MESSAGE);
        setTableStaf("");
        clearAll();
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(this,"Apakah yakin ingin menghapus data? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
            try{
                stafControl.deleteStaf(selectedId);
                JOptionPane.showConfirmDialog(null, "Berhasil menghapus data "+namaStafInput.getText(),"Success",JOptionPane.PLAIN_MESSAGE);
                setTableStaf("");
                clearAll();
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
            break;
            case 1:
            break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchInputKeyPressed

    private void jabatanDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanDropDownActionPerformed
        // TODO add your handling code here:
//        int selectedIndexJabatan = jabatanDropDown.getSelectedIndex();
//        if(selectedIndexJabatan == 1){
//            usernameInput.setText("Kasir");
//            usernameInput.setEnabled(false);
//        }else{
//            usernameInput.setText("");
//            usernameInput.setEnabled(true);
//        }
    }//GEN-LAST:event_jabatanDropDownActionPerformed

    private void namaStafInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaStafInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaStafInputActionPerformed

    private void noTeleponInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTeleponInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTeleponInputActionPerformed

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jabatanDropDown;
    private javax.swing.JLabel jabatanLabel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaStafInput;
    private javax.swing.JTextField noTeleponInput;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable stafTable;
    private com.toedter.calendar.JDateChooser tanggalMulaiKerja;
    private javax.swing.JLabel tanggalMulaiKerjaLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private void setTableStaf(String query) {
        stafTable.setModel(stafControl.showDataStaf(query));
        utils.UtilTable.tableResizeColumnWidth(stafTable);
    }
    private Date stringToDate(String value){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try{
            date = sdf.parse(value);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return date;
    }
    private String dateToString(Date value){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return (String) sdf.format(value);
    }

    private void setListener() {
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkTextField();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkTextField();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkTextField();
            }
            private void checkTextField() {
                
                String notelp = noTeleponInput.getText();
                if(namaStafInput.getText().isEmpty() 
                    || tanggalMulaiKerja.getDate()==null
                    || usernameInput.getText().isEmpty()
                    || passwordInput.getText().isEmpty()
                    || selectedId != 0
                    || !notelp.matches("\\d+")){
                    addBtn.setEnabled(false);
                }else{
                    addBtn.setEnabled(true);
                }
                
            }
        };
        namaStafInput.getDocument().addDocumentListener(docListener);
        noTeleponInput.getDocument().addDocumentListener(docListener);
        usernameInput.getDocument().addDocumentListener(docListener);
        passwordInput.getDocument().addDocumentListener(docListener);
        JTextField dateChooserTxt = (JTextField)tanggalMulaiKerja.getDateEditor().getUiComponent();
        dateChooserTxt.getDocument().addDocumentListener(docListener);
        
        searchInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTableStaf(searchInput.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTableStaf(searchInput.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTableStaf(searchInput.getText());
            }
        });
        
        stafTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Check if a row or column is selected
                    boolean isRowSelected = stafTable.getSelectedRow() != -1;
                    boolean isColumnSelected = stafTable.getSelectedColumn() != -1;

                    // Enable or disable the button based on the selection
                    setEditDeleteBtn(isRowSelected || isColumnSelected);
                }
            }
        });
    }
    private void clearAll() {
        namaStafInput.setText("");
        usernameInput.setText("");
        passwordInput.setText("");
        noTeleponInput.setText("");
        tanggalMulaiKerja.setDate(null);
        searchInput.setText("");
        stafTable.clearSelection();
        selectedId=0;
        setEditDeleteBtn(false);
    }
    private void setEditDeleteBtn(boolean b){
        deleteBtn.setEnabled(b);
        editBtn.setEnabled(b);
    }

    @Override
    public void refreshData() {
        setTableStaf("");
        clearAll();
    }
}
