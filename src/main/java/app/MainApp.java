/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Nitro 5
 */
public class MainApp {
        public static void main(String[] args) throws SQLException {
          // Menguji koneksi ke database
          Connection connection = DatabaseUtil.getConnection();
          
          
          
//        // Contoh query ke database
//        String query = "SELECT * FROM nama_tabel WHERE kolom = ?";
//        ResultSet resultSet = DatabaseUtil.executeQuery(query, "nilai_parameter");
//
//        // Proses hasil query
//        try {
//            while (resultSet.next()) {
//                // Ambil data dari hasil query
//                String data = resultSet.getString("nama_kolom");
//                System.out.println("Data: " + data);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Jangan lupa untuk menutup koneksi
//            DatabaseUtil.closeConnection(resultSet.getStatement().getConnection());
//        }


//
//             // Mendapatkan semua data dari tabel
//        String tableName = "nama_tabel";
//        List<String> allData = DatabaseUtil.getAllDataFromTable(tableName);
//
//        // Proses semua data
//        for (String data : allData) {
//            System.out.println("Data: " + data);
//        }
    }
}
