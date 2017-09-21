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
        MeinInnererActionListener mial = new MeinInnererActionListener();
        jButtonBlue.addActionListener(mial);
        jButtonRed.addActionListener(mial);
        jButtonYellow.addActionListener(mial);
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


    public class MeinInnererActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand().toLowerCase()) {
                case "red" :
                    jPanel.setBackground(Color.RED);
                    break;
                case "blue" :
                    jPanel.setBackground(Color.BLUE);
                    break;
                case "yellow" :
                    jPanel.setBackground(Color.YELLOW);
                    break;
            } // End switch

        } // End Method actionPerformed(ActionEvent e)

    } // End Class MeinInnererActionListener

} // End Class Farbenspiel
