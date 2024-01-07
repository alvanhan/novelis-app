package com.alvan.novelist_app.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberClass {
    private String id;
    private String nama;
    private String email;
    private String jenisKelamin;
    private String alamat;
    private String telepon;
    private String createdAt;

    public MemberClass(String id, String nama, String email, String jenisKelamin, String alamat, String telepon, String createdAt){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.telepon = telepon;
        this.createdAt = createdAt;
    }


    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }


    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public  static  MemberClass getMeberDetail(String memberId){
        Connection connection = KoneksiDatabase.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM member WHERE id = ?");
            preparedStatement.setString(1, SessionLogin.getUid());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new MemberClass(
                        resultSet.getString("id"),
                        resultSet.getString("nama"),
                        resultSet.getString("email"),
                        resultSet.getString("jenis_kelamin"),
                        resultSet.getString("alamat"),
                        resultSet.getString("telepon"),
                        resultSet.getString("created_at")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }



}
