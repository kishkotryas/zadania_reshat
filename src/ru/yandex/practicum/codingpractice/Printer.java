package ru.yandex.practicum.codingpractice;

public class Printer {

    static void print(int number) {
        System.out.println(number);
    }

    static void print(double number) {
        System.out.println(number);
    }

    static void print(String text) {
        System.out.println(text);
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] +"] ");
        }
        System.out.print(".\n");
    }

    static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] +"] ");
        }
        System.out.print(".\n");
    }
}
