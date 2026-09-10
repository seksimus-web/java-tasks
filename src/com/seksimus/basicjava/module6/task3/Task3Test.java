package com.seksimus.basicjava.module6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Scanner numbersScanner = new Scanner(input);

        List<Integer> numbers = new ArrayList<>();

        int position = 0;

        while (numbersScanner.hasNextInt()) {
            int number = numbersScanner.nextInt();

            if (position % 2 != 0) {
                numbers.add(number);
            }

            position++;
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}

