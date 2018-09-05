package com.mini.calc;

import java.awt.*;
import java.awt.event.*;

public class MiniCalc {

    public static void main(String[] args) {
        new Gui().setVisible(true);
    }
}

class Gui extends Frame{
    Panel p;
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Button b1,b2,b3,b4,b5;
    Gui(){
        setResizable(false);
        setLayout(null);
        setTitle("Mini Calci");
        setBackground(Color.ORANGE);
        setSize(400,300);
        this.setLocationRelativeTo(null);
        p = new Panel();
        p.setLayout(null);
        p.setBackground(Color.CYAN);
        p.setBounds(50,70,300,150);
        add(p);
        l1 = new Label("1st No : ");
        l1.setBounds(20,20,60,20);
        p.add(l1);
        t1 = new TextField();
        t1.setForeground(Color.red);
        t1.setBounds(100,20,180,20);
        p.add(t1);
        l2 = new Label("2nd No : ");
        l2.setBounds(20,60,60,20);
        p.add(l2);
        t2 = new TextField();
        t2.setForeground(Color.red);
        t2.setBounds(100,60,180,20);
        p.add(t2);
        b1 = new Button("+");
        b1.setForeground(Color.YELLOW);
        b1.setBackground(Color.BLACK);
        b1.setBounds(20,100,40,30);
        b1.addActionListener(new Add());
        p.add(b1);
        b2 = new Button("-");
        b2.setForeground(Color.YELLOW);
        b2.setBackground(Color.BLACK);
        b2.setBounds(70,100,40,30);
        b2.addActionListener(new Sub());
        p.add(b2);
        b3 = new Button("*");
        b3.setForeground(Color.YELLOW);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(new Mul());
        b3.setBounds(120,100,40,30);
        p.add(b3);
        b4 = new Button("/");
        b4.setForeground(Color.YELLOW);
        b4.setBackground(Color.BLACK);
        b4.setBounds(170,100,40,30);
        b4.addActionListener(new Div());
        p.add(b4);
        b5 = new Button("%");
        b5.setForeground(Color.YELLOW);
        b5.setBackground(Color.BLACK);
        b5.setBounds(220,100,40,30);
        b5.addActionListener(new Mod());
        p.add(b5);
        l3 = new Label("Answer : ");
        l3.setBounds(50,240,80,20);
        add(l3);
        l4 = new Label("-----------------------------------------------------");
        l4.setBounds(140,240,230,20);
        add(l4);
        addWindowListener(new Win());
    }
    
    class Add implements ActionListener{

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
    }
        
    class Sub implements ActionListener{

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
    }
        
    class Mul implements ActionListener{

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
        
    }
    class Div implements ActionListener{

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
        
    }
    class Mod implements ActionListener{

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
        
    }
    class Win extends WindowAdapter{

        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    }
}
