package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {

            }
        }
    }
}

