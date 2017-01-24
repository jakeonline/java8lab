package com.odsinada.lambdaexp1;

public class Exercise2 {

    public static void main(String args[]) {

        System.out.println(betterString("fantastic", "beast", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterString("amazon", "webservices", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterString("hello", "world", (s1, s2) -> true));

    }

    public static String betterString(String first, String second, TwoStringPredicate tsp) {
        if (tsp.chooseBetter(first, second)) {
            return first;
        } else {
            return second;
        }
    }
}
