/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alvan.novelist_app.UserInterfaceList;

import com.alvan.novelist_app.Database.KoneksiDatabase;
import com.alvan.novelist_app.Database.PasswordHash;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nitro 5
 */
public class DaftarForm extends javax.swing.JFrame {

    /**
     * Creates new form DaftarForm
     */
    public DaftarForm() {
        initComponents();
        setSize(new Dimension(1400, 800));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtamaDaftar = new javax.swing.JPanel();
        PanelKiriDaftar = new javax.swing.JPanel();
        LabelLogoDaftar = new javax.swing.JLabel();
        PanelKananDaftar = new javax.swing.JPanel();
        LabelDaftar = new javax.swing.JLabel();
        SeparatorDaftar = new javax.swing.JSeparator();
        LabelNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        txtEmailDaf = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        txtPasswordDaf = new javax.swing.JPasswordField();
        BtnDaftar = new javax.swing.JButton();
        LabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelUtamaDaftar.setPreferredSize(new java.awt.Dimension(1400, 800));
        PanelUtamaDaftar.setLayout(null);

        PanelKiriDaftar.setBackground(new java.awt.Color(231, 146, 21));
        PanelKiriDaftar.setMinimumSize(new java.awt.Dimension(700, 800));
        PanelKiriDaftar.setPreferredSize(new java.awt.Dimension(700, 800));

        javax.swing.GroupLayout PanelKiriDaftarLayout = new javax.swing.GroupLayout(PanelKiriDaftar);
        PanelKiriDaftar.setLayout(PanelKiriDaftarLayout);
        PanelKiriDaftarLayout.setHorizontalGroup(
            PanelKiriDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelLogoDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        PanelKiriDaftarLayout.setVerticalGroup(
            PanelKiriDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriDaftarLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(LabelLogoDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        PanelUtamaDaftar.add(PanelKiriDaftar);
        PanelKiriDaftar.setBounds(0, 0, 700, 800);

        PanelKananDaftar.setBackground(new java.awt.Color(255, 255, 255));
        PanelKananDaftar.setMinimumSize(new java.awt.Dimension(700, 800));
        PanelKananDaftar.setPreferredSize(new java.awt.Dimension(700, 800));

        LabelDaftar.setBackground(new java.awt.Color(231, 146, 21));
        LabelDaftar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelDaftar.setForeground(new java.awt.Color(231, 146, 21));
        LabelDaftar.setText("Daftar");

        SeparatorDaftar.setForeground(new java.awt.Color(153, 153, 153));

        LabelNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(231, 146, 21));
        LabelNama.setText("Nama");

        txtNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });

        LabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(231, 146, 21));
        LabelEmail.setText("Email");

