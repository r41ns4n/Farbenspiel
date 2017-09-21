package com.sabel;

import javax.swing.*;

public class Farbenspiel extends JFrame{

    // Datafields
    private JPanel jPanel;
    private JButton jButtonBlue;
    private JButton jButtonRed;
    private JButton jButtonYellow;

    public Farbenspiel() {
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(300,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

    public void initComponents() {
        jPanel = new JPanel();
        // Buttons
        jButtonBlue = new JButton("Blue");
        jButtonRed = new JButton("Red");
        jButtonYellow = new JButton("Yellow");
        // addButtons
        this.jPanel.add(jButtonBlue);
        this.jPanel.add(jButtonRed);
        this.jPanel.add(jButtonYellow);
        // addjPannel
        this.add(jPanel);
    } // End Methode initComponents

 } // End Class Farbenspiel
