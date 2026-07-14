package com.seksimus.basicjava.module4;

/**
 * Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче
 * отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException с сообщением "Expected
 * non-negative number, got ?", где вместо вопросика будет подставлено фактически переданное в метод число.
 */
public class Task1 {

    //если число нормальное (0 или больше) → вернуть квадратный корень;
    //если число отрицательное → не возвращать ничего, а выбросить исключение.

    public static void main(String[] args) {

        double result = sqrt(-9);
        System.out.println(result);

    }

    public static double sqrt(double x) {

        if (x >= 0) {
            return Math.sqrt(x);
        }

        throw new IllegalArgumentException("Expected non-negative number, got " + x);
    }
}

