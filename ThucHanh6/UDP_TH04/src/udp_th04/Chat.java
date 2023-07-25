/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package udp_th04;

import java.net.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Chat extends javax.swing.JFrame implements Runnable{
    private InetAddress group; // Địa chỉ nhóm muốn chat
    private int port; // PORT > 1024
    private String nick; // Nick của User
    
    private Thread myThread; //Thread xử lý các gói tin đến
    
    private MulticastSocket socket;
    private DatagramPacket truyen, nhan; //truyền lữu trữ dữ liệu từ máy truyền ra bên ngoài
                                        //nhận lưu trữ dữ liệu từ bên ngoài vào máy
    /**
     * Creates new form Chat
     */
    public Chat() {
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

        lblGroup = new javax.swing.JLabel();
        txtGroup = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        btnDong = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        lblPort = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        btnKetNoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình chat dùng Mutilcast");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGroup.setText("Nhập địa chỉ Multicast");

        txtGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtChat.setColumns(20);
        txtChat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        txtNoiDung.setColumns(20);
        txtNoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNoiDung.setRows(5);
        jScrollPane2.setViewportView(txtNoiDung);

        btnDong.setBackground(java.awt.SystemColor.activeCaption);
        btnDong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnSend.setBackground(java.awt.SystemColor.activeCaption);
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblPort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPort.setText("Port");

        txtPort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblNick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNick.setText("Nick");

        txtNick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnKetNoi.setBackground(java.awt.SystemColor.activeCaption);
        btnKetNoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKetNoi.setText("Kết nối");
        btnKetNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetNoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDong)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGroup)
                        .addGap(18, 18, 18)
                        .addComponent(txtGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPort)
                            .addGap(18, 18, 18)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNick)
                            .addGap(18, 18, 18)
                            .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGroup)
                            .addComponent(txtGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPort)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNick)
                            .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnKetNoi)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDong)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void run() {
        try {
            while (!Thread.interrupted()) { //Kiểm tra xem thread có bị ngắt kết nối chưa                
                nhan.setLength(nhan.getData().length); //thiết lập số byte cho các buffer
                socket.receive(nhan); //nhận dữ liệu
                String message = new String(nhan.getData(), 0, nhan.getLength(), "UTF8");
                txtChat.append(message + "\n"); //Hiển thị dữ liệu nhận được lên màn hình
            }
        } catch(IOException e) { //các thao tác thu gọn bộ nhớ khi có lỗi xảy ra
            if (myThread != null) {
                txtChat.append(e + "\n");
                txtNoiDung.setVisible(false);
                this.validate();
                if(myThread != Thread.currentThread())
                    myThread.interrupt();
                myThread = null;
                try {
                    socket.leaveGroup(group);
                } catch(IOException ignored) {
                    socket.close();
                }
            }
        }
    }
    
    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            byte utf[] = (nick + ": " + txtNoiDung.getText()).getBytes("UTF8"); //Chuyển dữ liệu thành chuỗi byte
            truyen.setData(utf); //Gán dữ liệu cho DatagramPacket
            truyen.setLength(utf.length); //Truyền số lượng byte cho buffer
            socket.send(truyen); //Bắt đầu truyền dữ liệu
            txtNoiDung.setText("");
        } catch(IOException e) {//các xử lý dọn dẹp bộ nhớ khi có lỗi
            if(myThread != null) {
                txtChat.append(e + "\n");
                txtNoiDung.setVisible(false);
                this.validate();
                if(myThread != Thread.currentThread())
                    myThread.interrupt();
                myThread = null;
                try {
                    socket.leaveGroup(group);
                } catch(IOException ignored) {
                    socket.close();
                }
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnKetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetNoiActionPerformed
        if(btnKetNoi.getText().equals("Kết nối")) {
            //Khi nhấn nút kết nối
            btnKetNoi.setText("Ngắt kết nối");  
            //Chuyển nút kết nối thành nút ngắt kết nối
            txtChat.setEnabled(true);
            txtNoiDung.setEnabled(true);
            btnSend.setEnabled(true);
            txtGroup.setEnabled(false);
            txtPort.setEnabled(false);
            txtNick.setEnabled(false);
            try {
                group = InetAddress.getByName(txtGroup.getText());
                if(group.isMulticastAddress()) { //kiểm tra địa chỉ có là Multicast hay không
                    nick = txtNick.getText();
                    port = Integer.parseInt(txtPort.getText());
                    if(myThread == null) { //Tạo ra và thiết lập ban đầu cho các đối tượng mạng
                        socket = new MulticastSocket(port);
                        socket.setTimeToLive(1);
                        //Thiết lập đường dẫn cho các gói tin
                        socket.joinGroup(group);
                        //Đăng ký router là chương trình máy tính đăng ký vào nhóm group
                        truyen = new DatagramPacket(new byte[1], 1, group, port);
                        nhan = new DatagramPacket(new byte[65507], 65507);
                        //Tạo ra thread xử lý dữ liệu truyền đến
                        myThread = new Thread(this);
                        myThread.start();
                        //Bắt đầu nhận dữ liệu - Lúc này hàm run sẽ được gọi để thực thi
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nhập địa chỉ sai rồi!");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            //Sự kiện cho nút ngắt kết nối
            txtChat.setEnabled(false);
            txtNoiDung.setEnabled(false);
            btnSend.setEnabled(false);
            txtGroup.setEnabled(true);
            txtPort.setEnabled(true);
            txtNick.setEnabled(true);
            btnKetNoi.setText("Kết nối");
            //Chuyển nút ngắt kết nối thành nút kết nối
            if(myThread != null) {
                myThread.interrupt(); //dừng nhận dữ liệu
                myThread = null;
                try {
                    socket.leaveGroup(group); //ra khỏi group
                } catch(IOException e) {}
                socket.close();
            }
        }
    }//GEN-LAST:event_btnKetNoiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(myThread != null) { //các hàm dọn dẹp bộ nhớ
                myThread.interrupt();
                myThread = null;
                try {
                    socket.leaveGroup(group);
                } catch(IOException e) {}
                socket.close();
            }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnKetNoi;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblPort;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtGroup;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}