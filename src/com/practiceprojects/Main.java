package com.practiceprojects;

public class Main {

    public static void main(String[] args) {
        //testFibonacci();
        //testPalindrome();
    }

    private static void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        System.out.println("Palindrome");
        System.out.println(palindrome.isPalindrome("wow"));
        System.out.println(palindrome.isPalindrome("madam"));
        System.out.println(palindrome.isPalindrome("miguel"));
        System.out.println(palindrome.isPalindrome("kayak"));
        System.out.println(palindrome.isPalindrome("racecar"));
        System.out.println("\n" + "*".repeat(5) + "\n");
    }

    private static void testFibonacci() {
        Fibonacci fib = new Fibonacci(10);
        System.out.println("Fibonacci Sequence");
        fib.print();
        System.out.println("\n" + "*".repeat(5) + "\n");
    }
}
