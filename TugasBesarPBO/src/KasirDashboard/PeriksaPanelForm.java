/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package KasirDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.CustomerControl;
import control.StafControl;
import control.TransaksiControl;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import model.Customer;
import model.Staf;
import model.Transaksi;
import utils.UtilTable;

/**
 *
 * @author VICTUS
 */
public class PeriksaPanelForm extends javax.swing.JPanel implements IKasirView{
    private TransaksiControl transaksiControl;
    private CustomerControl customerControl;
    private StafControl stafControl;
    List<Customer> listCustomer;
    List<Staf> listDokter;
    int selectedIDTransaksi=0;
    String action = "";
    
    /**
     * Creates new form PeriksaPanelForm
     */
    public PeriksaPanelForm() {
        
        initComponents();
        addRawatPasien.pack();
        addRawatPasien.setSize(720, 550);
        addRawatPasien.setLocationRelativeTo(null);
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        transaksiControl = new TransaksiControl();
        customerControl = new CustomerControl();
        stafControl = new StafControl();
        setCustomer();
        setDokter();
        setTablePeriksa("");
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

        addRawatPasien = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pasienDropdown = new javax.swing.JComboBox<>();
        dokterDropdown = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keluhanTxt = new javax.swing.JTextArea();
        cancelBtnInputPeriksa = new javax.swing.JButton();
        saveBtnInputPeriksa = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        servicePeriksaPasien = new KasirDashboard.CustomePalette.innerDashboard();
        namaLbl5 = new javax.swing.JLabel();
        namaLbl6 = new javax.swing.JLabel();
        namaLbl7 = new javax.swing.JLabel();
        namaLbl8 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        tablePeriksaScrollBar = new javax.swing.JScrollPane();
        PeriksaTable = new KasirDashboard.TableCustom();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        servicePeriksaPasien1 = new KasirDashboard.CustomePalette.innerDashboard();
        namaLbl9 = new javax.swing.JLabel();
        namaLbl10 = new javax.swing.JLabel();
        namaLbl11 = new javax.swing.JLabel();
        namaLbl12 = new javax.swing.JLabel();
        searchTxt1 = new javax.swing.JTextField();
        addBtn1 = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        removeBtn1 = new javax.swing.JButton();
        tablePeriksaScrollBar1 = new javax.swing.JScrollPane();
        PeriksaTable1 = new KasirDashboard.TableCustom();

        addRawatPasien.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(198, 231, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/bannerRawat.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nama Pasien");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 154, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(65, 169, 192));
        jLabel10.setText("Periksa Pasien");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 360, 70));

