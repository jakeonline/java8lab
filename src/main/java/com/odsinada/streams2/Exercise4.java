package com.odsinada.streams2;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");

        System.out.println(words.stream().mapToInt(String::length).sum());

    }

}
