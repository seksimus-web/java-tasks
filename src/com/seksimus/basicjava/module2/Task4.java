package com.seksimus.basicjava.module2;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита
 * заданного целого числа на противоположное. Данная задача актуальна,
 * например, при работе с битовыми полями.
 *
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса,
 * метод main и обработку ввода-вывода добавит проверяющая
 * система.
 */
public class Task4 {

    public static void main(String[] args) {

        int result = flipBit(0, 1);

        System.out.println(result);
    }

    public static int flipBit(int value, int bitIndex) {
        int mask = 1 << (bitIndex - 1);
        return value ^ mask;

//        public static int flipBit(int number, int i) {

//        }
//        int mask = 1 << (i - 1);
//
//        if ((number & mask) == 0) {
//            return number + mask;
//        } else {
//            return number - mask;
//        }
    }
}
