package com.odsinada.lambdaexp1;

@FunctionalInterface
public interface TwoElementPredicate<T> {

    public abstract boolean chooseBetter(T text1, T text2);

}
