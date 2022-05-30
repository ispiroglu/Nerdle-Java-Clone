package edu.ytu.nerdle.frontend.winningPage;

import javax.swing.*;

public class WinPage extends JDialog {
    private JPanel contentPane;
    private JPanel winPanel;
    private JLabel timeLabel;
    private JButton buttonOK;

    public WinPage() {

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

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
