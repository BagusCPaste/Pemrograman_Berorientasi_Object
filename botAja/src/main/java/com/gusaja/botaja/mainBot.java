/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gusaja.botaja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author muhba
 */

public class mainBot extends TelegramLongPollingBot {
    private static final String BOT_TOKEN = "6012795006:AAFcyVZ-p3lDIiGURtOs7Wb7Vcul2dwAMio";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_botaja";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    private String quotePending = null;

    
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        org.telegram.telegrambots.meta.api.objects.User user = update.getMessage().getFrom();
        try(Connection connection = createConnection()){
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            if(messageText.equals("/start")){
                //String pesan1 = messageText;
                sendStartMessage(chatId,"Halloo! Selamat Datang di gusaja Bot");
                String messageText1 = update.getMessage().getText();
            }
            else if(messageText.equals("/daftar")){
                    String sql = "SELECT COUNT(*) FROM users WHERE chat_id = ?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setLong(1, chatId);
                    ResultSet resultSet = statement.executeQuery();

                    // Mendapatkan jumlah baris yang sesuai dengan chatId
                    resultSet.next();
                    int count = resultSet.getInt(1);

                    if (count > 0) {
                        // chatId sudah terdaftar dalam database
                        // Lakukan logika yang sesuai
                        sendStartMessage(chatId,"Maaf, Akun Anda Sudah Terdaftar");
                    }else{
                        String nama = user.getFirstName();
                        registerUser(chatId,nama);
                    }
                    resultSet.close();
                    statement.close();
      
            } else if (messageText.equals("/qoute")) {
                String sql = "SELECT COUNT(*) FROM users WHERE chat_id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setLong(1, chatId);
                ResultSet resultSet = statement.executeQuery();

                // Mendapatkan jumlah baris yang sesuai dengan chatId
                resultSet.next();
                int count = resultSet.getInt(1);

                if (count > 0) {
                    quotePending = update.getMessage().getText();
                    sendStartMessage(chatId, "Silakan kirimLangsung Pesan / Qoute anda disini untuk di kirimkan admin ke semua user ");
                    
                } else {
                    sendStartMessage(chatId, "Maaf, Anda harus /daftar terlebih dahulu");
                }

                resultSet.close();
                statement.close();
            }else if (messageText.equals("/menu")) {
                String sql = "SELECT COUNT(*) FROM users WHERE chat_id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setLong(1, chatId);
                ResultSet resultSet = statement.executeQuery();

                // Mendapatkan jumlah baris yang sesuai dengan chatId
                resultSet.next();
                int count = resultSet.getInt(1);

                if (count > 0) {
                    String sqlCommand = "SELECT keyword, jawaban FROM command";
                    Statement statementCommand = connection.createStatement();
                    ResultSet resultSetCommand = statementCommand.executeQuery(sqlCommand);

                    StringBuilder resultCommand = new StringBuilder();
                    while (resultSetCommand.next()) {
                        String keyword = resultSetCommand.getString("keyword");
                        String jawaban = resultSetCommand.getString("jawaban");
                        resultCommand.append("- ").append(keyword).append(" \t: ").append(jawaban).append("\n");
                    }
                    sendStartMessage(chatId, "** list Menu gusBot Telegram **"
                            + "\n - /start \t: Untuk Mengaktifkan Bot "
                            + "\n - /daftar \t: Untuk Mendaftarkan User Agar Mendapatkan Menu yang banyak "
                            + "\n - /qoute \t: untuk Menambahkan Qoute Anda Inginkan Untuk di Share Keseluruh users Yang dikirimkan oleh admin"
                            + "\n** List Command Tambahan Admin **"
                            + "\n " + resultCommand.toString());

                    resultSetCommand.close();
                    statementCommand.close();
                } else {
                    sendStartMessage(chatId, "Maaf, Anda harus /daftar terlebih dahulu");
                }

                resultSet.close();
                statement.close();
            }else if (messageText.equals("/chatall")) {
                Boolean cek = true;
                String sql = "SELECT COUNT(*) FROM users WHERE chat_id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setLong(1, chatId);
                ResultSet resultSet = statement.executeQuery();

                // Mendapatkan jumlah baris yang sesuai dengan chatId
                resultSet.next();
                int count = resultSet.getInt(1);

                if (count > 0) {
                    sendStartMessage(chatId," Anda Berada pada Mode Chat All user, gunakan /exit untuk krluar dari menu chat ");
                    while(cek){
                        
                        quotePending = update.getMessage().getText();
                        if (quotePending.equals("/exit")) {
                            cek = false;
                        }
                        else if (quotePending != null) {
                            quotePending = null;            
                            sendStartMessage(chatId,user.getFirstName()+" : "+quotePending);
                            savechateToDatabase(chatId, user.getFirstName(), quotePending);
                        }
                    }                                     
                } else {
                    sendStartMessage(chatId, "Maaf, Anda harus /daftar terlebih dahulu");
                }

                resultSet.close();
                statement.close();
            }

            else{
                if (quotePending != null) {
                    saveMessageToDatabase(chatId, user.getFirstName(), messageText, java.time.LocalDate.now());
                    sendStartMessage(chatId, "Terimakasih sudah memberikan Quote: ' " + messageText + " ' Pesan akan disimpan ke database.");
                    quotePending = null;
                } else{
                    String sql = "SELECT COUNT(*) FROM users WHERE chat_id = ?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setLong(1, chatId);
                    ResultSet resultSet = statement.executeQuery();

                    // Mendapatkan jumlah baris yang sesuai dengan chatId
                    resultSet.next();
                    int count = resultSet.getInt(1);

                    if (count > 0) {
                        String sqlcmd = "SELECT keyword, jawaban FROM command WHERE keyword = ?";
                        PreparedStatement statementcmd = connection.prepareStatement(sqlcmd);
                        statementcmd.setString(1, messageText);
                        ResultSet resultSetcmd = statementcmd.executeQuery();

                        if (resultSetcmd.next()) {
                            String comm = resultSetcmd.getString("keyword");
                            String jawab = resultSetcmd.getString("jawaban");
                            if (messageText.equals(comm)) {
                                sendStartMessage(chatId, jawab);
                            } else {
                                sendStartMessage(chatId, "Maaf Perintah tidak valid.");

                            }
                        } else {
                        sendStartMessage(chatId, "Terima Kasih [ " + user.getFirstName() + " ] sudah mendaftar di GusBot. Silahkan gunakan /menu untuk melihat List menu. Selamat bersenang-senang!");

                        }

                        resultSetcmd.close();
                        statementcmd.close();
                    } else {
                        sendStartMessage(chatId, "Maaf, Anda harus /daftar terlebih dahulu");
                    }

                    resultSet.close();
                    statement.close();
                    }
                }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void saveMessageToDatabase(long chatId, String username, String messageText, java.time.LocalDate tanggal) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            try {
                String sql = "INSERT INTO qoute (nama, pesan,tanggal) VALUES ('" + username + "', '" + messageText + "', CURDATE())";
                Statement statement;
                statement = connection.createStatement();
                statement.executeUpdate(sql);
                // Menyimpan pesan berhasil
                System.out.println("Pesan berhasil disimpan di database.");
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Gagal menyimpan pesan
                System.out.println("Gagal menyimpan pesan di database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gagal menyimpan pesan
            System.out.println("Gagal menyimpan pesan di database.");
        }
    }
    private void savechateToDatabase(long chatId, String username, String messageText) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            try {
                String sql = "INSERT INTO chat (nama, pesan) VALUES ('" + username + "', '" + messageText + "')";
                Statement statement;
                statement = connection.createStatement();
                statement.executeUpdate(sql);
                // Menyimpan pesan berhasil
                System.out.println("Pesan berhasil disimpan di database.");
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Gagal menyimpan pesan
                System.out.println("Gagal menyimpan pesan di database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gagal menyimpan pesan
            System.out.println("Gagal menyimpan pesan di database.");
        }
    }

    private Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
    
    private void sendStartMessage(long chatId, String messagee) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(messagee);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    
    private void registerUser(long chatId, String username) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            try{
                String sql = "INSERT INTO users (chat_id, nama) VALUES (" + chatId + ", '" + username + "')";
                Statement statement;
                statement = connection.createStatement();
                statement.executeUpdate(sql);
                sendSuccessMessage(chatId,"Akun Anda Telah Berhasil Ditambah");
                sendStartMessage(chatId,"Nama Anda : "+username);
            }catch (SQLException e){
                e.printStackTrace();
                sendErrorMessage(chatId, "Failed to register user. Please try again later.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            sendErrorMessage(chatId, "Failed to register user. Please try again later.");
        }
    }
    
    private void sendSuccessMessage(long chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    
    private void sendErrorMessage(long chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "uasajabot";
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    public static void main(String[] args) {
    }
}