package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {


    public static List<String> allMatches(List<String> wordList, Predicate<String> matchFunction) {
        List<String> matchedWords = new ArrayList<>();

        for (String word : wordList) {
            if (matchFunction.test(word)) {
                matchedWords.add(word);
            }
        }

        return matchedWords;
    }

    public static List<String> transformedList(List<String> words, Function<String, String> func) {
        List<String> result = new ArrayList<>();
        for (String currWord : words) {
            result.add(func.apply(currWord));
        }
        return result;

    }


}
