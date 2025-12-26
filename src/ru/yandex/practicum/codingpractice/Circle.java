package ru.yandex.practicum.codingpractice;

public class Circle extends Shape {
    private final double radius;

    protected Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return PI*(radius*radius);
    }

    @Override
    protected double calculatePerimeter() {
        return 2*PI*radius;
    }
}
