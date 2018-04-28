package com.odsinada.lambdaexp4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jake");
        words.add("abby");
        words.add("kenzo");
        words.add("christina");
        words.add("jerome");
        words.add("celeste");

        String result = firstAnyMatch(words.stream(),
                word -> word.contains("f"),
                word -> word.length() > 6);

        System.out.println(result);
    }

    public static <T> T firstAnyMatch(Stream<T> stream, Predicate<T>... pred) {
        Predicate<T> allPred = anyPassPredicate(pred);
        return stream.filter(allPred).findFirst().orElse(null);
    }

    public static <T> Predicate<T> anyPassPredicate(Predicate<T>... pred) {
        Predicate allPred = null;
        for (Predicate curr : pred) {
            if (allPred == null) {
                allPred = curr;
                continue;
            }
            allPred = allPred.or(curr);

        }
        return allPred;
    }
}
