/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KasirDashboard;

import KasirDashboard.CustomePalette.PanelServiceMenu;
import KasirDashboard.CustomePalette.ScrollBarCustom;
import KasirDashboard.CustomePalette.innerDashboard;
import KasirDashboard.CustomePalette.panelAboutUs;
import LoginNew.LoginView;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import control.TransaksiControl;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableModel;
import model.Staf;

/**
 *
 * @author dendy
 */
public class KasirView extends javax.swing.JFrame {

    /**
     * Creates new form KasirHome
     */
    Color defaultColor= new Color(255,255,255);
    Color selectedColor = new Color(3,104,218);
    boolean selectHome = true, selectService = false, selectAboutUs = false, selectLogout = false;
    int panelSlideidx=0;
    
    private Staf loginData;
    private TransaksiControl transaksiControl;
    public KasirView(Staf loginData) {
        this.loginData = loginData;
        initComponents();
        transaksiControl = new TransaksiControl();
        
        init();
        panelSlide1.setVisible(false);
    }
    
    public void setStausTable(JTable table){
        TableModel tableModel = table.getModel();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
           if(tableModel.getValueAt(i, tableModel.getColumnCount()-1).toString().equalsIgnoreCase("Menunggu")){
               tableModel.setValueAt(StatusType.MENUNGGU, i, tableModel.getColumnCount()-1);
               
           }else if(tableModel.getValueAt(i, tableModel.getColumnCount()-1).toString().equalsIgnoreCase("Diperiksa")){
               tableModel.setValueAt(StatusType.DIPERIKSA, i, tableModel.getColumnCount()-1);
               
           }else if(tableModel.getValueAt(i, tableModel.getColumnCount()-1).toString().equalsIgnoreCase("Bayar")){
               tableModel.setValueAt(StatusType.BAYAR, i, tableModel.getColumnCount()-1);
               
           }else if(tableModel.getValueAt(i, tableModel.getColumnCount()-1).toString().equalsIgnoreCase("Selesai")){
               tableModel.setValueAt(StatusType.SELESAI, i, tableModel.getColumnCount()-1);
           }
        }
    }
    
    public void init (){
        setStausTable(homeTable);
        //setStausTable(PeriksaTable);
        //setStausTable(PembayaranTable);
        //setStausTable(PendaftaranTable);
        
        tableHomeScrollBar.setVerticalScrollBar(new ScrollBarCustom());
        //tablePembayaranScrollBar.setVerticalScrollBar(new ScrollBarCustom());
        //tablePendaftaranScrollBar.setVerticalScrollBar(new ScrollBarCustom());
        //tablePeriksaScrollBar.setVerticalScrollBar(new ScrollBarCustom());
        HomePanel.setVisible(true);
        HomeLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/home (1).png"));
        homeIcon.setIcon(icon);
        
        ServicesPanel.setVisible(false);
        AboutUsPanel.setVisible(false);
        LogoutPanel.setVisible(false);
        
        panelSlide1.init(new innerDashboard(),new PanelServiceMenu(selectedColor));
//        panelSlide2.init(new panelAboutUs(new ImageIcon(getClass().getResource("/Aset/home (1).png"))),
//                         new panelAboutUs(new ImageIcon(getClass().getResource("/Aset/home.png"))),
//                         new panelAboutUs(new ImageIcon(getClass().getResource("/Aset/services.png"))));
        panelSlide1.setAnimate(10);
        roundedPanel1.setVisible(false);
        roundedPanel3.setVisible(false);
        roundedPanel2.setVisible(false);
        
        namaLbl.setText(loginData.getNama());
        setHomeTable();
    }
    
 
    
    public void setDashboardPanelActive(boolean selectHome, boolean selectService, boolean selectAboutUs){
        if(selectHome){
            home.setVisible(selectHome);
            setMenuServicesActive(false, false, false);
            aboutUs.setVisible(selectAboutUs);
            panelSlide1.setVisible(false);
        }else if (selectService){
            setMenuServicesActive(true, false, false);
            home.setVisible(selectHome);
            aboutUs.setVisible(selectAboutUs);
        }else{
            setMenuServicesActive(false, false, false);
            home.setVisible(selectHome);
            aboutUs.setVisible(selectAboutUs);
            panelSlide1.setVisible(false);
        }
        
    }
    
    public void setMenuServicesActive(boolean periksa, boolean bayar, boolean daftar){       
        panelSlide1.setVisible(true);        
        servicePeriksaPasien.setVisible(periksa);
        servicePembayaranPasien.setVisible(bayar);
        servicePendaftaranPasien.setVisible(daftar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelBody2 = new KasirDashboard.CustomePalette.PanelBody();
        jLabel3 = new javax.swing.JLabel();
        namaLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logOutIcon = new javax.swing.JLabel();
        aboutUsIcon = new javax.swing.JLabel();
        ServicesLbl = new javax.swing.JLabel();
        servicesIcon = new javax.swing.JLabel();
        HomeLbl = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        AboutUsLbl = new javax.swing.JLabel();
        ServicesPanel = new KasirDashboard.CustomePalette.PanelBodyTransparan();
        HomePanel = new KasirDashboard.CustomePalette.PanelBodyTransparan();
        LogoutPanel = new KasirDashboard.CustomePalette.PanelBodyTransparan();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AboutUsPanel = new KasirDashboard.CustomePalette.PanelBodyTransparan();
        panelSlide1 = new KasirDashboard.CustomePalette.PanelSlide();
        roundedPanel2 = new KasirDashboard.CustomePalette.roundedPanel();
        roundedPanel3 = new KasirDashboard.CustomePalette.roundedPanel();
        roundedPanel1 = new KasirDashboard.CustomePalette.roundedPanel();
        subServiceIcon = new javax.swing.JLabel();
        home = new KasirDashboard.CustomePalette.innerDashboard();
        periksaPasienPanel = new KasirDashboard.CustomePalette.roundedPanel();
        jLabel2 = new javax.swing.JLabel();
        periksaPasienLbl = new javax.swing.JLabel();
        pembayaranPasienPanel = new KasirDashboard.CustomePalette.roundedPanel();
        jLabel6 = new javax.swing.JLabel();
        pembayaranLbl = new javax.swing.JLabel();
        pendaftaranKelasPanel = new KasirDashboard.CustomePalette.roundedPanel();
        jLabel8 = new javax.swing.JLabel();
        pendaftaranPasienLbl = new javax.swing.JLabel();
        namaLbl4 = new javax.swing.JLabel();
        namaLbl1 = new javax.swing.JLabel();
        namaLbl2 = new javax.swing.JLabel();
        namaLbl3 = new javax.swing.JLabel();
        tableHomeScrollBar = new javax.swing.JScrollPane();
        homeTable = new KasirDashboard.TableCustom();
        servicePembayaranPasien = new KasirDashboard.CustomePalette.innerDashboard();
        panelSlide = new KasirDashboard.CustomePalette.PanelSlide();
        pembayaranPanelForm1 = new KasirDashboard.PembayaranPanelForm();
        servicePendaftaranPasien = new KasirDashboard.CustomePalette.innerDashboard();
        pendaftaranPasienForm1 = new KasirDashboard.PendaftaranPasienForm();
        servicePeriksaPasien = new KasirDashboard.CustomePalette.innerDashboard();
        periksaPanelForm1 = new KasirDashboard.PeriksaPanelForm();
        aboutUs = new KasirDashboard.CustomePalette.innerDashboard();
        namaLbl17 = new javax.swing.JLabel();
        namaLbl18 = new javax.swing.JLabel();
        namaLbl19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelSlide2 = new KasirDashboard.CustomePalette.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(3, 104, 218));

        exitBtn.setBackground(new java.awt.Color(255, 102, 102));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("x");
        exitBtn.setBorder(null);
        exitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1020, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBody2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/profile putih.png"))); // NOI18N
        panelBody2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, 258, 136));

        namaLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl.setForeground(new java.awt.Color(255, 255, 255));
        namaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaLbl.setText("Dendy Pramartha");
        panelBody2.add(namaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 258, 25));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HELLO");
        panelBody2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 170, 258, -1));

        logOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/logout.png"))); // NOI18N
        panelBody2.add(logOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, 30));

        aboutUsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/aboutUs.png"))); // NOI18N
        panelBody2.add(aboutUsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 50));

        ServicesLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ServicesLbl.setForeground(new java.awt.Color(255, 255, 255));
        ServicesLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ServicesLbl.setText("             Services");
        ServicesLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ServicesLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicesLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ServicesLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ServicesLblMouseExited(evt);
            }
        });
        panelBody2.add(ServicesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 351, 260, 50));

        servicesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/services.png"))); // NOI18N
        panelBody2.add(servicesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 30));

        HomeLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        HomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        HomeLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeLbl.setText("            Home");
        HomeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeLblMouseExited(evt);
            }
        });
        panelBody2.add(HomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 281, 250, 50));

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/home.png"))); // NOI18N
        panelBody2.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        LogOut.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogOut.setText("             Log out");
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });
        panelBody2.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 260, 50));

        AboutUsLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        AboutUsLbl.setForeground(new java.awt.Color(255, 255, 255));
        AboutUsLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AboutUsLbl.setText("             About Us");
        AboutUsLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AboutUsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsLblMouseExited(evt);
            }
        });
        panelBody2.add(AboutUsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 421, 260, 50));

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        ServicesPanelLayout.setVerticalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelBody2.add(ServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, 50));

        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelBody2.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 260, 50));

        LogoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout LogoutPanelLayout = new javax.swing.GroupLayout(LogoutPanel);
        LogoutPanel.setLayout(LogoutPanelLayout);
        LogoutPanelLayout.setHorizontalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        LogoutPanelLayout.setVerticalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panelBody2.add(LogoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 270, 60));

        jPanel6.setBackground(new java.awt.Color(171, 220, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        panelBody2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 485, 260, 1));

        jPanel4.setBackground(new java.awt.Color(171, 220, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        panelBody2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, 1));

        jPanel3.setBackground(new java.awt.Color(171, 220, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        panelBody2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 338, 260, 1));

        AboutUsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsPanelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout AboutUsPanelLayout = new javax.swing.GroupLayout(AboutUsPanel);
        AboutUsPanel.setLayout(AboutUsPanelLayout);
        AboutUsPanelLayout.setHorizontalGroup(
            AboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        AboutUsPanelLayout.setVerticalGroup(
            AboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        panelBody2.add(AboutUsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 260, -1));

        jPanel1.add(panelBody2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 280, 640));

        roundedPanel2.setBackground(new java.awt.Color(255, 204, 0));
        roundedPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        roundedPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        roundedPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        subServiceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/garis3 (1).png"))); // NOI18N
        subServiceIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subServiceIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subServiceIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSlide1Layout = new javax.swing.GroupLayout(panelSlide1);
        panelSlide1.setLayout(panelSlide1Layout);
        panelSlide1Layout.setHorizontalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlide1Layout.createSequentialGroup()
                .addGroup(panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSlide1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSlide1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(subServiceIcon)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelSlide1Layout.setVerticalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlide1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(subServiceIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jPanel1.add(panelSlide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 140, 740));

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        periksaPasienPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                periksaPasienPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                periksaPasienPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                periksaPasienPanelMouseExited(evt);
            }
        });
        periksaPasienPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 104, 218));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Periksa Pasien");
        periksaPasienPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, -1));

        periksaPasienLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/daftar_pasien.png"))); // NOI18N
        periksaPasienLbl.setText("jLabel1");
        periksaPasienLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        periksaPasienPanel.add(periksaPasienLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 243, 170));

        home.add(periksaPasienPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 143, -1, 169));

        pembayaranPasienPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembayaranPasienPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pembayaranPasienPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pembayaranPasienPanelMouseExited(evt);
            }
        });
        pembayaranPasienPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 104, 218));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pembayaran Pasien");
        pembayaranPasienPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, -1));

        pembayaranLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/pembayaran_pasien.png"))); // NOI18N
        pembayaranLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pembayaranPasienPanel.add(pembayaranLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        home.add(pembayaranPasienPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 143, -1, 169));

        pendaftaranKelasPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendaftaranKelasPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendaftaranKelasPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendaftaranKelasPanelMouseExited(evt);
            }
        });
        pendaftaranKelasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 104, 218));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pendaftaran Pasien");
        pendaftaranKelasPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 240, 30));

        pendaftaranPasienLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/pendaftaranPasien.png"))); // NOI18N
        pendaftaranPasienLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pendaftaranKelasPanel.add(pendaftaranPasienLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 160));

        home.add(pendaftaranKelasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 143, 243, 169));

        namaLbl4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl4.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl4.setText("Dashboard> ");
        home.add(namaLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 30, -1, 25));

        namaLbl1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl1.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl1.setText("Kasir");
        home.add(namaLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 67, 134, 50));

        namaLbl2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl2.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl2.setText("Home");
        home.add(namaLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 30, 92, 25));

        namaLbl3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        namaLbl3.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl3.setText("Transaksi Terkini");
        home.add(namaLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 330, 570, 50));

        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"a", "b", "c", "d", "f", "g", "h", "Menunggu"},
                {"b", "c", "da", "f", "g", "g", "a", "Diperiksa"},
                {"a", "s", "w", "r", "f", "a", "w", "Selesai"},
                {"a", "f", "s", "FG", "G", "qw", "f", "Bayar"}
            },
            new String [] {
                "1", "2", "Title 33", "4", "5", "6", "7", "8"
            }
        ));
        tableHomeScrollBar.setViewportView(homeTable);

        home.add(tableHomeScrollBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 710, 240));

        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 850, 710));

        servicePembayaranPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSlide.setBackground(new java.awt.Color(102, 204, 0));
        panelSlide.setForeground(new java.awt.Color(51, 255, 204));
        servicePembayaranPasien.add(panelSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 0, 120, 720));
        servicePembayaranPasien.add(pembayaranPanelForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jPanel1.add(servicePembayaranPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 850, 710));

        servicePendaftaranPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        servicePendaftaranPasien.add(pendaftaranPasienForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(servicePendaftaranPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 850, 710));

        servicePeriksaPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        servicePeriksaPasien.add(periksaPanelForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(servicePeriksaPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 850, 710));

        namaLbl17.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        namaLbl17.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl17.setText("Dashboard> ");

        namaLbl18.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        namaLbl18.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl18.setText("About Us");

        namaLbl19.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        namaLbl19.setForeground(new java.awt.Color(3, 104, 218));
        namaLbl19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaLbl19.setText("About Us");

        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelSlide2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout aboutUsLayout = new javax.swing.GroupLayout(aboutUs);
        aboutUs.setLayout(aboutUsLayout);
        aboutUsLayout.setHorizontalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                        .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutUsLayout.createSequentialGroup()
                                .addComponent(namaLbl17)
                                .addGap(2, 2, 2)
                                .addComponent(namaLbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(namaLbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(517, 517, 517))))
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(panelSlide2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        aboutUsLayout.setVerticalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaLbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSlide2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jPanel1.add(aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 850, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1050, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void HomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HomePanelMouseEntered

    private void HomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_HomePanelMouseExited

    private void HomeLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLblMouseEntered
        // TODO add your handling code here:
        HomePanel.setVisible(true);
        HomeLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/home (1).png"));
        homeIcon.setIcon(icon);
    }//GEN-LAST:event_HomeLblMouseEntered

    private void HomeLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLblMouseExited
        // TODO add your handling code here:
        if(!selectHome){
            HomePanel.setVisible(false);
            HomeLbl.setForeground(defaultColor);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/home.png"));
            homeIcon.setIcon(icon);
        }
       
    }//GEN-LAST:event_HomeLblMouseExited

    private void ServicesLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesLblMouseExited
        // TODO add your handling code here:
        if(!selectService){
            ServicesPanel.setVisible(false);
            ServicesLbl.setForeground(defaultColor);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/services.png"));
            servicesIcon.setIcon(icon);
        }
        
    }//GEN-LAST:event_ServicesLblMouseExited

    private void ServicesLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesLblMouseEntered
        // TODO add your handling code here:
        ServicesPanel.setVisible(true);
        ServicesLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/services(1).png"));
        servicesIcon.setIcon(icon);
    }//GEN-LAST:event_ServicesLblMouseEntered

    private void LogoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_LogoutPanelMouseEntered

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        // TODO add your handling code here:
        LogoutPanel.setVisible(true);
        LogOut.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/logout (1).png"));
        logOutIcon.setIcon(icon);
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        // TODO add your handling code here:
        if(!selectLogout){
            LogoutPanel.setVisible(false);
            LogOut.setForeground(defaultColor);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/logout.png"));
            logOutIcon.setIcon(icon);
        }
        
    }//GEN-LAST:event_LogOutMouseExited

    private void HomeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLblMouseClicked
        // TODO add your handling code here:
        selectHome = true;
        selectAboutUs = false;
        selectService = false;
        selectLogout = false;
        HomePanel.setVisible(true);
        HomeLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/home (1).png"));
        homeIcon.setIcon(icon);
        
        ServicesPanel.setVisible(false);
        ServicesLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/services.png"));
        servicesIcon.setIcon(icon2);
        
        AboutUsPanel.setVisible(false);
        AboutUsLbl.setForeground(defaultColor);
        Icon icon3 = new ImageIcon(getClass().getResource("/Aset/aboutUs.png"));
        aboutUsIcon.setIcon(icon3);
        
        LogoutPanel.setVisible(false);
        LogOut.setForeground(defaultColor);
        Icon icon4 = new ImageIcon(getClass().getResource("/Aset/logout.png"));
        logOutIcon.setIcon(icon4);
        
        setDashboardPanelActive(selectHome, selectService, selectAboutUs);
        
        
        
    }//GEN-LAST:event_HomeLblMouseClicked

    private void ServicesLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesLblMouseClicked
        // TODO add your handling code here:
        selectService = true;
        selectHome = false;
        selectAboutUs = false;
        ServicesPanel.setVisible(true);
        ServicesLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/services(1).png"));
        servicesIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        AboutUsPanel.setVisible(false);
        AboutUsLbl.setForeground(defaultColor);
        Icon icon3 = new ImageIcon(getClass().getResource("/Aset/aboutUs.png"));
        aboutUsIcon.setIcon(icon3);
        
        LogoutPanel.setVisible(false);
        LogOut.setForeground(defaultColor);
        Icon icon4 = new ImageIcon(getClass().getResource("/Aset/logout.png"));
        logOutIcon.setIcon(icon4);
        setDashboardPanelActive(selectHome, selectService, selectAboutUs);
        
        
    }//GEN-LAST:event_ServicesLblMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        selectService = false;
        selectHome = false;
        selectAboutUs = false;
        selectLogout = true;
        
        LogoutPanel.setVisible(true);
        LogOut.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/logout (1).png"));
        logOutIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        ServicesPanel.setVisible(false);
        ServicesLbl.setForeground(defaultColor);
        Icon icon3 = new ImageIcon(getClass().getResource("/Aset/services.png"));
        servicesIcon.setIcon(icon3);
        
        AboutUsPanel.setVisible(false);
        AboutUsLbl.setForeground(defaultColor);
        Icon icon4 = new ImageIcon(getClass().getResource("/Aset/aboutUs.png"));
        aboutUsIcon.setIcon(icon4);
        
         int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Yakin ingin Log Out ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
         switch(getAnswer){
                case 0:
                    LoginView mp = new LoginView();
                    mp.setVisible(true);
                    this.setVisible(false);
                    break;
                    
                case 1:
                    LogoutPanel.setVisible(false);
                    LogOut.setForeground(defaultColor);
                    Icon icon5 = new ImageIcon(getClass().getResource("/Aset/logout.png"));
                    logOutIcon.setIcon(icon5);
                    HomeLblMouseClicked(evt);
                    break;
         }
        
    }//GEN-LAST:event_LogOutMouseClicked

    private void periksaPasienPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periksaPasienPanelMouseEntered
        // TODO add your handling code here:
        periksaPasienPanel.setLocation(periksaPasienPanel.getX(), periksaPasienPanel.getY()-10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/daftar_pasien1.png"));
        periksaPasienLbl.setIcon(icon);
    }//GEN-LAST:event_periksaPasienPanelMouseEntered

    private void periksaPasienPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periksaPasienPanelMouseExited
        // TODO add your handling code here:
        periksaPasienPanel.setLocation(periksaPasienPanel.getX(), periksaPasienPanel.getY()+10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/daftar_pasien.png"));
        periksaPasienLbl.setIcon(icon);
    }//GEN-LAST:event_periksaPasienPanelMouseExited

    private void pembayaranPasienPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranPasienPanelMouseEntered
        // TODO add your handling code here:
        pembayaranPasienPanel.setLocation(pembayaranPasienPanel.getX(), pembayaranPasienPanel.getY()-10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/pembayaran_pasien1.png"));
        pembayaranLbl.setIcon(icon);
    }//GEN-LAST:event_pembayaranPasienPanelMouseEntered

    private void pembayaranPasienPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranPasienPanelMouseExited
        // TODO add your handling code here:
        pembayaranPasienPanel.setLocation(pembayaranPasienPanel.getX(), pembayaranPasienPanel.getY()+10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/pembayaran_pasien.png"));
        pembayaranLbl.setIcon(icon);
    }//GEN-LAST:event_pembayaranPasienPanelMouseExited

    private void pendaftaranKelasPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftaranKelasPanelMouseEntered
        // TODO add your handling code here:
        pendaftaranKelasPanel.setLocation(pendaftaranKelasPanel.getX(), pendaftaranKelasPanel.getY()-10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/pendaftaranPasien1.png"));
        pendaftaranPasienLbl.setIcon(icon);
    }//GEN-LAST:event_pendaftaranKelasPanelMouseEntered

    private void pendaftaranKelasPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftaranKelasPanelMouseExited
        // TODO add your handling code here:
        pendaftaranKelasPanel.setLocation(pendaftaranKelasPanel.getX(), pendaftaranKelasPanel.getY()+10);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/pendaftaranPasien.png"));
        pendaftaranPasienLbl.setIcon(icon);
    }//GEN-LAST:event_pendaftaranKelasPanelMouseExited

    private void AboutUsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsLblMouseClicked
        // TODO add your handling code here:
        selectService = false;
        selectHome = false;
        selectAboutUs = true;
        
        AboutUsPanel.setVisible(true);
        AboutUsLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/AboutUs (1).png"));
        aboutUsIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        ServicesPanel.setVisible(false);
        ServicesLbl.setForeground(defaultColor);
        Icon icon3 = new ImageIcon(getClass().getResource("/Aset/services.png"));
        servicesIcon.setIcon(icon3);
        
        LogoutPanel.setVisible(false);
        LogOut.setForeground(defaultColor);
        Icon icon4 = new ImageIcon(getClass().getResource("/Aset/logout.png"));
        logOutIcon.setIcon(icon4);
        setDashboardPanelActive(selectHome, selectService, selectAboutUs);
    }//GEN-LAST:event_AboutUsLblMouseClicked

    private void AboutUsLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsLblMouseEntered
        // TODO add your handling code here:
        AboutUsPanel.setVisible(true);
        AboutUsLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/aboutUs (1).png"));
        aboutUsIcon.setIcon(icon);
    }//GEN-LAST:event_AboutUsLblMouseEntered

    private void AboutUsLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsLblMouseExited
        // TODO add your handling code here:
        if(!selectAboutUs){
            AboutUsPanel.setVisible(false);
            AboutUsLbl.setForeground(defaultColor);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/aboutUs.png"));
            aboutUsIcon.setIcon(icon);
        }
    }//GEN-LAST:event_AboutUsLblMouseExited

    private void AboutUsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsPanelMouseEntered

    private void roundedPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel2MouseClicked
        setMenuServicesActive(true, false, false);
    }//GEN-LAST:event_roundedPanel2MouseClicked

    private void roundedPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel3MouseClicked
        // TODO add your handling code here:
        setMenuServicesActive(false, true, false);
    }//GEN-LAST:event_roundedPanel3MouseClicked

    private void roundedPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel1MouseClicked
        // TODO add your handling code here:
        setMenuServicesActive(false, false, true);
    }//GEN-LAST:event_roundedPanel1MouseClicked

    private void periksaPasienPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periksaPasienPanelMouseClicked
        // TODO add your handling code here:
        selectHome = false;
        selectService = true;
        ServicesPanel.setVisible(true);
        ServicesLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/services(1).png"));
        servicesIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        setDashboardPanelActive(false, true, false);
        setMenuServicesActive(true, false, false);
        
    }//GEN-LAST:event_periksaPasienPanelMouseClicked

    private void pembayaranPasienPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranPasienPanelMouseClicked
        // TODO add your handling code here:
        selectService = true;        
        ServicesPanel.setVisible(true);
        ServicesLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/services(1).png"));
        servicesIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        setDashboardPanelActive(false, true, false);
        setMenuServicesActive(false, true, false);
    }//GEN-LAST:event_pembayaranPasienPanelMouseClicked

    private void pendaftaranKelasPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftaranKelasPanelMouseClicked
        // TODO add your handling code here:
        selectService = true;
        ServicesPanel.setVisible(true);
        ServicesLbl.setForeground(selectedColor);
        Icon icon = new ImageIcon(getClass().getResource("/Aset/services(1).png"));
        servicesIcon.setIcon(icon);
        
        HomePanel.setVisible(false);
        HomeLbl.setForeground(defaultColor);
        Icon icon2 = new ImageIcon(getClass().getResource("/Aset/home.png"));
        homeIcon.setIcon(icon2);
        
        setDashboardPanelActive(false, true, false);
        setMenuServicesActive(false, false, true);
    }//GEN-LAST:event_pendaftaranKelasPanelMouseClicked

    private void subServiceIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subServiceIconMouseClicked
        // TODO add your handling code here:
        if(roundedPanel1.isVisible()){
            roundedPanel1.setVisible(false);
            roundedPanel3.setVisible(false);
            roundedPanel2.setVisible(false);
            panelSlide1.show(0);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/garis3 (1).png"));
            subServiceIcon.setIcon(icon);
        }else{
            panelSlide1.show(1);
            roundedPanel1.setVisible(true);
            roundedPanel3.setVisible(true);
            roundedPanel2.setVisible(true);
            Icon icon = new ImageIcon(getClass().getResource("/Aset/garis_3.png"));
            subServiceIcon.setIcon(icon);
        }

    }//GEN-LAST:event_subServiceIconMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panelSlideidx++;
        panelSlide2.show(panelSlideidx);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(panelSlideidx!=0){
            panelSlideidx--;
            panelSlide2.show(panelSlideidx);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(KasirHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KasirHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KasirHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KasirHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        FlatMacLightLaf.setup();
        UIManager.put( "Button.arc", 999);
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Staf s = new Staf(8,"Tes","Tes","Tes","Tes","Tes","Tes");
                new KasirView(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUsLbl;
    private KasirDashboard.CustomePalette.PanelBodyTransparan AboutUsPanel;
    private javax.swing.JLabel HomeLbl;
    private KasirDashboard.CustomePalette.PanelBodyTransparan HomePanel;
    private javax.swing.JLabel LogOut;
    private KasirDashboard.CustomePalette.PanelBodyTransparan LogoutPanel;
    private javax.swing.JLabel ServicesLbl;
    private KasirDashboard.CustomePalette.PanelBodyTransparan ServicesPanel;
    private KasirDashboard.CustomePalette.innerDashboard aboutUs;
    private javax.swing.JLabel aboutUsIcon;
    private javax.swing.JButton exitBtn;
    private KasirDashboard.CustomePalette.innerDashboard home;
    private javax.swing.JLabel homeIcon;
    private KasirDashboard.TableCustom homeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JLabel namaLbl1;
    private javax.swing.JLabel namaLbl17;
    private javax.swing.JLabel namaLbl18;
    private javax.swing.JLabel namaLbl19;
    private javax.swing.JLabel namaLbl2;
    private javax.swing.JLabel namaLbl3;
    private javax.swing.JLabel namaLbl4;
    private KasirDashboard.CustomePalette.PanelBody panelBody2;
    private KasirDashboard.CustomePalette.PanelSlide panelSlide;
    private KasirDashboard.CustomePalette.PanelSlide panelSlide1;
    private KasirDashboard.CustomePalette.PanelSlide panelSlide2;
    private javax.swing.JLabel pembayaranLbl;
    private KasirDashboard.PembayaranPanelForm pembayaranPanelForm1;
    private KasirDashboard.CustomePalette.roundedPanel pembayaranPasienPanel;
    private KasirDashboard.CustomePalette.roundedPanel pendaftaranKelasPanel;
    private KasirDashboard.PendaftaranPasienForm pendaftaranPasienForm1;
    private javax.swing.JLabel pendaftaranPasienLbl;
    private KasirDashboard.PeriksaPanelForm periksaPanelForm1;
    private javax.swing.JLabel periksaPasienLbl;
    private KasirDashboard.CustomePalette.roundedPanel periksaPasienPanel;
    private KasirDashboard.CustomePalette.roundedPanel roundedPanel1;
    private KasirDashboard.CustomePalette.roundedPanel roundedPanel2;
    private KasirDashboard.CustomePalette.roundedPanel roundedPanel3;
    private KasirDashboard.CustomePalette.innerDashboard servicePembayaranPasien;
    private KasirDashboard.CustomePalette.innerDashboard servicePendaftaranPasien;
    private KasirDashboard.CustomePalette.innerDashboard servicePeriksaPasien;
    private javax.swing.JLabel servicesIcon;
    private javax.swing.JLabel subServiceIcon;
    private javax.swing.JScrollPane tableHomeScrollBar;
    // End of variables declaration//GEN-END:variables

    private void setHomeTable() {
        homeTable.setModel(transaksiControl.showDataPeriksa("", ""));
    }

}
