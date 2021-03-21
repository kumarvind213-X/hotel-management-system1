/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

/**
 *
 * @author ARVIND KUMAR
 */

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class AddDriver extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2,c3;
    JButton b1,b2;

  AddDriver()
  {
      
       JLabel title=new JLabel("Add Driver");
       title.setBounds(150,10,150,30);
       title.setFont(new Font("Tahoma",Font.BOLD,18));
       add(title);
       
       JLabel name=new JLabel("Name");
       name.setFont(new Font("Tahoma",Font.PLAIN,16));
       name.setBounds(60,70,100,30);
       add(name);
       
       t1=new JTextField();
       t1.setBounds(200,70,150,30);
       add(t1);
       
       
       JLabel age=new JLabel("Age");
       age.setFont(new Font("Tahoma",Font.PLAIN,16));
       age.setBounds(60,110,100,30);
       add(age);
       
        t2=new JTextField();
       t2.setBounds(200,110,150,30);
       add(t2);
       
       JLabel gender=new JLabel("Gender");
       gender.setFont(new Font("Tahoma",Font.PLAIN,16));
       gender.setBounds(60,150,100,30);
       add(gender);
       
       c1=new JComboBox(new String[]{"Male","Female"});
       c1.setBounds(200,150,150,30);
       
       add(c1);
       
       JLabel car=new JLabel("Car Company");
       car.setFont(new Font("Tahoma",Font.PLAIN,16));
       car.setBounds(60,190,100,30);
       add(car);
       
       t3=new JTextField();
       t3.setBounds(200,190,150,30);
       add(t3);
       
       JLabel model=new JLabel("Model");
       model.setFont(new Font("Tahoma",Font.PLAIN,16));
       model.setBounds(60,230,100,30);
       add(model);
       
       t4=new JTextField();
       t4.setBounds(200,230,150,30);
       add(t4);
       
       JLabel available=new JLabel("Available");
       available.setFont(new Font("Tahoma",Font.PLAIN,16));
       available.setBounds(60,270,100,30);
       add(available);
       
        c2=new JComboBox(new String[]{"Availaible","Busy"});
       c2.setBounds(200,270,150,30);
       
       add(c2);
       
       
       JLabel location=new JLabel("Location");
       location.setFont(new Font("Tahoma",Font.PLAIN,16));
       location.setBounds(60,310,100,30);
       add(location);
       
       t5=new JTextField();
       t5.setBounds(200,310,150,30);
       add(t5);
       
       
       
       b1=new JButton("Add Driver");
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       b1.setBounds(60,370,120,30);
         
       add(b1);
       
       b2=new JButton("Cancel");
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.setBounds(190,370,120,30);
       b2.addActionListener(this);
       add(b2);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/eleven.jpg"));
       Image i2=i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(400,20,500,400);
       add(l1);
       
       getContentPane().setBackground(Color.WHITE);
       
       setLayout(null);
       setBounds(500,200,1000,500);
       setVisible(true);
       
       
  }
  
  public void actionPerformed(ActionEvent ae)
  {
      if(ae.getSource()==b1)
      {
          String name=t1.getText();
          String age=t2.getText();
          String gender=(String)c1.getSelectedItem();
          String Company=t3.getText();
          String brand=t4.getText();
          String available=(String)c2.getSelectedItem();
          String location=t5.getText();
          
          conn c=new conn();
          
          String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+Company+"','"+brand+"','"+available+"','"+location+"')";
          try
          {
            c.s.executeUpdate(str);
          JOptionPane.showMessageDialog(null,"Driver succesfully Added");

          
          }catch(Exception e)
          {System.out.println(e);}
      }
      else if (ae.getSource()==b2)
      {
          setVisible(false);
      }
  }
  
  public static void main(String[] args)
  {
      new AddDriver().setVisible(true);
  }
    
}
