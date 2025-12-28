package ru.yandex.practicum.codingpractice;

public class Mammal extends Animal{

    protected Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    protected void eat() {
        System.out.println("Млекопитающее " + getName() + " ест.");
    }

    @Override
    protected void walk() {
        System.out.println("Млекопитающее " + getName() + " ходит.");
    }

    public void produceMilk() {
        System.out.println("Млекопитающее " + getName() + " кормит молоком.");
    }
}
