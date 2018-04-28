package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacob Odsinada on 17/05/2017.
 */
public class Exercise4 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jake");
        words.add("abigail");
        words.add("bbb");
        words.add("kenzo");
        words.add("jollibee");
        words.add("kulafu");
        words.add("fly");

        System.out.println(ElementUtils.transformedList(words, (s) -> s.concat("!")));
        System.out.println(ElementUtils.transformedList(words, (s) -> s.replace("i", "eye")));
        System.out.println(ElementUtils.transformedList(words, String::toUpperCase));

        List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
        System.out.println(wordLengths);
    }
}
