/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mufixapp.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mustafa Khaled
 */
public class DBConnection {
    public static Connection getCon(){
        Connection conn=null;
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://.\\usersDB.mdb");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static Connection getCon(String DB , String user , String password){
        Connection conn=null;
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\usersDB.mdb");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
