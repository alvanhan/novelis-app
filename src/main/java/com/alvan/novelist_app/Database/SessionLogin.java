/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alvan.novelist_app.Database;

/**
 *
 * @author Nitro 5
 */
public class SessionLogin {
    private static String id_user;
    private  static Boolean status_login;
    
    public static String getUid(){
        return id_user;
    }
    
    public static void  setUid(String id_user){
        SessionLogin.id_user = id_user;
    }


    public static Boolean getStatusLogin(){
        return status_login;
    }

    public static void setStatusLogin(Boolean status_login){
        SessionLogin.status_login = status_login;
    }



}
