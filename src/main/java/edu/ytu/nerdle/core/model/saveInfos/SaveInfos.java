package edu.ytu.nerdle.core.model.saveInfos;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class SaveInfos implements Serializable {
    private final ArrayList<String> rows;
    private final ArrayList<ArrayList<Color>> colorMatrix;

    private final String equation;
    private final int second;
    private final int guessCount;

    public SaveInfos(ArrayList<ArrayList<Color>> colorMatrix, String rowOne, String rowTwo, String rowThree, String rowFour, String rowFive, String rowSix, String equation, int second, int guessCount) {
        rows = new ArrayList<>();
        this.colorMatrix = colorMatrix;
        rows.add(rowOne);
        rows.add(rowTwo);
        rows.add(rowThree);
        rows.add(rowFour);
        rows.add(rowFive);
        rows.add(rowSix);
        this.equation = equation;
        this.second = second;
        this.guessCount = guessCount;
    }

    public ArrayList<String> getRows() {
        return rows;
    }

    public ArrayList<ArrayList<Color>> getColorMatrix() {
        return colorMatrix;
    }

    public int getSecond() {
        return second;
    }

    public int getGuessCount() {
        return guessCount;
    }

    public String getEquation() {
        return equation;
    }
}
