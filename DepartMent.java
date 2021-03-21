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
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.*;
public class DepartMent extends JFrame implements ActionListener {
    
    //Choice c1;
    JCheckBox c2;
    JButton b1,b2;
    JTable t1;
    DepartMent()
    {
        t1=new JTable();
        
        /*JLabel l1=new JLabel("DepartMent");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(300,30,200,30);
        add(l1);
        
        /*JLabel l2=new JLabel("Type of Car ");
        l2.setBounds(50,100,100,20);
        add(l2);
        
        c1=new Choice();
        
        try
        {
            conn c=new conn();
            
            ResultSet rs=c.s.executeQuery("select * from driver");
            
            while(rs.next())
            {
                c1.add(rs.getString("brand"));
            }
        }
        catch(Exception e)
        {}
        c1.setBounds(150,100,200,25);
        add(c1);
        c1.setBackground(Color.WHITE);
        
        
        add(c1); */
        
       /* c2=new JCheckBox("Only display Availaible");
        c2.setBounds(600,100,150,25);
        add(c2); */
        
        t1=new JTable();
        t1.setBounds(0,200,1000,200);
        add(t1);
        
        
        
        b1=new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,520,120,30);
        b2.addActionListener(this);
        add(b2);
        
        //JLabel l7=new JLabel("Department");
       // l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        //l7.setBounds(50,160,100,20);
        //add(l7);
        
        JLabel l3=new JLabel("Department");
       // l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setBounds(200,160,200,30);
        add(l3);
        
        JLabel l4=new JLabel("Budget");
       // l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setBounds(500,160,200,30);
        add(l4);
        
        /*JLabel l5=new JLabel("Company");
        //l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setBounds(450,160,200,30);
        add(l5);
        
        JLabel l6=new JLabel("Brand");
        //l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setBounds(600,160,200,30);
        add(l6);
        
         JLabel l8=new JLabel("Availaibility");
       // l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setBounds(750,160,200,30);
        add(l8);
        
         JLabel l9=new JLabel("Location");
       // l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setBounds(900,160,200,30);
        add(l9); */
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setLayout(null);
        setBounds(500,200,1000,650);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            try
            {
                String str="select * from department";
               // String str2="select * from room where available='Available' AND bed_type='"+c1.getSelectedItem()+"'";
                
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
              /*  if(c2.isSelected())
                {
                    ResultSet rs2=c.s.executeQuery(str2);
                    t1.setModel(DbUtils.resultSetToTableModel(rs2));
                }*/
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==b2)
        {
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String [] args)
    {
        new DepartMent().setVisible(true);
        
    }
}
