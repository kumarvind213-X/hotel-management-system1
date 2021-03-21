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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class HOTELMANAGEMENTSYSTEM extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    HOTELMANAGEMENTSYSTEM()
    {
        setBounds(300,300,1366,565);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/first.jpg"));
        
        JLabel l1=new JLabel(i1);
        
        l1.setBounds(0,0,1366,565);
        
        add(l1);
        
        JLabel l2=new JLabel("Hotel Management System");
        
        l2.setBounds(20,430,1000,90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN,70));
        l1.add(l2);
        
         setLayout(null);
         setVisible(true);
        
        
        
        
        JButton b1=new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1100,450,150,30);
        b1.addActionListener(this);
        l1.add(b1);
        
        
        while(true)
        {
            l2.setVisible(false);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                
            }
            
            l2.setVisible(true);
            try
            {
                
              Thread.sleep(500);
            }
            catch(Exception e)
            {
            }
            
            
            
        }
        
       
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        new login().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args) {
        
        new HOTELMANAGEMENTSYSTEM().setVisible(true);
    }
    
}
