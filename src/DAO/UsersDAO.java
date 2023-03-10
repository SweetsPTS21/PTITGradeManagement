/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Users;
import Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRI
 */
public class UsersDAO {

    private static UsersDAO instance;
    Users account = new Users();

    public UsersDAO() {
    }

    public static UsersDAO getInstance() {
        if (instance == null) {
            instance = new UsersDAO();
        }
        return instance;
    }

    public static void setInstance(UsersDAO instance) {
        UsersDAO.instance = instance;
    }

    public Boolean Login(String username, String password) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `users` WHERE username = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                account.setId(rs.getString("id"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setFirstName(rs.getNString("first_name"));
                account.setLastName(rs.getNString("last_name"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Users GetAccount() {
        return account;
    }

    public List<Users> listAccount() {
        List<Users> list = new ArrayList<>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * from `users`");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Users accountUsers = new Users();
                accountUsers.setId(rs.getString("id"));
                accountUsers.setUsername(rs.getString("username"));
                accountUsers.setPassword(rs.getString("password"));
                accountUsers.setFirstName(rs.getNString("first_name"));
                accountUsers.setLastName(rs.getNString("last_name"));
                accountUsers.setAge(rs.getInt("age"));
                accountUsers.setAddress(rs.getNString("address"));
                accountUsers.setPhoneNumber(rs.getString("phone_number"));
                accountUsers.setNote(rs.getNString("note"));
                accountUsers.setEmail(rs.getString("email"));
                accountUsers.setRole(rs.getNString("role"));
                
                list.add(accountUsers);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Boolean Add(String username, String password, String fistName, String lastName, int age, String address, String phoneNumber, String email, String note, String role) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `users`(`username`, `password`, `first_name`, `last_name`, `age`, `address`, `phone_number`, `email`, `note`, `role`) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setNString(3, fistName);
            pstmt.setNString(4, lastName);
            pstmt.setInt(5, age);
            pstmt.setNString(6, address);
            pstmt.setString(7, phoneNumber);
            pstmt.setString(8, email);
            pstmt.setNString(9, note);
            pstmt.setString(10, role);
            
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean Update(String password, String fistName, String lastName, int age, String address, String phoneNumber, String email, String note, String role, String id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `users` SET `password`=?,`fist_name`=?, `last_name`=?, `age`=?,`address`=?, `phoneNumber`=?, `email`=?, `note`=?, `role`=? WHERE `id`=?");
            pstmt.setString(1, password);
            pstmt.setNString(2, fistName);
            pstmt.setNString(3, lastName);
            pstmt.setInt(4, age);
            pstmt.setNString(5, address);
            pstmt.setString(6, phoneNumber);
            pstmt.setString(7, email);
            pstmt.setNString(8, note);
            pstmt.setString(9, role);
            pstmt.setString(10, id);
            
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean Delete(String id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("Delete from `users` where `id`=?");
            pstmt.setString(1, id);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean DoiMatKhau(String id, String pass) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `users` SET `password`=? WHERE `id`=?");
            pstmt.setString(1, pass);
            pstmt.setString(2, id);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
