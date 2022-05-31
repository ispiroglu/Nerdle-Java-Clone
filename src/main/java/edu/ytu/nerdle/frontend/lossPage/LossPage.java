package edu.ytu.nerdle.frontend.lossPage;

import edu.ytu.nerdle.frontend.mainPage.MainPage;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LossPage extends JDialog {
    private JPanel contentPane;
    private JPanel lossPanel;
    private JLabel equationLabel;
    private JButton mainPageButton;
    private JButton buttonOK;

    public LossPage() {
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

    public void setEquationString(String equationString) {
       equationLabel.setText("DENKLEM: " + equationString);
    }

    public static void main(String[] args) {
        LossPage dialog = new LossPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
