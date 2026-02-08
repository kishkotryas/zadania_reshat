package ru.yandex.practicum.codingpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(parseUserInput("erer"));
    }

    static int parseUserInput (String input) {
        try {
            int num = Integer.parseInt(input);
            if (num >= 1 && num <= 100) {
                return num;
            } else {
                throw new IllegalArgumentException("Ошибка: число не входит в диапазон (1-100)");
            }
        } catch (NumberFormatException number) {
            throw new IllegalArgumentException("Ошибка: некорректный ввод числа");
        }
    }
}

