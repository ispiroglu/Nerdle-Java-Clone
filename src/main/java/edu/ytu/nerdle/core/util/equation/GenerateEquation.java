package edu.ytu.nerdle.core.util.equation;

import edu.ytu.nerdle.core.model.equation.Equation;
import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;
import edu.ytu.nerdle.core.model.operand.Digit;
import edu.ytu.nerdle.core.model.operation.Operator;

import java.util.ArrayList;
import java.util.Random;

public class GenerateEquation {
    private ArrayList<IEquationSubject> equation;
    private ArrayList<Digit> options;
    private ArrayList<Operator> operators;
    private ArrayList<Integer> positions;
    private ArrayList<Digit> digit1;
    private ArrayList<Digit> digit2;
    private ArrayList<Digit> digit3;

    public GenerateEquation() {
        equation = new ArrayList<>();

        options= new ArrayList<>(4);

        positions = new ArrayList<>(2);
        operators = new ArrayList<>(2);

        digit1 = new ArrayList<>(3);
        digit2 = new ArrayList<>(3);
        digit3 = new ArrayList<>(3);

        initPosAndOperators();
        initOptions();


        System.out.println("Su ana kadar eldekiler..");
        System.out.println("Options");
        for (Digit option : options)
            System.out.print(option);
        System.out.println();
        System.out.println("Operators");
        for (Operator operator : operators)
            System.out.print(operator);
        System.out.println();
        System.out.println("Positions");
        for (Integer position : positions) {
            System.out.println(position);
        }

        initDigits();

        System.out.println("DIGITS");
        System.out.println(digit1.toString());
        System.out.println(digit2.toString());
        System.out.println(digit3.toString());

        equation.addAll(digit1);
        equation.add(operators.get(0));
        equation.addAll(digit2);
        if (positions.size() == 2) {
            equation.add(operators.get(1));
            equation.addAll(digit3);
        }

        System.out.println("EQUATION");
        System.out.println(equation);

    }

    public ArrayList<IEquationSubject> getEquation() {
        return equation;
    }

    private void initDigits() {
        if (positions.size() == 1) {
            for (int i = 0; i < positions.get(0); i++)
                digit1.add(options.get(i));
            for (int i = 0; i < options.size() - positions.get(0); i++)
                digit2.add(options.get(i + positions.get(0)));
        }
        else {
            for (int i = 0; i < positions.get(0); i++)
                digit1.add(options.get(i));
            for (int i = 0; i < positions.get(1) - positions.get(0); i++)
                digit2.add(options.get(i + positions.get(0)));
            for (int i = 0; i < options.size() - positions.get(1); i++)
                digit3.add(options.get(i + positions.get(1)));
        }

        if (digit1.size() > 1 && digit1.get(0).getDigit() == 0)
        {
            Digit tmp = digit1.get(0);
            digit1.set(0, digit1.get(1));
            digit1.set(1, tmp);
        }
        if (digit2.size() > 1 && digit2.get(0).getDigit() == 0)
        {
            Digit tmp = digit2.get(0);
            digit2.set(0, digit2.get(1));
            digit2.set(1, tmp);
        }
        if (positions.size() == 2 && digit3.size() > 1 && digit3.get(0).getDigit() == 0)
        {
            Digit tmp = digit1.get(0);
            digit3.set(0, digit3.get(1));
            digit3.set(1, tmp);
        }
    }
    private void initOptions() {
        options.add(new Digit());
        options.add(new Digit());
        options.add(new Digit());
        options.add(new Digit());
    }

    private void initPosAndOperators() {
        Random random = new Random();

        int operatorCount = random.nextInt(2) + 1;
        for (int i = 0; i < operatorCount; i++) {
            operators.add(new Operator());
            Integer pos = random.nextInt(3) + 1;
            while(positions.contains(pos))
                pos = random.nextInt(3) + 1;
            positions.add(pos);
        }

        if (positions.size() == 2 && positions.get(0) > positions.get(1)) {
            int tmp = positions.get(0);
            positions.set(0, positions.get(1));
            positions.set(1, tmp);
        }
    }

    public static void main(String[] args) {
        Equation equation = new Equation(new GenerateEquation().getEquation());
        System.out.println("Islem ");
        String equationString = "";
        for (IEquationSubject equationSubject : equation.getEquation()) {
            if (equationSubject.getClass() == Digit.class)
                equationString += equationSubject;
            else
                equationString += " " + equationSubject + " ";
        }
        equationString = equationString.trim();
        System.out.println(equationString);
        System.out.println(EvaluateString.evaluate(equationString)
);
    }
}
