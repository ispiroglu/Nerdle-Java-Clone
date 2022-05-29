package edu.ytu.nerdle.core.model.equation;

import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;

import java.util.ArrayList;

public class Equation {
    private ArrayList<IEquationSubject> equation;
    private String equationString;

    public String getEquationString() {
        return equationString;
    }

    public void setEquationString(String equationString) {
        this.equationString = equationString;
    }

    public Equation(ArrayList<IEquationSubject> equation) {
        this.equation = equation;
    }

    public ArrayList<IEquationSubject> getEquation() {
        return equation;
    }

}
