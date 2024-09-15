package com.practice;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        String result = isPrime(number) ? number + " is a prime number" : number + " not a prime number";
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;

        return true;
    }
}
