package com.company;

public class VictorianChair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Victorian chair (" +
                "age: " + age + ")";
    }
}
