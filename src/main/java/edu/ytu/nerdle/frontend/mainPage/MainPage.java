package edu.ytu.nerdle.frontend.mainPage;

import edu.ytu.nerdle.frontend.gamePage.GamePage;
import edu.ytu.nerdle.frontend.testPage.TestPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage extends JDialog {
    private JPanel contentPane;
    private javax.swing.JPanel JPanel;
    private JPanel mainPanel;
    private JPanel continuePanel;
    private JButton continueButton;
    private JPanel newGamePanel;
    private JButton newGameButton;
    private JPanel statsPanel;
    private JLabel statsLabel;
    private JPanel testPanel;
    private JButton testButton;
    private JPanel gameNamePanel;
    private JLabel gameNameLabel;
    public MainPage() {
        setContentPane(contentPane);
        setModal(true);
        newGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Clicked On New Game");
                GamePage gamePage = new GamePage();
                gamePage.pack();
                gamePage.setVisible(true);
//                setVisible(false);
            }
        });
        testButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                TestPage testPage = new TestPage();
                testPage.pack();
                testPage.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        MainPage dialog = new MainPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
