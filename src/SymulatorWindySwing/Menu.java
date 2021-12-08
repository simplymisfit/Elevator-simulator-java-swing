/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymulatorWindySwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;


/**
 *
 * @author Filip
 */
public class Menu extends JPanel{
Funkcje action;
 
 
 
    private JButton pierwszePietroButton;
    private JButton drugiePietroButton;
    private JButton trzeciePietroButton;
    private JButton czwartePietroButton;
    private JButton piatePietroButton;
    private JButton szostePietroButton;
    private JButton siodmePietroButton;
    private JButton osmePietroButton;

    
   
    private JButton wylaczAlarmButton;
    private JButton wezwijWindeButton;
    private JButton otworzDrzwiButton;
    private JButton zamknijDrzwiButton;
    private JButton wlaczAlarmButton;

    private JLabel blokeJLabel;
    private JLabel JLabelpietra;
    private JLabel JLabeldrzwi;
    private JLabel JLabelalarm;
 

    private JSeparator separator;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;
    private JSeparator separator5;
    private JSeparator separator6;
    private JSeparator separator7;
    private Font labelsFont;

    public Menu() {
        setSize(650, 200);
        setLayout(null);
      
        pierwszePietroButton = new JButton("1");
        drugiePietroButton = new JButton("2");
        trzeciePietroButton = new JButton("3");
        czwartePietroButton = new JButton("4");
        piatePietroButton = new JButton("5");
        szostePietroButton = new JButton("6");
        siodmePietroButton = new JButton("7");
        osmePietroButton = new JButton("8");

        blokeJLabel = new JLabel("1");
        JLabelpietra = new JLabel("0");
        JLabeldrzwi = new JLabel("Zamknięte");

        wlaczAlarmButton = new JButton("Włącz alarm");
        wylaczAlarmButton = new JButton("Wyłącz alarm");
        wezwijWindeButton = new JButton("Wezwij windę");
        otworzDrzwiButton = new JButton("Otwórz");
        zamknijDrzwiButton = new JButton("Zamknij");
        JLabelalarm = new JLabel("Filip Rosochacki");
        separator = new JSeparator();
        separator2 = new JSeparator(JSeparator.VERTICAL);
        separator3 = new JSeparator();
        separator4 = new JSeparator(JSeparator.VERTICAL);
        separator5 = new JSeparator(JSeparator.VERTICAL);
        separator6 = new JSeparator();
        separator7 = new JSeparator();
        labelsFont = new Font("", 0, 22);
        

        add(pierwszePietroButton);
        add(drugiePietroButton);
        add(trzeciePietroButton);
        add(czwartePietroButton);
        add(piatePietroButton);
        add(szostePietroButton);
        add(siodmePietroButton);
        add(osmePietroButton);

        
       
        add(wlaczAlarmButton);
        add(wezwijWindeButton);
        add(otworzDrzwiButton);
        add(zamknijDrzwiButton);
        add(wylaczAlarmButton);
        
        
        add(blokeJLabel);
        add(JLabelpietra);
        add(JLabeldrzwi);
        add(JLabelalarm);
         
        add(separator);
        add(separator2);
        add(separator3);
        add(separator4);
        add(separator5);
        add(separator6);
        add(separator7);
        
        wlaczAlarmButton.setMargin(new Insets(0, 0, 0, 0));
        wezwijWindeButton.setMargin(new Insets(0, 0, 0, 0));
        otworzDrzwiButton.setMargin(new Insets(0, 0, 0, 0));
        zamknijDrzwiButton.setMargin(new Insets(0, 0, 0, 0));
       /* wylaczAlarmButton.setMargin(new Insets(0, 0, 0, 0)); */
         
        pierwszePietroButton.setMargin(new Insets(0, 0, 0, 0));
        drugiePietroButton.setMargin(new Insets(0, 0, 0, 0));
        trzeciePietroButton.setMargin(new Insets(0, 0, 0, 0));
        czwartePietroButton.setMargin(new Insets(0, 0, 0, 0));
        piatePietroButton.setMargin(new Insets(0, 0, 0, 0));
        szostePietroButton.setMargin(new Insets(0, 0, 0, 0));
        siodmePietroButton.setMargin(new Insets(0, 0, 0, 0));
        osmePietroButton.setMargin(new Insets(0, 0, 0, 0));
        
        blokeJLabel.setHorizontalAlignment(JLabel.CENTER);
        JLabelpietra.setHorizontalAlignment(JLabel.CENTER);
        JLabeldrzwi.setHorizontalAlignment(JLabel.CENTER);
        JLabelalarm.setHorizontalAlignment(JLabel.CENTER);
           
        blokeJLabel.setFont(labelsFont);
        JLabelpietra.setFont(labelsFont);
        JLabeldrzwi.setFont(labelsFont);
        JLabelalarm.setFont(labelsFont);

        blokeJLabel.setBounds(0, 0, 200, 60);
        blokeJLabel.setBackground(Color.RED);
        
        separator.setBounds(0, 70, 200, 5); //pomiedzy 1 a zamkniete
        separator.setBackground(Color.RED);
        
        JLabeldrzwi.setBounds(0, 70, 200, 50);
        JLabeldrzwi.setBackground(Color.WHITE);
        
        separator3.setBounds(0, 130, 200, 5); //pomiedzy zamkniete a 0
        separator3.setBackground(Color.RED);
        
        JLabelpietra.setBounds(0, 140, 200, 50);
        JLabelpietra.setBackground(Color.WHITE);
        
        zamknijDrzwiButton.setBounds(0, 200, 200, 50);
        zamknijDrzwiButton.setBackground(Color.WHITE);
        
        otworzDrzwiButton.setBounds(0, 250, 200, 50);
        otworzDrzwiButton.setBackground(Color.WHITE);
       
       
       
        wlaczAlarmButton.setBounds(200, 250, 350, 50);
        wlaczAlarmButton.setBackground(Color.RED);
        
        separator2.setBounds(199, 0, 5, 50);
        separator2.setBackground(Color.RED);
        
        JLabelalarm.setBounds(250, 30, 260, 100);
        JLabelalarm.setBackground(Color.WHITE);
        
        separator4.setBounds(199, 50, 600, 201);
        separator4.setBackground(Color.RED);
        
        separator5.setBounds(548, 0, 100, 200);
        separator5.setBackground(Color.RED);
        
        separator6.setBounds(0,198,655,200);
        separator6.setBackground(Color.RED);
        
        separator7.setBounds(0,0,655,200);
        separator7.setBackground(Color.RED);
        
        wezwijWindeButton.setBounds(200, 200, 350, 50);
        wezwijWindeButton.setBackground(Color.WHITE);
        
        
        pierwszePietroButton.setBounds(550, 0, 50, 73);
        pierwszePietroButton.setBackground(Color.WHITE);
        drugiePietroButton.setBounds(600, 0, 50, 73);
        drugiePietroButton.setBackground(Color.WHITE);
        trzeciePietroButton.setBounds(550, 74, 50, 73);
        trzeciePietroButton.setBackground(Color.WHITE);
        czwartePietroButton.setBounds(600, 74, 50, 73);
        czwartePietroButton.setBackground(Color.WHITE);
        piatePietroButton.setBounds(550, 148, 50, 73);
        piatePietroButton.setBackground(Color.WHITE);
        szostePietroButton.setBounds(600, 148, 50, 73);
        szostePietroButton.setBackground(Color.WHITE);
        siodmePietroButton.setBounds(550, 222, 50, 73);
        siodmePietroButton.setBackground(Color.WHITE);
        osmePietroButton.setBounds(600, 222, 50, 73);
        osmePietroButton.setBackground(Color.WHITE);
         
      
                   
 action = new Funkcje(blokeJLabel, JLabelpietra, JLabeldrzwi, JLabelalarm);
    
 MouseListener alarmButtonAction = action.alarm();
        wlaczAlarmButton.addMouseListener(alarmButtonAction);

        
        MouseListener wezwijWindeButtonAction = action.wezwijWinde(JLabelpietra);
        wezwijWindeButton.addMouseListener(wezwijWindeButtonAction);
        
        MouseListener otworzDrzwiButtonAction = action.otworzWinde();
        otworzDrzwiButton.addMouseListener(otworzDrzwiButtonAction);                                                                                   
        
     MouseListener zamknijDrzwiButtonAction = action.zamknijWinde();
        zamknijDrzwiButton.addMouseListener(zamknijDrzwiButtonAction);   
        
    
      
        
        MouseListener pierwszePietroButtonAction = action.pierwszePietro(JLabelpietra,blokeJLabel);
        pierwszePietroButton.addMouseListener(pierwszePietroButtonAction);
        
        MouseListener drugiePietroButtonAction = action.drugiePietro(JLabelpietra,blokeJLabel);
        drugiePietroButton.addMouseListener(drugiePietroButtonAction);
        
           MouseListener trzeciePietroButtonAction = action.trzeciePietro(JLabelpietra,blokeJLabel);
        trzeciePietroButton.addMouseListener(trzeciePietroButtonAction);
        
           MouseListener czwartePietroButtonAction = action.czwartePietro(JLabelpietra,blokeJLabel);
        czwartePietroButton.addMouseListener(czwartePietroButtonAction);
        
           MouseListener piatePietroButtonAction = action.piatePietro(JLabelpietra,blokeJLabel);
        piatePietroButton.addMouseListener(piatePietroButtonAction);
        
           MouseListener szostePietroButtonAction = action.szostePietro(JLabelpietra,blokeJLabel);
        szostePietroButton.addMouseListener(szostePietroButtonAction);
        
           MouseListener siodmePietroButtonAction = action.siodmePietro(JLabelpietra,blokeJLabel);
        siodmePietroButton.addMouseListener(siodmePietroButtonAction);
        
           MouseListener osmePietroButtonAction = action.osmePietro(JLabelpietra,blokeJLabel);
        osmePietroButton.addMouseListener(osmePietroButtonAction);
                 }}
