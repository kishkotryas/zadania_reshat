package ru.yandex.practicum.codingpractice;

public class Payment {
    private static int startID = 10000;
    protected final int id;
    protected String clientName;
    protected double balance;
    protected String paymentType;

    public Payment(String clientName) {
        this.balance = 5000;
        this.id = ++startID;
        this.clientName = clientName;
    }

    public boolean pay(double amount) {
        balance = balance - amount;
        System.out.println("Покупка на " + amount + " успешна!");
        return true;
    }

    public void getPaymentDetails() {
        System.out.println("Счет " + id + ", Владелец счета: " + clientName + ", Текущий баланс: " + balance +
                ", Тип оплаты: " + paymentType);
    }
}
