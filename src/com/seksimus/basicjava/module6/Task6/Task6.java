package com.seksimus.basicjava.module6.Task6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task6 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        var list = stream.sorted(order).toList();

        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
            return;
        }

        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
    }

    public static void main(String[] args) {

        findMinMax(
                Stream.of(5, 2, 8, 1, 4),
                Comparator.naturalOrder(),
                (min, max) -> System.out.println("min = " + min + ", max = " + max)
        );

        findMinMax(
                Stream.<Integer>empty(),
                Comparator.naturalOrder(),
                (min, max) -> System.out.println("min = " + min + ", max = " + max)
        );
    }
}