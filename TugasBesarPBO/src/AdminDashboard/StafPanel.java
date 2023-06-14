/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.StafControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
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
    private List<Staf> listStaf;
    int selectedId = 0;
    
    public StafPanel() {
        initComponents();
        stafControl = new StafControl();
        searchInput.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        passwordInput.setEchoChar('*');
        showPass.setVisible(false);
        setBorderandFocus(searchInput);
//        setBorderandFocus(namaStafInput);
//        setBorderandFocus(usernameInput);
//        setBorderandFocus(passwordInput);
//        setBorderandFocus(noTeleponInput);
        setBorderandFocus(jabatanDropDown);
        setBorderandFocus((JTextField)tanggalMulaiKerja.getDateEditor().getUiComponent());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        stafTable = new KasirDashboard.TableCustom();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        jabatanLabel = new javax.swing.JLabel();
        jabatanDropDown = new javax.swing.JComboBox<>();
        showPass = new javax.swing.JLabel();
        tanggalMulaiKerjaLabel = new javax.swing.JLabel();
        tanggalMulaiKerja = new com.toedter.calendar.JDateChooser();
        clearBtn = new javax.swing.JButton();
        namaStafInput = new KasirDashboard.CustomePalette.TextField();
        noTeleponInput = new KasirDashboard.CustomePalette.TextField();
        usernameInput = new KasirDashboard.CustomePalette.TextField();
        passwordInput = new KasirDashboard.CustomePalette.PasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(stafTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 78, 530, 460));

        addBtn.setText("Tambah");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, -1, 30));

        editBtn.setText("Ubah");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 30));

        deleteBtn.setText("Hapus");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 20, -1, 30));

        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInputKeyPressed(evt);
            }
        });
        add(searchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 290, -1));

        jabatanLabel.setForeground(new java.awt.Color(51, 51, 51));
        jabatanLabel.setText("Jabatan");
        add(jabatanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 80, 300, -1));

        jabatanDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokter", "Kasir", "Admin" }));
        jabatanDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanDropDownActionPerformed(evt);
            }
        });
        add(jabatanDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 102, 260, 28));

        showPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showPass.setForeground(new java.awt.Color(51, 51, 51));
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/show.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 30, -1));

        tanggalMulaiKerjaLabel.setForeground(new java.awt.Color(51, 51, 51));
        tanggalMulaiKerjaLabel.setText("Tanggal Mulai Kerja");
        add(tanggalMulaiKerjaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 300, -1));

        tanggalMulaiKerja.setBackground(new java.awt.Color(255, 255, 255));
        add(tanggalMulaiKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 260, -1));

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 20, -1, 30));

        namaStafInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        namaStafInput.setLabelText("Nama");
        add(namaStafInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, -1));

        noTeleponInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        noTeleponInput.setLabelText("Nomor Telepon");
        add(noTeleponInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        usernameInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        usernameInput.setLabelText("Username");
        add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, -1));

        passwordInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        passwordInput.setLabelText("Password");
        passwordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordInputFocusLost(evt);
            }
        });
        add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Staf staf = new Staf(namaStafInput.getText(), noTeleponInput.getText(), (String)jabatanDropDown.getSelectedItem(), usernameInput.getText(), passwordInput.getText());
        staf.setTanggal_bergabung(dateToString(tanggalMulaiKerja.getDate()));
        if(checkSama(staf)){
            JOptionPane.showConfirmDialog(this, "Staf sudah terdaftar","Error",JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
            
            searchInput.setText(staf.getUsername());
        }else{
            stafControl.insertDataStaf(staf);
            JOptionPane.showConfirmDialog(null, "Berhasil menambahkan "+staf.getNama()+" sebagai "+staf.getJabatan(),"Success",JOptionPane.PLAIN_MESSAGE);
            setTableStaf("");
            clearAll();
        }
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

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        // TODO add your handling code here:
        showPass.setVisible(true);
         if(passwordInput.echoCharIsSet()){
            passwordInput.setEchoChar((char) 0);
            showPass.setIcon(new ImageIcon("src/Aset/hidden.png"));
        }else{
            passwordInput.setEchoChar('*');
            showPass.setIcon(new ImageIcon("src/Aset/show.png"));
        }
    }//GEN-LAST:event_showPassMouseClicked

    private void searchInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchInputKeyPressed

    private void passwordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusGained
        // TODO add your handling code here:
        showPass.setVisible(true);
    }//GEN-LAST:event_passwordInputFocusGained

    private void passwordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusLost
        // TODO add your handling code here:
        showPass.setVisible(false);
    }//GEN-LAST:event_passwordInputFocusLost

    private void stafTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stafTableMouseClicked
        // TODO add your handling code here:
        int clickedRow = stafTable.getSelectedRow();
        TableModel tableModel = stafTable.getModel();

        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());

        switch(tableModel.getValueAt(clickedRow, 1).toString()){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jabatanDropDown;
    private javax.swing.JLabel jabatanLabel;
    private KasirDashboard.CustomePalette.TextField namaStafInput;
    private KasirDashboard.CustomePalette.TextField noTeleponInput;
    private KasirDashboard.CustomePalette.PasswordField passwordInput;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel showPass;
    private KasirDashboard.TableCustom stafTable;
    private com.toedter.calendar.JDateChooser tanggalMulaiKerja;
    private javax.swing.JLabel tanggalMulaiKerjaLabel;
    private KasirDashboard.CustomePalette.TextField usernameInput;
    // End of variables declaration//GEN-END:variables

    private void setTableStaf(String query) {
        stafTable.setModel(stafControl.showDataStaf(query));
        utils.UtilTable.tableResizeColumnWidth(stafTable);
        listStaf = stafControl.showListStaf("");
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
    
    private boolean checkSama(Staf staf){
        for(Staf s : listStaf){
            if(staf.getUsername().equals(s.getUsername())){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void refreshData() {
        setTableStaf("");
        clearAll();
    }
    private void setBorderandFocus(JComponent comp){
        comp.putClientProperty(FlatClientProperties.STYLE, ""
                +"borderWidth:1;"
                + "focusWidth:0");
    }
}
