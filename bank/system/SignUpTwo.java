/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignUpTwo extends JFrame implements ActionListener {
    
    
    JTextField Aadhar,Pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox Religion,Category,Occupation, Educational,Income;
    String  formno;                                 /*gloabally*/
    
    SignUpTwo(String formno)
    {   this.formno = formno;
        setLayout(null);
    
        setTitle("NEW ACCOUNT APPLICATION FORM 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Railway" ,Font.BOLD ,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
       
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Railway" ,Font.BOLD ,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        Religion = new JComboBox(valreligion);
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
        
            
        
        
        JLabel category = new JLabel("Category :");
        category .setFont(new Font("Railway" ,Font.BOLD ,20));
        category .setBounds(100,190,200,30);
        add(category );
        String valcategory[] = {"SC","ST","OBC","General","Other"};
        Category = new JComboBox(valcategory);
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Railway" ,Font.BOLD ,20));
        income.setBounds(100,240,240,30);
        add(income);
        String valincome[] = {"Null","<150000","<250000","<500000","Upto 10000000"};
        Income = new JComboBox(valincome);
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.WHITE);
        Income.setForeground(Color.BLACK);
        add(Income);
        
        
        
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Railway" ,Font.BOLD ,20));
        educational.setBounds(100,300,200,30);
        add(educational);
        String valeducation[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        Educational = new JComboBox(valeducation);
        Educational.setBounds(300,315,400,30);
        Educational.setBackground(Color.WHITE);
        Educational.setForeground(Color.BLACK);
        add(Educational);
        
        
        
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Railway" ,Font.BOLD ,20));
        qualification.setBounds(100,325,200,30);
        add(qualification);
        
        
        
        
        JLabel occupation = new JLabel("Occupation :");
        occupation .setFont(new Font("Railway" ,Font.BOLD ,20));
        occupation .setBounds(100,390,200,30);
        add(occupation );
        String valoccupation[] = {"Private","Public","Salaried","Self-Employed","Business","Student","Retired","Others"};
        Occupation = new JComboBox(valoccupation);
        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        Occupation.setForeground(Color.BLACK);
        add(Occupation);
        
        
        
         
        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Railway" ,Font.BOLD ,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        Pan= new JTextField();
        Pan.setFont(new Font("Railway" , Font.BOLD , 14));
        Pan.setBounds(300,440,400,30);
        add(Pan);
        
        
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Railway" ,Font.BOLD ,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        Aadhar = new JTextField();
        Aadhar.setFont(new Font("Railway" , Font.BOLD , 14));
        Aadhar.setBounds(300,490,400,30);
        add(Aadhar);
        
        
        
        JLabel scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Railway" ,Font.BOLD ,20));
        scitizen.setBounds(100,540,200,30);
        add(scitizen);
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup mariralgroup = new ButtonGroup();
        mariralgroup.add(syes);
        mariralgroup.add(sno);
        
        
        
        
        
        
      
        JLabel eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Railway" ,Font.BOLD ,20));
        eaccount.setBounds(100,590,200,30);
        add(eaccount);
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup emariralgroup = new ButtonGroup();
        emariralgroup.add(eyes);
        emariralgroup.add(eno);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway" , Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);  
        
        
        
        getContentPane().setBackground(Color.WHITE);                                                      /*getContentPane - frame*/
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
                                                                                           /*random is of long type but we are converting long into string by using ("" +)*/
       String sreligion = (String)Religion.getSelectedItem();                               /*getSelectedItem() : to get value from ComboBox*/
       String scategory = (String)Category.getSelectedItem();
       String sincome   = (String)Income.getSelectedItem();
       String seducational = (String)Educational.getSelectedItem();
       String soccupation  = (String)Occupation.getSelectedItem();
       String sseniorcitizen = null;
       if (syes.isSelected()) {
           sseniorcitizen ="Yes";
       }
       else if (syes.isSelected()) {
           sseniorcitizen ="No";
        }
       
       String eexistingaccount = null;
       if (eyes.isSelected())
       {
           eexistingaccount = "Yes";
       }
       else if (eno.isSelected())
       {
           eexistingaccount = "No";
       }
       
       
       String spanno = Pan.getText();
       String saadhar= Aadhar.getText();
       
       try
       {    
              Connect c = new Connect();                                                                /*creating connection with database and insert values in signup table*/
              String query = "insert into   signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducational+"','"+soccupation+"','"+spanno+"','"+saadhar+"','"+sseniorcitizen+"','"+eexistingaccount+"')";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new SignUpThree(formno).setVisible(true);
              
          }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
    
    }
    
    public static void main(String args[]) {
       new SignUpTwo("");
        
    }
}