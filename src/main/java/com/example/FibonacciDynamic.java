package com.example;

public class FibonacciDynamic {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fibArray = new int[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number is: " + fibonacci(n));
    }
}
