package edu.ytu.nerdle.frontend.gamePage;

import edu.ytu.nerdle.core.model.saveInfos.SaveInfos;
import edu.ytu.nerdle.core.util.equation.EquationUtil;
import edu.ytu.nerdle.core.util.string.StringUtil;
import edu.ytu.nerdle.core.util.validation.inputValidator.InputValidator;
import edu.ytu.nerdle.frontend.lossPage.LossPage;
import edu.ytu.nerdle.frontend.mainPage.MainPage;
import edu.ytu.nerdle.frontend.winningPage.WinPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class GamePage extends JDialog {
    private String equation;
    private JPanel contentPane;
    private JPanel gamePanel;
    private JPanel equationField;
    private JPanel equationField1_1;
    private JPanel equationField1_2;
    private JPanel equationField1_3;
    private JPanel equationField1_4;
    private JPanel equationField1_5;
    private JPanel equationField1_6;
    private JPanel equationField1_7;
    private JPanel equationField1_8;
    private JPanel equationField1_9;
    private JPanel equationField2_1;
    private JPanel equationField2_2;
    private JPanel equationField2_3;
    private JPanel equationField2_4;
    private JPanel equationField2_5;
    private JPanel equationField2_6;
    private JPanel equationField2_7;
    private JPanel equationField2_8;
    private JPanel equationField2_9;
    private JPanel equationField3_1;
    private JPanel equationField3_2;
    private JPanel equationField3_3;
    private JPanel equationField3_4;
    private JPanel equationField3_5;
    private JPanel equationField3_6;
    private JPanel equationField3_7;
    private JPanel equationField3_8;
    private JPanel equationField3_9;
    private JPanel equationField4_1;
    private JPanel equationField4_2;
    private JPanel equationField4_3;
    private JPanel equationField4_4;
    private JPanel equationField4_5;
    private JPanel equationField4_6;
    private JPanel equationField4_7;
    private JPanel equationField4_8;
    private JPanel equationField4_9;
    private JPanel equationField5_1;
    private JPanel equationField5_2;
    private JPanel equationField5_3;
    private JPanel equationField5_4;
    private JPanel equationField5_5;
    private JPanel equationField5_6;
    private JPanel equationField5_7;
    private JPanel equationField5_8;
    private JPanel equationField5_9;
    private JPanel equationField6_1;
    private JPanel equationField6_2;
    private JPanel equationField6_3;
    private JPanel equationField6_4;
    private JPanel equationField6_5;
    private JPanel equationField6_6;
    private JPanel equationField6_7;
    private JPanel equationField6_8;
    private JPanel equationField6_9;
    private JPanel operationFields;
    private JPanel operationField1_1;
    private JPanel operationField1_2;
    private JPanel operationField1_3;
    private JPanel operationField1_4;
    private JPanel operationField1_5;
    private JPanel operationField1_6;
    private JPanel operationField1_7;
    private JPanel operationField1_8;
    private JPanel operationField1_9;
    private JPanel operationField2_1;

    private JPanel guessPanel;
    private JPanel deletePanel;
    private JPanel finishLaterPanel;
    private JLabel zeroLabel;
    private JLabel oneLabel;
    private JLabel twoLabel;
    private JLabel threeLabel;
    private JLabel fourLabel;
    private JLabel fiveLabel;
    private JLabel sixLabel;
    private JLabel sevenLabel;
    private JLabel eightLabel;
    private JLabel nineLabel;
    private JPanel operationField2_2;
    private JPanel operationField2_3;
    private JPanel operationField2_4;
    private JLabel plusLabel;
    private JLabel minusLabel;
    private JLabel multiplyLabel;
    private JLabel deleteLabel;
    private JLabel guessLabel;
    private JLabel finishLaterLabel;
    private JPanel operationField2_5;
    private JLabel divideLabel;
    private JLabel label1_1;
    private JLabel label1_2;
    private JLabel label1_3;
    private JPanel equalSignPanel;
    private JLabel equalSignLabel;
    private JLabel timerLabel;
    private JLabel selectedLabel;
    private int second = 0;

    private int guessCount = 0;
    private int selectedIndex = 0;
    private ArrayList<JPanel> rowOne;
    private ArrayList<JPanel> rowTwo;
    private ArrayList<JPanel> rowThree;
    private ArrayList<JPanel> rowFour;
    private ArrayList<JPanel> rowFive;
    private ArrayList<JPanel> rowSix;
    private ArrayList<ArrayList<JPanel>> rows;



    public GamePage() {
        setContentPane(contentPane);
        setModal(true);

        if (equation == null)
        {
            equation = EquationUtil.getEquationString();
            System.out.println("-----------------------------------");
            System.out.println(equation);
            System.out.println("-----------------------------------");
        }

        rows = new ArrayList<>();

        rowOne = new ArrayList<>();
        rowOne.add(equationField1_1);
        rowOne.add(equationField1_2);
        rowOne.add(equationField1_3);
        rowOne.add(equationField1_4);
        rowOne.add(equationField1_5);
        rowOne.add(equationField1_6);
        rowOne.add(equationField1_7);
        rowOne.add(equationField1_8);
        rowOne.add(equationField1_9);

        rowTwo = new ArrayList<>();
        rowTwo.add(equationField2_1);
        rowTwo.add(equationField2_2);
        rowTwo.add(equationField2_3);
        rowTwo.add(equationField2_4);
        rowTwo.add(equationField2_5);
        rowTwo.add(equationField2_6);
        rowTwo.add(equationField2_7);
        rowTwo.add(equationField2_8);
        rowTwo.add(equationField2_9);

        rowThree = new ArrayList<>();
        rowThree.add(equationField3_1);
        rowThree.add(equationField3_2);
        rowThree.add(equationField3_3);
        rowThree.add(equationField3_4);
        rowThree.add(equationField3_5);
        rowThree.add(equationField3_6);
        rowThree.add(equationField3_7);
        rowThree.add(equationField3_8);
        rowThree.add(equationField3_9);

        rowFour = new ArrayList<>();
        rowFour.add(equationField4_1);
        rowFour.add(equationField4_2);
        rowFour.add(equationField4_3);
        rowFour.add(equationField4_4);
        rowFour.add(equationField4_5);
        rowFour.add(equationField4_6);
        rowFour.add(equationField4_7);
        rowFour.add(equationField4_8);
        rowFour.add(equationField4_9);

        rowFive = new ArrayList<>();
        rowFive.add(equationField5_1);
        rowFive.add(equationField5_2);
        rowFive.add(equationField5_3);
        rowFive.add(equationField5_4);
        rowFive.add(equationField5_5);
        rowFive.add(equationField5_6);
        rowFive.add(equationField5_7);
        rowFive.add(equationField5_8);
        rowFive.add(equationField5_9);

        rowSix = new ArrayList<>();
        rowSix.add(equationField6_1);
        rowSix.add(equationField6_2);
        rowSix.add(equationField6_3);
        rowSix.add(equationField6_4);
        rowSix.add(equationField6_5);
        rowSix.add(equationField6_6);
        rowSix.add(equationField6_7);
        rowSix.add(equationField6_8);
        rowSix.add(equationField6_9);

        rows.add(rowOne);
        rows.add(rowTwo);
        rows.add(rowThree);
        rows.add(rowFour);
        rows.add(rowFive);
        rows.add(rowSix);

        for (ArrayList<JPanel> row : rows) {
            for (JPanel jPanel : row) {
                jPanel.setBackground(new Color(188,191,196));
                jPanel.setVisible(false);
//                ((JLabel)jPanel.getComponent(0)).setText(" ");
            }
            for (int i = 0; i < equation.length(); i++)
            {
                row.get(i).setBackground(new Color(255,255,245));
                row.get(i).setVisible(true);
            }
        }

        equationField1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_6.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField1_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 0;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField1_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });


        equationField2_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_6.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField2_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 1;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField2_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });

        equationField3_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_6.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField3_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 2;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField3_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });

        equationField4_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_6.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)

                    selectedLabel = (JLabel) equationField4_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField4_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 3;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField4_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });

        equationField5_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount){
                    selectedLabel = (JLabel) equationField5_6.getComponent(0);

                }

                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField5_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 4;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField5_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });

        equationField6_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_1.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_2.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_3.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_4.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_5.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_6.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_7.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_8.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        equationField6_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selectedIndex = 5;
                if (selectedIndex == guessCount)
                    selectedLabel = (JLabel) equationField6_9.getComponent(0);
                else
                    JOptionPane.showMessageDialog(null, "Bu bölümü seçemezsiniz");
            }
        });
        guessPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int idx  = 0;
                boolean isOK = true;

                while(isOK && idx < equation.length()) {
                    JLabel label = (JLabel)(rows.get(selectedIndex).get(idx++).getComponent(0));
                    if (label.getText().isEmpty())
                        isOK = false;
                }


                if (!isOK)
                    JOptionPane.showMessageDialog(null, "Lütfen bütün denklemi tamamlayıp öyle tahmin ediniz.");
                else // Should check the equation result
                {
                    idx = 0;
                    var selectedRow = rows.get(selectedIndex);
                    if (! new InputValidator().isValid(StringUtil.inputToString(selectedRow)))
                        JOptionPane.showMessageDialog(null, "Lütfen girdiğiniz denklemin doğruluğundan emin olun.");
                    else {
                        int correctCount = 0;
                        for (int i = 0; i < equation.length(); i++) {
                            JPanel iteratorPanel = selectedRow.get(i);
                            String equationChar =  "" + equation.charAt(idx++);
                            String inputChar = ((JLabel)iteratorPanel.getComponent(0)).getText();

                            System.out.println("----------");
                            System.out.println(equationChar);
                            System.out.println(inputChar);
                            System.out.println("----------");

                            if (equationChar.equals(inputChar))
                            {
                                iteratorPanel.setBackground(new Color(Color.GREEN.getRGB()));
                                correctCount++;
                            }

                            else {
                                if (equation.contains(inputChar))
                                    iteratorPanel.setBackground(new Color(Color.YELLOW.getRGB()));
                                else
                                    iteratorPanel.setBackground((new Color(Color.RED.getRGB())));
                            }
                        }
                        if (correctCount == equation.length()) {
                            WinPage winPage = new WinPage();
                            winPage.pack();
                            winPage.setTime(String.valueOf(second));
                            winPage.setVisible(true);
                            dispose();
                        }
                        else {
                            guessCount++;
                        }
                        if (guessCount >= 6)
                        {
                            LossPage lossPage = new LossPage();
                            lossPage.pack();
                            lossPage.setEquationString(equation);
                            lossPage.setVisible(true);
                            dispose();
                        }
                    }
                }

            }
        });

        zeroLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("0");
            }
        });
        oneLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("1");
            }
        });
        twoLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("2");
            }
        });
        threeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("3");
            }
        });
        fourLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("4");
            }
        });
        fiveLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("5");
            }
        });
        sixLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("6");
            }
        });
        sevenLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("7");
            }
        });
        eightLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("8");
            }
        });
        nineLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("9");
            }
        });
        plusLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("+");
            }
        });
        minusLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("-");
            }
        });
        multiplyLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("*");
            }
        });
        divideLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("/");
            }
        });
        deletePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null) {
                    selectedLabel.setText("");
                    JPanel selectedPanel = (JPanel) selectedLabel.getParent();
                    int idx = rows.get(selectedIndex).indexOf(selectedPanel) - 1;
                    if (idx >= 0)
                        selectedLabel = (JLabel) rows.get(selectedIndex).get(idx).getComponent(0);
                }
            }
        });
        equalSignPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (selectedLabel != null)
                    selectedLabel.setText("=");
            }
        });

        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (second == 0) {
                    var timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            timerLabel.setText(String.valueOf(second));
                            ++second;
                        }
                    });
                    timer.start();
                }
            }
        };
        equationField1_1.addMouseListener(listener);
        equationField1_2.addMouseListener(listener);
        equationField1_3.addMouseListener(listener);
        equationField1_4.addMouseListener(listener);
        equationField1_5.addMouseListener(listener);
        equationField1_6.addMouseListener(listener);
        equationField1_7.addMouseListener(listener);
        equationField1_8.addMouseListener(listener);
        equationField1_9.addMouseListener(listener);
        equationField2_1.addMouseListener(listener);
        equationField2_2.addMouseListener(listener);
        equationField2_3.addMouseListener(listener);
        equationField2_4.addMouseListener(listener);
        equationField2_5.addMouseListener(listener);
        equationField2_6.addMouseListener(listener);
        equationField2_7.addMouseListener(listener);
        equationField2_8.addMouseListener(listener);
        equationField2_9.addMouseListener(listener);
        equationField3_1.addMouseListener(listener);
        equationField3_2.addMouseListener(listener);
        equationField3_3.addMouseListener(listener);
        equationField3_4.addMouseListener(listener);
        equationField3_5.addMouseListener(listener);
        equationField3_6.addMouseListener(listener);
        equationField3_7.addMouseListener(listener);
        equationField3_8.addMouseListener(listener);
        equationField3_9.addMouseListener(listener);
        equationField4_1.addMouseListener(listener);
        equationField4_2.addMouseListener(listener);
        equationField4_3.addMouseListener(listener);
        equationField4_4.addMouseListener(listener);
        equationField4_5.addMouseListener(listener);
        equationField4_6.addMouseListener(listener);
        equationField4_7.addMouseListener(listener);
        equationField4_8.addMouseListener(listener);
        equationField4_9.addMouseListener(listener);
        equationField5_1.addMouseListener(listener);
        equationField5_2.addMouseListener(listener);
        equationField5_3.addMouseListener(listener);
        equationField5_4.addMouseListener(listener);
        equationField5_5.addMouseListener(listener);
        equationField5_6.addMouseListener(listener);
        equationField5_7.addMouseListener(listener);
        equationField5_8.addMouseListener(listener);
        equationField5_9.addMouseListener(listener);
        equationField6_1.addMouseListener(listener);
        equationField6_2.addMouseListener(listener);
        equationField6_3.addMouseListener(listener);
        equationField6_4.addMouseListener(listener);
        equationField6_5.addMouseListener(listener);
        equationField6_6.addMouseListener(listener);
        equationField6_7.addMouseListener(listener);
        equationField6_8.addMouseListener(listener);
        equationField6_9.addMouseListener(listener);

        finishLaterPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream("lastGame.ser"));

                    SaveInfos saveInfos = new SaveInfos(
                            StringUtil.arrayListToString(rowOne),
                            StringUtil.arrayListToString(rowTwo),
                            StringUtil.arrayListToString(rowThree),
                            StringUtil.arrayListToString(rowFive),
                            StringUtil.arrayListToString(rowFive),
                            StringUtil.arrayListToString(rowSix),
                            equation, second, guessCount
                    );
                    objectOutputStream.writeObject(saveInfos);
                    objectOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    throw new RuntimeException(ex);
                }
                dispose();
                MainPage mainPage = new MainPage();
                mainPage.pack();
                mainPage.setVisible(true);
            }
        });
    }
    public void initFromSave(SaveInfos saveInfos) {
        equation = saveInfos.getEquation();
        System.out.println(equation);
        second = saveInfos.getSecond();
        guessCount = saveInfos.getGuessCount();
        int idx = 0;
        for (ArrayList<JPanel> row : rows) {
            for (int i = 0; i < equation.length(); i++)
                ((JLabel) row.get(i).getComponent(0)).setText((saveInfos.getRows().get(idx).charAt(i) + "").trim());
            idx++;
        }
        for (ArrayList<JPanel> row : rows) {
            for (JPanel jPanel : row) {
                jPanel.setBackground(new Color(188,191,196));
                jPanel.setVisible(false);
            }
            for (int i = 0; i < equation.length(); i++)
            {
                row.get(i).setBackground(new Color(255,255,245));
                row.get(i).setVisible(true);
            }
        }
    }


    public static void main(String[] args) {
        GamePage dialog = new GamePage();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
