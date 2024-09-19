package com.example;

public class FibonacciIterative {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 0;

        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number is: " + fibonacci(n));
    }
}
