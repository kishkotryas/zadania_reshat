package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        Shape[] shapes =
                {
                        new Circle("красный", 3.5),
                        new Circle("желтый", 5.5),
                        new Circle("зеленый", 3),
                        new Circle("красный", 4.2),
                        new Rectangle("красный", 15, 10),
                        new Rectangle("черный", 10, 20),
                        new Triangle("оранжевый", 3, 5, 3),
                        new Triangle("Фиолетовый", 4, 5, 8)
                };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculateArea());
            System.out.println(shapes[i].calculatePerimeter());
        }
    }
}

