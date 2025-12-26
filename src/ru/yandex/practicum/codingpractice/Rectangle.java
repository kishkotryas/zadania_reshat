package ru.yandex.practicum.codingpractice;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    protected Rectangle (String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return width*height;
    }

    @Override
    protected double calculatePerimeter() {
        return 2*(height*width);
    }
}
