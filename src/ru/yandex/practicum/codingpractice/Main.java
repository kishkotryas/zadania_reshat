package ru.yandex.practicum.codingpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Comparator<Book> bookPageCountComparator = new BookPageCountComparator();
        Comparator<Book> bookYearComparator = new BookYearComparator();

        books.add(new Book("Чепчун", "Мася", 1488, Genre.HORROR, 92));
        books.add(new Book("Апельсин", "Баська", 1590, Genre.DRAMA, 105));
        books.add(new Book("Баськин домик", "Чепчик", 2025, Genre.ROMANTIC, 240));
        books.add(new Book("Гойда", "Улитка", 690, Genre.THRILLER, 44));
        System.out.println("ДО СОРТИРОВКИ:");
        System.out.println(books);
        System.out.println("СОРТИРОВКА ПО ЖАНРУ:");
        books.sort(Comparator.comparing(Book::getGenre));
        System.out.println(books);
    }
}
