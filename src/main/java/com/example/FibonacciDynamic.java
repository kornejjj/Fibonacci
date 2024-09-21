package com.example;

public class FibonacciDynamic {

    // Функція для обчислення n-го числа Фібоначчі за принципом динамічного програмування
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // O(1)
        }

        int[] fibArray = new int[n + 1]; // O(n) - масив
        fibArray[0] = 0;
        fibArray[1] = 1;

        // O(n) - цикл проходить n-1 разів
        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2]; // Операція O(1)
        }
        return fibArray[n]; // O(1)
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number is: " + fibonacci(n));
    }
}
