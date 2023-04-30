/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myrestaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kalum Sanjeewa
 */
public class MyRestaurant extends JFrame {
    JLabel Customer,Name,Contact,Food,Drink,Type;
    JTextField tfNumber,tfName,tfContact;
    JButton reset,print,receipt;
    JComboBox cb1,cb2;
    JRadioButton r1,r2;
    JTextArea area1,area2;
    int total,dprice,fprice;
    
    MyRestaurant(){
    
        setTitle("Restrant and coffe");
        setSize(700, 500);
        setLayout (null);
        
        Customer = new JLabel("Customer No:");
        Customer.setBounds(20, 50, 120, 30);
       
        Name = new JLabel("Name:");
        Name.setBounds(20, 100, 120, 30);
        
        Contact = new JLabel("Contact:");
        Contact.setBounds(20, 150, 120, 30);
        
        Food = new JLabel("Food:");
        Food.setBounds(20, 200, 120, 30);
        String foods[] = {"Pizza","KFC","Burger"};
        cb1 = new JComboBox(foods);
        cb1.setBounds(150,200,200,30);
        
        Drink = new JLabel("Drink:");
        Drink.setBounds(20, 250, 120, 30);
        String drinks[] = {"Milk","Coffe","Tea"};
        cb2 = new JComboBox(drinks);
        cb2.setBounds(150,250,200,30);
        
        Type = new JLabel("Type:");
        Type.setBounds(20, 300, 120, 30);
        r1 = new JRadioButton("Diet");
        r2 = new JRadioButton("Normal");
        r1.setBounds(150, 300, 60, 30);
        r2.setBounds(250, 300, 70, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        tfNumber = new JTextField();
        tfNumber.setBounds(150, 50, 200, 30);
        
        tfName = new JTextField();
        tfName.setBounds(150, 100, 200, 30);
        
        tfContact = new JTextField();
        tfContact.setBounds(150, 150, 200, 30);
        
        reset = new JButton("reset");
        reset.setBounds(100, 400, 80, 40);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 tfNumber.setText("");
                 tfContact.setText("");
                 tfName.setText("");
                 area1.setText("");
            }
            
        });
        
        receipt = new JButton("Receipt");
        receipt.setBounds(180, 400, 80, 40);
        receipt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area1.setText("GAMAGE RESTAURANT\n");
                area1.setText(area1.getText()+"Customer Number :"+ tfNumber.getText()+
                        "\n Name :"+tfName.getText()+"\n Contact :"+tfContact.getText());
                area1.setText(area1.getText()+ "\nFood :"+cb1.getSelectedItem());
                area1.setText(area1.getText()+"\n Food Price :"+fprice);
                area1.setText(area1.getText()+ "\nDrink :"+cb2.getSelectedItem());
                area1.setText(area1.getText()+"\n Drink Price :"+dprice);
                if (cb1.getSelectedIndex()==0){
                    fprice = 200;
                    
                }
                if (cb1.getSelectedIndex()==1){
                    fprice = 300;
                }
                if (cb1.getSelectedIndex()==2){
                    fprice = 400;
                }
        
                if (cb2.getSelectedIndex()==0){
                    dprice = 100;
                    total = fprice+dprice;
                    area1.setText(area1.getText()+"\n Total Price = :" + total);
                }
                if (cb2.getSelectedIndex()==1){
                    dprice = 200;
                    total = fprice + dprice;
                    area1.setText(area1.getText()+"\n Total Price :"+total);
                }
                if (cb2.getSelectedIndex()==2){
                    dprice = 250;
                    total = fprice + dprice;
                    area1.setText(area1.getText()+"\n Total Price :"+total);
                }
                
            }
        });
        
        print = new JButton("Print");
        print.setBounds(260, 400, 80, 40);
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    area1.print();
                } catch (PrinterException ex) {
                    System.out.print(ex.getMessage());
                }
            }
        });
        
        
        
       
        area1 = new JTextArea();
        area1.setBounds(400, 100, 250, 300);
        
        getContentPane().add(Customer);
        getContentPane().add(tfNumber);
        getContentPane().add(Name);
        getContentPane().add(tfName);
        getContentPane().add(Contact);
        getContentPane().add(tfContact);
        getContentPane().add(Food);
        getContentPane().add(Drink);
        getContentPane().add(Type);
        getContentPane().add(reset);
        getContentPane().add(receipt);
        getContentPane().add(print);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(r1);
        getContentPane().add(r2);
        getContentPane().add(area1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }

    public static void main(String[] args) {
        
        new MyRestaurant();
    }

    private JTextArea newJTextArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
