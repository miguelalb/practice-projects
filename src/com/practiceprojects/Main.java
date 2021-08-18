package com.practiceprojects;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //testFibonacci();
        //testPalindrome();
        testFactorial();
    }

    private static void testFactorial() {
        int n = 6;
        while (n >= 0) {
            var factorial = new Factorial(n);
            System.out.println("The factorial of " + n + " is: " + factorial.getFactorial());
            n--;
        }
    }

    private static void testPalindrome() {
        var palindrome = new Palindrome();
        System.out.println("Palindrome");
        System.out.println(palindrome.isPalindrome("wow"));
        System.out.println(palindrome.isPalindrome("madam"));
        System.out.println(palindrome.isPalindrome("miguel"));
        System.out.println(palindrome.isPalindrome("kayak"));
        System.out.println(palindrome.isPalindrome("racecar"));
        System.out.println("\n" + "*".repeat(5) + "\n");
    }

    private static void testFibonacci() {
        var fib = new Fibonacci(10);
        System.out.println("Fibonacci Sequence");
        fib.print();
        System.out.println("\n" + "*".repeat(5) + "\n");
    }
}
