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
public class SearchRoom extends JFrame implements ActionListener {
    
    JComboBox c1;
    JCheckBox c2;
    JButton b1,b2;
    JTable t1;
    SearchRoom()
    {
        t1=new JTable();
        
        JLabel l1=new JLabel("Search for room");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(300,30,200,30);
        add(l1);
        
        JLabel l2=new JLabel("Room bed type ");
        l2.setBounds(50,100,100,20);
        add(l2);
        
        c1=new  JComboBox(new String[]{"Single Bed","Double bed"});
        c1.setBounds(200,95,150,25);
        c1.setBackground(Color.WHITE);
        
        
        add(c1);
        
        c2=new JCheckBox("Only display Availaible");
        c2.setBounds(600,100,150,25);
        add(c2);
        
        t1=new JTable();
        t1.setBounds(0,200,1000,200);
        add(t1);
        
        
        
        b1=new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300,520,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(500,520,120,30);
        b2.addActionListener(this);
        add(b2);
        
        JLabel l7=new JLabel("Room No");
       // l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setBounds(50,160,100,20);
        add(l7);
        
        JLabel l3=new JLabel("Availaibility");
       // l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setBounds(250,160,200,30);
        add(l3);
        
        JLabel l4=new JLabel("Cleaning Status");
       // l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setBounds(450,160,200,30);
        add(l4);
        
        JLabel l5=new JLabel("Price");
        //l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setBounds(650,160,200,30);
        add(l5);
        
        JLabel l6=new JLabel("Bed type");
       // l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setBounds(850,160,200,30);
        add(l6);
        
        
        
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
                String str="select * from room where  bed_type='"+c1.getSelectedItem()+"'";
                String str2="select * from room where available='Available' AND bed_type='"+c1.getSelectedItem()+"'";
                
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
                if(c2.isSelected())
                {
                    ResultSet rs2=c.s.executeQuery(str2);
                    t1.setModel(DbUtils.resultSetToTableModel(rs2));
                }
                
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
        new SearchRoom().setVisible(true);
        
    }
}
