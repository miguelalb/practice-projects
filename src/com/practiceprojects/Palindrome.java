package com.practiceprojects;

import java.util.Locale;

public class Palindrome {
    private int forwardRunner;
    private int backwardRunner;
    private char[] values;

    public boolean isPalindrome(String input) {
        return compareByReverse(input);
    }

    private boolean compareByReverse(String input) {
        String b = "";
        for (int i = input.length() - 1; i >= 0; i--)
            b = b + input.charAt(i);

        if (b.equalsIgnoreCase(input))
            return true;
        return false;
    }

    private boolean compareByLetter(String input){
        values = input.toLowerCase().toCharArray();
        forwardRunner = 0;
        backwardRunner = values.length - 1;

        if (forwardRunner == backwardRunner)
            return true;

        for (int i = 0; i < values.length; i++)
            if (values[forwardRunner++] != values[backwardRunner--])
                return false;
        return true;
    }

}
