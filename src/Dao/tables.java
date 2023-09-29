/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class tables {

    public static void main(String[] args) {
        try {
            String useTable = "create table surveyCreator(id int AUTO_INCREMENT primary key, userName varchar(20), password varchar(150),firstName varchar(20), lastName varchar(20),faculty varchar(20),gender varchar(10), email varchar(50),phoneNo varchar(20),isActive int, createDate Date )";
            DbOpretions.setOrDeleteData(useTable, "surveyCreator Table is Created");
            ///// Servey table
            String servey="create table servey(id int AUTO_INCREMENT PRIMARY KEY, surveyTitle varchar(30),creatorId int, creatorName varchar(30), createDate date)";
            DbOpretions.setOrDeleteData(servey, "Servey Table is created");
            ///// question table
            String question="create table question(id int AUTO_INCREMENT PRIMARY KEY, qPosition int,surveyId int, qText varchar(100), qAns varchar(10))";
            DbOpretions.setOrDeleteData(question, "question Table is created");
             ///// SConfig table
            String sConfig="create table sConfig(id int AUTO_INCREMENT PRIMARY KEY, surveyId int,sMarks int, sDate Date)";
            DbOpretions.setOrDeleteData(sConfig, "SConfig Table is created");
              ///// SMapping table
            String sMapping="create table sMapping(id int AUTO_INCREMENT PRIMARY KEY, scId int,surveyId int, qAns varchar(10))";
            DbOpretions.setOrDeleteData(sMapping, "SMapping Table is created");

            /////////Audit Table 
            String auditTbl = "create table Audit(id int AUTO_INCREMENT primary key, userName varchar(30), date date, status varchar(20))";
            DbOpretions.setOrDeleteData(auditTbl, "Audit Table is Created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
