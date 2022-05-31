package edu.ytu.nerdle.core.util.equation;

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
    private ArrayList<Digit> operand1;
    private ArrayList<Digit> operand2;
    private ArrayList<Digit> operand3;

    public GenerateEquation() {
        equation = new ArrayList<>();

        options= new ArrayList<>(4);

        positions = new ArrayList<>(2);
        operators = new ArrayList<>(2);

        operand1 = new ArrayList<>(3);
        operand2 = new ArrayList<>(3);
        operand3 = new ArrayList<>(3);

        initPosAndOperators();
        initOptions();

        initDigits();
        equation.addAll(operand1);
        equation.add(operators.get(0));
        equation.addAll(operand2);
        if (positions.size() == 2) {
            equation.add(operators.get(1));
            equation.addAll(operand3);
        }
    }

    public ArrayList<IEquationSubject> getEquation() {
        return equation;
    }

    private void initDigits() {
        if (positions.size() == 1) {
            for (int i = 0; i < positions.get(0); i++)
                operand1.add(options.get(i));
            for (int i = 0; i < options.size() - positions.get(0); i++)
                operand2.add(options.get(i + positions.get(0)));
        }
        else {
            for (int i = 0; i < positions.get(0); i++)
                operand1.add(options.get(i));
            for (int i = 0; i < positions.get(1) - positions.get(0); i++)
                operand2.add(options.get(i + positions.get(0)));
            for (int i = 0; i < options.size() - positions.get(1); i++)
                operand3.add(options.get(i + positions.get(1)));
        }

        if (operand1.size() > 1 && operand1.get(0).getDigit() == 0)
        {
            Digit tmp = operand1.get(0);
            operand1.set(0, operand1.get(1));
            operand1.set(1, tmp);
        }
        if (operand2.size() > 1 && operand2.get(0).getDigit() == 0)
        {
            Digit tmp = operand2.get(0);
            operand2.set(0, operand2.get(1));
            operand2.set(1, tmp);
        }
        if (positions.size() == 2 && operand3.size() > 1 && operand3.get(0).getDigit() == 0)
        {
            Digit tmp = operand1.get(0);
            operand3.set(0, operand3.get(1));
            operand3.set(1, tmp);
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
}
