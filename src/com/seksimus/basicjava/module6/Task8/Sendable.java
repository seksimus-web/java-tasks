package com.seksimus.basicjava.module6.Task8;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
