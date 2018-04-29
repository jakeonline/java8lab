package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        String filtered = words.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s -> s.contains("E")).findFirst().orElse(null);
        System.out.println(filtered);

        String filtered2 = words.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s -> s.contains("H")).findFirst().orElse(null);
        System.out.println(filtered2);
    }

}
