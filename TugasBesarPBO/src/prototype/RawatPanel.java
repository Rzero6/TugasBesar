/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prototype;

import com.formdev.flatlaf.FlatClientProperties;
import control.DetailTransaksiControl;
import control.ObatControl;
import control.TindakanControl;
import control.TransaksiControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.DetailTransaksi;
import model.Obat;
import model.Staf;
import model.Tindakan;
import model.Transaksi;
import utils.UtilTable;

/**
 *
 * @author VICTUS
 */
public class RawatPanel extends javax.swing.JPanel implements IPanelDokter{
    private TransaksiControl transaksiControl;
    private DetailTransaksiControl detailTransaksiControl;
    private ObatControl obatControl;
    private TindakanControl tindakanControl;
    private List<Obat> listObat;
    private List<Tindakan> listTindakan;
    private int SelectedID = 0;
    private int SelectedIDDetailTransaksi = 0;
    private Staf loginData;
    /**
     * Creates new form RawatPanel
     */
    public RawatPanel(Staf loginData) {
        this.loginData=loginData;
        initComponents();
        transaksiControl = new TransaksiControl();
        detailTransaksiControl = new DetailTransaksiControl();
        obatControl = new ObatControl();
        tindakanControl = new TindakanControl();
        
        diagnosisTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Diagnosis");
        diagnosisTxt.putClientProperty(FlatClientProperties.STYLE, ""
            +"borderWidth:0;"
            + "focusWidth:2");
        setObatTindakanDropdown();
        setTablePasien();
        setTableObat();
        setTableTindakan();
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
        tablePasien = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableObat = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTindakan = new javax.swing.JTable();
        cancelBtn = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        obatDropdown = new javax.swing.JComboBox<>();
        jumlahObatSpinner = new javax.swing.JSpinner();
        addObatBtn = new javax.swing.JButton();
        tindakanDropdown = new javax.swing.JComboBox<>();
        addTindakanBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        diagnosisTxt = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();

        setEnabled(false);

        tablePasien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePasien);

        tableObat.setModel(new javax.swing.table.DefaultTableModel(
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
        tableObat.setEnabled(false);
        tableObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableObatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableObat);

        tableTindakan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTindakan.setEnabled(false);
        tableTindakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTindakanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableTindakan);

        cancelBtn.setText("Cancel");
        cancelBtn.setEnabled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        selectBtn.setText("Select");
        selectBtn.setEnabled(false);
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        obatDropdown.setEnabled(false);

        jumlahObatSpinner.setEnabled(false);

