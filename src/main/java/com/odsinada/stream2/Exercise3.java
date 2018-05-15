package com.odsinada.stream2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "how", "are", "you");

        System.out.println(words.stream().reduce((s1, s2) -> String.join(",", s1, s2)).get());

        // extra
        int[] numbers = new int[3];
        numbers[0] = 1111;
        numbers[1] = 2222;
        numbers[2] = 3333;

        System.out.println(Arrays.stream(numbers).mapToObj((num) -> "" + num)
                .map(s -> "'".concat(s).concat("'"))
                .reduce((s1, s2) -> String.join(",", s1, s2)).get());
        System.out.println(Arrays.stream(numbers).mapToObj((num) -> "" + num)
                .map(s -> "'".concat(s).concat("'"))
                .collect(Collectors.joining(",")));

        List<Integer> numbs = new ArrayList<>();
        numbs.add(4444);
        numbs.add(5555);
        numbs.add(6666);
        System.out.println(Stream.of(numbs)
                .map(s -> s.toString())
                .reduce((s1, s2) -> String.join(",", s1, s2)).get());
        System.out.println(Stream.of(numbs)
                .map(s -> s.toString())
                .collect(Collectors.joining(",")));
    }

}
