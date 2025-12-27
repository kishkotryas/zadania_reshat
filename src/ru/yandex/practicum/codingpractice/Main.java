package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        PaymentSystem creditCard = new CreditCard("Егор");
        PaymentSystem payPal = new PayPal("Петус");
        PaymentSystem cryptoWallet = new CryptoWallet("Алиса");

        shoppingCart.checkout(creditCard, 3500);
        shoppingCart.checkout(payPal, 2500);
        shoppingCart.checkout(cryptoWallet, 2450.23);
    }
}

