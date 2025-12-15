package ru.yandex.practicum.codingpractice;

public class ScientificCalculator extends Calculator{

    @Override
    protected int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return super.multiply(a, b);
        }
    }

    protected int power (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
