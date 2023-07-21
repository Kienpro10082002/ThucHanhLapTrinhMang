/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package udpclient;

import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frmClient extends javax.swing.JFrame {

    /**
     * Creates new form frmClient
     */
    public frmClient() {
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

        lblDomain = new javax.swing.JLabel();
        txtDomain = new javax.swing.JTextField();
        lblKetQua = new javax.swing.JLabel();
        txtKetQua = new javax.swing.JTextField();
        btnTruyenChuoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblChuoi = new javax.swing.JLabel();
        txtChuoi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bài thực hành số 1");

        lblDomain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDomain.setText("Nhập địa chỉ");

        txtDomain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblKetQua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKetQua.setText("Nhập chuỗi");

        txtKetQua.setEditable(false);
        txtKetQua.setBackground(java.awt.SystemColor.activeCaption);
        txtKetQua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnTruyenChuoi.setBackground(java.awt.SystemColor.activeCaption);
        btnTruyenChuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTruyenChuoi.setText("Truyền chuỗi");
        btnTruyenChuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruyenChuoiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(java.awt.SystemColor.activeCaption);
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblChuoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblChuoi.setText("Nhập chuỗi");

        txtChuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnTruyenChuoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomain)
                    .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChuoi)
                    .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKetQua)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTruyenChuoi)
                    .addComponent(btnThoat))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Lưu ý là Domain không nên truyền bất kì tên domain nào.
    private void btnTruyenChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruyenChuoiActionPerformed
        byte sendData[];
        DatagramSocket socket;
        try {
            socket = new DatagramSocket();
            String domain = this.txtDomain.getText();
            InetAddress ipServer = InetAddress.getByName(domain); // lưu địa chỉ máy server
            int port = 1234; // sử dụng PORT 1234 để giao tiếp với server
            String stSend = this.txtChuoi.getText();// lấy dữ liệu cần truyền đi
            sendData = stSend.getBytes(); // chuyển dữ liệu thành dạng byte rồi truyền đi
            // DatagramPacket dùng để lưu trữ dữ liệu
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipServer, port);
            socket.send(sendPacket);
            // Nhận chuỗi kết quả từ server
            byte buffer[] = new byte[65507]; // độ lớn tối đa của tập tin 65535 - (7 byte header của UDP)
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(receivePacket); // nhận chuỗi kết quả
            txtKetQua.setText(new String(receivePacket.getData()).trim()); // lấy dữ liệu hiện lên màn hình
            socket.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnTruyenChuoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(frmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTruyenChuoi;
    private javax.swing.JLabel lblChuoi;
    private javax.swing.JLabel lblDomain;
    private javax.swing.JLabel lblKetQua;
    private javax.swing.JTextField txtChuoi;
    private javax.swing.JTextField txtDomain;
    private javax.swing.JTextField txtKetQua;
    // End of variables declaration//GEN-END:variables
}
