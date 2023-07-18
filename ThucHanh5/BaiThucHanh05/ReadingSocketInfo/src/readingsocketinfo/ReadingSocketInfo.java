/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readingsocketinfo;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class ReadingSocketInfo {
    public static void main(String[] args) {
        try {
            // Đọc thông tin Socket máy cục bộ
            InetAddress localHost = InetAddress.getLocalHost();
            int localPort = getLocalPort();

            System.out.println("Socket's information of the local machine: ");
            System.out.println("IP: " + localHost.getHostAddress());
            System.out.println("Port: " + localPort);

            // Đọc thông tin Socket máy từ xa trên cổng 80
            InetAddress remoteHost = InetAddress.getByName("example.com");
            int remotePort = 80;

            System.out.println("Socket's information of the remote machine on port 80: ");
            System.out.println("IP: " + remoteHost.getHostAddress());
            System.out.println("Port: " + remotePort);
        } catch (UnknownHostException e) {
            System.out.println("The remote machine address could not be determined.");
        }
    }

    private static int getLocalPort() {
        try (Socket s = new Socket()) {
            // Tạo socket và kết nối tới localhost để lấy thông tin máy cục bộ
            s.bind(null);
            return s.getLocalPort();
        } catch (IOException e) {
            System.out.println("Unable to connect to localhost.");
        }
        return -1;
    }
}
