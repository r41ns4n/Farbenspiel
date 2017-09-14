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
        initComponents();
        this.setSize(300,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

    public void initComponents() {
        jPanel = new JPanel();
        jButtonBlue = new JButton("Blue");
        jButtonBlue.addActionListener(this);
        this.jPanel.add(jButtonBlue);
        jButtonRed = new JButton("Red");
        jButtonRed.addActionListener(this);
        this.jPanel.add(jButtonRed);
        jButtonYellow = new JButton("Yellow");
        jButtonYellow.addActionListener(this);
        this.jPanel.add(jButtonYellow);
        this.add(jPanel);
    } // End Methode initComponents

    public void actionPerformed (ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.jButtonBlue) {
            jPanel.setBackground(Color.blue);
        } // End if Blue
        else if (actionEvent.getSource() == this.jButtonRed) {
            jPanel.setBackground(Color.red);
        } // End if Red
        else if (actionEvent.getSource() == this.jButtonYellow) {
            jPanel.setBackground(Color.yellow);
        } // End if Yellow

    } // End Methode actionPerformed

} // End Class Farbenspiel
