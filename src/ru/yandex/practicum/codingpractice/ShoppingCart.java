package ru.yandex.practicum.codingpractice;

public class ShoppingCart {

    public void checkout (PaymentSystem paymentSystem, double amount) {
        System.out.println("==== ДО ОПЛАТЫ ====");
        paymentSystem.getPaymentDetails();
        System.out.println("==== ПОСЛЕ ОПЛАТЫ ====");
        paymentSystem.pay(amount);
        paymentSystem.getPaymentDetails();
    }
}
