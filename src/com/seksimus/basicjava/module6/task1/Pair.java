package com.seksimus.basicjava.module6.task1;

import java.util.Optional;

/**
 *
 Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару
 элементов разных типов и не запрещающий элементам принимать значение null.

 Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
 а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
 */

public class Pair<F, S>{

    private final F first;
    private final S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pair))
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return java.util.Objects.equals(first, pair.first)
                && java.util.Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(first, second);
    }
}
