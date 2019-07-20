/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mufixapp.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bridj.cpp.std.list;

/**
 *
 * @author Mustafa Khaled
 */
public class UserDAO {
    private final String getAll_stmt ="Select * From users";
    
    public List<User>  getAllUSers(){
        List<User> all=new ArrayList<User>();
        try(PreparedStatement pstmt = DBConnection.getCon().prepareStatement(getAll_stmt)){
            try(ResultSet rs=pstmt.executeQuery()) {
                while (rs.next()) {
                    User u=new User(rs.getString("id"), rs.getString("name") , rs.getString("track"));
                    all.add(u);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }
    
}
