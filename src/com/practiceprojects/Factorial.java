package com.practiceprojects;

import java.math.BigInteger;

public class Factorial {
    private int n;
    private BigInteger accumulator;
    private int counter;

    public Factorial(int n) {
        setN(n);
        setAccumulator(n);
        setCounter(n);
    }

    public BigInteger getFactorial(){
        if (n == 0)
            return BigInteger.valueOf(1);

        calculateFactorial();
        return accumulator;
    }

    private void calculateFactorial() {
        if (counter > 0) {
            accumulator = accumulator.multiply(BigInteger.valueOf(counter));
            counter--;
            calculateFactorial();
        }
    }

    private void setN(int n) {
        inputValidator(n);
        this.n = n;
    }

    private void setCounter(int n) {
        if (n > 0)
            counter = n - 1;
    }

    private void setAccumulator(int n) {
        accumulator = BigInteger.valueOf(n);
    }

    private void inputValidator(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Input n cannot be negative.");
    }
}
