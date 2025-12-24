package ru.yandex.practicum.codingpractice;

public class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    private static String color;

    public MountainHare (int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }
}
