package edu.ytu.nerdle.frontend.winningPage;

import edu.ytu.nerdle.frontend.mainPage.MainPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WinPage extends JDialog {
    private JPanel contentPane;
    private JPanel winPanel;
    private JLabel timeLabel;
    private JButton mainPageButton;
    private JButton buttonOK;

    public WinPage() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        mainPageButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                MainPage mainPage = new MainPage();
                mainPage.loadStats();
                mainPage.pack();
                mainPage.setVisible(true);
            }
        });
    }

    public void setTime(String time) {
        timeLabel.setText("SÜRE = " + time + " SANİYE");
    }

    public static void main(String[] args) {
        WinPage dialog = new WinPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
