package edu.ytu.nerdle.core.util.equation;

import edu.ytu.nerdle.core.model.equation.Equation;
import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;
import edu.ytu.nerdle.core.model.operand.Digit;

public class EquationUtil {
    static String isValidEquation(Equation equation) {
        String equationString = "";
        for (IEquationSubject equationSubject : equation.getEquation()) {
            if (equationSubject.getClass() == Digit.class)
                equationString += equationSubject;
            else
                equationString += " " + equationSubject + " ";
        }
        equationString = equationString.trim();
        int result = EvaluateString.evaluate(equationString);

        if (result < 0)
            return null;

        equationString = equationString.replaceAll("\\s", "");
        equationString += "=";
        equationString += result;

        if (equationString.length() < 7 || equationString.length() > 9)
            return null;
        return  equationString;
    }
    public static String getEquationString() {
        String equationString;
        do {
            try {
                equationString = EquationUtil.isValidEquation(
                        new Equation(new GenerateEquation().getEquation())
                );
            }catch (UnsupportedOperationException e) {
                equationString = null;
            }
        }
        while (equationString == null) ;
        return equationString;
    }

}
