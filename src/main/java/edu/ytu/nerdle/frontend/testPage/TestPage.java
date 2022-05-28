package edu.ytu.nerdle.frontend.testPage;

import javax.swing.*;

public class TestPage extends JDialog {
    private JPanel contentPane;
    private JPanel testPanel;
    private JLabel equationLabel;
    private JButton generateButton;
    private JButton cancelButton;

    public TestPage() {
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        TestPage dialog = new TestPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
