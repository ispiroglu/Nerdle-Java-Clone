package edu.ytu.nerdle.frontend.mainPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainPage");
        frame.setContentPane(new mainPage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JPanel mainPanel;
    private JPanel statsPanel;
    private JPanel newGamePanel;
    private JPanel continuePanel;
    private JPanel testPanel;
    private JLabel gameNameLabel;
    private JPanel gameNamePanel;
    private JLabel asude;

    public mainPage() {
        statsPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("ASUDE BIR SEYI DE ANLA ARTIK");

            }
        });
    }
}
