package com.odsinada.lambdaexp1;

public class LambdaUtil {
    static int charComparison(String s1, String s2) {
        if (s1.contains("e")) {
            return -1;
        } else if (s2.contains("e")) {
            return 0;
        } else {
            return -1;
        }
    }
}