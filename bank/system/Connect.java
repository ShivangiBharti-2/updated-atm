/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.system;

import java.sql.*;


public class Connect {
    
    Connection c;                                                                                 /*2. creating connection*/
    Statement s;                                                                                  /*3. creating statement*/
  
    public Connect()
    {
        try{
           /* Class.forName("com.mysql.cj.jdbc.Driver"); */                                     /*first we have to register the driver by using then class (Class)  which have static method ForName(Driver Name) , this driver is present in one library name mysql connector java*/
            c = DriverManager.getConnection("jdbc:mysql:///banksystem" , "root" , "Shivangi@123");
            s =c.createStatement();                                                                /*importing library mysql connector java*/
            
        }catch (Exception e) {
            System.out.println(e);
        }
    }
            
    
     
}