/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

import TugasAkhir.CreatForm;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbsensiPegawai {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/absensibaru", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        Login xx;
        xx = new Login();
        xx.setVisible(true);
    } 
}
