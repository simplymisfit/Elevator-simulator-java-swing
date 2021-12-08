/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;


/**
 *
 * @author Filip
 */
public class Funkcje extends CialoFunkcji{
    
    public Funkcje(   JLabel blokeJLabel, JLabel JLabelpietra, JLabel JLabeldrzwi, JLabel JLabelalarm) {
        super(blokeJLabel, JLabelpietra, JLabeldrzwi, JLabelalarm);
    }

    public MouseListener alarm() {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                wlaczAlarmButton();
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };

    }




  public MouseListener wezwijWinde(JLabel JLabelpietra) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                wezwijWindeButton(JLabelpietra);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
  
  
  
  
  
  
    public MouseListener otworzWinde() {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                otworzWindeButton();
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
    
    
    
    
    
      public MouseListener zamknijWinde() {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                zamknijWindeButton();
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
      
      
      
        public MouseListener pierwszePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                pierwszePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
        
        
        
        
          public MouseListener drugiePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                 drugiePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
          
          
          
          
          
            public MouseListener trzeciePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                trzeciePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
            
            
            
            
            
              public MouseListener czwartePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                czwartePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
              
              
              
              
                public MouseListener piatePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                piatePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
                
                
                
                
                  public MouseListener szostePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                szostePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
                  
                  
                  
                    public MouseListener siodmePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                siodmePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }
                    
                    
                    
                      public MouseListener osmePietro(JLabel JLabelpietra,JLabel blokeJLabel) {
        return new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                osmePietroButton(JLabelpietra,blokeJLabel);
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        };
    }           
}
