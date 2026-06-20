package com.seksimus.basicjava.module2;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии а
 *
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class Task5 {

    public static void main(String[] args) {

        char result = charExpression(32);

        System.out.println(result);
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
