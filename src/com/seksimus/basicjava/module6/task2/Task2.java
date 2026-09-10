package com.seksimus.basicjava.module6.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств.
 * Метод должен возвращать результат в виде нового множества.
 * Изменять переданные в него множества не допускается.
 * Пример:
 * Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */


public class Task2 {

    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(0, 1, 2);

        Set<Integer> result = symmetricDifference(set1, set2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(result);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> result = new HashSet<>(set1);

        for (T element : set2) {
            if (!result.add(element)) {
                result.remove(element);
            }
        }
        return result;
    }
}

