/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alvan.novelist_app.UserInterfaceList;

import com.alvan.novelist_app.Database.SessionLogin;

import java.awt.Dimension;

/**
 *
 * @author Nitro 5
 */
public class DashboardPage extends javax.swing.JFrame {


    String nama_user = SessionLogin.getUid();
    Boolean status_login = SessionLogin.getStatusLogin();


    /**
     * Creates new form DashboardPage
     */
    public DashboardPage() {
        initComponents();
        setSize(new Dimension(1400, 800));

        if (status_login == true && nama_user != null) {
            LblNamaUser.setText(nama_user);
            BtnLoginNav.setText("Keluar");
        } else {
            LblNamaUser.setText("Username");
            BtnLoginNav.setText("Masuk");
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

        PanelDashboard = new javax.swing.JPanel();
        PanelSide = new javax.swing.JPanel();
        LabelLogoSide = new javax.swing.JLabel();
        LblProfile = new javax.swing.JLabel();
        jSeparatorProfile = new javax.swing.JSeparator();
        LblListBuku = new javax.swing.JLabel();
        jSeparatorListBuku = new javax.swing.JSeparator();
        LblListPinjamanmu = new javax.swing.JLabel();
        jSeparatorListPinjamU = new javax.swing.JSeparator();
        BtnKeluarSide = new javax.swing.JButton();
        PanelNav = new javax.swing.JPanel();
        LblSelamat = new javax.swing.JLabel();
        LblNamaUser = new javax.swing.JLabel();
        BtnLoginNav = new javax.swing.JButton();
        PanelDashMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelDashboard.setPreferredSize(new java.awt.Dimension(1400, 800));
        PanelDashboard.setLayout(null);

        PanelSide.setBackground(new java.awt.Color(255, 255, 255));

        LabelLogoSide.setIcon(new javax.swing.ImageIcon("D:\\Kuli\\s3\\pbo\\novelist_app\\src\\main\\java\\com\\alvan\\novelist_app\\AssetGambar\\Novelist-logos_transparent 4.png")); // NOI18N

        LblProfile.setBackground(new java.awt.Color(231, 146, 21));
        LblProfile.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LblProfile.setForeground(new java.awt.Color(231, 146, 21));
        LblProfile.setText("Profile");

        LblListBuku.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LblListBuku.setForeground(new java.awt.Color(231, 146, 21));
        LblListBuku.setText("List Buku");

        LblListPinjamanmu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LblListPinjamanmu.setForeground(new java.awt.Color(231, 146, 21));
        LblListPinjamanmu.setText("List Pinjamanmu");

        BtnKeluarSide.setBackground(new java.awt.Color(231, 146, 21));
        BtnKeluarSide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnKeluarSide.setForeground(new java.awt.Color(255, 255, 255));
        BtnKeluarSide.setText("Keluar");

        javax.swing.GroupLayout PanelSideLayout = new javax.swing.GroupLayout(PanelSide);
        PanelSide.setLayout(PanelSideLayout);
        PanelSideLayout.setHorizontalGroup(
            PanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLogoSide, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelSideLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblListPinjamanmu)
                    .addComponent(LblListBuku)
                    .addComponent(LblProfile)
                    .addComponent(jSeparatorProfile)
                    .addComponent(jSeparatorListBuku)
                    .addComponent(jSeparatorListPinjamU)
                    .addComponent(BtnKeluarSide, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSideLayout.setVerticalGroup(
            PanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSideLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelLogoSide, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(LblProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblListBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorListBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblListPinjamanmu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorListPinjamU, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(BtnKeluarSide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        PanelDashboard.add(PanelSide);
        PanelSide.setBounds(0, 0, 260, 800);

        PanelNav.setBackground(new java.awt.Color(231, 146, 21));

        LblSelamat.setBackground(new java.awt.Color(255, 255, 255));
        LblSelamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblSelamat.setForeground(new java.awt.Color(255, 255, 255));
        LblSelamat.setText("Halo : ");

        LblNamaUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblNamaUser.setForeground(new java.awt.Color(255, 255, 255));
        LblNamaUser.setText("Username");

        BtnLoginNav.setBackground(new java.awt.Color(125, 85, 31));
        BtnLoginNav.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLoginNav.setForeground(new java.awt.Color(255, 255, 255));
        BtnLoginNav.setText("Masuk");

        javax.swing.GroupLayout PanelNavLayout = new javax.swing.GroupLayout(PanelNav);
        PanelNav.setLayout(PanelNavLayout);
        PanelNavLayout.setHorizontalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(LblSelamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNamaUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 814, Short.MAX_VALUE)
                .addComponent(BtnLoginNav, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        PanelNavLayout.setVerticalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNavLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSelamat)
                    .addComponent(LblNamaUser)
                    .addComponent(BtnLoginNav, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        PanelDashboard.add(PanelNav);
        PanelNav.setBounds(260, 0, 1140, 70);

        PanelDashMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDashMainLayout = new javax.swing.GroupLayout(PanelDashMain);
        PanelDashMain.setLayout(PanelDashMainLayout);
        PanelDashMainLayout.setHorizontalGroup(
            PanelDashMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelDashMainLayout.setVerticalGroup(
            PanelDashMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        PanelDashboard.add(PanelDashMain);
        PanelDashMain.setBounds(290, 100, 1060, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnKeluarSide;
    private javax.swing.JButton BtnLoginNav;
    private javax.swing.JLabel LabelLogoSide;
    private javax.swing.JLabel LblListBuku;
    private javax.swing.JLabel LblListPinjamanmu;
    private javax.swing.JLabel LblNamaUser;
    private javax.swing.JLabel LblProfile;
    private javax.swing.JLabel LblSelamat;
    private javax.swing.JPanel PanelDashMain;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelNav;
    private javax.swing.JPanel PanelSide;
    private javax.swing.JSeparator jSeparatorListBuku;
    private javax.swing.JSeparator jSeparatorListPinjamU;
    private javax.swing.JSeparator jSeparatorProfile;
    // End of variables declaration//GEN-END:variables
}
