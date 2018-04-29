package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        String filtered = words.stream().map(s -> {
            String upperCase = s.toUpperCase();
            System.out.println(upperCase);
            return upperCase;
        }).filter(s -> s.length() < 4).filter(s -> s.contains("A")).findFirst().orElse(null);
        System.out.println(filtered);

    }

}
