package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jake");
        words.add("abigail");
        words.add("bbb");
        words.add("kenzo");
        words.add("jollibee");
        words.add("kulafu");
        words.add("fly");

        System.out.println(StringUtils.allMatches(words, s -> s.length() < 4));
        System.out.println(StringUtils.allMatches(words, s -> s.contains("b")));
        System.out.println(StringUtils.allMatches(words, s -> (s.length() % 2) == 0));

    }

}
