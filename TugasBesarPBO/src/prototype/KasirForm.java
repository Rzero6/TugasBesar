/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototype;

import static com.formdev.flatlaf.FlatClientProperties.TABBED_PANE_TAB_ALIGNMENT;
import static com.formdev.flatlaf.FlatClientProperties.TABBED_PANE_TAB_WIDTH_MODE;
import static com.formdev.flatlaf.FlatClientProperties.TABBED_PANE_TAB_WIDTH_MODE_COMPACT;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author VICTUS
 */
public class KasirForm extends javax.swing.JFrame {

    /**
     * Creates new form KasirForm
     */
    private List<IPanelKasir> panelList;
    
    public KasirForm() {
        initComponents();
        setLocationRelativeTo(null);
        containerTab.putClientProperty(TABBED_PANE_TAB_WIDTH_MODE, TABBED_PANE_TAB_WIDTH_MODE_COMPACT);
        containerTab.putClientProperty(TABBED_PANE_TAB_ALIGNMENT, SwingConstants.LEADING);
        containerTab.setIconAt(0, new FlatSVGIcon("assets/people-fill-svgrepo-com.svg",16,16));
        containerTab.setIconAt(1, new FlatSVGIcon("assets/people-fill-svgrepo-com.svg",16,16));
        containerTab.setIconAt(2, new FlatSVGIcon("assets/people-fill-svgrepo-com.svg",16,16));
        panelList = new ArrayList<>();
        panelList.add(periksaPanel);
        panelList.add(bayarPanel);
        panelList.add(customerPanel);
        
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
        periksaPanel = new prototype.PeriksaPanel();
        customerPanel = new prototype.CustomerPanel();
        bayarPanel = new prototype.BayarPanel();
        jPanel2 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        namaTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        containerTab.addTab("Periksa", periksaPanel);
        containerTab.addTab("Customer", customerPanel);
        containerTab.addTab("Pembayaran", bayarPanel);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        logoutBtn.setText("Logout");

        namaTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaTxt.setForeground(new java.awt.Color(255, 255, 255));
        namaTxt.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTxt)
                    .addComponent(logoutBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containerTab, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerTab, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private prototype.BayarPanel bayarPanel;
    private javax.swing.JTabbedPane containerTab;
    private prototype.CustomerPanel customerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel namaTxt;
    private prototype.PeriksaPanel periksaPanel;
    // End of variables declaration//GEN-END:variables

    private void refreshData() {
        int selectedIndex = containerTab.getSelectedIndex();
        IPanelKasir selectedPanel = panelList.get(selectedIndex);
        selectedPanel.refreshDataTable();
    }

    private void setListener() {
        containerTab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                refreshData();
            }
        });
    }
}
