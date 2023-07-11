/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thuchanh3_phan2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class IP_Interaction extends javax.swing.JFrame {

    /**
     * Creates new form IP_Interaction
     */
    public IP_Interaction() {
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

        lbl_IP = new javax.swing.JLabel();
        txt_Octect1 = new javax.swing.JTextField();
        btn_Calculate = new javax.swing.JButton();
        lbl_baiTap1_IP1 = new javax.swing.JLabel();
        lbl_binaryIPAddress = new javax.swing.JLabel();
        txt_binaryIPAddress = new javax.swing.JTextField();
        lbl_maskAddress = new javax.swing.JLabel();
        txt_maskAddress = new javax.swing.JTextField();
        lbl_networkAddress = new javax.swing.JLabel();
        txt_networkAddress = new javax.swing.JTextField();
        lbl_binaryMaskAddress = new javax.swing.JLabel();
        txt_binaryMaskAddress = new javax.swing.JTextField();
        lbl_broadcastAddress = new javax.swing.JLabel();
        txt_broadcastAddress = new javax.swing.JTextField();
        lbl_binaryNetworkAddress = new javax.swing.JLabel();
        txt_binaryNetworkAddress = new javax.swing.JTextField();
        txt_binaryBroadcastAddress = new javax.swing.JTextField();
        lbl_binaryBroadcastAddress = new javax.swing.JLabel();
        txt_Octect2 = new javax.swing.JTextField();
        txt_Octect3 = new javax.swing.JTextField();
        txt_SubnetMask = new javax.swing.JTextField();
        txt_Octect4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thao tác với IP");
        setSize(new java.awt.Dimension(673, 400));

        lbl_IP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_IP.setText("IP");

        txt_Octect1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Octect1.setText("192");

        btn_Calculate.setBackground(java.awt.SystemColor.activeCaption);
        btn_Calculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Calculate.setText("Tính");
        btn_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateActionPerformed(evt);
            }
        });

        lbl_baiTap1_IP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_baiTap1_IP1.setText("/");

        lbl_binaryIPAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_binaryIPAddress.setText("Địa chỉ IP nhị phân");

        txt_binaryIPAddress.setEditable(false);
        txt_binaryIPAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_binaryIPAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_maskAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_maskAddress.setText("Địa chỉ Mask");

        txt_maskAddress.setEditable(false);
        txt_maskAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_maskAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_networkAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_networkAddress.setText("Địa chỉ Network");

        txt_networkAddress.setEditable(false);
        txt_networkAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_networkAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_binaryMaskAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_binaryMaskAddress.setText("Mask nhị phân");

        txt_binaryMaskAddress.setEditable(false);
        txt_binaryMaskAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_binaryMaskAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_broadcastAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_broadcastAddress.setText("Địa chỉ Broadcast");

        txt_broadcastAddress.setEditable(false);
        txt_broadcastAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_broadcastAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_binaryNetworkAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_binaryNetworkAddress.setText("Network nhị phân");

        txt_binaryNetworkAddress.setEditable(false);
        txt_binaryNetworkAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_binaryNetworkAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_binaryBroadcastAddress.setEditable(false);
        txt_binaryBroadcastAddress.setBackground(java.awt.SystemColor.activeCaption);
        txt_binaryBroadcastAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_binaryBroadcastAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_binaryBroadcastAddress.setText("Broadcast nhị phân");

        txt_Octect2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Octect2.setText("168");

        txt_Octect3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Octect3.setText("1");

        txt_SubnetMask.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_SubnetMask.setText("24");

        txt_Octect4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Octect4.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_binaryIPAddress)
                            .addComponent(lbl_maskAddress)
                            .addComponent(lbl_binaryMaskAddress)
                            .addComponent(lbl_networkAddress)
                            .addComponent(lbl_binaryNetworkAddress)
                            .addComponent(lbl_broadcastAddress)
                            .addComponent(lbl_binaryBroadcastAddress))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_binaryBroadcastAddress)
                            .addComponent(txt_broadcastAddress)
                            .addComponent(txt_binaryNetworkAddress)
                            .addComponent(txt_networkAddress)
                            .addComponent(txt_binaryMaskAddress)
                            .addComponent(txt_maskAddress)
                            .addComponent(txt_binaryIPAddress)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lbl_IP)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Octect1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Octect2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Octect3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Octect4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_baiTap1_IP1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_SubnetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Calculate)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_IP)
                    .addComponent(txt_Octect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_baiTap1_IP1)
                    .addComponent(btn_Calculate)
                    .addComponent(txt_Octect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Octect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SubnetMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Octect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_binaryIPAddress)
                    .addComponent(txt_binaryIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maskAddress)
                    .addComponent(txt_maskAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_binaryMaskAddress)
                    .addComponent(txt_binaryMaskAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_networkAddress)
                    .addComponent(txt_networkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_binaryNetworkAddress)
                    .addComponent(txt_binaryNetworkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_broadcastAddress)
                    .addComponent(txt_broadcastAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_binaryBroadcastAddress)
                    .addComponent(txt_binaryBroadcastAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Hàm lấy địa chỉ IP
     public static String getNetworkAddress(String binaryIP, int prefixLength) {
        StringBuilder network = new StringBuilder();

        for (int i = 0; i < binaryIP.length(); i++) {
            if (i < prefixLength) {
                network.append(binaryIP.charAt(i));
            } else {
                network.append('0');
            }
        }

        return network.toString();
    }
    
     // Hàm tính địa chỉ IP
    public static String calculateNetworkAddress(String ipAddress, String subnetMask) {
        try {
            InetAddress ip = InetAddress.getByName(ipAddress);
            InetAddress subnet = InetAddress.getByName(subnetMask);

            byte[] ipBytes = ip.getAddress();
            byte[] subnetBytes = subnet.getAddress();

            byte[] networkBytes = new byte[ipBytes.length];

            for (int i = 0; i < ipBytes.length; i++) {
                networkBytes[i] = (byte) (ipBytes[i] & subnetBytes[i]);
            }

            InetAddress networkAddress = InetAddress.getByAddress(networkBytes);
            String networkAddressStr = networkAddress.getHostAddress();

         return networkAddressStr;

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
         return "0";
    }

    // Hàm chuyển đổi nhị phân
    public static String convertIPToBinary(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        StringBuilder binaryIP = new StringBuilder();

        for (String octet : octets) {
            int value = Integer.parseInt(octet);
            String binaryOctet = String.format("%8s", Integer.toBinaryString(value)).replace(' ', '0');
            binaryIP.append(binaryOctet);
        }

        return binaryIP.toString();
    }

    // Hàm thêm dấu chấm vào chuỗi nhị phân để xuất ra màn hình
    public static String addDotsToBinaryIP(String binaryIP) {
        StringBuilder dottedBinaryIP = new StringBuilder();

        for (int i = 0; i < binaryIP.length(); i++) {
            dottedBinaryIP.append(binaryIP.charAt(i));

            if ((i + 1) % 8 == 0 && i != binaryIP.length() - 1) {
                dottedBinaryIP.append('.');
            }
        }

        return dottedBinaryIP.toString();
    }

    // Hàm tính địa chỉ subnetMask
    public static String calculateSubnetMask(int prefixLength) {
        StringBuilder subnetMask = new StringBuilder();

        int fullOctets = prefixLength / 8;
        int remainingBits = prefixLength % 8;

        for (int i = 0; i < fullOctets; i++) {
            subnetMask.append("255");

            if (i < 3) {
                subnetMask.append(".");
            }
        }

        if (remainingBits > 0) {
            int value = 256 - (int) Math.pow(2, 8 - remainingBits);
            subnetMask.append(value);

            if (fullOctets < 3) {
                subnetMask.append(".");
            }
        } else {
            subnetMask.append("0");
        }

        return subnetMask.toString();
    }

    // Hàm tính địa chỉ Broadcast
    public static String calculateBroadcastAddress(String ipAddress, String subnetMask) {
        String[] ipOctets = ipAddress.split("\\.");
        String[] subnetOctets = subnetMask.split("\\.");
        StringBuilder broadcastAddress = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int ipOctet = Integer.parseInt(ipOctets[i]);
            int subnetOctet = Integer.parseInt(subnetOctets[i]);

            int broadcastOctet = ipOctet | (255 - subnetOctet);
            broadcastAddress.append(broadcastOctet);

            if (i < 3) {
                broadcastAddress.append(".");
            }
        }

        return broadcastAddress.toString();
    }

    private void btn_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateActionPerformed
        String str = txt_Octect1.getText() + "." + txt_Octect2.getText() + "." + txt_Octect3.getText() + "." + txt_Octect4.getText();
        int prefixLength = Integer.parseInt(txt_SubnetMask.getText());

        // Lấy địa chỉ IP nhị phân
        String binaryIPAddress = convertIPToBinary(str);
        txt_binaryIPAddress.setText(addDotsToBinaryIP(binaryIPAddress));
    
        // Lấy địa chỉ mask
        String maskAddress = calculateSubnetMask(prefixLength);
        txt_maskAddress.setText(maskAddress);
        // Lấy địa chỉ mask nhị phân
        String binaryMaskAddress = convertIPToBinary(maskAddress);
        txt_binaryMaskAddress.setText(addDotsToBinaryIP(binaryMaskAddress));

         // Lấy địa chỉ Network
        txt_networkAddress.setText(calculateNetworkAddress(str,maskAddress));
        
        // Lấy địa chỉ network nhị phân
        //String binaryNetworkAddress = getNetworkAddress(str, prefixLength);
        txt_binaryNetworkAddress.setText(addDotsToBinaryIP(binaryIPAddress));
        
        // Lấy địa chỉ broadcast
        String strIP = str;
        String mask = txt_maskAddress.getText();
        if(strIP != null && mask !=null){
         String broadcast = calculateBroadcastAddress(strIP, mask);
         txt_broadcastAddress.setText(broadcast);
        }
       
        // Lấy địa chỉ broadcast nhị phân     
        String binaryBroadcast = convertIPToBinary(txt_broadcastAddress.getText());
        txt_binaryBroadcastAddress.setText(addDotsToBinaryIP(binaryBroadcast));
    }//GEN-LAST:event_btn_CalculateActionPerformed

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
            java.util.logging.Logger.getLogger(IP_Interaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IP_Interaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IP_Interaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IP_Interaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IP_Interaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calculate;
    private javax.swing.JLabel lbl_IP;
    private javax.swing.JLabel lbl_baiTap1_IP1;
    private javax.swing.JLabel lbl_binaryBroadcastAddress;
    private javax.swing.JLabel lbl_binaryIPAddress;
    private javax.swing.JLabel lbl_binaryMaskAddress;
    private javax.swing.JLabel lbl_binaryNetworkAddress;
    private javax.swing.JLabel lbl_broadcastAddress;
    private javax.swing.JLabel lbl_maskAddress;
    private javax.swing.JLabel lbl_networkAddress;
    private javax.swing.JTextField txt_Octect1;
    private javax.swing.JTextField txt_Octect2;
    private javax.swing.JTextField txt_Octect3;
    private javax.swing.JTextField txt_Octect4;
    private javax.swing.JTextField txt_SubnetMask;
    private javax.swing.JTextField txt_binaryBroadcastAddress;
    private javax.swing.JTextField txt_binaryIPAddress;
    private javax.swing.JTextField txt_binaryMaskAddress;
    private javax.swing.JTextField txt_binaryNetworkAddress;
    private javax.swing.JTextField txt_broadcastAddress;
    private javax.swing.JTextField txt_maskAddress;
    private javax.swing.JTextField txt_networkAddress;
    // End of variables declaration//GEN-END:variables
}
