/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginNew;

import DokterDashboard.DokterView;
import KasirDashboard.KasirView;
import com.formdev.flatlaf.FlatClientProperties;
//import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.util.Animator;
import com.formdev.flatlaf.util.Animator.TimingTarget;
import control.StafControl;
import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Insets;
//import java.awt.RenderingHints;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import model.Staf;

/**
 *
 * @author dendy
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    private Animator animatorLogin;
    private Animator animatorBody;
    private Animator animatorLoading;
    private boolean signIn;
    
  
    progressThread t1;
    Color defaultColor= new Color(0,20,93);
    Color selectedColor = new Color(0,107,166);
    JPanel selectedViewBtn = new JPanel();
    
    private StafControl stafControl;
    private Staf loginData=null;
    
    public LoginView() {
        initComponents();
        stafControl = new StafControl();
        passwordInput.setEchoChar('*');
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        panelBody.setVisible(false);
        showPass.setVisible(false);
        startbtn.setVisible(false);
        getContentPane().setBackground(new Color(245, 245, 245));
        TimingTarget targetLogin = new TimingTarget() { 

            @Override
            public void timingEvent(float f) {
                 if (signIn) {
                    backgroundPanel1.setAnimate(f);
                } else {
                    backgroundPanel1.setAnimate(1f - f);
                }
            
            }
            
            @Override
            public void end(){
               if (signIn) {
                    panelLogin.setVisible(false);
                    panelLoading.setVisible(false);
                    backgroundPanel1.setShowPaint(true);
                    panelBody.setAlpha(0);
                    panelBody.setVisible(true);
                    animatorBody.start();
                } else {
//                    enableLogin(true);
//                    jTextField1.grabFocus();
                }
            }
 
        };
        TimingTarget targetBody = new TimingTarget() { 
            @Override
            public void timingEvent(float f) {
                if(signIn){
                     panelBody.setAlpha(f);
                } else{
                    panelBody.setAlpha(1f-f);
                }
            }
            @Override
            public void end(){
                if (signIn == false) {
                    panelBody.setVisible(false);
                    backgroundPanel1.setShowPaint(false);
                    backgroundPanel1.setAnimate(1);
                    panelLogin.setVisible(true);
                    animatorLogin.start();
                }
            }

        };
        
        TimingTarget targetLoading = new TimingTarget() { 
             public void timingEvent(float f) {
                if(signIn){
                     panelBody.setAlpha(f);
                } else{
                    panelBody.setAlpha(1f-f);
                }
            }
            @Override
            public void end(){
                if (signIn == false) {
                    panelBody.setVisible(false);
                    backgroundPanel1.setShowPaint(false);
                    backgroundPanel1.setAnimate(1);
                    panelLoading.setVisible(true);
                    animatorLogin.start();
                    t1 = new progressThread(loading);
                    t1.start();
                    
                    
                }
            }

 
        };
    
        animatorLogin = new Animator(1500,targetLogin);
        animatorBody = new Animator(500,targetBody);
        animatorLoading = new Animator(1000,targetLoading);
        animatorLogin.setResolution(1);
        animatorBody.setResolution(1);       
        animatorLoading.setResolution(1);
        
    }
    
    class progressThread extends Thread{

        public progressThread(JProgressBar pb) {
            pb = loading;
        }
        
        public void run(){
            loading.setValue(0);
            try {
                
                sleep(1800);
                jLabel15.setVisible(true);
                jLabel17.setVisible(true);
                for (int i = 0; i <= 100; i++) {
                    loading.setValue(i);
                    persenLbl.setText(i+"%");
                    sleep(50);
                    if(i==10){
                        loadingLbl.setText("Turning On Modules...");
                    }else if (i==20){
                        loadingLbl.setText("Loading Modules...");
                    }else if (i==50){
                        loadingLbl.setText("Connecting to Modules...");
                    }else if (i==70){
                        loadingLbl.setText("Connection Successful...");
                    }else if (i==85){
                        loadingLbl.setText("Launching System...");
                    }else if( i ==100){
                        openingLbl.setText("Welcome Back");
                        loading.setVisible(false);
                        persenLbl.setVisible(false);
                        startbtn.setVisible(true);
                        startbtn.doClick();
                    }

                }
            } catch (InterruptedException ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
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
        backgroundPanel1 = new LoginNew.BackgroundPanel();
        jPanel1 = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        welcomePanel = new LoginNew.PanelLogin();
        jLabel4 = new javax.swing.JLabel();
        panelBody = new LoginNew.PanelTransparent();
        bg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        usernameInput = new KasirDashboard.CustomePalette.TextField();
        passwordInput = new KasirDashboard.CustomePalette.PasswordField();
        panelBody2 = new LoginNew.PanelBody();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelLoading = new LoginNew.PanelTransparent();
        jPanel4 = new javax.swing.JPanel();
        startbtn = new javax.swing.JButton();
        openingLbl = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        persenLbl = new javax.swing.JLabel();
        loadingLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(14, 210, 247));

        exitBtn.setBackground(new java.awt.Color(255, 102, 102));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("x");
        exitBtn.setBorder(null);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        backgroundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/dokter.png"))); // NOI18N
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 210, 247));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATMA UNIVERSAL CLINIC");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 560, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selamat Datang Di");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 560, -1));

        welcomePanel.setBackground(new java.awt.Color(0, 255, 153));
        welcomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcomePanelMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLogin.add(welcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, 60));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(239, 239, 239));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 210, 247));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login your account");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 197, 400, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(14, 210, 247));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/user.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 30, 50));

        showPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showPass.setForeground(new java.awt.Color(14, 210, 247));
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/show.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel3.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 30, 30));

        loginBtn.setBackground(new java.awt.Color(14, 210, 247));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel3.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 187, 47));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(14, 210, 247));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/AUC LOGO biru muda.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 381, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(14, 210, 247));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/padlock.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 30, 30));

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameInput.setLabelText("Username");
        jPanel3.add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 340, -1));

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordInput.setLabelText("Password");
        passwordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordInputFocusLost(evt);
            }
        });
        jPanel3.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 340, -1));

        panelBody2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(14, 210, 247));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/foto_dokter.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panelBody2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 510));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(14, 210, 247));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/next.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        panelBody2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, -1, 44));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Back");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panelBody2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 17, 153, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" ut aliquip ex ea commodo consequat. Duis aute ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        panelBody2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 460, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" ut aliquip ex ea commodo consequat. Duis aute nan te");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panelBody2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 460, 19));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(panelBody2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBody2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startbtn.setBackground(new java.awt.Color(14, 210, 247));
        startbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        startbtn.setForeground(new java.awt.Color(255, 255, 255));
        startbtn.setText("START");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        jPanel4.add(startbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 150, 50));

        openingLbl.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        openingLbl.setForeground(new java.awt.Color(14, 210, 247));
        openingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openingLbl.setText("Opening System");
        jPanel4.add(openingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 647, -1));

        loading.setForeground(new java.awt.Color(178, 254, 250));
        jPanel4.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 757, 21));

        persenLbl.setForeground(new java.awt.Color(14, 210, 247));
        persenLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        persenLbl.setText("0%");
        jPanel4.add(persenLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 64, -1));

        loadingLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loadingLbl.setForeground(new java.awt.Color(14, 210, 247));
        loadingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingLbl.setText("Loading...");
        jPanel4.add(loadingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 760, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/AUC LOGO biru muda.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 647, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/ezgif.com-video-to-gif.gif"))); // NOI18N
        jLabel17.setText("jLabel14");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 430, 200));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aset/nodeGif.gif"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 430, 30));

        javax.swing.GroupLayout panelLoadingLayout = new javax.swing.GroupLayout(panelLoading);
        panelLoading.setLayout(panelLoadingLayout);
        panelLoadingLayout.setHorizontalGroup(
            panelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLoadingLayout.setVerticalGroup(
            panelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLoading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void welcomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomePanelMouseClicked
        // TODO add your handling code here:
        signIn = true;
        animatorLogin.start();        
    }//GEN-LAST:event_welcomePanelMouseClicked

    private void welcomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomePanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePanelMouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        signIn = false;
        animatorBody.start();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         signIn = false;
        animatorBody.start();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        // TODO add your handling code here:
        
        switch(loginData.getJabatan().toLowerCase()){
            case "kasir":
                KasirView kh = new KasirView(loginData);
                this.dispose();
                kh.setVisible(true);
                break;
            case "dokter":
                //DokterView dv = new DokterView(loginData);
                //dv.setVisible(true);
                break;
            case "admin":
                break;
        }
    }//GEN-LAST:event_startbtnActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_loginBtnMouseClicked

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

    private void passwordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusGained
        // TODO add your handling code here:
        showPass.setVisible(true);
    }//GEN-LAST:event_passwordInputFocusGained

    private void passwordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusLost
        // TODO add your handling code here:
        showPass.setVisible(false);
    }//GEN-LAST:event_passwordInputFocusLost

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String password = new String(passwordInput.getPassword());
        try{
            loginData = stafControl.loginStaf(usernameInput.getText(), password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(loginData==null){
            JOptionPane.showConfirmDialog(rootPane, "Username atau Password salah","Error",JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
        }else{
            signIn = false;
            animatorLoading.start();
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

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
//            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        FlatMacLightLaf.setup();
        UIManager.put( "Panel.arc", 999);
        UIManager.put( "Button.arc", 999);
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new LoginView().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LoginNew.BackgroundPanel backgroundPanel1;
    private javax.swing.JPanel bg;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar loading;
    private javax.swing.JLabel loadingLbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel openingLbl;
    private LoginNew.PanelTransparent panelBody;
    private LoginNew.PanelBody panelBody2;
    private LoginNew.PanelTransparent panelLoading;
    private javax.swing.JPanel panelLogin;
    private KasirDashboard.CustomePalette.PasswordField passwordInput;
    private javax.swing.JLabel persenLbl;
    private javax.swing.JLabel showPass;
    private javax.swing.JButton startbtn;
    private KasirDashboard.CustomePalette.TextField usernameInput;
    private LoginNew.PanelLogin welcomePanel;
    // End of variables declaration//GEN-END:variables
}
