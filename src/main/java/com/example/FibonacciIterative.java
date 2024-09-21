package com.example;

public class FibonacciIterative {

    // Функція для обчислення n-го числа Фібоначчі ітераційно
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // O(1), O(1)
        }
        int fib = 1;
        int prevFib = 0;

        // O(n) - цикл проходить n-1 разів
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib = fib + prevFib; // Операція O(1)
            prevFib = temp;      // Операція O(1)
        }
        return fib; // O(1)
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number is: " + fibonacci(n));
    }
}


