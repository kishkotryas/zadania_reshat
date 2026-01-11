package ru.yandex.practicum.codingpractice;

public class Book {
    private String title;
    private String author;
    private int year;
    private Genre genre;
    private int pageCount;

    public Book(String title, String author, int year, Genre genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{ Book } title: " + getTitle() +
                ", author: " + getAuthor() +
                ", year: " + getYear() +
                ", genre: " + getGenre().getName() +
                ", pagecount: " + getPageCount() + "\n";
    }
}
