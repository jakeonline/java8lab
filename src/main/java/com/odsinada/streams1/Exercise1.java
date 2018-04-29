package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        words.forEach((s) -> System.out.println("__" + s));

        // Exercise 1 play
        words.stream().forEach(s -> System.out.println("xx" + s));
        Stream.of(words.toArray()).forEach(s -> System.out.println("**" + s)); // uses Stream.of(T... obj) i.e. Stream.of(T[] obj)

        Stream.of(words).forEach(s -> System.out.println("++" + s)); // will print the list, not its elements
        // uses Stream.of(T obj)
        // this is because there is no Stream.of(Collection) to stream its elements
    }

}
