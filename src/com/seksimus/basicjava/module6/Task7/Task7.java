package com.seksimus.basicjava.module6.Task7;

/**
 * Вытащить из текста слова.
 * Считать Мама, мама, МАМА одним словом.
 * Посчитать, сколько раз встретилось каждое слово.
 * Отсортировать:
 * сначала по количеству, от большего к меньшему;
 * если количество одинаковое — по алфавиту.
 * Взять максимум 10 слов.
 * Вывести только сами слова.
 */

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {

        String text = "Мама мыла-мыла-мыла раму!";

        new Scanner(text)
                .useDelimiter("[^\\p{L}\\p{N}]+")
                .tokens()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = Long.compare(b.getValue(), a.getValue());
                    return result != 0
                            ? result
                            : a.getKey().compareTo(b.getKey());
                })
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}