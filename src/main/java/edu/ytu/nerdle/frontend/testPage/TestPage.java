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
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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


}
