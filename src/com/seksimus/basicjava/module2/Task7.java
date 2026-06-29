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
        //                        заменитьВсе    [^не от a-z A-Z 0-9]
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanedText)
                .reverse() // разворачивает символы в обратном порядке
                .toString(); // StringBuilder → String

        return cleanedText.equals(reversedText);
    }
}
