package com.odsinada.lambdaexp2;

@FunctionalInterface
public interface TwoStringPredicate {

    public abstract boolean chooseBetter(String text1, String text2);

}
