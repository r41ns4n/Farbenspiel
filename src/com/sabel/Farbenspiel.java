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
        initComponents();
        this.setSize(300,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

    public void initComponents() {
        jPanel = new JPanel();
        jButtonBlue = new JButton("Blue");
        this.jPanel.add(jButtonBlue);
        jButtonRed = new JButton("Red");
        this.jPanel.add(jButtonRed);
        jButtonYellow = new JButton("Yellow");
        this.jPanel.add(jButtonYellow);
        this.add(jPanel);
    } // End Methode initComponents

} // End Class Farbenspiel
