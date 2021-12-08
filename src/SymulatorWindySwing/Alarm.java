/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Filip
 */
public class Alarm extends JApplet implements ActionListener {
    private JLabel JLabelalarm;
 

  

    public Alarm(JLabel JLabelalarm) {
         this.JLabelalarm = JLabelalarm;
         
    }
    
    
    
    public void wlacz(String musicLocation) {
        
        try {
            File musicPath = new File(musicLocation);
            
            if(musicPath.exists()) 
            {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
            JOptionPane.showMessageDialog(null,"Wyłącz alarm!");
            //long clipTimePosition = clip.getMicrosecondPosition();
            clip.stop();
                    }
        }
        catch(Exception e) {
            
        }
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
