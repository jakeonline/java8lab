package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {

    public static <T> List<T> allMatches(List<T> wordList, Predicate<T> matchFunction) {
        List<T> matchedWords = new ArrayList<>();

        for (T word : wordList) {
            if (matchFunction.test(word)) {
                matchedWords.add(word);
            }
        }

        return matchedWords;
    }

    public static <T, R> List<R> transformedList(List<T> words, Function<T, R> func) {
        List<R> result = new ArrayList<>();
        for (T currWord : words) {
            result.add(func.apply(currWord));

        }
        return result;

    }
}