        addObatBtn.setText("Add");
        addObatBtn.setEnabled(false);
        addObatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObatBtnActionPerformed(evt);
            }
        });

        tindakanDropdown.setEnabled(false);

        addTindakanBtn.setText("Add");
        addTindakanBtn.setEnabled(false);
        addTindakanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTindakanBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.setEnabled(false);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        doneBtn.setText("Done");
        doneBtn.setEnabled(false);
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        diagnosisTxt.setEnabled(false);

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doneBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(diagnosisTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(obatDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jumlahObatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addComponent(addObatBtn))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tindakanDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addTindakanBtn))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(refreshBtn)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(selectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagnosisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obatDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahObatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addObatBtn)
                    .addComponent(tindakanDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTindakanBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBtn)
                    .addComponent(doneBtn))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        tablePasien.clearSelection();
        setInputData(false);
        tablePasien.setEnabled(true);
        SelectedID=0;
        setTablePasien();
        setTableObat();
        setTableTindakan();
        diagnosisTxt.putClientProperty("JComponent.outline", "#FF000");
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        SelectedID = Integer.parseInt(tablePasien.getModel().getValueAt(tablePasien.getSelectedRow(), 6).toString());
        setInputData(true);
        tablePasien.setEnabled(false);
        setTableObat();
        setTableTindakan();
        diagnosisTxt.putClientProperty("JComponent.outline", "error");
    }//GEN-LAST:event_selectBtnActionPerformed

    private void addObatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObatBtnActionPerformed
        Obat obat = (Obat) obatDropdown.getSelectedItem();
        Tindakan tindakan = (Tindakan) tindakanDropdown.getItemAt(0);
        int jumlahObat = (int) jumlahObatSpinner.getValue();
        DetailTransaksi dt = new DetailTransaksi(SelectedID, obat, tindakan, jumlahObat);
        int idDetailTransaksi = detailTransaksiControl.checkDetailSama(SelectedID, obat.getId(), "obat");
        if(idDetailTransaksi==0){//cek jika belum ada detail transaksi dengan obat sama
            detailTransaksiControl.insertDetailTransaksi(dt);
        }else{
            dt.setId_detail_transaksi(idDetailTransaksi);
            detailTransaksiControl.updateDetailTransaksi(dt);
        }
        setTableObat();
    }//GEN-LAST:event_addObatBtnActionPerformed

    private void addTindakanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTindakanBtnActionPerformed
        Obat obat = (Obat) obatDropdown.getItemAt(0);
        Tindakan tindakan = (Tindakan) tindakanDropdown.getSelectedItem();
        DetailTransaksi dt = new DetailTransaksi(SelectedID, obat, tindakan, 0);
        int idDetailTransaksi = detailTransaksiControl.checkDetailSama(SelectedID, tindakan.getId(), "tindakan");
        if(idDetailTransaksi==0){//cek jika belum ada detail transaksi dengan obat sama
            detailTransaksiControl.insertDetailTransaksi(dt);
        }else{
            dt.setId_detail_transaksi(idDetailTransaksi);
            detailTransaksiControl.updateDetailTransaksi(dt);
        }
        setTableTindakan();
    }//GEN-LAST:event_addTindakanBtnActionPerformed

    private void tableObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableObatMouseClicked
        tableTindakan.clearSelection();
        SelectedIDDetailTransaksi = Integer.parseInt(tableObat.getModel().getValueAt(tableObat.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tableObatMouseClicked

    private void tableTindakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTindakanMouseClicked
        tableObat.clearSelection();
        SelectedIDDetailTransaksi = Integer.parseInt(tableTindakan.getModel().getValueAt(tableTindakan.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tableTindakanMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        detailTransaksiControl.deleteDetailTransaksi(SelectedIDDetailTransaksi);
        setTableObat();
        setTableTindakan();
        SelectedIDDetailTransaksi=0;
    }//GEN-LAST:event_removeBtnActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Selesai merawat "+tablePasien.getModel().getValueAt(tablePasien.getSelectedRow(), 1).toString(),"Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            Transaksi transaksi = transaksiControl.searchTransaksi(SelectedID);
            transaksi.setStatus("Bayar");
            transaksi.setDiagnosis(diagnosisTxt.getText());
            transaksi.setTanggalTransaksi(transaksi.dateTimeNowinString());
            transaksiControl.updateStatusDataTransaksi(transaksi);
            setTablePasien();
            SelectedID=0;
            setTableObat();
            setTableTindakan();
            tablePasien.setEnabled(true);
            setInputData(false);
            doneBtn.setEnabled(false);
        }
    }//GEN-LAST:event_doneBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        refreshDataTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObatBtn;
    private javax.swing.JButton addTindakanBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField diagnosisTxt;
    private javax.swing.JButton doneBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jumlahObatSpinner;
    private javax.swing.JComboBox<Obat> obatDropdown;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JTable tableObat;
    private javax.swing.JTable tablePasien;
    private javax.swing.JTable tableTindakan;
    private javax.swing.JComboBox<Tindakan> tindakanDropdown;
    // End of variables declaration//GEN-END:variables

    private void setObatTindakanDropdown() {
        listObat = obatControl.showListObat("");
        for(Obat o:listObat){
            obatDropdown.addItem(o);
        }
        listTindakan = tindakanControl.showListTindakan("");
        for(Tindakan t : listTindakan){
            tindakanDropdown.addItem(t);
        }
    }

    private void setTablePasien() {
        tablePasien.setModel(transaksiControl.showDataPasienPerDokter(loginData.getId(), "Menunggu"));
        UtilTable.tableResizeColumnWidth(tablePasien);
    }
    private void setTableObat(){
        tableObat.setModel(detailTransaksiControl.showDataKeranjangObat("", SelectedID));
        UtilTable.tableResizeColumnWidth(tableObat);
    }
    private void setTableTindakan(){
        tableTindakan.setModel(detailTransaksiControl.showDataKeranjangTindakan("", SelectedID));
        UtilTable.tableResizeColumnWidth(tableTindakan);
    }
    @Override
    public void refreshDataTable() {
        setObatTindakanDropdown();
        setTablePasien();
        SelectedID=0;
        setTableObat();
        setTableTindakan();
    }

    private void setListener() {
        tablePasien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    boolean isRowSelected = tablePasien.getSelectedRow() != -1;
                    boolean isColumnSelected = tablePasien.getSelectedColumn() != -1;

                    selectBtn.setEnabled(isRowSelected || isColumnSelected);
                    cancelBtn.setEnabled(isRowSelected || isColumnSelected);
                }
            }
        });
        
        tableObat.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isTableObatTindakanSelected();
                }
            }
        });
        
        tableTindakan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isTableObatTindakanSelected();
                }
            }
        });
        
        jumlahObatSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = (int) jumlahObatSpinner.getValue();
                if(value<0){
                    jumlahObatSpinner.setValue(0);
                }else{
                    isObatSelected();
                }
            }
        });
        
        obatDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isObatSelected();
            }
        });
        
        tindakanDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTindakanBtn.setEnabled(tindakanDropdown.getSelectedIndex()!=0);
            }
        });
        
        diagnosisTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!diagnosisTxt.getText().isEmpty()){
                    diagnosisTxt.putClientProperty("JComponent.outline", "#FF000");
                }else{
                    diagnosisTxt.putClientProperty("JComponent.outline", "error");
                }
                doneBtn.setEnabled(!diagnosisTxt.getText().isEmpty());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!diagnosisTxt.getText().isEmpty()){
                    diagnosisTxt.putClientProperty("JComponent.outline", "#FF000");
                }else{
                    diagnosisTxt.putClientProperty("JComponent.outline", "error");
                }
                doneBtn.setEnabled(!diagnosisTxt.getText().isEmpty());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(!diagnosisTxt.getText().isEmpty()){
                    diagnosisTxt.putClientProperty("JComponent.outline", "#FF000");
                    doneBtn.setEnabled(!diagnosisTxt.getText().isEmpty());
                }else{
                    diagnosisTxt.putClientProperty("JComponent.outline", "error");
                }
                doneBtn.setEnabled(!diagnosisTxt.getText().isEmpty());
            }
        });
        
    }
    private void isTableObatTindakanSelected(){
        removeBtn.setEnabled(tableObat.getSelectedRow()!=-1 || tableTindakan.getSelectedRow()!=-1);
    }
    private void isObatSelected(){
        addObatBtn.setEnabled((int)jumlahObatSpinner.getValue()>0 && obatDropdown.getSelectedIndex()!=0);
    }
    private void setInputData(boolean b){
        selectBtn.setEnabled(b);
        cancelBtn.setEnabled(b);
        jumlahObatSpinner.setEnabled(b);
        obatDropdown.setEnabled(b);
        tindakanDropdown.setEnabled(b);
        diagnosisTxt.setEnabled(b);
        tableObat.setEnabled(b);
        tableTindakan.setEnabled(b);
    }
}