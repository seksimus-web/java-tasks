package com.seksimus.basicjava.module6.Task4;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Objects;

public class Task4 {

    public static void main(String[] args) {

        Predicate<Object> condition = Objects::isNull;

        Function<Object, Integer> ifTrue = obj -> 0;

        Function<CharSequence, Integer> ifFalse = CharSequence::length;

        Function<String, Integer> safeStringLength =
                ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(safeStringLength.apply(null));
        System.out.println(safeStringLength.apply("Hello"));
        System.out.println(safeStringLength.apply("Java"));

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

//        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
        
        return obj -> {
            if (condition.test(obj)) {
                return ifTrue.apply(obj);
            } else {
                return ifFalse.apply(obj);
            }
        };
    }
}
