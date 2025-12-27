package ru.yandex.practicum.codingpractice;

public class PayPal extends Payment implements PaymentSystem{

    public PayPal(String clientName) {
        super(clientName);
        this.paymentType = "ПэйПал";
    }

}
