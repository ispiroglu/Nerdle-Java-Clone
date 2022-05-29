package edu.ytu.nerdle.core.util.validation.inputValidator;

import edu.ytu.nerdle.core.util.equation.EquationUtil;
import edu.ytu.nerdle.core.util.equation.EvaluateString;
import edu.ytu.nerdle.core.util.validation.IValidator;

public class InputValidator implements IValidator {
    @Override
    public boolean isValid(String equationString) {
        return isRightFormatted(equationString) && isResultCorrect(equationString);
    }

    @Override
    public boolean isRightFormatted(String equationString) {
        int idx = equationString.indexOf("=");
        char c;
        while (++idx < equationString.length())
        {
            c = equationString.charAt(idx);
            if (c == '+' ||
                    c == '-' ||
                    c == '*' ||
                    c == '/' ||
                    c == '='
            ) {
                System.out.println("1");
                return false;
            }
        }

        idx = 0;
        c = equationString.charAt(idx);
        if (    c == '+' ||
                c == '-' ||
                c == '*' ||
                c == '/' ||
                c == '='
        ) {
            System.out.println("2");
            return false;
        }

        idx = equationString.length() - 1;
        c = equationString.charAt(idx);
        if (c == '+' ||
                c == '-' ||
                c == '*' ||
                c == '/' ||
                c == '='
        ) {
            System.out.println("3");
            return false;
        }

        idx = 0;
        boolean isOperator = false;
        while (idx < equationString.length()) {
            c = equationString.charAt(idx);
            if (isOperator(c) && isOperator)
            {
                System.out.println("4");
                return false;
            }

            if (isOperator(c) && !isOperator)
                isOperator = true;
            if (!isOperator(c))
                isOperator = false;
            idx++;
        }
        return true;
    }

    @Override
    public boolean isResultCorrect(String equationString) {
        int idx = equationString.indexOf("=");
        System.out.println("idx = " + idx);
        String str = "";
        int count = 0;

        for (int i = 0; i < idx + 1; i++) {
            char c = equationString.charAt(i);
            if (isOperator(c))
                str += " " + c + " ";
            else
                str += c;
            count++;
        }

        String strResult = "";
        for (int i = idx + 1; i < equationString.length(); i++)
            strResult += equationString.charAt(i);


        System.out.println("-----------------------------------");

        str = str.trim();
        System.out.println(str);
        System.out.println(strResult);

        System.out.println("-----------------------------------");


        return EvaluateString.evaluate(str) == Integer.parseInt(strResult);
    }

    private static boolean isOperator(char c) {
        return c == '+' ||
                c == '-' ||
                c == '*' ||
                c == '/' ||
                c == '=';
    }

}
