package com.seksimus.basicjava.module6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Напишите программу, которая прочитает из System.in последовательность целых чисел,
 * разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях,
 * и затем выведет получившуюся последовательность в обратном порядке в System.out.
 *
 * Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 */

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int position = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (position % 2 != 0) {
                numbers.add(number);
            }

            position++;
        }

        System.out.println("Результат:");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
