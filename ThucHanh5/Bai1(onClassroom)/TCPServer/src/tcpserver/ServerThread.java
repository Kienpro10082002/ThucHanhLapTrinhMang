/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpserver;

import java.io.*;
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
            while (true) {                
                String chuoi = in.nextLine().trim();
                Scanner sc = new Scanner(chuoi);
                sc.useDelimiter("@");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float c = sc.nextFloat();
                if(a == 0) {
                    if(b == 0) {
                        out.println("Phương trình vô nghiệm");
                    } else {
                        out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
                    }
                }
                float delta = b*b - 4*a*c;
                float x1;
                float x2;
                if (delta > 0) {
                    x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                    x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                    out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
                } else if (delta == 0) {
                    x1 = (-b / (2 * a));
                    out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
                } else {
                    out.println("Phương trình vô nghiệm!");
                }
            }
        } catch (Exception ex) {
            System.out.println("");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }
}