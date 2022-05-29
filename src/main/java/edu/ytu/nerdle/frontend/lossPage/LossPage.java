package edu.ytu.nerdle.frontend.lossPage;

import javax.swing.*;

public class LossPage extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public LossPage() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        LossPage dialog = new LossPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
