/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alvan.novelist_app;

import com.alvan.novelist_app.Database.KoneksiDatabase;
import com.alvan.novelist_app.UserInterfaceList.DashboardPage;
import com.alvan.novelist_app.UserInterfaceList.LoginForm;

import java.sql.Connection;

/**
 *
 * @author Nitro 5
 */
public class Novelist_app {

    public static void main(String[] args) {
        Connection connection = KoneksiDatabase.getConnection();
        if (connection != null) {
            System.out.println("Koneksi ke database berhasil!");
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
            loginForm.setLocationRelativeTo(null);
        } else {
            System.out.println("Koneksi ke database gagal!");
        }
    }
}
