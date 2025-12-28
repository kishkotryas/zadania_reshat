package ru.yandex.practicum.codingpractice;

public class Parrot extends Bird{

    protected Parrot(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println(getName().toUpperCase() + " ХОР-Р-РОШИЙ!");
    }
}
