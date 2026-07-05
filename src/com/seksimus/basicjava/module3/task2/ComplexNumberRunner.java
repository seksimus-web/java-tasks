package com.seksimus.basicjava.module3.task2;

public class ComplexNumberRunner {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber c = new ComplexNumber(2.28, 2);
        ComplexNumber d = new ComplexNumber(2.28, 2);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
        System.out.println();// ниже строчки уже по приколу написаны нежели по условию
        System.out.println("a " + a.hashCode());
        System.out.println("b " + b.hashCode());
        System.out.println("c " + c.hashCode());
        System.out.println("d " + d.hashCode());
    }
}