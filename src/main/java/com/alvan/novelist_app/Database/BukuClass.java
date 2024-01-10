package com.alvan.novelist_app.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BukuClass {
    private String id;
    private String judul;
    private double hargaPinjam;
    private String penerbit;
    private String isbn;
    private String pengarang;
    private int jumlahHalaman;
    private int jumlahStok;
    private String tahunTerbit;
    private String sinopsis;
    private String gambar;
    private String createdAt;

    public BukuClass(String id, String judul, double hargaPinjam, String penerbit, String isbn, String pengarang,
                     int jumlahHalaman, int jumlahStok, String tahunTerbit, String sinopsis, String gambar, String createdAt) {
        this.id = id;
        this.judul = judul;
        this.hargaPinjam = hargaPinjam;
        this.penerbit = penerbit;
        this.isbn = isbn;
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
        this.jumlahStok = jumlahStok;
        this.tahunTerbit = tahunTerbit;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getHargaPinjam() {
        return hargaPinjam;
    }

    public static BukuClass getBookById(String bookId) {
        Connection connection = KoneksiDatabase.getConnection();

        try {
            String query = "SELECT * FROM buku WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, bookId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new BukuClass(
                        resultSet.getString("id"),
                        resultSet.getString("judul"),
                        resultSet.getDouble("harga_pinjam"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("isbn"),
                        resultSet.getString("pengarang"),
                        resultSet.getInt("jumlah_halaman"),
                        resultSet.getInt("jumlah_stok"),
                        resultSet.getString("tahun_terbit"),
                        resultSet.getString("sinopsis"),
                        resultSet.getString("gambar"),
                        resultSet.getString("created_at")
                );
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
