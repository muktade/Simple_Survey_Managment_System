/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class ConnectionProvider {

    Connection conn=null;
    public static Connection getConnectDatabase(){
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@//103.143.242.168:1521/orcl","PRAN_DAIRY","PRAN_DAIRY");
            JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    public static void main(String[] args) {
        getConnectDatabase();
    }
    
}
