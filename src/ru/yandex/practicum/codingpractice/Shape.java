package ru.yandex.practicum.codingpractice;

public abstract class Shape {
    protected String color;
    final static double PI = Math.PI;

    protected Shape (String color) {
        this.color = color;
    }

    protected abstract double calculateArea();

    protected abstract double calculatePerimeter();
}
