package ru.yandex.practicum.codingpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        Map<String, LocalDateTime> historyOfOrders = new LinkedHashMap<>(16, 0_75, true);
        addItem(historyOfOrders, "Футболка");
        addItem(historyOfOrders, "Шорты");
        addItem(historyOfOrders, "Носки");
        addItem(historyOfOrders, "Ботинки");
        addItem(historyOfOrders, "Кепка");
        getHistory(historyOfOrders);
    }

    public static void getRecentViews(Map<String, LocalDateTime> items, int n) {
        for (int i = 0; i <= n; i++) {
            for (String item : items.keySet()) {
                System.out.println(item);
            }
        }
    }

    public static void addItem(Map<String, LocalDateTime> items, String item) {
        if (items.containsKey(item)) {
            items.replace(item, LocalDateTime.now());
        } else {
            items.put(item, LocalDateTime.now());
        }
    }

    public static void getHistory(Map<String, LocalDateTime> items) {
        for (int i = 0; i < 3; i++) {
            for (String item : items.keySet()) {
                System.out.println(item + " = " + items.get(item));
            }
        }
    }
}
