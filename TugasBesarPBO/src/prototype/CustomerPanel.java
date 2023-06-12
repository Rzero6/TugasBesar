/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prototype;

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
        setTextfield();
        setEditDelBtn(false);
        addBtn.setEnabled(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        namaTxt = new javax.swing.JTextField();
        alamatTxt = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        noTelpPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        noTelpTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();

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
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        jLabel1.setText("+62");

        javax.swing.GroupLayout noTelpPanelLayout = new javax.swing.GroupLayout(noTelpPanel);
        noTelpPanel.setLayout(noTelpPanelLayout);
        noTelpPanelLayout.setHorizontalGroup(
            noTelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noTelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTelpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );
        noTelpPanelLayout.setVerticalGroup(
            noTelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noTelpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(noTelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noTelpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(noTelpPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alamatTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, clearBtn, delBtn, editBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alamatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noTelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(delBtn)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        int clickedRow = tableCustomer.getSelectedRow();
        TableModel tableModel = tableCustomer.getModel();
        selectedID = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaTxt.setText(tableModel.getValueAt(clickedRow, 1).toString());
        noTelpTxt.setText(tableModel.getValueAt(clickedRow, 2).toString().substring(3));
        alamatTxt.setText(tableModel.getValueAt(clickedRow, 3).toString());
        dateChooser.setDate(stringToDate(tableModel.getValueAt(clickedRow, 4).toString()));
        setEditDelBtn(true);
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Customer c = new Customer(namaTxt.getText(), "+62"+noTelpTxt.getText(), dateToString(dateChooser.getDate()), alamatTxt.getText());
        customerControl.insertDataCustomer(c);
        setTableCustomer("");
        clearAll();
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Hapus data "
                +tableCustomer.getModel().getValueAt(tableCustomer.getSelectedRow(), 1).toString()+"?",
                "Warning",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            customerControl.deleteCustomer(selectedID);
            setTableCustomer("");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        Customer c = new Customer(selectedID,namaTxt.getText(), "+62"+noTelpTxt.getText(),"", dateToString(dateChooser.getDate()), alamatTxt.getText());
        customerControl.updateDataCustomer(c);
        setTableCustomer("");
    }//GEN-LAST:event_editBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField alamatTxt;
    private javax.swing.JButton clearBtn;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JPanel noTelpPanel;
    private javax.swing.JTextField noTelpTxt;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables

    private void setTextfield() {
        JTextField dateChooserTextField=(JTextField)dateChooser.getDateEditor().getUiComponent();
        namaTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama");
        alamatTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Alamat");
        searchTxt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cari");
        dateChooserTextField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tanggal Lahir");
        noTelpPanel.setBorder(new TitledBorder("Nomor Telepon"));
        setBorderandFocus(namaTxt);
        setBorderandFocus(alamatTxt);
        setBorderandFocus(noTelpTxt);
        setBorderandFocus(searchTxt);
        setBorderandFocus(dateChooserTextField);
    }
    private void setBorderandFocus(JComponent comp){
        comp.putClientProperty(FlatClientProperties.STYLE, ""
                +"borderWidth:1;"
                + "focusWidth:0");
    }

    private void setEditDelBtn(boolean b) {
        addBtn.setEnabled(!b);
        delBtn.setEnabled(b);
        editBtn.setEnabled(b);
    }

    private void setTableCustomer(String string) {
        tableCustomer.setModel(customerControl.showDataCustomer(string));
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
                
                String notelp = noTelpTxt.getText();
                if(namaTxt.getText().isEmpty() 
                    || alamatTxt.getText().isEmpty()
                    || dateChooser.getDate()==null
                    || noTelpTxt.getText().isEmpty()
                    || selectedID != 0
                    || !notelp.matches("\\d+")){
                    addBtn.setEnabled(false);
                }else{
                    addBtn.setEnabled(true);
                }
                
            }
        };
        namaTxt.getDocument().addDocumentListener(docListener);
        alamatTxt.getDocument().addDocumentListener(docListener);
        noTelpTxt.getDocument().addDocumentListener(docListener);
        JTextField dateChooserTxt = (JTextField)dateChooser.getDateEditor().getUiComponent();
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
        namaTxt.setText("");
        alamatTxt.setText("");
        noTelpTxt.setText("");
        dateChooser.setDate(null);
        tableCustomer.clearSelection();
        selectedID=0;
    }

    @Override
    public void refreshData() {
        setTableCustomer("");
    }
}
