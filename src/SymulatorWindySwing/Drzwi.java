/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import javax.swing.JLabel;

/**
 *
 * @author Filip
 */
public class Drzwi {
    
    private JLabel JLabeldrzwi;


    public Drzwi(JLabel JLabeldrzwi) {
         this.JLabeldrzwi = JLabeldrzwi;
         
    }

        public void otworz() {
        
                                     this.JLabeldrzwi.setText("Otwarte");
     
                             }
        
     public void zamknij() {
        
                                     this.JLabeldrzwi.setText("Zamknięte");
     

                           }
}
