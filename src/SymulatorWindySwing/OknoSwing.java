/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import javax.swing.JFrame;

/**
 *
 * @author Filip
 */
public class OknoSwing extends JFrame {

    Menu menu;
    
    Pojemnosc pojemnosc = new Pojemnosc() {};
    
    

    public OknoSwing(int pojemnosc) {
        
        
        
        System.out.println("Maksymalna pojemnosc windy to: "+pojemnosc + " kg");

        setTitle("Filip Rosochacki Winda");
        
        setBounds(600,300,655,320);
        
        menu = new Menu();
        
        add(menu);
        

        
        setVisible(true);
        
        setResizable(false);
        

                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
