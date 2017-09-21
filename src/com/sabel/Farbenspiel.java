package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.initEvents();
        this.setSize(300,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

    private void initEvents() {
        jButtonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            } // End Method RED
        } //End addActionListener(new ActionListener()
        );
        jButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            } // End Method Blue
        } // addActionListener(new ActionListener()
        );
        jButtonYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.YELLOW);
            } // End Method YELLOW
        } // addActionListener(new ActionListener()
        );

    } // End Method initEvents()

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
