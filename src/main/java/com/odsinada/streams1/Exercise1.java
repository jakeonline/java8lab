package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        words.forEach((s) -> System.out.println("__" + s));

        words.forEach(System.out::println);

        List<String> excitingWords = words.stream().map((s -> s + "!")).collect(Collectors.toList());
        System.out.println(excitingWords);

        List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        System.out.println(eyeWords);

        List<String> upperCaseWords = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseWords);

        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(shortWords);

        List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
        System.out.println(wordsWithB);

        List<String> evenLengthWords = words.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
        System.out.println(evenLengthWords);

        String[] wordArr = words.stream().filter(s -> s.length() % 2 == 0).toArray(String[]::new);
        System.out.println(wordArr);

        String filtered = words.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s -> s.contains("E")).findFirst().orElse(null);
        System.out.println(filtered);

        String filtered2 = words.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s -> s.contains("H")).findFirst().orElse(null);
        System.out.println(filtered2);
    }

}
