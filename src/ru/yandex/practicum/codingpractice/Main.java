package ru.yandex.practicum.codingpractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 2; i++) {
            arrayList.add("Котик");
            arrayList.add(i, "Попугай");
            arrayList.addAll(arrayList);
            linkedList.add("Жопа");
            linkedList.add("Песик");
            linkedList.addAll(linkedList);
        }
        System.out.println(arrayList);
        System.out.println(linkedList);

        arrayList.remove(3);
        arrayList.remove("Попугай");
        arrayList.remove(arrayList.subList(5, 7));

        linkedList.remove(2);
        linkedList.remove("Песик");
        linkedList.remove(linkedList.subList(3,6));

        System.out.println();
        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
