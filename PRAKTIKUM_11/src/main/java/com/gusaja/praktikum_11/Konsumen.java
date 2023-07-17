/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gusaja.praktikum_11;

import java.sql.*;

/**
 *
 * @author muhba
 */
public class Konsumen {
    String url, usr, pwd, dbn;
    public Konsumen(String dbn){
        this.url = "jdbc:mysql://localhost/" + dbn;
        this.usr = "root";
        this.pwd = "";
    }
    public Connection getConnection() throws SQLException {
            Connection con = null;
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.usr,
            this.pwd);
            }catch(ClassNotFoundException e){
                System.out.println ("Error #1 : " + e.getMessage());
                System.exit(0);
            }catch (SQLException e) {
                System.out.println ("Error #2 : " + e.getMessage());
                System.exit(0);
            }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Konsumen con = new Konsumen("konsumen");
        Connection conn = con.getConnection();
    }
    
}
