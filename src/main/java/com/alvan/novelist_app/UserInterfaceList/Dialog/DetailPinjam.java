/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.alvan.novelist_app.UserInterfaceList.Dialog;

import com.alvan.novelist_app.Database.KoneksiDatabase;
import com.alvan.novelist_app.UserInterfaceList.ListPeminjamanPage;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nitro 5
 */
public class DetailPinjam extends javax.swing.JDialog {


    public static  String idPinjam;

    /**
     * Creates new form DetailPinjam
     */
    public DetailPinjam(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Detail Peminjaman");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnTutupPinjamBuku = new javax.swing.JButton();
        BtnKembalikanBuku = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnHapusPinjamBuku = new javax.swing.JButton();
        txtNotaDetailPinjam = new javax.swing.JLabel();
        txtJudulBukuDetailPinjam = new javax.swing.JLabel();
        txtHargaPinjamBukuDetailPinjam = new javax.swing.JLabel();
        txtTotalHargaPinjamDetailPinjam = new javax.swing.JLabel();
        txtLamaPinjamDetailPinjam = new javax.swing.JLabel();
        txtTanggalPinjamDetailPinjam = new javax.swing.JLabel();
        txtKembaliSebelumDetailPinjam = new javax.swing.JLabel();
        txtTanggalKembaliDetailPinjam = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 146, 21));
        jLabel1.setText("Detail Pinjaman Buku");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nomor Nota ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Judul Buku ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Harga Pinjam");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total Harga pinjam");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Lama Pinjam");

        BtnTutupPinjamBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnTutupPinjamBuku.setText("Tutup");
        BtnTutupPinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTutupPinjamBukuMouseClicked(evt);
            }
        });

        BtnKembalikanBuku.setBackground(new java.awt.Color(231, 146, 21));
        BtnKembalikanBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnKembalikanBuku.setForeground(new java.awt.Color(255, 255, 255));
        BtnKembalikanBuku.setText("Kembalikan Buku");
        BtnKembalikanBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnKembalikanBukuMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tanggal Pinjam");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Kembali");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Harus di Kembalikan Sebelum ");

        BtnHapusPinjamBuku.setBackground(new java.awt.Color(204, 0, 51));
        BtnHapusPinjamBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnHapusPinjamBuku.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapusPinjamBuku.setText("Hapus Pinjaman");
        BtnHapusPinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHapusPinjamBukuMouseClicked(evt);
            }
        });

        txtNotaDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNotaDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtNotaDetailPinjam.setText("txtNotaDetailPinjam");

        txtJudulBukuDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtJudulBukuDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtJudulBukuDetailPinjam.setText("txtJudulBukuDetailPinjam");

        txtHargaPinjamBukuDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHargaPinjamBukuDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtHargaPinjamBukuDetailPinjam.setText("txtHargaPinjamBukuDetailPinjam");

        txtTotalHargaPinjamDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTotalHargaPinjamDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtTotalHargaPinjamDetailPinjam.setText("txtTotalHargaPinjamDetailPinjam");

        txtLamaPinjamDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLamaPinjamDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtLamaPinjamDetailPinjam.setText("txtLamaPinjamDetailPinjam");

        txtTanggalPinjamDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTanggalPinjamDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalPinjamDetailPinjam.setText("txtTanggalPinjamDetailPinjam");

        txtKembaliSebelumDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtKembaliSebelumDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtKembaliSebelumDetailPinjam.setText("txtKembaliSebelumDetailPinjam");

        txtTanggalKembaliDetailPinjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTanggalKembaliDetailPinjam.setForeground(new java.awt.Color(102, 102, 102));
        txtTanggalKembaliDetailPinjam.setText("txtTanggalKembaliDetailPinjam");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTutupPinjamBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnKembalikanBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggalKembaliDetailPinjam)
                            .addComponent(txtKembaliSebelumDetailPinjam)
                            .addComponent(txtTanggalPinjamDetailPinjam)
                            .addComponent(txtLamaPinjamDetailPinjam)
                            .addComponent(txtTotalHargaPinjamDetailPinjam)
                            .addComponent(txtHargaPinjamBukuDetailPinjam)
                            .addComponent(txtJudulBukuDetailPinjam)
                            .addComponent(txtNotaDetailPinjam)))
                    .addComponent(BtnHapusPinjamBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNotaDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJudulBukuDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHargaPinjamBukuDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalHargaPinjamDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLamaPinjamDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTanggalPinjamDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKembaliSebelumDetailPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTanggalKembaliDetailPinjam))
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BtnKembalikanBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnTutupPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnHapusPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTutupPinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTutupPinjamBukuMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnTutupPinjamBukuMouseClicked

    private void BtnKembalikanBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnKembalikanBukuMouseClicked
        try {
            Connection connection = KoneksiDatabase.getConnection();

            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String tanggalKembali = "2024-01-24";
            String tanggalKembali = dateFormat.format(currentDate);

            String queryTanggalPinjam = "SELECT * FROM pinjaman WHERE id = ?";
            PreparedStatement PinjamData = connection.prepareStatement(queryTanggalPinjam);
            PinjamData.setString(1, idPinjam);
            ResultSet resultSetTanggalPinjam = PinjamData.executeQuery();
            

            if (resultSetTanggalPinjam.next()) {
                System.out.println("tanggal kembali hari ini " + tanggalKembali);

                String tanggalPinjam = resultSetTanggalPinjam.getString("tanggal_pinjam");
                if (tanggalPinjam.equals(tanggalKembali)) {
                    JOptionPane.showMessageDialog(null, "Buku Tidak Bisa di Kembalikan di Hari yang Sama.");
                    return;
                }else {
                    String BukuId = resultSetTanggalPinjam.getString("buku_id");
                    String queryUpdateStokBuku = "UPDATE buku SET jumlah_stok = jumlah_stok + 1 WHERE id = ?";
                    PreparedStatement preparedStatementUpdateStokBuku = connection.prepareStatement(queryUpdateStokBuku);
                    preparedStatementUpdateStokBuku.setString(1, BukuId);
                    preparedStatementUpdateStokBuku.executeUpdate();
                }
            }


            String queryUpdateTanggalKembali = "UPDATE pinjaman SET tanggal_kembali = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(queryUpdateTanggalKembali);
            preparedStatement.setString(1, tanggalKembali);
            preparedStatement.setString(2, idPinjam);
            preparedStatement.executeUpdate();

            DefaultTableModel modelTabelListPeminjaman = ListPeminjamanPage.DataListPeminjamanMember();
            ListPeminjamanPage.TablePinjamanMember.setModel(modelTabelListPeminjaman);

            JOptionPane.showMessageDialog(null, "Buku Berhasil di Kembalikan.");

            this.dispose();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_BtnKembalikanBukuMouseClicked

    private void BtnHapusPinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHapusPinjamBukuMouseClicked
        Connection connection = KoneksiDatabase.getConnection();
        try {
            String queryHapusPinjam = "DELETE FROM pinjaman WHERE id = ?";
            String queryHapusDetailPinjam = "DELETE FROM transaksi WHERE pinjaman_id = ?";

            PreparedStatement preparedStatementHapusDetailPinjam = connection.prepareStatement(queryHapusDetailPinjam);
            preparedStatementHapusDetailPinjam.setString(1, idPinjam);
            preparedStatementHapusDetailPinjam.executeUpdate();

            PreparedStatement preparedStatement = connection.prepareStatement(queryHapusPinjam);
            preparedStatement.setString(1, idPinjam);
            preparedStatement.executeUpdate();

            DefaultTableModel modelTabelListPeminjaman = ListPeminjamanPage.DataListPeminjamanMember();
            ListPeminjamanPage.TablePinjamanMember.setModel(modelTabelListPeminjaman);

            JOptionPane.showMessageDialog(null, "Pinjaman Buku Berhasil di Hapus.");

            this.dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_BtnHapusPinjamBukuMouseClicked

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
            java.util.logging.Logger.getLogger(DetailPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailPinjam dialog = new DetailPinjam(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnHapusPinjamBuku;
    public javax.swing.JButton BtnKembalikanBuku;
    public javax.swing.JButton BtnTutupPinjamBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel txtHargaPinjamBukuDetailPinjam;
    public javax.swing.JLabel txtJudulBukuDetailPinjam;
    public javax.swing.JLabel txtKembaliSebelumDetailPinjam;
    public javax.swing.JLabel txtLamaPinjamDetailPinjam;
    public javax.swing.JLabel txtNotaDetailPinjam;
    public javax.swing.JLabel txtTanggalKembaliDetailPinjam;
    public javax.swing.JLabel txtTanggalPinjamDetailPinjam;
    public javax.swing.JLabel txtTotalHargaPinjamDetailPinjam;
    // End of variables declaration//GEN-END:variables
}
