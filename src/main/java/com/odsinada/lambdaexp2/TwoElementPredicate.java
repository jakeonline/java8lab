package com.odsinada.lambdaexp2;

@FunctionalInterface
public interface TwoElementPredicate<T> {

    public abstract boolean chooseBetter(T text1, T text2);

}
