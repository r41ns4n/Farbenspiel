package com.sabel;

import javax.swing.*;

public class Farbenspiel extends JFrame{

    // Datafields
    private JPanel jPanel;
    private JButton jButtonRed;
    private JButton jButtonYellow;
    private JButton jButtonBlue;

    public Farbenspiel() {
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    } // End Constructor Farbenspiel()

} // End Class Farbenspiel
