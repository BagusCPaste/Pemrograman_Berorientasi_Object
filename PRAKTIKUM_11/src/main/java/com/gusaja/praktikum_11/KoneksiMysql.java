package com.gusaja.praktikum_11;
import java.sql.*;

public class KoneksiMysql{
    String url, usr, pwd, dbn;
public KoneksiMysql (String dbn){
    this.url = "jdbc:mysql://localhost/" + dbn;
    this.usr = "root";
    this.pwd = "";
    }

public Connection getConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(this.url, this.usr, this.pwd);
    }catch(ClassNotFoundException err){
        System.out.println("Error #1 : " + err.getMessage());
        System.exit(0);
    }catch(SQLException err){
        System.out.println("Error #2 : " + err.getMessage());
        System.exit(0);
    }
        return con;
    }
    public static void main(String args[]){
        KoneksiMysql kon = new KoneksiMysql("penjualan");
        Connection c = kon.getConnection();
    }
}