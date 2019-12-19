package com.example.unittestingappfromscratch;

import java.util.HashSet;
import java.util.Set;

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
                sb.append(first.substring(i));
                sb.append(second.substring(j));
                return sb.toString();
            } else if (j == second.length() - 1) {
                sb.append(second.substring(j));
                sb.append(first.substring(i));
                return sb.toString();
            }
            sb.append(first.charAt(i++));
            sb.append(second.charAt(j++));
        }
        return sb.toString();
    }

    public String deconstructedWord(String word) {
        if (word == null) return "";
         Set<Character> vowelsSet = new HashSet<Character>() {{
            add('a'); add('e'); add('i'); add('o'); add('u');
        }};
         StringBuilder cons = new StringBuilder();
         StringBuilder vows = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (vowelsSet.contains(word.charAt(i))) {
                vows.append(word.charAt(i));
            } else {
                cons.append(word.charAt(i));
            }
        }
        return (cons + " " + vows).trim();
    }

    public int wordSum(String first, String second) {
        return first.length() + second.length();
    }


}
