package ru.yandex.practicum.codingpractice;

public class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double c;

    protected Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calculateArea() {
        double h = (a*b)/c;
        return a*h/2;
    }

    @Override
    protected double calculatePerimeter() {
        return a+b+c;
    }
}
