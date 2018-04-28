package com.odsinada.lambdaexp1;

public class Exercise3 {

    public static void main(String args[]) {

        System.out.println(betterElement("fantastic", "beast", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterElement("amazon", "webservices", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterElement("hello", "world", (s1, s2) -> true));
        System.out.println(betterElement("hello", "world", (s1, s2) -> false));

        System.out.println("Pricier car is " + betterElement(new Car("Lightning", 5, 200), new Car("Mater", 10, 100), (c1, c2) -> c1.getPrice() > c2.getPrice()));
        System.out.println("Heavier car is " + betterElement(new Car("Lightning", 5, 200), new Car("Mater", 10, 100), (c1, c2) -> c1.getWeight() > c2.getWeight()));
        System.out.println("Richer employee is " + betterElement(new Employee(14), new Employee(9), (c1, c2) -> c1.getSalary() > c2.getSalary()));

        System.out.println("DONE!");

    }

    public static <T> T betterElement(T first, T second, TwoElementPredicate<T> tsp) {
        if (tsp.chooseBetter(first, second)) {
            return first;
        } else {
            return second;
        }
    }

    static class Car {
        private String name;
        private int weight;
        private int price;

        public Car(String name, int i, int initPrice) {
            this.weight = weight;
            this.price = initPrice;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int newPrice) {
            price = newPrice;
        }

        @Override
        public String toString() {
            return "Car with name: " + name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
