package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener {

    private JPanel jPanel;

    public MeinActionListener(JPanel jPanel) {
        this.jPanel = jPanel;
    } // End Constructor MeinActionListener

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand().toLowerCase());
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
        } // End Switch

    } // End Ovverride

} // End Class MeinActionListener

