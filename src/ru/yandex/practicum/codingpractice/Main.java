package ru.yandex.practicum.codingpractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();
        List<String> animalsList = new ArrayList<>(List.of("dog", "bird", "duck", "cat"));

        animals.add("cat");
        animals.addAll(animalsList);
        System.out.println(animals);
        animals.remove("bird");
        System.out.println("is bird in the hash set? " + animals.contains("bird"));
    }
}
