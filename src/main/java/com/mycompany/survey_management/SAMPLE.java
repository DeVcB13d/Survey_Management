/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.survey_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class SAMPLE {
    public static void main(String args[]){
        try {
            /**
             * To Commit the current values into database and move onto the next page
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","12345678");
            Statement stm = con.createStatement();
            String table_name = "login_details";
            String sql = "DESCRIBE " + table_name;
            ResultSet rs = stm.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()){
                String column_name = rs.getString("Field");
                System.out.println(column_name);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SurveyDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
