package com.example.unittestingappfromscratch;

public class StringManipulator {

    private static StringManipulator instance;

    private StringManipulator() {
    }

    public static StringManipulator getInstance() {
        if (instance == null) {
            instance = new StringManipulator();
        }
        return instance;
    }

    public boolean isLessThan10(String input) {
        if (input == null || input.equals("")) {
            return true;
        }
        return input.length() < 10;
    }

    public boolean isOddLength(String input) {
        if (input == null) {
            return false;
        }
        return input.length() % 2 != 0;
    }

    public String zipperWords(String first, String second) {
        if (first == null || second == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i <= first.length() && j < second.length()) {
            if (i == first.length() - 1) {
                sb.append(first.charAt(i));
                sb.append(second.substring(j));
                return sb.toString();
            } else if (j == second.length() - 1) {
                sb.append(first.charAt(j));
                sb.append(second.substring(i));
                return sb.toString();
            }
            sb.append(first.charAt(i++));
            sb.append(second.charAt(j++));
        }
        return sb.toString();
    }


}
