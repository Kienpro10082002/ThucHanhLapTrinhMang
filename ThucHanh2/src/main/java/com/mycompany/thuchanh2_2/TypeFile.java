/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thuchanh2_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TypeFile extends javax.swing.JFrame {

    /**
     * Creates new form TypeFile
     */
    public TypeFile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_FileName = new javax.swing.JLabel();
        lbl_NhapChuoi = new javax.swing.JLabel();
        lbl_NoiDungFile = new javax.swing.JLabel();
        txt_FileName = new javax.swing.JTextField();
        txt_NhapChuoi = new javax.swing.JTextField();
        txt_NoiDungFile = new javax.swing.JTextField();
        btn_DocFileNhiPhan = new javax.swing.JButton();
        btn_DocFileVanBan = new javax.swing.JButton();
        btn_VietFileNhiPhan = new javax.swing.JButton();
        btn_VietFileVanBan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_FileName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_FileName.setText("Nhập tên tập tin");

        lbl_NhapChuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NhapChuoi.setText("Nhập chuỗi");

        lbl_NoiDungFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NoiDungFile.setText("Nội dung file");

        txt_FileName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_NhapChuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_NhapChuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhapChuoiActionPerformed(evt);
            }
        });

        txt_NoiDungFile.setBackground(java.awt.SystemColor.activeCaption);
        txt_NoiDungFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_NoiDungFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NoiDungFileActionPerformed(evt);
            }
        });

        btn_DocFileNhiPhan.setBackground(java.awt.SystemColor.activeCaption);
        btn_DocFileNhiPhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DocFileNhiPhan.setText("Đọc file nhị phân");
        btn_DocFileNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocFileNhiPhanActionPerformed(evt);
            }
        });

        btn_DocFileVanBan.setBackground(java.awt.SystemColor.activeCaption);
        btn_DocFileVanBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DocFileVanBan.setText("Đọc file văn bản");
        btn_DocFileVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocFileVanBanActionPerformed(evt);
            }
        });

        btn_VietFileNhiPhan.setBackground(java.awt.SystemColor.activeCaption);
        btn_VietFileNhiPhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_VietFileNhiPhan.setText("Ghi file nhị phân");
        btn_VietFileNhiPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VietFileNhiPhanActionPerformed(evt);
            }
        });

        btn_VietFileVanBan.setBackground(java.awt.SystemColor.activeCaption);
        btn_VietFileVanBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_VietFileVanBan.setText("Ghi file văn bản");
        btn_VietFileVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VietFileVanBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_NhapChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NhapChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_NoiDungFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_NoiDungFile, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_DocFileNhiPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_DocFileVanBan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_VietFileNhiPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_VietFileVanBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_FileName)
                    .addComponent(txt_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapChuoi)
                    .addComponent(txt_NhapChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NoiDungFile)
                    .addComponent(txt_NoiDungFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DocFileNhiPhan)
                    .addComponent(btn_VietFileNhiPhan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DocFileVanBan)
                    .addComponent(btn_VietFileVanBan))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NhapChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhapChuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhapChuoiActionPerformed

    private void txt_NoiDungFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NoiDungFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NoiDungFileActionPerformed

    private void btn_VietFileNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VietFileNhiPhanActionPerformed
        byte a[] = new byte[20];
        File file;
        int i;
        char s[] = txt_NhapChuoi.getText().toCharArray();
        //chuyển đổi chuỗi thành nhị phân
        for(i = 0; i < s.length; i++) {
            a[i] = (byte)s[i];
        }
        
        try {
            file = new File(txt_FileName.getText());
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(a);
            fo.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_VietFileNhiPhanActionPerformed

    private void btn_DocFileNhiPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocFileNhiPhanActionPerformed
        byte a[];
        File file;
        try {
            file = new File(txt_FileName.getText());
            FileInputStream fi = new FileInputStream(file);
            a = new byte[fi.available()];
            fi.read(a);
            fi.close();
            // Xuất kết quả ra màn hình
            txt_NoiDungFile.setText(new String(a));
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_DocFileNhiPhanActionPerformed

    private void btn_VietFileVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VietFileVanBanActionPerformed
        try {
            FileWriter fw = new FileWriter(new File(txt_FileName.getText()));
            fw.write(txt_NhapChuoi.getText());
            fw.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_VietFileVanBanActionPerformed

    private void btn_DocFileVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocFileVanBanActionPerformed
        try {
            FileReader fr = new FileReader(new File(txt_FileName.getText()));
            StringBuffer sb = new StringBuffer();
            char ca[] = new char[5]; //đọc mỗi lần 5 ký tự
            while (fr.ready()) {
                int len = fr.read(ca);
                sb.append(ca, 0 , len);
            }
            fr.close();
            txt_NoiDungFile.setText(sb + "");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_DocFileVanBanActionPerformed

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
            java.util.logging.Logger.getLogger(TypeFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypeFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypeFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypeFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypeFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DocFileNhiPhan;
    private javax.swing.JButton btn_DocFileVanBan;
    private javax.swing.JButton btn_VietFileNhiPhan;
    private javax.swing.JButton btn_VietFileVanBan;
    private javax.swing.JLabel lbl_FileName;
    private javax.swing.JLabel lbl_NhapChuoi;
    private javax.swing.JLabel lbl_NoiDungFile;
    private javax.swing.JTextField txt_FileName;
    private javax.swing.JTextField txt_NhapChuoi;
    private javax.swing.JTextField txt_NoiDungFile;
    // End of variables declaration//GEN-END:variables
}
