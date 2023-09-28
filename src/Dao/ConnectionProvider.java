/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class ConnectionProvider {

    Connection conn=null;
    public static Connection getConnectDatabase(){
        
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.sqlite.JDBC");
//            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eps","root","");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:db.sqlite","root","root");
            JOptionPane.showMessageDialog(null, "Connection to database is successful");
            
//            Statement stmt = conn.createStatement();
//            
//            stmt.executeUpdate("drop table surveyCreator");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    public static void main(String[] args){
        getConnectDatabase();
    }
    
}
