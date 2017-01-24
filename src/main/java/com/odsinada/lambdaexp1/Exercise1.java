package com.odsinada.lambdaexp1;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String args[]) {
        String[] myArr = new String[]{"hello", "jakeodsi", "abby", "kuya lucas", "kenzo", "nathan"};

        System.out.println("original: " + Arrays.asList(myArr));

        // shortest to longest
        Arrays.sort(myArr, (s1, s2) -> s1.length() - s2.length());

        System.out.println(Arrays.asList(myArr));

        // longest to shortest
        Arrays.sort(myArr, (s1, s2) -> s2.length() - s1.length());

        System.out.println(Arrays.asList(myArr));

        //alphabetically by the first character only
        Arrays.sort(myArr, (s1, s2) -> s1.charAt(0) - s2.charAt(0));

        System.out.println(Arrays.asList(myArr));

        // words with 'e' first, all else second
        Arrays.sort(myArr, (s1, s2) -> {
            if (s1.contains("e")) {
                return -1;
            } else if (s2.contains("e")) {
                return 0;
            } else {
                return -1;
            }
        });

        System.out.println(Arrays.asList(myArr));

    }
}
