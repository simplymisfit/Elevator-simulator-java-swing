/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Filip
 */
public class Pietra {
    private Drzwi drzwi;
    private int uzytkownik = 1;//pietro uzytkownika
    private int pietroWinda;//piętro na którym znajduje się winda
    protected int pietroDocelowe;//pietro na ktore chcesz się udać 
    private JLabel JLabelpietra;
    private JLabel JLabelalarm;
    private int x = 1;
    private int y = 8;
    int pojemnosc;
    /* x i y oznaczają wielkość budynku czyli np: od 1 do 10 piętra*/
    Random r = new Random();
    Scanner in = new Scanner(System.in);

    public Pietra() {
        this.uzytkownik = uzytkownik;
        this.pietroWinda = pietroWinda;
        this.x = x;
        this.y = y;
        this.pojemnosc = pojemnosc;

    }

    public void wezwanie(JLabel JLabelpietra) {

      /*  pietroWinda = r.nextInt(y - x + 1) + x;
        pietroWinda *= 10;
        pietroWinda = Math.round(pietroWinda);
        pietroWinda /= 10; */
        
        pietroWinda = r.nextInt(7)+1;
     
        if (uzytkownik > pietroWinda) {
            for (int i = pietroWinda; i < uzytkownik; i++) {
                pietroWinda++;
                
                if (uzytkownik == pietroWinda) {

                    JOptionPane.showMessageDialog(null, "Winda jedzie");
                    JLabelalarm.setText("Nr piętra: " + pietroWinda);
                    JLabelpietra.setText("Nr piętra: " + pietroWinda);
                } else {
                    JOptionPane.showMessageDialog(null, "Winda jedzie");
                    JLabelpietra.setText("Nr piętra: " + pietroWinda);
                }
            }
        } else if (uzytkownik < pietroWinda) {
            for (int j = pietroWinda; j > uzytkownik; j--) {
                pietroWinda--;
                 
                if (uzytkownik == pietroWinda) {
                     JLabelpietra.setText("Nr piętra: " + pietroWinda);
                    JOptionPane.showMessageDialog(null, "Winda jedzie");
                    
                } else {
                    JLabelpietra.setText("Nr piętra: " + pietroWinda);
                    JOptionPane.showMessageDialog(null, "Winda jedzie ");
                }
            }

        } else if (uzytkownik == pietroWinda) {
            JOptionPane.showMessageDialog(null, "Winda przyjechała");

        }

    }

    
    public void sterowanie(JLabel JLabelpietra,JLabel blokeJLabel, int pietroDocelowe) {
        this.pietroDocelowe=pietroDocelowe;

  if(pietroWinda==uzytkownik){
        if (pietroDocelowe > pietroWinda) {
            for (int i = pietroWinda; i < pietroDocelowe; i++) {
                pietroWinda++;
                uzytkownik++;
               
                if (pietroWinda == pietroDocelowe) {
                     JLabelpietra.setText("Nr piętra: " + pietroWinda);
                    blokeJLabel.setText(""+uzytkownik);
                  
                    JOptionPane.showMessageDialog(null, "Jesteś na piętrze " + pietroWinda);

                }
                 else {
                    JLabelpietra.setText("Nr piętra: " + pietroWinda);
                       blokeJLabel.setText(""+uzytkownik);
                    JOptionPane.showMessageDialog(null, "Winda jedzie ");
                }
            }
        } else if (pietroDocelowe < pietroWinda) {
            for (int j = pietroWinda; j > pietroDocelowe; j--) {

                pietroWinda--;
                uzytkownik--;
              
                if (pietroWinda == pietroDocelowe) {
                     JLabelpietra.setText("Nr piętra: " + pietroWinda);
                     blokeJLabel.setText("Nr piętra: " + uzytkownik);
                    
                    JOptionPane.showMessageDialog(null, "Jesteś na piętrze " + pietroWinda);

                }
                 else {
                    JLabelpietra.setText("Nr piętra: " + pietroWinda);
                       blokeJLabel.setText(""+uzytkownik);
                    JOptionPane.showMessageDialog(null, "Winda jedzie ");
                }
            }

        } else if (pietroDocelowe == pietroWinda) {

            JOptionPane.showMessageDialog(null, "Jesteś aktualnie na wskazanym piętrze");
            drzwi.otworz();
        }
  }
  else
       JOptionPane.showMessageDialog(null, "Musisz wezwać windę");
        drzwi.zamknij();
        System.out.println("M");
    }
}
