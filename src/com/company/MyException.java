package com.company;


    public class MyException extends Exception {

        public MyException() {
            System.out.println("Incorrect operation: ");
        }

        public MyException(String message) {
            this();
            System.out.println(message);

        }
    }