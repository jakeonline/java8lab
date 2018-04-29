package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(shortWords);

        List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
        System.out.println(wordsWithB);

        List<String> evenLengthWords = words.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
        System.out.println(evenLengthWords);

    }

}
