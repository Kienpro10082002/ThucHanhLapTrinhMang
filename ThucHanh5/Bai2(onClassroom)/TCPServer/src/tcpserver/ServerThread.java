/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpserver;

import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServerThread implements Runnable{
    private Socket socket;
    private String name;
    private PrintWriter out = null;  // viết hoặc đẩy đi
    private Scanner in = null;      // đọc hoặc nhận vào
    
    public ServerThread(Socket socket, String name) throws IOException{
        this.socket = socket;
        this.name = name;
        this.in = new Scanner(this.socket.getInputStream());
        this.out = new PrintWriter(this.socket.getOutputStream(), true);
        new Thread(this).start(); //thừa kết từ interface Runnable
    }
    
    public void run() {
        try {
            String chuoi = in.nextLine().trim();

            if (isStringInteger(chuoi)) {
                int soNguyen = Integer.parseInt(chuoi);
                chuoi = Integer.toBinaryString(soNguyen);
            } else {
                chuoi = "Have not Integer";
            }
            
            out.println(chuoi);
        } catch(Exception ex) {
            System.out.println(name + "has departed");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }
    
    // Kiểm tra số nguyên
    public boolean isStringInteger(String str) {
        // Kiểm tra xem chuỗi có chứa ký tự không phải là số hay không
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
