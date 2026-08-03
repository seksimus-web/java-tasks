package com.seksimus.basicjava.module5;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        while (scanner.hasNext()) {
            String token = scanner.next();

            try {
                double number = Double.parseDouble(token);
                sum += number;

            } catch (NumberFormatException e) {

            }
        }
        System.out.printf(Locale.US, "%.6f", sum);
    }
}
