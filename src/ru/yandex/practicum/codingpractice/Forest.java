package ru.yandex.practicum.codingpractice;

import java.util.ArrayList;

public class Forest {
    private static String season;
    private static ArrayList<MountainHare> hares;

    public Forest (ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason (String season) {
        for (int i = 0; i < hares.size(); i++) {
            switch (season) {
                case "Зима":
                    hares.get(i).setColor("белый");
                    break;
                default:
                    hares.get(i).setColor("серо-рыжий");
            }
        }
    }

    public void displayHares () {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
