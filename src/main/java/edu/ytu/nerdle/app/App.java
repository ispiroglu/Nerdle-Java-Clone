package edu.ytu.nerdle.app;

import edu.ytu.nerdle.core.model.equation.Equation;
import edu.ytu.nerdle.core.util.equation.EquationUtil;
import edu.ytu.nerdle.frontend.firstPage.FirstPage;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        //System.out.println(EquationUtil.infixToPrefix("A*B+C/D".toCharArray()));
        System.out.println(EquationUtil.infixToPrefix(
                EquationUtil.generateEquation().toCharArray()
        ));
        //Equation equation = new Equation(new Random().nextInt(2) + 7);
    }
}
