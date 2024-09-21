package com.example;

public class FibonacciRecursive {

    // Функція для обчислення n-го числа Фібоначчі рекурсивно
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // O(1)
        }
        // O(2^n) - через повторювані обчислення
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number is: " + fibonacci(n));
    }
}

