package com.practiceprojects;

public class Fibonacci {
    private int limit;
    private int n1 = 0, n2 = 1, n3 = 0;
    private int iterCount;
    private int[] results;

    public Fibonacci(int limit) {
        this.limit = limit;
        results = new int[limit];
    }

    private void calculateFibonaci() {
        while (limit > 0) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            results[iterCount++] = n3;
            limit--;
        }
    }

    private void calculateFibonacciRecursive(){
        if(limit > 0){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            results[iterCount++] = n3;
            limit--;
            calculateFibonacciRecursive();
        }
    }

    public void print() {
        calculateFibonacciRecursive();
        System.out.print("0->1");
        for (int item: results)
            System.out.print("->" + item);
    }
}
