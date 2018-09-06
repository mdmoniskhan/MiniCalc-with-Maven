package com.mini.calc;

import org.jdesktop.swingx.*;

import java.awt.Color;
import java.awt.event.*;

public class MiniCalc {

    public static void main(String[] args) {
        new Gui().setVisible(true);
    }
}

class Gui extends JXFrame{
    JXPanel p,f;
    JXLabel l1,l2,l3,l4;
    JXTextField t1,t2;
    JXButton b1,b2,b3,b4,b5;
    Gui(){
        setResizable(false);
        setLayout(null);
        setTitle("Mini Calci");
        setSize(400,300);
        this.setLocationRelativeTo(null);
        f=new JXPanel();
        f.setLayout(null);
        f.setBackground(Color.ORANGE);
        f.setBounds(0, 0, 400, 280);
        add(f);
        p = new JXPanel();
        p.setLayout(null);
        p.setBackground(Color.CYAN);
        p.setBounds(50,40,300,150);
        f.add(p);
        l1 = new JXLabel("1st No : ");
        l1.setBounds(20,20,60,20);
        p.add(l1);
        t1 = new JXTextField();
        t1.setForeground(Color.red);
        t1.setBounds(100,20,180,20);
        p.add(t1);
        l2 = new JXLabel("2nd No : ");
        l2.setBounds(20,60,60,20);
        p.add(l2);
        t2 = new JXTextField();
        t2.setForeground(Color.red);
        t2.setBounds(100,60,180,20);
        p.add(t2);
        b1 = new JXButton("+");
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.BLACK);
        b1.setBounds(20,100,55,40);
        p.add(b1);
        b2 = new JXButton("-");
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b2.setBounds(70,100,55,40);
        p.add(b2);
        b3 = new JXButton("*");
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b3.setBounds(120,100,55,40);
        p.add(b3);
        b4 = new JXButton("/");
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b4.setBounds(170,100,55,40);
        p.add(b4);
        b5 = new JXButton("%");
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.BLACK);
        b5.setBounds(220,100,55,40);
        p.add(b5);
        l3 = new JXLabel("Answer : ");
        l3.setBounds(50,240,80,20);
        f.add(l3);
        l4 = new JXLabel("-----------------------------------------------------");
        l4.setBounds(140,240,230,20);
        f.add(l4);
        
        //actions
        b1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            String s1 = t1.getText();
		            String s2 = t2.getText();
		            int a1 = Integer.parseInt(s1);
		            int a2 = Integer.parseInt(s2);
		            a1 = a1 + a2;
		            l4.setText(String.valueOf(a1));
	            }catch(Exception message){
	                l4.setText(message.getMessage());
	            }
			}
        });
        
        b2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            String s1 = t1.getText();
		            String s2 = t2.getText();
		            int a1 = Integer.parseInt(s1);
		            int a2 = Integer.parseInt(s2);
		            a1 = a1 - a2;
		            l4.setText(String.valueOf(a1));
	            }catch(Exception message){
	                l4.setText(message.getMessage());
	            }
			}
        });
        
        b3.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            String s1 = t1.getText();
		            String s2 = t2.getText();
		            int a1 = Integer.parseInt(s1);
		            int a2 = Integer.parseInt(s2);
		            a1 = a1 * a2;
		            l4.setText(String.valueOf(a1));
	            }catch(Exception message){
	                l4.setText(message.getMessage());
	            }
			}
        });
        
        b4.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            String s1 = t1.getText();
		            String s2 = t2.getText();
		            int a1 = Integer.parseInt(s1);
		            int a2 = Integer.parseInt(s2);
		            a1 = a1 / a2;
		            l4.setText(String.valueOf(a1));
	            }catch(Exception message){
	                l4.setText(message.getMessage());
	            }
			}
        });
        
        b5.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            String s1 = t1.getText();
		            String s2 = t2.getText();
		            int a1 = Integer.parseInt(s1);
		            int a2 = Integer.parseInt(s2);
		            a1 = a1 % a2;
		            l4.setText(String.valueOf(a1));
	            }catch(Exception message){
	                l4.setText(message.getMessage());
	            }
			}
        });
    }
}
