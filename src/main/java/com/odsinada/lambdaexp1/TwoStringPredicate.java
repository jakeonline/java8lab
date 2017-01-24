package com.odsinada.lambdaexp1;

@FunctionalInterface
public interface TwoStringPredicate {

    public abstract boolean chooseBetter(String text1, String text2);

}
