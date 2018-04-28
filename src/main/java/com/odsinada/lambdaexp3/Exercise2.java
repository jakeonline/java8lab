package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jake");
        words.add("abigail");
        words.add("bbb");
        words.add("kenzo");
        words.add("jollibee");
        words.add("kulafu");
        words.add("fly");

        System.out.println(ElementUtils.allMatches(words, s -> s.length() < 4));
        System.out.println(ElementUtils.allMatches(words, s -> s.contains("b")));
        System.out.println(ElementUtils.allMatches(words, s -> (s.length() % 2) == 0));

        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        System.out.println(ElementUtils.allMatches(nums, n -> n > 500));
    }

}
