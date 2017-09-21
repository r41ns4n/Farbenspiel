package com.sabel;

import javax.swing.*;

public class Farbenspiel extends JFrame{

    // Datafields
    private JPanel jPanel;
    private JButton jButtonBlue;
    private JButton jButtonRed;
    private JButton jButtonYellow;
    private JButton jButtonGreen;

    public Farbenspiel() {
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(400,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

    private void initEvents() {
        MeinActionListener mal = new MeinActionListener(jPanel);
        jButtonBlue.addActionListener(mal);
        jButtonRed.addActionListener(mal);
        jButtonYellow.addActionListener(mal);
        jButtonGreen.addActionListener(mal);
    } // End Method initEvents()

    public void initComponents() {
        jPanel = new JPanel();
        // Buttons
        jButtonBlue = new JButton("Blue");
        jButtonRed = new JButton("Red");
        jButtonYellow = new JButton("Yellow");
        jButtonGreen = new JButton("Green");
        // addButtons
        this.jPanel.add(jButtonBlue);
        this.jPanel.add(jButtonRed);
        this.jPanel.add(jButtonYellow);
        this.jPanel.add(jButtonGreen);
        // addjPannel
        this.add(jPanel);
    } // End Method initComponents

 } // End Class Farbenspiel
