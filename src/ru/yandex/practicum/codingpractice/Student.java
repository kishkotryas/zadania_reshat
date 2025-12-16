package ru.yandex.practicum.codingpractice;

import java.util.Objects;

public class Student {
    protected String studentID;
    protected String name;
    protected int age;

    public Student (String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Student otherStudent = (Student) obj;
        return Objects.equals(this.studentID, otherStudent.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentID);
    }
}

