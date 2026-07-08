package com.seksimus.basicjava.module3.task4;

public class Runner {

    public static void main(String[] args) {

        byte[] data = {65, 66, 67, 68};

        AsciiCharSequence text = new AsciiCharSequence(data);

        System.out.println(text.length());
        System.out.println(text.charAt(2));
        System.out.println(text);
        System.out.println(text.subSequence(1, 3));
    }
}
