package com.seksimus.basicjava.module2;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что а + b = с?
 * Допустимая погрешность - 0.0001 (1Е-4)
 *
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 *
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class Task3 {

    public static void main(String[] args) {

        boolean result = doubleExpression(0.1, 0.2, 0.3);

        System.out.println(result);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        //                  модуль
        double differance = Math.abs((a + b) - c);

        return differance < 0.0001;
        // что-то написал
    }
}
