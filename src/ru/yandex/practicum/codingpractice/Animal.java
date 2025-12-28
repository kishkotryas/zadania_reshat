package ru.yandex.practicum.codingpractice;

public abstract class Animal {
    private final String name;
    private final int age;
    private static int countOfAnimals;

    protected Animal (String name, int age) {
        this.name = name;
        this.age = age;
        ++countOfAnimals;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected abstract void eat();
    protected abstract void walk();
}
