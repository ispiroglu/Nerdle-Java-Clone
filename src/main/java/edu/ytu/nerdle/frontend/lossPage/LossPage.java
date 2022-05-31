package edu.ytu.nerdle.frontend.lossPage;

import javax.swing.*;

public class LossPage extends JDialog {
    private JPanel contentPane;
    private JPanel lossPanel;
    private JLabel equationLabel;
    private JButton buttonOK;

    public LossPage() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
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
