/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Timer;

/**
 *
 * @author Filip
 */
public class CialoFunkcji extends Pietra {
    private  Pietra pietro;
    private Drzwi drzwi;
    private Alarm alarm;
    String filepath = "ALARM_06.wav";

 
    public CialoFunkcji(   JLabel blokeJLabel, JLabel JLabelpietra, JLabel JLabeldrzwi, JLabel JLabelalarm)  {
    
     
       
        pietro = new Pietra();
        drzwi = new Drzwi(JLabeldrzwi);
        alarm = new Alarm(JLabelalarm);
      
    
    }

 public void wezwijWindeButton(JLabel JLabelpietra) {
        try {
            pietro.wezwanie(JLabelpietra);
            drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
  public void wlaczAlarmButton() {
        try {
            alarm.wlacz(filepath);
        } catch (Exception e) {
        
        }

    }

    public void otworzWindeButton() {
        try {
            drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
     public void zamknijWindeButton() {
        try {
            drzwi.zamknij();
        } catch (Exception e) {
        
        }

    }

 public void pierwszePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=1;
           pietro.sterowanie(JLabelpietra,blokeJLabel,1);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
 public void drugiePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=2;
           pietro.sterowanie(JLabelpietra,blokeJLabel,2);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
  public void trzeciePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=3;
           pietro.sterowanie(JLabelpietra,blokeJLabel,3);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
   public void czwartePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=4;
           pietro.sterowanie(JLabelpietra,blokeJLabel,4);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
    public void piatePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=5;
           pietro.sterowanie(JLabelpietra,blokeJLabel,5);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
     public void szostePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=6;
           pietro.sterowanie(JLabelpietra,blokeJLabel,6);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
      public void siodmePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=7;
           pietro.sterowanie(JLabelpietra,blokeJLabel,7);
           drzwi.otworz();
        } catch (Exception e) {
        
        }

    }
       public void osmePietroButton(JLabel JLabelpietra,JLabel blokeJLabel) {
        try {
           drzwi.zamknij();
           pietroDocelowe=8;
           pietro.sterowanie(JLabelpietra,blokeJLabel,8);
        } catch (Exception e) {
        
        }

    }
}
