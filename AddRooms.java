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
public class AddRooms extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    
    AddRooms()
    {
        
        JLabel l1=new JLabel("Add Rooms");
        l1.setFont(new Font("Tahoma",Font.PLAIN,18));
        l1.setBounds(200,20,100,20);
        add(l1);
        
        JLabel room=new JLabel("Room Number");
        room.setFont(new Font("Tahoma",Font.PLAIN,18));
        
        room.setBounds(60,60,120,30);
        add(room);
        
        t1=new JTextField();
        t1.setBounds(200,60,150,30);
        add(t1);
        
        JLabel available=new JLabel("Available");
        available.setFont(new Font("Tahoma",Font.PLAIN,18));
        
        available.setBounds(60,130,120,30);
        add(available);
        
        c1=new JComboBox(new String[] {"Availaible","Occupied"});
        c1.setBounds(200,130,150,30);
        add(c1);
        
        JLabel status=new JLabel("cleaning status");
        status.setFont(new Font("Tahoma",Font.PLAIN,18));
        
         c2=new JComboBox(new String[] {"Clean","dirty"});
        c2.setBounds(200,180,150,30);
        add(c2);
        
        
        status.setBounds(60,180,120,30);
        add(status);
        
        JLabel price=new JLabel("price");
        price.setFont(new Font("Tahoma",Font.PLAIN,18));
        
        price.setBounds(60,230,120,30);
        add(price);
        
        t2=new JTextField();
        t2.setBounds(200,230,150,30);
        add(t2);
        
        JLabel type=new JLabel("Bed type");
        type.setFont(new Font("Tahoma",Font.PLAIN,18));
        
        type.setBounds(60,280,120,30);
        add(type);
        
         c3=new JComboBox(new String[] {"Single Bed","Double bed"});
        c3.setBounds(200,280,150,30);
        add(c3);
        
        b1=new JButton("Add Room");
        b1.setBounds(60,330,130,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(210,330,130,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon  i1=new  ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/twelve.jpg"));
        JLabel l3=new JLabel(i1);
        l3.setBounds(400,30,500,350);
        add(l3);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(400,200,1000,500);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String room=t1.getText();
            String available=(String)c1.getSelectedItem();
            String status=(String)c2.getSelectedItem();
            String price=t2.getText();
            String type=(String)c3.getSelectedItem();
            
            conn c=new conn();
            
            try
            {
                String str="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                c.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null,"New Room Added");
                this.setVisible(false);
            }
            catch(Exception e){}
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String [] args)
    {
        new AddRooms().setVisible(true);
    }
}
