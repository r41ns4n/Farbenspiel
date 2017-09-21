package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenspiel extends JFrame implements ActionListener{

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
        jButtonBlue.addActionListener(this);
        jButtonRed.addActionListener(this);
        jButtonYellow.addActionListener(this);
    } // End Method initEvents

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

    @Override
    public void actionPerformed (ActionEvent actionEvent) {

        switch (actionEvent.getActionCommand().toLowerCase()) {
            case "blue":
                jPanel.setBackground(Color.BLUE);
                break;
            case "red":
                jPanel.setBackground(Color.RED);
                break;
            case "yellow":
                jPanel.setBackground(Color.YELLOW);
                break;
        } // End switch

    } // End Methode actionPerformed

} // End Class Farbenspiel
