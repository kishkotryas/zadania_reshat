package ru.yandex.practicum.codingpractice;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 150));
        hares.add(new MountainHare(1, 2.1, 100));
        hares.add(new MountainHare(5, 5.2, 110));
        Forest forest = new Forest(hares);

        System.out.println("В лесу лето!");
        Forest.setSeason("Лето");
        System.out.println("Список зайцев летом:");
        forest.displayHares();

        System.out.println("В лесу зима!");
        Forest.setSeason("Зима");
        System.out.println("Список зайцев зимой:");
        forest.displayHares();
    }
}

