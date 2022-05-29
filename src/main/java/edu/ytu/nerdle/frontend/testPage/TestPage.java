package edu.ytu.nerdle.frontend.testPage;

import edu.ytu.nerdle.core.util.equation.EquationUtil;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestPage extends JDialog {
    private JPanel contentPane;
    private JPanel testPanel;
    private JLabel equationLabel;
    private JButton generateButton;
    private JButton cancelButton;

    public TestPage() {
        setContentPane(contentPane);
        setModal(true);
        generateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                equationLabel.setText(EquationUtil.getEquationString());
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        TestPage dialog = new TestPage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
