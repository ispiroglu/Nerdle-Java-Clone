package edu.ytu.nerdle.frontend.mainPage;

import edu.ytu.nerdle.core.model.gameInfos.GameInfos;
import edu.ytu.nerdle.core.model.stats.Stats;
import edu.ytu.nerdle.frontend.gamePage.GamePage;
import edu.ytu.nerdle.frontend.testPage.TestPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

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
    private JLabel winCountLabel;
    private JLabel lossCountLabel;
    private JLabel leftOffCountLabel;
    private JLabel averageWinTimeLabel;
    private JLabel averageGuessCountLabel;
    private static int leftOffCount;
    private static int lossCount;
    private static int winCount;
    private static int averageGuessCount;
    private static int averageWinTime;

    public MainPage() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        setModal(true);
        loadStats();
        newGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Clicked On New Game");
                new File("lastGame.ser").delete();
                dispose();
                GamePage gamePage = new GamePage();
                gamePage.initNewGame();
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
                GameInfos gameInfos = null;
                if (finalObjectInputStream != null) {
                    try {
                        gameInfos = (GameInfos) finalObjectInputStream.readObject();
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
                if (gameInfos != null)
                    gamePage.initFromSave(gameInfos);
                gamePage.setVisible(true);
            }
        });
    }

    public static void saveStats() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("stats.ser"));
            Stats stats = new Stats(leftOffCount, lossCount, winCount, averageGuessCount, averageWinTime);
            objectOutputStream.writeObject(stats);
            objectOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void loadStats() {
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("stats.ser"));
            Stats stats = (Stats) objectInputStream.readObject();
            leftOffCount = stats.getLeftOffCount();
            lossCount = stats.getLossCount();
            winCount = stats.getWinCount();
            averageGuessCount = stats.getAverageGuessCount();
            averageWinTime = stats.getAverageWinTime();
        } catch (Exception ex) {
            ex.printStackTrace();
            leftOffCount = 0;
            lossCount = 0;
            winCount = 0;
            averageGuessCount = 0;
            averageWinTime = 0;
        }
        winCountLabel.setText("TOPLAM KAZANMA SAYISI: " + winCount);
        lossCountLabel.setText("TOPLAM KAYBETME SAYISI: " + lossCount);
        averageWinTimeLabel.setText("ORTALAMA KAZANMA SÜRESİ: " + averageWinTime);
        averageGuessCountLabel.setText("ORTALAMA TAHMİN SAYISI: " + (averageGuessCount + 1));
        leftOffCountLabel.setText("OYUNU TERK ETME SAYISI: " + leftOffCount);
    }

    public static int getLeftOffCount() {
        return leftOffCount;
    }

    public static void setLeftOffCount(int leftOffCount) {
        MainPage.leftOffCount = leftOffCount;
    }

    public static int getLossCount() {
        return lossCount;
    }

    public static void setLossCount(int lossCount) {
        MainPage.lossCount = lossCount;
    }

    public static int getWinCount() {
        return winCount;
    }

    public static void setWinCount(int winCount) {
        MainPage.winCount = winCount;
    }

    public static int getAverageGuessCount() {
        return averageGuessCount;
    }

    public static void setAverageGuessCount(int averageGuessCount) {
        MainPage.averageGuessCount = averageGuessCount;
    }

    public static int getAverageWinTime() {
        return averageWinTime;
    }

    public static void setAverageWinTime(int averageWinTime) {
        MainPage.averageWinTime = averageWinTime;
    }

    public static void main(String[] args) {
        MainPage dialog = new MainPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
