package ru.yandex.practicum.codingpractice;

public class Bird extends Animal{

    protected Bird(String name, int age) {
        super(name, age);
    }

    protected void fly() {
        System.out.println("Птица " + getName() + " полетела.");
    }

    @Override
    protected void eat() {
        System.out.println("Птица " + getName() + " клюет зерно.");
    }

    @Override
    protected void walk() {
        System.out.println("Птица " + getName() + " прыгает по земле.");
    }
}
