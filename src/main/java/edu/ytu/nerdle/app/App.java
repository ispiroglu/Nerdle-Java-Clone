package edu.ytu.nerdle.app;


import edu.ytu.nerdle.frontend.mainPage.MainPage;

public class App {
    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        mainPage.loadStats();
        mainPage.pack();
        mainPage.setVisible(true);
    }
}
