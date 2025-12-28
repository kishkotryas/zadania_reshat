package ru.yandex.practicum.codingpractice;

public class Dog extends Mammal{

    protected Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("ГАВ-ГАВ!");
    }
}
