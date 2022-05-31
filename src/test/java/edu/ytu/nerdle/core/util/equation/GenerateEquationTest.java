package edu.ytu.nerdle.core.util.equation;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateEquationTest {

    @RepeatedTest(10000)
    @Test
    public void lentgthTest() {
        String equation = EquationUtil.getEquationString();
        boolean isRightLength = true;
        if (equation.length() > 9 || equation.length() < 7)
            isRightLength = false;
        assertTrue(isRightLength);
    }

    @Test
    public void equalSignTest() {
        String equation = EquationUtil.getEquationString();
        int count = 0;
        for (char c : equation.toCharArray()) {
            if (c == '=')
                count++;
        }
        assertEquals(1, count);
    }
    @Test
    public void minOneOperatorTest() {
        String equation = EquationUtil.getEquationString();
        boolean hasOperator = false;
        for (char c : equation.toCharArray()) {
            if (c == '+' ||
            c == '-' ||
            c == '*' ||
            c == '/')
                hasOperator = true;
        }
        assertTrue(hasOperator);
    }
    @Test
    public void hasPredenceTest() {
        boolean hasPredence = EvaluateString.hasPrecedence('*', '-');
        assertFalse(hasPredence);
    }
}