/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminDashboard;

import LoginNew.LoginView;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Staf;

/**
 *
 * @author VICTUS
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    private List<IPanelAdmin> panelList;
    private Staf loginData;
    public AdminView(Staf loginData) {
        initComponents();
        this.loginData=loginData;
        loginIDTxt.setText("Login ID : "+loginData.getUsername());
        namaTxt.setText("Hallo "+loginData.getNama());
        logoutBtn.putClientProperty(FlatClientProperties.STYLE, ""
            +"borderWidth:1;"
            + "focusWidth:0");
        panelList = new ArrayList<>();
        panelList.add(stafPanel1);
        panelList.add(mutasiPanelNew1);
        panelList.add(supplierPanel1);
        panelList.add(pengadaanPanel1);
        panelList.add(tindakanPanel1);
        panelList.add(customerPanel1);
        panelList.add(transaksiPanel1);
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

        containerTab = new javax.swing.JTabbedPane();
        stafPanel1 = new AdminDashboard.StafPanel();
        mutasiPanelNew1 = new AdminDashboard.MutasiPanelNew();
        supplierPanel1 = new AdminDashboard.SupplierPanel();
        pengadaanPanel1 = new AdminDashboard.PengadaanPanel();
        tindakanPanel1 = new AdminDashboard.TindakanPanel();
        customerPanel1 = new AdminDashboard.CustomerPanel();
        transaksiPanel1 = new AdminDashboard.TransaksiPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginIDTxt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        namaTxt = new javax.swing.JLabel();
        loginIDTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerTab.setBackground(new java.awt.Color(51, 153, 255));
        containerTab.setForeground(new java.awt.Color(255, 255, 255));
        containerTab.addTab("Staff", stafPanel1);
        containerTab.addTab("Mutasi", mutasiPanelNew1);
        containerTab.addTab("Supplier", supplierPanel1);
        containerTab.addTab("Obat", pengadaanPanel1);
        containerTab.addTab("Tindakan", tindakanPanel1);
        containerTab.addTab("Customer", customerPanel1);
        containerTab.addTab("Transaksi", transaksiPanel1);

        jPanel1.setBackground(new java.awt.Color(3, 104, 218));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/AUC LOGO biru muda.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 370, 70));

        loginIDTxt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginIDTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/bannerAdmin.jpg"))); // NOI18N
        jPanel1.add(loginIDTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        jPanel2.setBackground(new java.awt.Color(3, 104, 218));

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(51, 153, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        namaTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaTxt.setForeground(new java.awt.Color(255, 255, 255));
        namaTxt.setText("Nama");

        loginIDTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginIDTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginIDTxt.setText("LOGIN ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(loginIDTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(containerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(containerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin Logout ?","Logout",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            logout();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Staf s = new Staf(0,"Tes","Tes","Tes","Tes","Tes","Tes");
                new AdminView(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane containerTab;
    private AdminDashboard.CustomerPanel customerPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loginIDTxt;
    private javax.swing.JLabel loginIDTxt1;
    private javax.swing.JButton logoutBtn;
    private AdminDashboard.MutasiPanelNew mutasiPanelNew1;
    private javax.swing.JLabel namaTxt;
    private AdminDashboard.PengadaanPanel pengadaanPanel1;
    private AdminDashboard.StafPanel stafPanel1;
    private AdminDashboard.SupplierPanel supplierPanel1;
    private AdminDashboard.TindakanPanel tindakanPanel1;
    private AdminDashboard.TransaksiPanel transaksiPanel1;
    // End of variables declaration//GEN-END:variables
    private void refreshData() {
        int selectedIndex = containerTab.getSelectedIndex();
        IPanelAdmin selectedPanel = panelList.get(selectedIndex);
        selectedPanel.refreshData();
    }

    private void setListener() {
        containerTab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                refreshData();
            }
        });
    }

    private void logout() {
        LoginView lv = new LoginView();
        this.dispose();
        lv.setVisible(true);
        
    }
    
}
