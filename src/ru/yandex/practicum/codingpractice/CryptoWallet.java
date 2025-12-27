package ru.yandex.practicum.codingpractice;

public class CryptoWallet extends Payment implements PaymentSystem{

    public CryptoWallet(String clientName) {
        super(clientName);
        this.paymentType = "Крипто-Кошелек";
    }

}
