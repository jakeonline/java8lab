package com.odsinada.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");

        System.out.println(words.stream().filter(s -> s.contains("h")).count());
        System.out.println(words.stream().filter(s -> s.contains("h")).collect(Collectors.toList()).size());

    }

}
