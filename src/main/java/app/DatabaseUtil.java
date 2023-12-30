package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/peminjaman_buku";
    private static final String USER = "root";
    private static final String PASSWORD = "";



    // Metode untuk mendapatkan objek Connection
    public static Connection getConnection() {
        try (Connection Connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            return Connection;
        } catch (SQLException e) {
            System.out.println("Unable to connect database.");
            return null;
        }
    }
    

    public static ResultSet executeQuery(String query, Object... params) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            return statement.executeQuery();
        } catch (SQLException e) {
            return null;
        }
    }
    
    public static List<String> getAllDataFromTable(String tableName) {
        List<String> dataList = new ArrayList<>();

        String query = "SELECT * FROM " + tableName;

        try (ResultSet resultSet = executeQuery(query)) {
            if (resultSet != null) {
                while (resultSet.next()) {
                    String data = resultSet.getString("nama_kolom");
                    dataList.add(data);
                }
            }
        } catch (SQLException e) {
            return null;
        }
        return dataList;
    }
    

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }
}
