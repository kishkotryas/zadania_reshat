package ru.yandex.practicum.codingpractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashNums = new HashSet<>();
        Set<Integer> linkedHashNums = new LinkedHashSet<>();
        Set<Integer> treeNums = new TreeSet<>();
        addNums(hashNums);
        addNums(linkedHashNums);
        addNums(treeNums);
        System.out.println(hashNums);
        System.out.println(linkedHashNums);
        System.out.print(treeNums);
    }

    public static void addNums (Set<Integer> nums) {
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);
    }
}
