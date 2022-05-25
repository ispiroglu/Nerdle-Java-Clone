package edu.ytu.nerdle.core.model.operation;

import edu.ytu.nerdle.core.model.equationSubject.IEquationSubject;

import java.util.Random;

public class Operator implements IEquationSubject {
    private final char operation;
    private final static char[]operations = new char[]{'*', '/', '+', '-'};

    public Operator() {
        operation = operations[new Random().nextInt(4)];
    }

    public char getOperation() {
        return operation;
    }
}
