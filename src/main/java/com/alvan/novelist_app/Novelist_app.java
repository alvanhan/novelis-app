/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alvan.novelist_app;

import com.alvan.novelist_app.Database.KoneksiDatabase;
import java.sql.Connection;

/**
 *
 * @author Nitro 5
 */
public class Novelist_app {

    public static void main(String[] args) {
        Connection connection = KoneksiDatabase.getConnection();

    }
}
