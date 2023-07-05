/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh1;

//import com.mysql.jdbc.Connection; ----this is the mysql-connector-java-5.1.40.jar
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MyConnection {
    public Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");//newInstance();
            // Kết nối này sử dụng cho xampp (http://localhost:8080/myadminphp)
            //String URL = "jdbc:mysql://localhost/quanlytaikhoan?user=root&password=";
            String URL = "jdbc:mysql://localhost:3306/quanlytaikhoan?user=root&password=123456&useSSL=false";
            Connection con = (Connection) DriverManager.getConnection(URL);
            return con;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Loi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
