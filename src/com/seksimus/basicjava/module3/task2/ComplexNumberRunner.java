package com.seksimus.basicjava.module3.task2;

public class ComplexNumberRunner {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber c = new ComplexNumber(2, 1);

        System.out.println(a.equals(b)); // true
        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.equals(c)); // false
    }
}