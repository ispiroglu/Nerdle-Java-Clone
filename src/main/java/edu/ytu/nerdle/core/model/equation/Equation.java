package edu.ytu.nerdle.core.model.equation;

import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;
import edu.ytu.nerdle.core.util.equation.EquationUtil;

import java.util.ArrayList;

public class Equation {
    private ArrayList<IEquationSubject> equation;

    public Equation(ArrayList<IEquationSubject> equation) {
        this.equation = equation;
    }

    public ArrayList<IEquationSubject> getEquation() {
        return equation;
    }

}
