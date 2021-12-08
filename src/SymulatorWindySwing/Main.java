/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import javax.swing.SwingUtilities;

/**
 *
 * @author Filip
 */
public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

              OknoSwing okno = new OknoSwing(700);

            }
        });

    }
}
