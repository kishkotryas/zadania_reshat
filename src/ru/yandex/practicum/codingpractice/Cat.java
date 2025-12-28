package ru.yandex.practicum.codingpractice;

public class Cat extends Mammal{

    protected Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("МЯУ-МЯУ!");
    }
}
