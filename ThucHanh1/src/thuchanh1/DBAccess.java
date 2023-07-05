/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DBAccess {
    private Connection con;
    private Statement stmt;

    public DBAccess() {
        try {
            MyConnection mycon = new MyConnection();
            con = mycon.getConnection();
            stmt = con.createStatement();
        } catch(Exception ex) {
            
        }
    }
    
    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch(Exception ex) {
            return -1;
        }
    }
    
    public ResultSet Query(String srt) {
        try {
            ResultSet rs = stmt.executeQuery(srt);
            return rs;
        } catch(Exception ex) {
            return null;
        }
    }
    
}