        txtEmailDaf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmailDaf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        txtEmailDaf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailDafKeyPressed(evt);
            }
        });

        LabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(231, 146, 21));
        LabelPassword.setText("Password");

        txtPasswordDaf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPasswordDaf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        txtPasswordDaf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordDafKeyPressed(evt);
            }
        });

        BtnDaftar.setBackground(new java.awt.Color(231, 146, 21));
        BtnDaftar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        BtnDaftar.setText("Daftar");
        BtnDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDaftarMouseClicked(evt);
            }
        });
        BtnDaftar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnDaftarKeyPressed(evt);
            }
        });

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(231, 146, 21));
        LabelLogin.setText("Sudah punya akun?");
        LabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelKananDaftarLayout = new javax.swing.GroupLayout(PanelKananDaftar);
        PanelKananDaftar.setLayout(PanelKananDaftarLayout);
        PanelKananDaftarLayout.setHorizontalGroup(
            PanelKananDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananDaftarLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(LabelDaftar)
                .addGap(323, 323, 323))
            .addGroup(PanelKananDaftarLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(PanelKananDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelLogin)
                    .addGroup(PanelKananDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelPassword)
                        .addComponent(LabelEmail)
                        .addComponent(LabelNama)
                        .addComponent(SeparatorDaftar)
                        .addComponent(txtNama)
                        .addComponent(txtEmailDaf)
                        .addComponent(txtPasswordDaf)
                        .addComponent(BtnDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKananDaftarLayout.setVerticalGroup(
            PanelKananDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananDaftarLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(LabelDaftar)
                .addGap(18, 18, 18)
                .addComponent(SeparatorDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailDaf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordDaf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLogin)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        PanelUtamaDaftar.add(PanelKananDaftar);
        PanelKananDaftar.setBounds(700, 0, 700, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelUtamaDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelUtamaDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDaftarMouseClicked
        Connection connection = KoneksiDatabase.getConnection();

        String nama = txtNama.getText();
        String email = txtEmailDaf.getText();
        String password = txtPasswordDaf.getText();

        if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            resetForm();
        } else if (!CekEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email tidak valid");
            resetForm();
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password minimal 8 karakter");
            resetForm();
        } else if (CekEmailExist(email)) {
            JOptionPane.showMessageDialog(null, "Email sudah terdaftar");
            resetForm();
        } else {
            try {
                PasswordHash haspwd = new PasswordHash();
                var pwdencrypt = haspwd.hashPassword(password);

                String query = "INSERT INTO member (nama, email, password, created_at ) VALUES (?, ?, ?, NOW())";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, nama);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, pwdencrypt);

                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Daftar berhasil silahkan login");
                    LoginForm loginPage = new LoginForm();
                    loginPage.setVisible(true);
                    loginPage.setLocationRelativeTo(null);
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error executing query: " + ex.getMessage());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal ditambahkan: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_BtnDaftarMouseClicked

    private void LabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLoginMouseClicked
        LoginForm loginPage = new LoginForm();
        loginPage.setVisible(true);
        loginPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LabelLoginMouseClicked

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        if(evt.getKeyCode ()== KeyEvent.VK_ENTER){
        txtEmailDaf.requestFocus();
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtEmailDafKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailDafKeyPressed
        if(evt.getKeyCode ()== KeyEvent.VK_ENTER){
        txtPasswordDaf.requestFocus();
        }
    }//GEN-LAST:event_txtEmailDafKeyPressed

    private void txtPasswordDafKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordDafKeyPressed
        if(evt.getKeyCode ()== KeyEvent.VK_ENTER){
        BtnDaftar.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordDafKeyPressed

    private void BtnDaftarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnDaftarKeyPressed
        Connection connection = KoneksiDatabase.getConnection();

        String nama = txtNama.getText();
        String email = txtEmailDaf.getText();
        String password = txtPasswordDaf.getText();

        if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            resetForm();
        } else if (!CekEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email tidak valid");
            resetForm();
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password minimal 8 karakter");
            resetForm();
        } else if (CekEmailExist(email)) {
            JOptionPane.showMessageDialog(null, "Email sudah terdaftar");
            resetForm();
        } else {
            try {
                PasswordHash haspwd = new PasswordHash();
                var pwdencrypt = haspwd.hashPassword(password);

                String query = "INSERT INTO member (nama, email, password, created_at ) VALUES (?, ?, ?, NOW())";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, nama);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, pwdencrypt);

                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Daftar berhasil silahkan login");
                    LoginForm loginPage = new LoginForm();
                    loginPage.setVisible(true);
                    loginPage.setLocationRelativeTo(null);
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error executing query: " + ex.getMessage());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal ditambahkan: " + e.getMessage());
            }
        }
        
        if(evt.getKeyCode ()== KeyEvent.VK_ENTER){
        BtnDaftar.doClick();
        }
    }//GEN-LAST:event_BtnDaftarKeyPressed

    private boolean CekEmail(String Email) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    private boolean CekEmailExist(String email) {
        try (Connection connection = KoneksiDatabase.getConnection()) {
            String query = "SELECT * FROM member WHERE email = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    private void resetForm() {
        txtNama.setText("");
        txtEmailDaf.setText("");
        txtPasswordDaf.setText("");
    }

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
            java.util.logging.Logger.getLogger(DaftarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDaftar;
    private javax.swing.JLabel LabelDaftar;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLogoDaftar;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JPanel PanelKananDaftar;
    private javax.swing.JPanel PanelKiriDaftar;
    private javax.swing.JPanel PanelUtamaDaftar;
    private javax.swing.JSeparator SeparatorDaftar;
    private javax.swing.JTextField txtEmailDaf;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPasswordDaf;
    // End of variables declaration//GEN-END:variables
}
