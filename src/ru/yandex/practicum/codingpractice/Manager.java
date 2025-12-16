package ru.yandex.practicum.codingpractice;

import java.util.ArrayList;
import java.util.Objects;

public class Manager extends Employee{
    private ArrayList <Employee> team;

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
        team = new ArrayList<>();
    }

    public ArrayList <Employee> getTeam () {
        return team;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(id)) {
            return false;
        } else {
            Manager otherManager = (Manager) obj;
            return Objects.equals(this.team, otherManager.team);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team);
    }
}
