/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ftpservervd;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main {

    // Khai báo các hằng trong giao thức giao tiếp
    public static final int DANGNHAP = 1;
    public static final int KHONGLALENH = 0;
    public static final int DANGNHAPKHONGTHANHCONG = 0;
    public static final int DANGNHAPTHANHCONG = 1;
    public static final int THOAT = 2;
    
    // Hàm đồi chuỗi giao tiếp thành hằng cho dễ xử lý
    public static int laLenh(String cmd) {
        if(cmd.equals(DANGNHAP))
            return DANGNHAP;
        return KHONGLALENH;
    }
    
    // Thiết lập đầu PORT giao tiếp của ứng dụng, FTP có PORT là 20 và 21
    // Ví dụ chọn PORT 10000
    public static final int PORT = 10000;
    
    public static void main(String[] args) {
        // Giả sử có user, pass và path
        // Sinh viên thấy 1 user này bằng cách truy xuất cơ sở dữ liệu
        // Các user đã tạo ra ở bước 1 do chương trình quản lý user
        String userA = "kienpro10082002";
        String passA = "kienpro10082002";
        String path = "C:/";
        ServerSocket s;
        try {
            s = new ServerSocket(PORT);
            while (true) {                
                Socket new_s = s.accept();
                // Nhận lệnh giao tiếp từ Client
                boolean lap = true;
                while (lap) {                    
                    String cmd;
                    Scanner sc = null;
                    cmd = sc.nextLine();
                    // Điều phối sự kiện yêu cầu ở Client
                    switch (laLenh(cmd)) {
                        case DANGNHAP:
                            String user = sc.nextLine();
                            String pass = sc.nextLine();
                            PrintWriter pw;
                            pw = new PrintWriter(new_s.getOutputStream());
                            if(user.equals(userA) && pass.equals(passA)) {
                                pw.println(DANGNHAPTHANHCONG);
                                // Mở thư mục lên gửi về cho Client
                                File dir = new File(path);
                                File dsFile[] = dir.listFiles();
                                if(dsFile == null) {
                                    JOptionPane.showMessageDialog(null, "Đường dẫn không đúng hay không phải thư mục!");
                                } else {
                                    pw.println(dsFile.length);
                                    for(int i = 0; i < dsFile.length; i++) {
                                        pw.println(dsFile[i].getName());
                                    }
                                }
                            } else {
                                // Gọi về không mở được
                                pw.println(DANGNHAPKHONGTHANHCONG);
                                pw.println("Đăng nhập không thành công");
                            }
                            pw.flush();
                            break;
                        case THOAT:
                            lap = false;
                            break;
                    }
                }
                new_s.close();
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
}
