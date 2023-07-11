/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thuchanh3;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frm_InetAddress extends javax.swing.JFrame {

    /**
     * Creates new form BaiThucHanh1
     */
    public frm_InetAddress() {
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

        dialog_baiTap1 = new javax.swing.JDialog();
        lbl_baiTap1_IP = new javax.swing.JLabel();
        txt_baiTap1_IP = new javax.swing.JTextField();
        btn_baiTap1_checkIP = new javax.swing.JButton();
        btn_baiTap1_exit = new javax.swing.JButton();
        dialog_baiTap2 = new javax.swing.JDialog();
        lbl_baiTap2_tenMien = new javax.swing.JLabel();
        txt_baiTap2_tenMien = new javax.swing.JTextField();
        btn_baiTap2_findIP = new javax.swing.JButton();
        scrollPane__baiTap2_listIP = new javax.swing.JScrollPane();
        list_baiTap2_IP = new javax.swing.JList<>();
        btn_baiTap2_exit = new javax.swing.JButton();
        dialog_baiTap3 = new javax.swing.JDialog();
        lbl__baiTap3_IP = new javax.swing.JLabel();
        lbl_baiTap3_tenMien = new javax.swing.JLabel();
        btn_baiTap3_exit = new javax.swing.JButton();
        btn_baiTap3_findDomain = new javax.swing.JButton();
        txt_baiTap3_IP = new javax.swing.JTextField();
        txt_baiTap3_tenMien = new javax.swing.JTextField();
        dialog_baiTap4 = new javax.swing.JDialog();
        lbl_baiTap4_IP = new javax.swing.JLabel();
        txt_baiTap4_IP = new javax.swing.JTextField();
        btn_baiTap4_findIP = new javax.swing.JButton();
        btn_baiTap4_exit = new javax.swing.JButton();
        jMenuBar_InetAddress = new javax.swing.JMenuBar();
        jMenu_system = new javax.swing.JMenu();
        jMenu_functions = new javax.swing.JMenu();
        jMenuItem_checkIP = new javax.swing.JMenuItem();
        jMenuItem_findDomainByIP = new javax.swing.JMenuItem();
        jMenuItem_findIPbyDomain = new javax.swing.JMenuItem();
        jMenuItem_findLocalIP = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        dialog_baiTap1.setTitle("Chương trình kiểm tra IP");
        dialog_baiTap1.setSize(new java.awt.Dimension(708, 160));

        lbl_baiTap1_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_baiTap1_IP.setText("Nhập địa chỉ IP cần kiểm tra");

        txt_baiTap1_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_baiTap1_checkIP.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap1_checkIP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap1_checkIP.setText("Kiểm tra");
        btn_baiTap1_checkIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap1_checkIPActionPerformed(evt);
            }
        });

        btn_baiTap1_exit.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap1_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap1_exit.setText("Thoát");
        btn_baiTap1_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap1_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialog_baiTap1Layout = new javax.swing.GroupLayout(dialog_baiTap1.getContentPane());
        dialog_baiTap1.getContentPane().setLayout(dialog_baiTap1Layout);
        dialog_baiTap1Layout.setHorizontalGroup(
            dialog_baiTap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_baiTap1_IP)
                .addGap(18, 18, 18)
                .addComponent(txt_baiTap1_IP)
                .addContainerGap())
            .addGroup(dialog_baiTap1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btn_baiTap1_checkIP)
                .addGap(182, 182, 182)
                .addComponent(btn_baiTap1_exit)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        dialog_baiTap1Layout.setVerticalGroup(
            dialog_baiTap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dialog_baiTap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_baiTap1_IP)
                    .addComponent(txt_baiTap1_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialog_baiTap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_baiTap1_checkIP)
                    .addComponent(btn_baiTap1_exit))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        dialog_baiTap2.setTitle("Chương trình tìm IP của tên miền");
        dialog_baiTap2.setSize(new java.awt.Dimension(708, 400));

        lbl_baiTap2_tenMien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_baiTap2_tenMien.setText("Nhập tên miền");

        txt_baiTap2_tenMien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_baiTap2_findIP.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap2_findIP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap2_findIP.setText("Tìm IP");
        btn_baiTap2_findIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap2_findIPActionPerformed(evt);
            }
        });

        list_baiTap2_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scrollPane__baiTap2_listIP.setViewportView(list_baiTap2_IP);

        btn_baiTap2_exit.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap2_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap2_exit.setText("Thoát");
        btn_baiTap2_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap2_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialog_baiTap2Layout = new javax.swing.GroupLayout(dialog_baiTap2.getContentPane());
        dialog_baiTap2.getContentPane().setLayout(dialog_baiTap2Layout);
        dialog_baiTap2Layout.setHorizontalGroup(
            dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_baiTap2_findIP)
                    .addComponent(lbl_baiTap2_tenMien, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane__baiTap2_listIP, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(txt_baiTap2_tenMien))
                .addGap(18, 18, 18)
                .addComponent(btn_baiTap2_exit)
                .addGap(84, 84, 84))
        );
        dialog_baiTap2Layout.setVerticalGroup(
            dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_baiTap2_exit)
                    .addGroup(dialog_baiTap2Layout.createSequentialGroup()
                        .addGroup(dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_baiTap2_tenMien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_baiTap2_tenMien))
                        .addGap(86, 86, 86)
                        .addGroup(dialog_baiTap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_baiTap2_findIP)
                            .addComponent(scrollPane__baiTap2_listIP, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        dialog_baiTap3.setTitle("Chương trình tìm tên miền");
        dialog_baiTap3.setSize(new java.awt.Dimension(597, 320));

        lbl__baiTap3_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl__baiTap3_IP.setText("Nhập IP");

        lbl_baiTap3_tenMien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_baiTap3_tenMien.setText("Tên miền");

        btn_baiTap3_exit.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap3_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap3_exit.setText("Thoát");
        btn_baiTap3_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap3_exitActionPerformed(evt);
            }
        });

        btn_baiTap3_findDomain.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap3_findDomain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap3_findDomain.setText("Tìm tên miền");
        btn_baiTap3_findDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap3_findDomainActionPerformed(evt);
            }
        });

        txt_baiTap3_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_baiTap3_tenMien.setEditable(false);
        txt_baiTap3_tenMien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout dialog_baiTap3Layout = new javax.swing.GroupLayout(dialog_baiTap3.getContentPane());
        dialog_baiTap3.getContentPane().setLayout(dialog_baiTap3Layout);
        dialog_baiTap3Layout.setHorizontalGroup(
            dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap3Layout.createSequentialGroup()
                .addGroup(dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_baiTap3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialog_baiTap3Layout.createSequentialGroup()
                                .addComponent(btn_baiTap3_findDomain)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dialog_baiTap3Layout.createSequentialGroup()
                                .addComponent(lbl__baiTap3_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txt_baiTap3_IP))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_baiTap3Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_baiTap3Layout.createSequentialGroup()
                                .addComponent(btn_baiTap3_exit)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_baiTap3Layout.createSequentialGroup()
                                .addComponent(lbl_baiTap3_tenMien, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_baiTap3_tenMien, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        dialog_baiTap3Layout.setVerticalGroup(
            dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl__baiTap3_IP)
                    .addComponent(txt_baiTap3_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_baiTap3_findDomain)
                .addGap(41, 41, 41)
                .addGroup(dialog_baiTap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_baiTap3_tenMien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_baiTap3_tenMien))
                .addGap(51, 51, 51)
                .addComponent(btn_baiTap3_exit)
                .addGap(28, 28, 28))
        );

        dialog_baiTap4.setTitle("Chương trình tìm IP của máy cục bộ");
        dialog_baiTap4.setSize(new java.awt.Dimension(540, 150));

        lbl_baiTap4_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_baiTap4_IP.setText("IP của máy cục bộ");

        txt_baiTap4_IP.setEditable(false);
        txt_baiTap4_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_baiTap4_findIP.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap4_findIP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap4_findIP.setText("Tìm IP");
        btn_baiTap4_findIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap4_findIPActionPerformed(evt);
            }
        });

        btn_baiTap4_exit.setBackground(java.awt.SystemColor.activeCaption);
        btn_baiTap4_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_baiTap4_exit.setText("Thoát");
        btn_baiTap4_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baiTap4_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialog_baiTap4Layout = new javax.swing.GroupLayout(dialog_baiTap4.getContentPane());
        dialog_baiTap4.getContentPane().setLayout(dialog_baiTap4Layout);
        dialog_baiTap4Layout.setHorizontalGroup(
            dialog_baiTap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_baiTap4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbl_baiTap4_IP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_baiTap4_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(dialog_baiTap4Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btn_baiTap4_findIP)
                .addGap(64, 64, 64)
                .addComponent(btn_baiTap4_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialog_baiTap4Layout.setVerticalGroup(
            dialog_baiTap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_baiTap4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(dialog_baiTap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_baiTap4_IP)
                    .addComponent(txt_baiTap4_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(dialog_baiTap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_baiTap4_findIP)
                    .addComponent(btn_baiTap4_exit))
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thực hành lập trình mạng");
        setBackground(java.awt.SystemColor.controlLtHighlight);

        jMenuBar_InetAddress.setBackground(java.awt.SystemColor.control);
        jMenuBar_InetAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jMenuBar_InetAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu_system.setText("Hệ Thống");
        jMenuBar_InetAddress.add(jMenu_system);

        jMenu_functions.setText("Chức Năng");

        jMenuItem_checkIP.setText("kiểm tra IP");
        jMenuItem_checkIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_checkIPActionPerformed(evt);
            }
        });
        jMenu_functions.add(jMenuItem_checkIP);

        jMenuItem_findDomainByIP.setText("Tìm IP của tên miền");
        jMenuItem_findDomainByIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_findDomainByIPActionPerformed(evt);
            }
        });
        jMenu_functions.add(jMenuItem_findDomainByIP);

        jMenuItem_findIPbyDomain.setText("Tìm tên miền của IP");
        jMenuItem_findIPbyDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_findIPbyDomainActionPerformed(evt);
            }
        });
        jMenu_functions.add(jMenuItem_findIPbyDomain);

        jMenuItem_findLocalIP.setText("Tìm IP của máy cục bộ");
        jMenuItem_findLocalIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_findLocalIPActionPerformed(evt);
            }
        });
        jMenu_functions.add(jMenuItem_findLocalIP);

        jMenuItem5.setText("Kiểm tra IP");
        jMenu_functions.add(jMenuItem5);

        jMenuItem6.setText("Kiểm tra 2 tên miền");
        jMenu_functions.add(jMenuItem6);

        jMenuBar_InetAddress.add(jMenu_functions);

        setJMenuBar(jMenuBar_InetAddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_checkIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_checkIPActionPerformed
        //Hiển thị Dialog
        dialog_baiTap1.setVisible(true);
        jMenuBar_InetAddress.setEnabled(false);
        dialog_baiTap1.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        dialog_baiTap1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar_InetAddress.setEnabled(true);
                dialog_baiTap1.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_checkIPActionPerformed

    //Sự kiện kiểm tra IP
    private void btn_baiTap1_checkIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap1_checkIPActionPerformed
        String IP = txt_baiTap1_IP.getText();
        try {
            InetAddress host = Inet4Address.getByName(IP);
            if (host != null) {
                if (IP.contains(".")) {
                    JOptionPane.showMessageDialog(null, "Đây là IPV4");
                } else {
                    JOptionPane.showMessageDialog(null, "Đây là IPV6");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Địa chỉ IP của bạn nhập sai!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Địa chỉ IP của bạn nhập sai!!!:\n" + ex.toString());
        }
    }//GEN-LAST:event_btn_baiTap1_checkIPActionPerformed

    private void btn_baiTap1_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap1_exitActionPerformed
        dialog_baiTap1.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_baiTap1_exitActionPerformed

    private void jMenuItem_findDomainByIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_findDomainByIPActionPerformed
        //Hiển thị Dialog
        dialog_baiTap2.setVisible(true);
        jMenuBar_InetAddress.setEnabled(false);
        dialog_baiTap2.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        dialog_baiTap2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar_InetAddress.setEnabled(true);
                dialog_baiTap2.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_findDomainByIPActionPerformed

    //Sự kiện tìm IP của tên miền
    private void btn_baiTap2_findIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap2_findIPActionPerformed
        try {
            int i, j;
            // Lấy tất cả các IP của địa chỉ
            InetAddress addr[] = InetAddress.getAllByName(txt_baiTap2_tenMien.getText());
            DefaultListModel dm = new DefaultListModel();
            for (i = 0; i < addr.length; i++) {
                byte[] ipAddr = addr[i].getAddress();
                String ipAddrStr = "";
                for (j = 0; j < ipAddr.length; j++) {
                    if (j > 0) {
                        ipAddrStr += ".";
                    }
                    ipAddrStr += ipAddr[j] & 0xFF;
                }
                dm.addElement(ipAddrStr);
            }
            list_baiTap2_IP.setModel(dm);
        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Địa chỉ của bạn nhập sai!!!");
        }
    }//GEN-LAST:event_btn_baiTap2_findIPActionPerformed

    private void btn_baiTap2_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap2_exitActionPerformed
        dialog_baiTap2.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_baiTap2_exitActionPerformed

    // Xử lý sự kiện tìm tên miền
    private void btn_baiTap3_findDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap3_findDomainActionPerformed
        try {
            InetAddress addr = InetAddress.getByName(txt_baiTap3_IP.getText());
            String hostName = addr.getHostName();
            txt_baiTap3_tenMien.setText(hostName);
        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Bạn nhập sai tên miền rồi!!!");
        }
    }//GEN-LAST:event_btn_baiTap3_findDomainActionPerformed


    private void jMenuItem_findIPbyDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_findIPbyDomainActionPerformed
        //Hiển thị Dialog
        dialog_baiTap3.setVisible(true);
        jMenuBar_InetAddress.setEnabled(false);
        dialog_baiTap3.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        dialog_baiTap3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar_InetAddress.setEnabled(true);
                dialog_baiTap3.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_findIPbyDomainActionPerformed

    private void btn_baiTap3_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap3_exitActionPerformed
        dialog_baiTap3.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_baiTap3_exitActionPerformed

    private void btn_baiTap4_findIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap4_findIPActionPerformed
        try {
            InetAddress addr = InetAddress.getLocalHost();
            byte[] ipAddr = addr.getAddress();
            String ipAddStr = "";
            for(int j = 0; j < ipAddr.length; j++) {
                if(j > 0)
                    ipAddStr += ".";
                ipAddStr += ipAddr[j]&0xFF;
            }
            txt_baiTap4_IP.setText(ipAddStr);
        } catch(UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi!!!");
        }
    }//GEN-LAST:event_btn_baiTap4_findIPActionPerformed

    private void jMenuItem_findLocalIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_findLocalIPActionPerformed
        //Hiển thị Dialog
        dialog_baiTap4.setVisible(true);
        jMenuBar_InetAddress.setEnabled(false);
        dialog_baiTap4.setLocationRelativeTo(this);
        //Không hiển thị Dialog
        dialog_baiTap4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hiển thị trang chính khi Dialog đóng
                jMenuBar_InetAddress.setEnabled(true);
                dialog_baiTap4.setVisible(false);
            }
        });
    }//GEN-LAST:event_jMenuItem_findLocalIPActionPerformed

    private void btn_baiTap4_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baiTap4_exitActionPerformed
        dialog_baiTap4.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_baiTap4_exitActionPerformed

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
            java.util.logging.Logger.getLogger(frm_InetAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_InetAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_InetAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_InetAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_InetAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baiTap1_checkIP;
    private javax.swing.JButton btn_baiTap1_exit;
    private javax.swing.JButton btn_baiTap2_exit;
    private javax.swing.JButton btn_baiTap2_findIP;
    private javax.swing.JButton btn_baiTap3_exit;
    private javax.swing.JButton btn_baiTap3_findDomain;
    private javax.swing.JButton btn_baiTap4_exit;
    private javax.swing.JButton btn_baiTap4_findIP;
    private javax.swing.JDialog dialog_baiTap1;
    private javax.swing.JDialog dialog_baiTap2;
    private javax.swing.JDialog dialog_baiTap3;
    private javax.swing.JDialog dialog_baiTap4;
    private javax.swing.JMenuBar jMenuBar_InetAddress;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_checkIP;
    private javax.swing.JMenuItem jMenuItem_findDomainByIP;
    private javax.swing.JMenuItem jMenuItem_findIPbyDomain;
    private javax.swing.JMenuItem jMenuItem_findLocalIP;
    private javax.swing.JMenu jMenu_functions;
    private javax.swing.JMenu jMenu_system;
    private javax.swing.JLabel lbl__baiTap3_IP;
    private javax.swing.JLabel lbl_baiTap1_IP;
    private javax.swing.JLabel lbl_baiTap2_tenMien;
    private javax.swing.JLabel lbl_baiTap3_tenMien;
    private javax.swing.JLabel lbl_baiTap4_IP;
    private javax.swing.JList<String> list_baiTap2_IP;
    private javax.swing.JScrollPane scrollPane__baiTap2_listIP;
    private javax.swing.JTextField txt_baiTap1_IP;
    private javax.swing.JTextField txt_baiTap2_tenMien;
    private javax.swing.JTextField txt_baiTap3_IP;
    private javax.swing.JTextField txt_baiTap3_tenMien;
    private javax.swing.JTextField txt_baiTap4_IP;
    // End of variables declaration//GEN-END:variables
}
