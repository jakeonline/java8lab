package com.odsinada.stream2;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");

        System.out.println(words.stream().map(String::toUpperCase).reduce("", (s1, s2) -> s1.concat(s2)));
        System.out.println(words.stream().map(s -> s.toUpperCase()).reduce("", String::concat));
    }

}
