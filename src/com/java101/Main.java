package com.java101;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        int number = input.nextInt();

        boolean result = isPrime(number, 2);

        System.out.print("Number " + number + " is " + (result ? "prime number" : "not prime number"));
    }
}
