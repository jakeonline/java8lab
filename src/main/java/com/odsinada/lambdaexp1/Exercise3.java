package com.odsinada.lambdaexp1;

public class Exercise3 {

    public static void main(String args[]) {

        System.out.println(betterElement("fantastic", "beast", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterElement("amazon", "webservices", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterElement("hello", "world", (s1, s2) -> true));

        System.out.println(betterElement(new Car(5), new Car(10), (c1, c2) -> c1.getPrice() > c2.getPrice()));
        System.out.println(betterElement(new Employee(14), new Employee(9), (c1, c2) -> c1.getSalary() > c2.getSalary()));

    }

    public static <T> T betterElement(T first, T second, TwoElementPredicate<T> tsp) {
        if (tsp.chooseBetter(first, second)) {
            return first;
        } else {
            return second;
        }
    }

    static class Car {
        private int price;

        public Car() {

        }

        public Car(int initPrice) {
            price = initPrice;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int newPrice) {
            price = newPrice;
        }

        @Override
        public String toString() {
            return "Car with price: " + price;
        }
    }

    static class Employee {
        private int salary;

        public Employee(int initSalary) {
            salary = initSalary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int newSalary) {
            salary = newSalary;
        }

        @Override
        public String toString() {
            return "Employee with salary: " + salary;
        }
    }
}
