package com.seksimus.basicjava.module2;

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 *
 * Решать можно разными способами:
 *
 * • воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * · применив пару трюков из двоичной арифметики;
 * · написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра
 * соответствующих уроков).
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая
 * система.
 */
public class Task6 {

    public static void main(String[] args) {

        boolean result = isPowerOfTwo(-9);

        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int value) {

        if (value < 0) {
            value = -(value);
        }

        if (value == 0) {
            return false;
        }
        while (value % 2 == 0) {
            value = value / 2;
        }

        return value == 1;
    }
}
        //        int number = Math.abs(value);
//
//        if (number == 0) {
//            return false;
//        }
//
//        while (number % 2 == 0) {
//            number = number / 2;
//        }
//
//        return number == 1;
//    }
//}
