/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package KasirDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.CustomerControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import model.Customer;
import utils.UtilTable;

/**
 *
 * @author VICTUS
 */
public class PendaftaranPasienForm extends javax.swing.JPanel {

    /**
     * Creates new form PendaftaranPasienForm
     */
    private CustomerControl customerControl;
    int selectedID=0;
    String action = "";
    public PendaftaranPasienForm() {
        initComponents();
        addPasien.pack();
        addPasien.setSize(712,590);
        addPasien.setLocationRelativeTo(null);
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        customerControl = new CustomerControl();
        setEditDelBtn(false);
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

        addPasien = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cancelBtnInputPasien = new javax.swing.JButton();
        saveBtnInputPasien = new javax.swing.JButton();
        tanggalLahir = new com.toedter.calendar.JDateChooser();
        alamatTxt = new KasirDashboard.CustomePalette.TextField();
        namaTxt = new KasirDashboard.CustomePalette.TextField();
        notelpTxt = new KasirDashboard.CustomePalette.TextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        servicePendaftaranPasien = new KasirDashboard.CustomePalette.innerDashboard();
        namaLbl9 = new javax.swing.JLabel();
        namaLbl10 = new javax.swing.JLabel();
        namaLbl11 = new javax.swing.JLabel();
        namaLbl12 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        tablePendaftaranScrollBar = new javax.swing.JScrollPane();
        PendaftaranTable = new KasirDashboard.TableCustom();
        refreshBtn = new javax.swing.JButton();

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(198, 231, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel15.setText("Registrasi Pasien");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 380, -1));

