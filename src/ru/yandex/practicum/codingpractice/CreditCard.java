package ru.yandex.practicum.codingpractice;

public class CreditCard extends Payment implements PaymentSystem {

    public CreditCard(String clientName) {
        super(clientName);
        this.paymentType = "Кредитная карта";
    }

}
