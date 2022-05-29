package edu.ytu.nerdle.core.util.validation;

public interface IValidator {
    boolean isValid(String equationString);
    boolean isRightFormatted(String equationString);
    boolean isResultCorrect(String equationString);
}
