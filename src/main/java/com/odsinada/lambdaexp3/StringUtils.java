package com.odsinada.lambdaexp3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringUtils {

    public static List<String> transformedList(List<String> words, Function<String, String> func) {
        List<String> result = new ArrayList<>();
        for (String currWord : words) {
            result.add(func.apply(currWord));

        }
        return result;

    }


}
