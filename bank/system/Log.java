/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.system;

/**
 *
 * @author bhart
 */


import javax.swing.*;                                                                                      /*  javax- extended package of java, swing - used for desktop bases application and use to make frame,JFrame - class of swing package */
import java.awt.*;                                                                                         /* awt -image class is present in awt package*/
import java.awt.event.*;                                                                                   /*  event - A class in which ActionListener interface is present */
import java.sql.*;                                                                                         
 

public class Log extends JFrame implements ActionListener{                                                  /* Login - constructor ; ActionListener - interface (to catch the event of button) */  
    
    JButton login ,signup,clear;                                                       
    JTextField cardTextField;
    JPasswordField pinTextField;                                                                           /*cardTextField and pinTextField are globally declared because they will be access by Abstarct function ActionPerform*/
  Log()
  {
     setTitle("Automated Teller Machine");                                                            /*title of frame*/
     
     setLayout(null);                                                                                /*bydefault is Border layour which have the property of center align. If we use setlayout(null) so it will pick custom layout instead of border layout*/
     
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));              /* Imageicon - class used for images , Classloader: Class used to fetch image, getSystemResourse : static method to load image*/
     
     
    
     Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);              /* Image : This is a Class and present in Awt package ; getscaledinstance - to change width and height of image*/
     ImageIcon i3 = new ImageIcon(i2);                                                                 /* Conerting Image ingto ImageIcon to put it into JLabel ;  we cant't place imageIcon directly on frame we have to put ImageIcon first in JLabel ,*/
     JLabel label = new JLabel(i3);                                                                    /*can't put image in JLabel only can put ImageIcon in JLabel*/
     label.setBounds(70,10,100,100);
     add(label);
     
     JLabel text = new JLabel("Welcome to ATM");
     text.setFont(new Font("Osward" , Font.BOLD, 38));
     text.setBounds(200,40,400,40);
     add(text);
     
     
     JLabel cardno = new JLabel("Card No:");
     cardno.setFont(new Font("Railway" , Font.BOLD, 25));
     cardno.setBounds(120,150,150,30);
     add(cardno);
     
     cardTextField = new JTextField();
     cardTextField.setBounds(300,150,230,30);
     cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
     add(cardTextField);
     
     
     JLabel pin = new JLabel("PIN:");
     pin.setFont(new Font("Railway" , Font.BOLD, 25));
     pin.setBounds(120,220,250,30);
     add(pin);
     
     pinTextField = new JPasswordField();
     pinTextField.setBounds(300,220,230,30);
     pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
     add(pinTextField);
     
     login = new JButton("SIGN IN");
     login.setBounds(300,300,100,30);
     login.setBackground(Color.BLACK);
     login.setForeground(Color.WHITE);
     login.addActionListener(this);
     add(login);
     
     
     clear = new JButton("CLEAR");
     clear.setBounds(430,300,100,30);
     clear.setBackground(Color.BLACK);
     clear.setForeground(Color.WHITE);
     clear.addActionListener(this);
     add(clear);
     
     signup = new JButton("SIGN UP");
     signup.setBounds(300,350,230,30);
     signup.setBackground(Color.BLACK);
     signup.setForeground(Color.WHITE);
     signup.addActionListener(this);                                                                        /* this method is use to catch the event of button */
     add(signup);
     
  
     getContentPane().setBackground(Color.white);                                                           /*background color of image*/
     setSize(800,480);                                                                              /*size of frame*/
     setVisible(true);                                                                                      /*frame visisblity*/
     setLocation(350,200);                                                                                /*location of frame*/
     
  }
  public void actionPerformed(ActionEvent ae)                                                                 /*actionPerformed : Abstract method of interface eventListener which have to be override*/                              
  {
     if (ae.getSource() == clear)                                                                             /*getSource: what is source of button*/
     {
         cardTextField.setText("");                                                                         /*if clear button press text field should be empty*/
         pinTextField.setText("");
         
     }
     else if (ae.getSource() == login)
     {
      Connect c = new Connect();
      String cardnumber = cardTextField.getText();
      String pinnumber = pinTextField.getText();
      String query = "select * from log where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";
      try{
          ResultSet rs = c.s.executeQuery(query);                                                      /*Resultset = when above query matches in database then it return some data in object of Resultset means type of data is Resultset and Resultset present in sql package.*/
          if(rs.next())
          {
              setVisible(false);                                                                          /*current frame will close*/
              new Transactions(pinnumber).setVisible(true);                                               /*Transaction frame will open*/
              
          }else {
              JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin ");
          }
          
      }catch(Exception e)
      {
          System.out.println(e);
      }
     }
     else if (ae.getSource() == signup)
     {
         setVisible(false);
         new SignUpOne().setVisible(true);
     }
      
  }
  

  
  
    public static void main(String args[]) {
        JFrame J = new Log();
        // TODO code application logic here
    }
}