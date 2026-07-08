package com.seksimus.basicjava.module3.task4;

import java.util.Arrays;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в
 * один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в
 * два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 *
 * • реализовывать интерфейс java.lang.CharSequence;
 * • иметь конструктор, принимающий массив байт;
 * • определять методы length(), charAt(), subSequence() и toString0
 *
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
 *
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой
 * и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 */

public class AsciiCharSequence implements CharSequence {
    //ыыыыыы
    private byte[] value;

    public AsciiCharSequence(byte[] value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return (char) value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(
                Arrays.copyOfRange(value, start, end)
        );
    }

    @Override
    public String toString() {
        return new String(value);
    }
}