package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        List<String> excitingWords = words.stream().map((s -> s + "!")).collect(Collectors.toList());
        System.out.println(excitingWords);

        List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        System.out.println(eyeWords);

        List<String> upperCaseWords = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseWords);

    }

}
