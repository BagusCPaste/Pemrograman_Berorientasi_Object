/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gusaja.praktikum_14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muhba
 */

public class DatabaseBackupUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/penjualan";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    private static final String BACKUP_PATH = "C:\\backup\\backup.sql";

    public static void main(String[] args) {
        createBackup();
    }

    public static void createBackup() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String dumpCommand = String.format("mysqldump --host=%s --port=%d --user=%s --password=%s --add-drop-database -B %s -r %s",
                    "localhost", 3306, DB_USERNAME, DB_PASSWORD, connection.getCatalog(), BACKUP_PATH);

            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("cmd.exe", "/c", dumpCommand);

            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Backup created successfully.");
            } else {
                System.out.println("Error creating backup.");
            }
        } catch (IOException | InterruptedException | SQLException e) {
            e.printStackTrace();
        }
    }
}

