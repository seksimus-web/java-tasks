package com.seksimus.basicjava.module2;

import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 */
public class Task8 {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
//public static BigInteger factorial(int value) {
//
//    BigInteger result = BigInteger.ONE;
//
//    for (int i = 1; i <= value; i++) {
//        result = result.multiply(BigInteger.valueOf(i));
//    }
//
//    return result;
//}
//}