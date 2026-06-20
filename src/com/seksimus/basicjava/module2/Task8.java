package com.seksimus.basicjava.module2;

import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 */
public class Task8 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {

            // result = result * i
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}