        jPanel5.add(pasienDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 320, 30));

        jPanel5.add(dokterDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 320, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Keluhan");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 154, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Nama Dokter");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 154, 30));

        keluhanTxt.setColumns(20);
        keluhanTxt.setRows(5);
        jScrollPane2.setViewportView(keluhanTxt);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 320, 150));

        cancelBtnInputPeriksa.setBackground(new java.awt.Color(3, 104, 218));
        cancelBtnInputPeriksa.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtnInputPeriksa.setText("Batal");
        cancelBtnInputPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnInputPeriksaActionPerformed(evt);
            }
        });
        jPanel5.add(cancelBtnInputPeriksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, 30));

        saveBtnInputPeriksa.setBackground(new java.awt.Color(3, 104, 218));
        saveBtnInputPeriksa.setForeground(new java.awt.Color(255, 255, 255));
        saveBtnInputPeriksa.setText("Simpan");
        saveBtnInputPeriksa.setEnabled(false);
        saveBtnInputPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnInputPeriksaActionPerformed(evt);
            }
        });
        jPanel5.add(saveBtnInputPeriksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, 30));

        jLabel17.setForeground(new java.awt.Color(140, 140, 140));
        jLabel17.setText("Silahkan Input Data Diri Pasien yang akan diperiksa");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, -1, 30));

        javax.swing.GroupLayout addRawatPasienLayout = new javax.swing.GroupLayout(addRawatPasien.getContentPane());
        addRawatPasien.getContentPane().setLayout(addRawatPasienLayout);
        addRawatPasienLayout.setHorizontalGroup(
            addRawatPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRawatPasienLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        addRawatPasienLayout.setVerticalGroup(
            addRawatPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        servicePeriksaPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaLbl5.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl5.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl5.setText("Dashboard> Services> ");
        servicePeriksaPasien.add(namaLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 30, -1, 25));

        namaLbl6.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl6.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl6.setText("Periksa Pasien");
        servicePeriksaPasien.add(namaLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 70, 350, 50));

        namaLbl7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl7.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl7.setText("Periksa Pasien");
        servicePeriksaPasien.add(namaLbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 30, 157, 25));

        namaLbl8.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        namaLbl8.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl8.setText("Antrean Pasien");
        servicePeriksaPasien.add(namaLbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 570, 50));
        servicePeriksaPasien.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 202, 270, 30));

        addBtn.setBackground(new java.awt.Color(3, 104, 218));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("+ Add New");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        servicePeriksaPasien.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        editBtn.setBackground(new java.awt.Color(3, 104, 218));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        servicePeriksaPasien.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        removeBtn.setBackground(new java.awt.Color(3, 104, 218));
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Remove");
        removeBtn.setEnabled(false);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        servicePeriksaPasien.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, 30));

        PeriksaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "b", "c", "d", "f", "g", "h", null, "Menunggu"},
                {"b", "c", "da", "f", "g", "g", "a", null, "Diperiksa"},
                {"a", "s", "w", "r", "f", "a", "w", null, "Selesai"},
                {"a", "f", "s", "FG", "G", "qw", "f", null, "Bayar"}
            },
            new String [] {
                "1", "2", "Title 33", "4", "5", "6", "7", "9", "8"
            }
        ));
        PeriksaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeriksaTableMouseClicked(evt);
            }
        });
        tablePeriksaScrollBar.setViewportView(PeriksaTable);

        servicePeriksaPasien.add(tablePeriksaScrollBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 640, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/banner.jpg"))); // NOI18N
        servicePeriksaPasien.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 907, 180));

        servicePeriksaPasien1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaLbl9.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl9.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl9.setText("Dashboard> Services> ");
        servicePeriksaPasien1.add(namaLbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 30, -1, 25));

        namaLbl10.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl10.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl10.setText("Periksa Pasien");
        servicePeriksaPasien1.add(namaLbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 340, 50));

        namaLbl11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl11.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl11.setText("Periksa Pasien");
        servicePeriksaPasien1.add(namaLbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 30, 157, 25));

        namaLbl12.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        namaLbl12.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl12.setText("Antrean Pasien");
        servicePeriksaPasien1.add(namaLbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 570, 50));
        servicePeriksaPasien1.add(searchTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 202, 270, 30));

        addBtn1.setBackground(new java.awt.Color(3, 104, 218));
        addBtn1.setForeground(new java.awt.Color(255, 255, 255));
        addBtn1.setText("+ Add New");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        servicePeriksaPasien1.add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        editBtn1.setBackground(new java.awt.Color(3, 104, 218));
        editBtn1.setForeground(new java.awt.Color(255, 255, 255));
        editBtn1.setText("Edit");
        editBtn1.setEnabled(false);
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
            }
        });
        servicePeriksaPasien1.add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        removeBtn1.setBackground(new java.awt.Color(3, 104, 218));
        removeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn1.setText("Remove");
        removeBtn1.setEnabled(false);
        removeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtn1ActionPerformed(evt);
            }
        });
        servicePeriksaPasien1.add(removeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, 30));

        PeriksaTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "b", "c", "d", "f", "g", "h", null, "Menunggu"},
                {"b", "c", "da", "f", "g", "g", "a", null, "Diperiksa"},
                {"a", "s", "w", "r", "f", "a", "w", null, "Selesai"},
                {"a", "f", "s", "FG", "G", "qw", "f", null, "Bayar"}
            },
            new String [] {
                "1", "2", "Title 33", "4", "5", "6", "7", "9", "8"
            }
        ));
        PeriksaTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeriksaTable1MouseClicked(evt);
            }
        });
        tablePeriksaScrollBar1.setViewportView(PeriksaTable1);

        servicePeriksaPasien1.add(tablePeriksaScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 640, 330));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicePeriksaPasien1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicePeriksaPasien1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicePeriksaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicePeriksaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        action = "Add";
        clearAll();
        addRawatPasien.setVisible(true);
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnInputPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnInputPeriksaActionPerformed
        // TODO add your handling code here:
        addRawatPasien.setVisible(false);
        clearAll();
    }//GEN-LAST:event_cancelBtnInputPeriksaActionPerformed

    private void saveBtnInputPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnInputPeriksaActionPerformed
        // TODO add your handling code here:
        Customer pasien = (Customer) pasienDropdown.getSelectedItem();
        Staf dokter = (Staf) dokterDropdown.getSelectedItem();
        String cek = transaksiControl.checkTransaksiForMultipleUndoneTransaction(pasien.getId());
        
        if(action.equalsIgnoreCase("add")){
            if(cek.equalsIgnoreCase("aman")){
                Transaksi transaksi = new Transaksi(pasien, dokter, keluhanTxt.getText());
                transaksiControl.insertDataTransaksi(transaksi);
                addRawatPasien.setVisible(false);
            }else{
                JOptionPane.showConfirmDialog(addRawatPasien, cek,"Error",JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
            }  
        }else{
            
            Transaksi transaksi = transaksiControl.searchTransaksi(selectedIDTransaksi);
            transaksi.setDokter(dokter);
            transaksi.setPasien(pasien);
            transaksi.setKeluhan(keluhanTxt.getText());
            transaksi.setTanggalTransaksi(transaksi.dateTimeNowinString());
            transaksiControl.updateDataTransaksi(transaksi);
            addRawatPasien.setVisible(false);
        }
        clearAll();
    }//GEN-LAST:event_saveBtnInputPeriksaActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        action = "Edit";
        addRawatPasien.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void PeriksaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriksaTableMouseClicked
        int clickedRow = PeriksaTable.getSelectedRow();
        TableModel tableModel = PeriksaTable.getModel();
        selectedIDTransaksi = Integer.parseInt(tableModel.getValueAt(clickedRow, 5).toString());
        int selectedIDPasien = Integer.parseInt(tableModel.getValueAt(clickedRow, 6).toString());
        int selectedIDDokter = Integer.parseInt(tableModel.getValueAt(clickedRow, 7).toString());
        keluhanTxt.setText(tableModel.getValueAt(clickedRow, 3).toString());
        int selectedIndexPasien=-1;
        int selectedIndexDokter=-1;
        for(Customer customer : listCustomer){
            if(customer.getId() == selectedIDPasien){
                selectedIndexPasien = listCustomer.indexOf(customer);
            }
        }
        pasienDropdown.setSelectedIndex(selectedIndexPasien);
        for(Staf dokter : listDokter){
            if(dokter.getId() == selectedIDDokter){
                selectedIndexDokter = listDokter.indexOf(dokter);
            }
        }
        dokterDropdown.setSelectedIndex(selectedIndexDokter);
    }//GEN-LAST:event_PeriksaTableMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Hapus data antrian "+PeriksaTable.getModel().getValueAt(PeriksaTable.getSelectedRow(), 1).toString(),"Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            transaksiControl.deleteTransaksi(selectedIDTransaksi);
            clearAll();
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtn1ActionPerformed

    private void removeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeBtn1ActionPerformed

    private void PeriksaTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriksaTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PeriksaTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private KasirDashboard.TableCustom PeriksaTable;
    private KasirDashboard.TableCustom PeriksaTable1;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JFrame addRawatPasien;
    private javax.swing.JButton cancelBtnInputPeriksa;
    private javax.swing.JComboBox<Staf> dokterDropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton editBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keluhanTxt;
    private javax.swing.JLabel namaLbl10;
    private javax.swing.JLabel namaLbl11;
    private javax.swing.JLabel namaLbl12;
    private javax.swing.JLabel namaLbl5;
    private javax.swing.JLabel namaLbl6;
    private javax.swing.JLabel namaLbl7;
    private javax.swing.JLabel namaLbl8;
    private javax.swing.JLabel namaLbl9;
    private javax.swing.JComboBox<Customer> pasienDropdown;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton removeBtn1;
    private javax.swing.JButton saveBtnInputPeriksa;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField searchTxt1;
    private KasirDashboard.CustomePalette.innerDashboard servicePeriksaPasien;
    private KasirDashboard.CustomePalette.innerDashboard servicePeriksaPasien1;
    private javax.swing.JScrollPane tablePeriksaScrollBar;
    private javax.swing.JScrollPane tablePeriksaScrollBar1;
    // End of variables declaration//GEN-END:variables

    private void setTablePeriksa(String query) {
        PeriksaTable.setModel(transaksiControl.showDataPeriksa(query,"Menunggu"));
        UtilTable.tableResizeColumnWidth(PeriksaTable);
    }

    private void setCustomer() {
        listCustomer = customerControl.showListCustomer("");
        setupProperty(pasienDropdown);
        pasienDropdown.removeAllItems();
        for(Customer c : listCustomer){
            pasienDropdown.addItem(c);
        }
    }
    private void setDokter() {
        listDokter = stafControl.showListStaf("Dokter");
        setupProperty(dokterDropdown);
        dokterDropdown.removeAllItems();
        for(Staf s : listDokter){
            dokterDropdown.addItem(s);
        }
    }
    private void setupProperty(JComponent comp){
        comp.putClientProperty(FlatClientProperties.STYLE,""
                +"borderWidth:0;"
                + "focusWidth:0");
    }
    private void setListener(){
        keluhanTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                saveBtnInputPeriksa.setEnabled(!keluhanTxt.getText().isEmpty() && pasienDropdown.getSelectedIndex()!=-1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                saveBtnInputPeriksa.setEnabled(!keluhanTxt.getText().isEmpty() && pasienDropdown.getSelectedIndex()!=-1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                saveBtnInputPeriksa.setEnabled(!keluhanTxt.getText().isEmpty() && pasienDropdown.getSelectedIndex()!=-1); 
            }
        });
        
        ListSelectionModel listSelectionModel = PeriksaTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Check if a row or column is selected
                    boolean isRowSelected = PeriksaTable.getSelectedRow() != -1;
                    boolean isColumnSelected = PeriksaTable.getSelectedColumn() != -1;

                    // Enable or disable the button based on the selection
                    removeBtn.setEnabled(isRowSelected || isColumnSelected);
                    editBtn.setEnabled(isRowSelected || isColumnSelected);
                }
            }
        });
        searchTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTablePeriksa(searchTxt.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTablePeriksa(searchTxt.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTablePeriksa(searchTxt.getText());
            }
        });
    }

    private void clearAll() {
        setTablePeriksa("");
        pasienDropdown.setSelectedIndex(0);
        dokterDropdown.setSelectedIndex(0);
        keluhanTxt.setText("");
        PeriksaTable.clearSelection();
        editBtn.setEnabled(false);
        removeBtn.setEnabled(false);
        searchTxt.setText("");
    }

    @Override
    public void refreshDataTable() {
        setTablePeriksa("");
        setCustomer();
        setDokter();
    }
}
