package com.seksimus.basicjava.module2;

/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 * Палиндромом называется строка, которая читается
 * одинаково слева направо и справа налево (в том числе пустая).
 * При определении "палиндромности" строки должны учитываться
 * только буквы и цифры. А пробелы, знаки препинания,
 * а также регистр символов должны игнорироваться. Гарантируется, что в метод
 * попадают только строки, состоящие из символов ASCI
 * (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих
 * экзотических символов в строке не будет.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса,
 * метод main и обработку ввода-вывода добавит проверяющая
 * система.
 */
public class Task7 {

    public static void main(String[] args) {

        boolean result = isPalindrome("Madam, I'm Adam!");

        System.out.println(result);
    }

    public static boolean isPalindrome(String text) {

        String cleanedText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                cleanedText += Character.toLowerCase(c);
            }
        }
        // этот ебучий кусок я решал 3 часа
        for (int i = 0, j = cleanedText.length() - 1; i < j; i++, j--)
        if (cleanedText.charAt(i) != cleanedText.charAt(j)) {
            return false;

        }

        return true;
    }
}
