/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package KasirDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import control.DetailTransaksiControl;
import control.MutasiControl;
import control.TransaksiControl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import model.Mutasi;
import model.Transaksi;

/**
 *
 * @author VICTUS
 */
public class PembayaranPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form PembayaranPanelForm
     */
    private MutasiControl mutasiControl;
    private TransaksiControl transaksiControl;
    private DetailTransaksiControl detailTransaksiControl;
    int selectedIDTransaksi=0;
    int selectedIDDetailTransaksi=0;
    
    public PembayaranPanelForm() {
        initComponents();
        mutasiControl = new MutasiControl();
        transaksiControl = new TransaksiControl();
        detailTransaksiControl = new DetailTransaksiControl();
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        
        
        checkOut.pack();
        checkOut.setLocationRelativeTo(this);
        setTableBayar("");
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

        checkOut = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inputUang = new KasirDashboard.CustomePalette.TextField();
        namaPasien1 = new KasirDashboard.CustomePalette.TextField();
        totalHarga1 = new KasirDashboard.CustomePalette.TextField();
        rincianBtn = new javax.swing.JButton();
        cancelBtnPembayaran = new javax.swing.JButton();
        bayarBtn = new javax.swing.JButton();
        detailsFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        detailsTxt = new javax.swing.JTextArea();
        okBtn = new javax.swing.JButton();
        servicePembayaranPasien = new KasirDashboard.CustomePalette.innerDashboard();
        namaLbl13 = new javax.swing.JLabel();
        namaLbl14 = new javax.swing.JLabel();
        namaLbl15 = new javax.swing.JLabel();
        namaLbl16 = new javax.swing.JLabel();
        tablePembayaranScrollBar = new javax.swing.JScrollPane();
        PembayaranTable = new KasirDashboard.TableCustom();
        checkOutBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();

        checkOut.setUndecorated(true);
        checkOut.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 35)); // NOI18N
        jLabel18.setText("Biaya Perawatan");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 350, -1));

        jPanel11.setBackground(new java.awt.Color(198, 231, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel20.setText("Pembayaran");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 310, -1));

        jLabel21.setForeground(new java.awt.Color(140, 140, 140));
        jLabel21.setText("Silahkan Input Nominal Uang");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 30));

        inputUang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputUang.setLabelText("Masukkan Nominal Uang Anda");
        inputUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUangActionPerformed(evt);
            }
        });
        jPanel10.add(inputUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 290, -1));

        namaPasien1.setEditable(false);
        namaPasien1.setBackground(new java.awt.Color(255, 255, 255));
        namaPasien1.setText("I Kadek Dendy Pramartha");
        namaPasien1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaPasien1.setLabelText("Nama Pasien");
        jPanel10.add(namaPasien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 290, -1));

        totalHarga1.setEditable(false);
        totalHarga1.setBackground(new java.awt.Color(255, 255, 255));
        totalHarga1.setText("Rp 200.000");
        totalHarga1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalHarga1.setLabelText("Total Harga");
        jPanel10.add(totalHarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 290, -1));

        rincianBtn.setBackground(new java.awt.Color(3, 104, 218));
        rincianBtn.setForeground(new java.awt.Color(255, 255, 255));
        rincianBtn.setText("Rincian");
        rincianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianBtnActionPerformed(evt);
            }
        });
        jPanel10.add(rincianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, 30));

        cancelBtnPembayaran.setBackground(new java.awt.Color(3, 104, 218));
        cancelBtnPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtnPembayaran.setText("Batal");
        cancelBtnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnPembayaranActionPerformed(evt);
            }
        });
        jPanel10.add(cancelBtnPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, 30));

        bayarBtn.setBackground(new java.awt.Color(3, 104, 218));
        bayarBtn.setForeground(new java.awt.Color(255, 255, 255));
        bayarBtn.setText("Bayar");
        bayarBtn.setEnabled(false);
        bayarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarBtnActionPerformed(evt);
            }
        });
        jPanel10.add(bayarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        checkOut.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        detailsFrame.setUndecorated(true);

        detailsTxt.setEditable(false);
        detailsTxt.setColumns(20);
        detailsTxt.setRows(5);
        jScrollPane4.setViewportView(detailsTxt);

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(okBtn)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(okBtn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout detailsFrameLayout = new javax.swing.GroupLayout(detailsFrame.getContentPane());
        detailsFrame.getContentPane().setLayout(detailsFrameLayout);
        detailsFrameLayout.setHorizontalGroup(
            detailsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        detailsFrameLayout.setVerticalGroup(
            detailsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        servicePembayaranPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaLbl13.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl13.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl13.setText("Dashboard> Services> ");
        servicePembayaranPasien.add(namaLbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 30, -1, 25));

        namaLbl14.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl14.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl14.setText("Pembayaran Biaya Rawat");
        servicePembayaranPasien.add(namaLbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 50));

        namaLbl15.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl15.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl15.setText("Pembayaran Pasien");
        servicePembayaranPasien.add(namaLbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 30, 210, 25));

        namaLbl16.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        namaLbl16.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl16.setText("Daftar Transaksi Pasien");
        servicePembayaranPasien.add(namaLbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 570, 50));

        PembayaranTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PembayaranTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembayaranTableMouseClicked(evt);
            }
        });
        tablePembayaranScrollBar.setViewportView(PembayaranTable);

        servicePembayaranPasien.add(tablePembayaranScrollBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 640, 330));

        checkOutBtn.setBackground(new java.awt.Color(3, 104, 218));
        checkOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkOutBtn.setText("+ Check Out");
        checkOutBtn.setEnabled(false);
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });
        servicePembayaranPasien.add(checkOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));
        servicePembayaranPasien.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(servicePembayaranPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(servicePembayaranPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        checkOut.setVisible(true);
        
        
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void inputUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUangActionPerformed

    private void rincianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianBtnActionPerformed
        // TODO add your handling code here:
        Transaksi transaksi = transaksiControl.searchTransaksi(selectedIDTransaksi);
        transaksi.setDetailTransaksiList(detailTransaksiControl.getListDetailTransaksiByTransaksiID("", selectedIDTransaksi));
        detailsTxt.setText(transaksi.showNota());
        
        detailsFrame.pack();
        detailsFrame.setLocationRelativeTo(checkOut);
        
        detailsFrame.setVisible(true);
    }//GEN-LAST:event_rincianBtnActionPerformed

    private void cancelBtnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnPembayaranActionPerformed
        // TODO add your handling code here:
        checkOut.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_cancelBtnPembayaranActionPerformed

    private void PembayaranTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembayaranTableMouseClicked
        int clickedRow = PembayaranTable.getSelectedRow();
        TableModel tableModel = PembayaranTable.getModel();
        selectedIDTransaksi = Integer.parseInt(tableModel.getValueAt(clickedRow, 7).toString());
        namaPasien1.setText(tableModel.getValueAt(clickedRow, 1).toString());
        totalHarga1.setText("Rp. "+tableModel.getValueAt(clickedRow, 6).toString());
    }//GEN-LAST:event_PembayaranTableMouseClicked

    private void bayarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarBtnActionPerformed
        double uangDiterima = Double.parseDouble(inputUang.getText());
        double totalHarga = Double.parseDouble(totalHarga1.getText().substring(3));
        double kembalian = uangDiterima-totalHarga;
        
        Transaksi transaksi = transaksiControl.searchTransaksi(selectedIDTransaksi);
        transaksi.setDetailTransaksiList(detailTransaksiControl.getListDetailTransaksiByTransaksiID("", transaksi.getId()));
        transaksi.setTanggalTransaksi(getCurrentDateAndTime());
        transaksi.setStatus("Selesai");
        transaksiControl.updateStatusDataTransaksi(transaksi);
        double saldo = mutasiControl.getSaldo() + transaksi.totalHarga();
        Mutasi m = new Mutasi(transaksi.getId(), 0, transaksi.totalHarga(), saldo, "Perawatan pasien "+transaksi.getPasien().getNama(), "Pemasukan", transaksi.getTanggalTransaksi());
        mutasiControl.insertDataMutasi(m);
        
        JOptionPane.showConfirmDialog(checkOut, "Pembayaran berhasil, kembalian = Rp. "+kembalian,"Konfirmasi",JOptionPane.PLAIN_MESSAGE);
        checkOut.setVisible(false);
        clearAll();
        
    }//GEN-LAST:event_bayarBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        detailsFrame.setVisible(false);
    }//GEN-LAST:event_okBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private KasirDashboard.TableCustom PembayaranTable;
    private javax.swing.JButton bayarBtn;
    private javax.swing.JButton cancelBtnPembayaran;
    private javax.swing.JFrame checkOut;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JFrame detailsFrame;
    private javax.swing.JTextArea detailsTxt;
    private KasirDashboard.CustomePalette.TextField inputUang;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel namaLbl13;
    private javax.swing.JLabel namaLbl14;
    private javax.swing.JLabel namaLbl15;
    private javax.swing.JLabel namaLbl16;
    private KasirDashboard.CustomePalette.TextField namaPasien1;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton rincianBtn;
    private javax.swing.JTextField searchTxt;
    private KasirDashboard.CustomePalette.innerDashboard servicePembayaranPasien;
    private javax.swing.JScrollPane tablePembayaranScrollBar;
    private KasirDashboard.CustomePalette.TextField totalHarga1;
    // End of variables declaration//GEN-END:variables
    
    private String getCurrentDateAndTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String sqlDateandTime = currentDateTime.format(formatter);
        return sqlDateandTime;
    }
    private void setTableBayar(String query) {
        PembayaranTable.setModel(transaksiControl.showDataPembayaranCustomer(query, "Bayar"));
        selectedIDTransaksi=0;
    }
    private void setListener() {
        searchTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTableBayar(searchTxt.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTableBayar(searchTxt.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTableBayar(searchTxt.getText());
            }
        });
        PembayaranTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
               if (!e.getValueIsAdjusting()) {
                    boolean isRowSelected = PembayaranTable.getSelectedRow() != -1;
                    boolean isColumnSelected = PembayaranTable.getSelectedColumn() != -1;

                    checkOutBtn.setEnabled(isRowSelected || isColumnSelected);
                } 
            }
        });
        inputUang.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    double value = Double.parseDouble(inputUang.getText());
                    double harga = Double.parseDouble(totalHarga1.getText().substring(3));
                    bayarBtn.setEnabled(value>=harga);
                }catch(Exception ex){
                    bayarBtn.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try{
                    double value = Double.parseDouble(inputUang.getText());
                    double harga = Double.parseDouble(totalHarga1.getText());
                    bayarBtn.setEnabled(value<=harga);
                }catch(Exception ex){
                    bayarBtn.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try{
                    double value = Double.parseDouble(inputUang.getText());
                    double harga = Double.parseDouble(totalHarga1.getText());
                    bayarBtn.setEnabled(value<=harga);
                }catch(Exception ex){
                    bayarBtn.setEnabled(false);
                }
            }
        });
    }

    private void clearAll() {
        setTableBayar("");
        searchTxt.setText("");
        checkOutBtn.setEnabled(false);
        selectedIDTransaksi=0;
    }
}