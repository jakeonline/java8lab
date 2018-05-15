package com.odsinada.stream2;

import java.util.Arrays;
import java.util.List;

public class Exercisex {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");


        // Problem 1
        System.out.println(words.stream().reduce("", (s, t) -> s.concat(t.toUpperCase())));
        System.out.println(words.stream().reduce("", String::concat).toUpperCase());


        // Problem 2
        System.out.println(words.stream().map(String::toUpperCase).reduce(String::concat).get());

        // Problem 3
        System.out.println(words.stream().reduce("", (s, t) -> {
            if (!s.isEmpty()) {
                s = s.concat(",");
            }
            return s.concat(t);
        }));
        // better
        System.out.println(words.stream().reduce((s,t) -> s.concat(",").concat(t)).get());

        // Problem 4
        System.out.println(words.stream().mapToInt(String::length).sum());

        // Problem 5
        System.out.println(words.stream().filter(s -> s.contains("h")).count());

    }

}