        cancelBtnInputPasien.setBackground(new java.awt.Color(3, 104, 218));
        cancelBtnInputPasien.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtnInputPasien.setText("Batal");
        cancelBtnInputPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnInputPasienActionPerformed(evt);
            }
        });
        jPanel8.add(cancelBtnInputPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, 30));

        saveBtnInputPasien.setBackground(new java.awt.Color(3, 104, 218));
        saveBtnInputPasien.setForeground(new java.awt.Color(255, 255, 255));
        saveBtnInputPasien.setText("Simpan");
        saveBtnInputPasien.setEnabled(false);
        saveBtnInputPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnInputPasienActionPerformed(evt);
            }
        });
        jPanel8.add(saveBtnInputPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, 30));

        tanggalLahir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(tanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 330, -1));

        alamatTxt.setLabelText("Alamat");
        jPanel8.add(alamatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 330, 50));

        namaTxt.setLabelText("Nama");
        jPanel8.add(namaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 330, 50));

        notelpTxt.setLabelText("Nomor Telepon");
        jPanel8.add(notelpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 330, 50));

        jLabel14.setForeground(new java.awt.Color(140, 140, 140));
        jLabel14.setText("Silahkan Input Data Diri Pasien");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, -1, 30));

        jLabel16.setForeground(new java.awt.Color(140, 140, 140));
        jLabel16.setText("Tanggal Lahir");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        javax.swing.GroupLayout addPasienLayout = new javax.swing.GroupLayout(addPasien.getContentPane());
        addPasien.getContentPane().setLayout(addPasienLayout);
        addPasienLayout.setHorizontalGroup(
            addPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPasienLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        addPasienLayout.setVerticalGroup(
            addPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        servicePendaftaranPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaLbl9.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl9.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl9.setText("Dashboard> Services> ");
        servicePendaftaranPasien.add(namaLbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 30, -1, 25));

        namaLbl10.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl10.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl10.setText("Pendaftaran Pasien");
        servicePendaftaranPasien.add(namaLbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 514, 50));

        namaLbl11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl11.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl11.setText("Pendaftaran Pasien");
        servicePendaftaranPasien.add(namaLbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 222, 25));

        namaLbl12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        namaLbl12.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl12.setText("Daftar Pasien");
        servicePendaftaranPasien.add(namaLbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 570, 50));

        addBtn.setBackground(new java.awt.Color(3, 104, 218));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("+ Add New");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        servicePendaftaranPasien.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        editBtn.setBackground(new java.awt.Color(3, 104, 218));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        servicePendaftaranPasien.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        removeBtn.setBackground(new java.awt.Color(3, 104, 218));
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Remove");
        removeBtn.setEnabled(false);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        servicePendaftaranPasien.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, 30));
        servicePendaftaranPasien.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 202, 270, 30));

        PendaftaranTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PendaftaranTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PendaftaranTableMouseClicked(evt);
            }
        });
        tablePendaftaranScrollBar.setViewportView(PendaftaranTable);

        servicePendaftaranPasien.add(tablePendaftaranScrollBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 640, 330));

        refreshBtn.setBackground(new java.awt.Color(3, 104, 218));
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        servicePendaftaranPasien.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 80, 30));

        add(servicePendaftaranPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        clearAll();
        addPasien.setVisible(true);
        action="add";
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnInputPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnInputPasienActionPerformed
        // TODO add your handling code here:
        clearAll();
        addPasien.setVisible(false);
    }//GEN-LAST:event_cancelBtnInputPasienActionPerformed

    private void saveBtnInputPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnInputPasienActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer(namaTxt.getText(), notelpTxt.getText(), dateToString(tanggalLahir.getDate()), alamatTxt.getText());
        if(action.equalsIgnoreCase("add")){
            customerControl.insertDataCustomer(customer);
        }else{
            customer.setId(selectedID);
            customerControl.updateDataCustomer(customer);
        }
        addPasien.setVisible(false);
        clearAll();
    }//GEN-LAST:event_saveBtnInputPasienActionPerformed

    private void PendaftaranTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PendaftaranTableMouseClicked
        int clickedRow = PendaftaranTable.getSelectedRow();
        TableModel tableModel = PendaftaranTable.getModel();
        selectedID = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaTxt.setText(tableModel.getValueAt(clickedRow, 1).toString());
        notelpTxt.setText(tableModel.getValueAt(clickedRow, 2).toString());
        alamatTxt.setText(tableModel.getValueAt(clickedRow, 3).toString());
        tanggalLahir.setDate(stringToDate(tableModel.getValueAt(clickedRow, 4).toString()));
        setEditDelBtn(true);
    }//GEN-LAST:event_PendaftaranTableMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        addPasien.setVisible(true);
        action="edit";
    }//GEN-LAST:event_editBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Hapus data pasien "+PendaftaranTable.getModel().getValueAt(PendaftaranTable.getSelectedRow(), 1).toString(),"Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            customerControl.deleteCustomer(selectedID);
            clearAll();
        } 
    }//GEN-LAST:event_removeBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        setTableCustomer("");
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private KasirDashboard.TableCustom PendaftaranTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JFrame addPasien;
    private KasirDashboard.CustomePalette.TextField alamatTxt;
    private javax.swing.JButton cancelBtnInputPasien;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel namaLbl10;
    private javax.swing.JLabel namaLbl11;
    private javax.swing.JLabel namaLbl12;
    private javax.swing.JLabel namaLbl9;
    private KasirDashboard.CustomePalette.TextField namaTxt;
    private KasirDashboard.CustomePalette.TextField notelpTxt;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton saveBtnInputPasien;
    private javax.swing.JTextField searchTxt;
    private KasirDashboard.CustomePalette.innerDashboard servicePendaftaranPasien;
    private javax.swing.JScrollPane tablePendaftaranScrollBar;
    private com.toedter.calendar.JDateChooser tanggalLahir;
    // End of variables declaration//GEN-END:variables
    private void setEditDelBtn(boolean b) {
        removeBtn.setEnabled(b);
        editBtn.setEnabled(b);
    }

    private void setTableCustomer(String string) {
        PendaftaranTable.setModel(customerControl.showDataCustomer(string));
        UtilTable.tableResizeColumnWidth(PendaftaranTable);
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
                
                String notelp = notelpTxt.getText();
                if(namaTxt.getText().isEmpty() 
                    || alamatTxt.getText().isEmpty()
                    || tanggalLahir.getDate()==null
                    || notelpTxt.getText().isEmpty()
                    || !notelp.matches("\\d+")){
                    saveBtnInputPasien.setEnabled(false);
                }else{
                    saveBtnInputPasien.setEnabled(true);
                }
                
            }
        };
        namaTxt.getDocument().addDocumentListener(docListener);
        alamatTxt.getDocument().addDocumentListener(docListener);
        notelpTxt.getDocument().addDocumentListener(docListener);
        JTextField dateChooserTxt = (JTextField)tanggalLahir.getDateEditor().getUiComponent();
        dateChooserTxt.getDocument().addDocumentListener(docListener);
        
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

    private void clearAll() {
        setTableCustomer("");
        selectedID=0;
        editBtn.setEnabled(false);
        removeBtn.setEnabled(false);
        searchTxt.setText("");
        namaTxt.setText("");
        alamatTxt.setText("");
        notelpTxt.setText("");
        tanggalLahir.setDate(new Date());
    }
}
