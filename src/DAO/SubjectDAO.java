/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import AES.AES;
import java.util.ArrayList;
import DTO.Subject;
import Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author sondt
 */
public class SubjectDAO {
    
    private static SubjectDAO instance;
    public static SubjectDAO getInstance() {
        if (instance == null) {
            instance = new SubjectDAO();
        }
        return instance;
    }
    public static void setInstance(SubjectDAO instance) {
        SubjectDAO.instance = instance;
    }
    
    public ArrayList<Subject> getAllSubjects(){
        ArrayList<Subject> listSubjects = new ArrayList<>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * from `mon_hoc`");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Subject subject = new Subject();
                subject.setId(rs.getString("id"));
                subject.setTen(rs.getString("ten"));
                subject.setSo_tc(Integer.parseInt(rs.getString("so_tc")));
                subject.setMo_ta(rs.getString("mo_ta"));
 
             
                listSubjects.add(subject);
            }
        } catch (Exception e) {
        }
        return listSubjects;
    }
    public ArrayList<String> getAllSubjectId(){
        ArrayList<String> listSubjectIds = new ArrayList<>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * from `mon_hoc`");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Subject subject = new Subject();
                String id = rs.getString("id");
                subject.setId(id);
                subject.setTen(rs.getString("ten"));
                subject.setSo_tc(Integer.parseInt(rs.getString("so_tc")));
                subject.setMo_ta(rs.getString("mo_ta"));
 
             
                listSubjectIds.add(id);
            }
        } catch (Exception e) {
        }
        return listSubjectIds;
    }
    public Boolean UpdateSubject(String idSubjectString, int idDauDiem,String percent){
       
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `monhoc_daudiem` SET `tile_phantram`=? WHERE `id_monhoc`=? AND `id_daudiem`=? ");
            
            
            pstmt.setString(1, percent);
            pstmt.setString(2, idSubjectString);
            pstmt.setString(3, String.valueOf(idDauDiem));
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            
        }
        return false;
    }
}
