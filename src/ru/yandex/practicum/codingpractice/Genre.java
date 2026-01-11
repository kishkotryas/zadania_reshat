package ru.yandex.practicum.codingpractice;

public enum Genre {
    THRILLER("Триллер"),
    DRAMA("Драма"),
    ROMANTIC("Романтика"),
    HORROR("Ужасы");
    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
