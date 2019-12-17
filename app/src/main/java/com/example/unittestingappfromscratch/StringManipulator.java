package com.example.unittestingappfromscratch;

public class StringManipulator {

    private static StringManipulator stringManipulator;

    private StringManipulator() {
    }

    public static StringManipulator getInstance() {
        if (stringManipulator == null) {
            stringManipulator = new StringManipulator();
        }
        return stringManipulator;
    }
}
