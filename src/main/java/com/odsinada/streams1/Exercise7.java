package com.odsinada.streams1;

import java.util.Arrays;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "bye", "hello", "willoughby", "how", "are", "you", "yiheee");

        String[] wordArr = words.stream().filter(s -> s.length() % 2 == 0).toArray(String[]::new);
        System.out.println(wordArr);

    }

}
