package com.company;

public class Checker {

    public static MathOperation defineMathOperation(String s) throws MyException {
        if (s.contains("+")) {
            return MathOperation.ADD;
        } else if (s.contains("-")) {
            return MathOperation.SUBTRACT;
        } else if (s.contains("*")) {
            return MathOperation.MULTIPLY;
        } else if (s.contains("/")) {
            return MathOperation.DIVIDE;
        } else {
            throw new MyException("Сalculator cannot work with this sign! " +
                    "  '+, -, *, /' print these sign! ");
        }
    }

    public static boolean isDigit(String s) {
        try {
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean limit(int a) throws MyException {
        if (a < 1 || a > 10) {
            throw new MyException("Calculator works with numbers from 1 to 10! ");
        }
        return false;
    }
}


