package com.seksimus.basicjava.module2;

import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке
 * массив. Массивы могут быть любой длины, в том числе нулевой.
 *
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и
 * сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort()
 * уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая
 * система.
 *
 * Пример
 *
 * Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив (0, 1, 2, 2, 3}
 */
public class Task9 {

    public static void main(String[] args) {

        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};

        int[] result = mergeArrays(a1, a2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] result = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a1.length && j < a2.length) {

            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        while (j < a2.length) {
            result[k++] = a2[j++];
        }

        return result;
    }
}