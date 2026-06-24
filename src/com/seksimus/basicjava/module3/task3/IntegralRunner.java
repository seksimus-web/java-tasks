package com.seksimus.basicjava.module3.task3;

import java.util.function.DoubleUnaryOperator;

public class IntegralRunner {

    /**
     * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых
     * прямоугольников.
     *
     * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод applyAsDouble() принимает
     * значение аргумента и возвращает значение функции в заданной точке.
     *
     * Интервал интегрирования задается его конечными точками а и b, причем а <= b. Для получения достаточно точного результата
     * используйте шаг сетки не больше 10-6.
     * @param args
     */

    public static void main(String[] args) {
        double result = integrate(x -> 1, 0, 10);
        System.out.println(result);
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 1e-6;
        double result = 0;

        for (double x = a; x < b; x += step) {
            result += f.applyAsDouble(x) * step;
        }

        return result;
    }
}