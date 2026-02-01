package ru.yandex.practicum.codingpractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        divideNums();
    }

    static void divideNums () {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число...");
            int firstNum = scanner.nextInt();
            System.out.println("Введите второе число...");
            int secondNum = scanner.nextInt();
            System.out.println(firstNum / secondNum);
        } catch (ArithmeticException arithmetic) {
            System.out.println("Ошибка: деление на ноль.");
        } catch (InputMismatchException mismatch) {
            System.out.println("Ошибка: введены не числовые значения.");
        } catch (RuntimeException runtime) {
            System.out.println("Произошла неопределенная ошибка!");
        }
    }
}

