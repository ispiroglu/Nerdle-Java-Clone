package edu.ytu.nerdle.frontend.mainPage;

import javax.swing.*;

public class MainPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainPage");
        frame.setContentPane(new MainPage().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel JPanel;
    private JPanel mainPanel;
    private JPanel statsPanel;
    private JPanel newGamePanel;
    private JPanel continuePanel;
    private JPanel testPanel;
    private JLabel gameNameLabel;
    private JPanel gameNamePanel;
    private JButton continueButton;
    private JButton newGameButton;
    private JLabel statsLabel;
    private JButton testButton;

    public MainPage() {
    }
}
