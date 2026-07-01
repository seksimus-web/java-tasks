package com.seksimus.basicjava.module2;

import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию
 * массива чисел в один отсортированный в том же порядке
 * массив. Массивы могут быть любой длины, в том числе нулевой.
 *
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
                result[k] = a1[i]; // result[k++] = a1[i++];
                k++;
                i++;
            } else {
                result[k] = a2[j];
                k++;
                j++;
            }
        }

        while (i < a1.length) {
            result[k] = a1[i];
            k++;
            i++;
        }

        while (j < a2.length) {
            result[k] = a2[j];
            k++;
            j++;
        }

        return result;
    }
}