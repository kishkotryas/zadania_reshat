package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        Student student1 = new Student("1001", "Павел", 25);
        Student student2 = new Student("1001", "Игорь", 11);

        System.out.println("Хэш код первого объекта: " + student1.hashCode());
        System.out.println("Хэш код второго объекта: " + student2.hashCode());
    }
}

