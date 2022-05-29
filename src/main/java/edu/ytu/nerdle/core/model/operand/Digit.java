package edu.ytu.nerdle.core.model.operand;

import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;

import java.util.Random;

public class Digit implements IEquationSubject {
    private int digit;

    public void setDigit(int digit) {
        this.digit = digit;
    }

    private final static int[] digits = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Digit() {
        digit = digits[new Random().nextInt(10)];
    }

    public int getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "" + digit;
    }
}
