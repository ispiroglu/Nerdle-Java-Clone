package edu.ytu.nerdle.app;


import edu.ytu.nerdle.core.util.equation.EquationUtil;
import edu.ytu.nerdle.frontend.mainPage.MainPage;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        mainPage.loadStats();
        mainPage.pack();
        mainPage.setVisible(true);
    }
}
