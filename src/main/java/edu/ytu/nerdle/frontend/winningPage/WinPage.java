package edu.ytu.nerdle.frontend.winningPage;

import javax.swing.*;

public class WinPage extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public WinPage() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        WinPage dialog = new WinPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
