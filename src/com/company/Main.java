package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws MyException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = bufferedReader.readLine();
        String input = userInput.replaceAll(" ", "");
        String[] array = input.split("[-+*/]");
        int a = 0;
        int b = 0;
        boolean isRoman = false;
        int result = 0;
        if (Checker.isDigit(array[0]) && Checker.isDigit(array[1])) {
            a = Integer.parseInt(array[0]);
            b = Integer.parseInt(array[1]);
            if (Checker.limit(a) || Checker.limit(b)) {
                throw new MyException();
            }
        } else if (RomanNumeral.isRoman(array[0]) && RomanNumeral.isRoman(array[1])) {
            isRoman = true;
            a = RomanNumeral.romanToDecimal(array[0]);
            b = RomanNumeral.romanToDecimal(array[1]);
            if (Checker.limit(a) || Checker.limit(b)) {
                throw new MyException();
            }
        } else {
            throw new MyException("Display two numbers of the same type  ( 2 + 2  or II + II )");
        }
        switch (Checker.defineMathOperation(input)) {
            case ADD -> result = Calculate.add(a, b);
            case SUBTRACT -> result = Calculate.subtract(a, b);
            case MULTIPLY -> result = Calculate.multiply(a, b);
            case DIVIDE -> result = Calculate.divide(a, b);
        }
        if (isRoman) {
            System.out.println(RomanNumeral.decimalToRoman(result));
        } else {
            System.out.println(result);
        }
    }
}
