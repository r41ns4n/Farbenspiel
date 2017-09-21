package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener {

    // Datafields
    private JPanel jPanel;

    public MeinActionListener(JPanel jPanel) {
        this.jPanel = jPanel;
    } // End Constructor MeinActionListener

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toLowerCase()) {
            case "red":
                jPanel.setBackground(Color.RED);
                break;
            case "blue":
                jPanel.setBackground(Color.BLUE);
                break;
            case "yellow":
                jPanel.setBackground(Color.YELLOW);
                break;
            case "green":
                jPanel.setBackground(Color.GREEN);
                break;
        } // End Switch

    } // End Method actionPerformed(ActionEvent e)

} // End Class MeinActionListener

