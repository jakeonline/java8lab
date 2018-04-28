package com.odsinada.lambdaexp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise3 {
    public static void main(String[] args) {

        int x = 2, y = 3;
        method1(x, y, d -> Math.cos(d));
        method1(x, y, Math::cos);

        method1B(x, y, d -> {
            Math.cos(d);
            return;
        });
        methodX("jake", "odsinada", (s1, s2) -> s1 + " " + s2);
        methodX("jake", "odsinada", (s1, s2) -> s2 + ", " + s1);


        List<String> someList = Arrays.asList("abigail", "kenzo", "jacob");
        someList.forEach(entry -> System.out.println(entry));
        someList.forEach(System.out::println);


        int a = 0;
        int b = 0;
        int c = 0;
        method2(a, b, c, (d1, d2) -> Math.pow(d1, d2));
        method2(a, b, c, Math::pow);

        List<Integer> someStream = Arrays.asList(1, 2, 3, 4, 5);
        someStream.stream().reduce(0, (i1, i2) -> Integer.sum(i1, i2));
        someStream.stream().reduce(0, Integer::sum);

        String foo = "foo";
        String bar = "bar";

        method3(foo, bar, (e, f, g) -> Utils.doSomethingWith(e, f, g));
        method3(foo, bar, Utils::doSomethingWith);

        method4(() -> Math.random());
        method4(Math::random);

    }

    private static void method4(Supplier<Double> func) {
        System.out.println(func.get());
    }

    public static void method3(Object a, Object b, MyLambda func) {
        func.myFunction("e", "f", "g");
    }

    public static void method2(int a, int b, int c, BinaryOperator<Double> func) {
        double result = func.apply(new Double(a), new Double(b));
    }

    public static void method1B(int x, int y, Consumer<Double> func) {
        System.out.println("hellow");
        func.accept(5d);
    }

    public static void method1(int x, int y, Function<Double, Double> func) {
        System.out.println("hellow");
        System.out.println(func.apply(2d));
    }

    public static void methodX(String x, String y, BinaryOperator<String> func) {
        System.out.println("hellow");
        System.out.println(func.apply(x, y));
    }
}
