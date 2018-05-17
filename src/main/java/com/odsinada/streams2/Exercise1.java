package com.odsinada.streams2;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");

        // Problem 1
        System.out.println(words.stream().reduce("", (s, t) -> s.concat(t.toUpperCase())));
        System.out.println(words.stream().reduce("", String::concat).toUpperCase());

    }

}
