/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Khoa;
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
 * @author ThinkPad
 */
public class KhoaDAO {
    
    private static KhoaDAO instance;
    
    public KhoaDAO() {
    }

    public static KhoaDAO getInstance() {
        if (instance == null) {
            instance = new KhoaDAO();
        }
        return instance;
    }

    public static void setInstance(KhoaDAO instance) {
        KhoaDAO.instance = instance;
    }
    
    public List<Khoa> getAllKhoa(){
        List<Khoa> list = new ArrayList<>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * from khoa");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Khoa kh = new Khoa();
                kh.setId(rs.getInt("id"));
                kh.setTen(rs.getString("ten"));
                
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
