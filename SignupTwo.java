/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category, income, education,occupation;
    String formno;

    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion");
        name.setFont(new Font("raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Christian","Sikh","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
   
                
        JLabel fname = new JLabel("Category");
        fname.setFont(new Font("raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        JLabel dob = new JLabel("Income");
        dob.setFont(new Font("raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);   
        
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
        
      
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("raleway", Font.BOLD, 20));
        gender.setBounds(100,320,200,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification");
        email.setFont(new Font("raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,340,400,30);
        education.setBackground(Color.white);
        add(education);
       
                
        
        JLabel maritalstatus = new JLabel("Occupation");
        maritalstatus.setFont(new Font("raleway", Font.BOLD, 20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
 
        
        JLabel address = new JLabel("PAN Number");
        address.setFont(new Font("raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
                
        
        
        JLabel city = new JLabel("Aadhar Number");
        city.setFont(new Font("raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
                
        
        JLabel state = new JLabel("Senior Citizen");
        state.setFont(new Font("raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
                
        
        JLabel pincode = new JLabel("Existing Account");
        pincode.setFont(new Font("raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        add(next);
        next.addActionListener(this);
        
                
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen= "Yes"; 
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if (eno.isSelected()){
            existingaccount = "No";
        }             
        String span = pan.getText();
        String saadhar= aadhar.getText();
   
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')"; 
                c.s.executeUpdate(query); 
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
                
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]){
        new SignupTwo("");
        
    }
}