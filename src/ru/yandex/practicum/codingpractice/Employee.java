package ru.yandex.practicum.codingpractice;

import java.util.Objects;

public class Employee {
    protected String id;
    protected String name;
    protected double salary;

    public Employee (String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Employee otherEmployee = (Employee) obj;
        return Objects.equals(this.id, otherEmployee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

