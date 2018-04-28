package com.odsinada.lambdaexp4;

import java.util.Arrays;
import java.util.List;

// provided in lambdas-4-exercises project

public class StreamPreview {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String s1 = words.stream()
                .filter(word -> word.contains("o"))
                .findFirst()
                .orElse(null);
        System.out.println(s1);
        String s2 = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse(null);
        System.out.println(s2);


        // jake additions
        s2 = words.stream()
                .filter(word -> word.endsWith("e"))
                .findFirst()
                .orElse(null);
        System.out.println(s2);
    }
}
