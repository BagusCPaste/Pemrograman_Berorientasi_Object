/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gusaja.praktikum_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muhba
 */

public class KoneksiMysql {

    private String host;
    private String username;
    private String password;
    private String database;

    public KoneksiMysql(String host, String username, String password, String database) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.database = database;
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://3306" + host + "/" + database;
        return DriverManager.getConnection(url, username, password);
    }

}

