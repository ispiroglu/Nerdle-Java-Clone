package edu.ytu.nerdle.frontend.mainPage;

import edu.ytu.nerdle.core.model.saveInfos.SaveInfos;
import edu.ytu.nerdle.frontend.gamePage.GamePage;
import edu.ytu.nerdle.frontend.testPage.TestPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
                new File("lastGame.ser").delete();
                dispose();
                GamePage gamePage = new GamePage();
                gamePage.pack();
                gamePage.setVisible(true);
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
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("lastGame.ser"));
        } catch (IOException e) {
            continuePanel.setVisible(false);
        }


        ObjectInputStream finalObjectInputStream = objectInputStream;

        continueButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                SaveInfos saveInfos = null;
                if (finalObjectInputStream != null) {
                    try {
                        saveInfos = (SaveInfos) finalObjectInputStream.readObject();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                System.out.println("Clicked On Continue");
                dispose();
                GamePage gamePage = new GamePage();
                gamePage.pack();
                if (saveInfos != null)
                    gamePage.initFromSave(saveInfos);
                else
                    System.out.println("IMDAT");
                gamePage.setVisible(true);

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
