package com.seksimus.basicjava.module4;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 *
 * Метод getCallerClassAndMethodName( должен возвращать имя класса и метода, откуда вызван метод, вызвавший
 * данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший
 * getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
 */
public class Task2 {

    public static void main(String[] args) {

        methodA();
    }

    public static void methodA() {

        System.out.println(getCallerClassAndMethodName());
        System.out.println();
        System.out.println(getCallerClassAndMethodNameDwa());

    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        if (stack.length < 4) {
            return null;
        }

        StackTraceElement caller = stack[3];

        return caller.getClassName() + "#" + caller.getMethodName();
    }

    public static String getCallerClassAndMethodNameDwa() {

        StackTraceElement[] stack = new Exception().getStackTrace();

        if (stack.length < 3) {
            return null;
        }

        StackTraceElement caller = stack[2];

        return caller.getClassName() + "#" + caller.getMethodName();
    }
}
