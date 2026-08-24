package com.seksimus.basicjava.module6.Task8;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private final Map<String, List<T>> mailBox =
            new HashMap<String, List<T>>() {

                @Override
                public List<T> get(Object key) {
                    return getOrDefault(key, Collections.emptyList());
                }
            };

    @Override
    public void accept(Sendable<T> message) {
        mailBox
                .computeIfAbsent(message.getTo(), key -> new ArrayList<>())
                .add(message.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}