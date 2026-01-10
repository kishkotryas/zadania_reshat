package ru.yandex.practicum.codingpractice;

import java.util.Comparator;

public abstract class StudentAgeComparator implements Comparator {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.age-student2.age;
    }
}
