package ru.yandex.practicum.codingpractice;

public class BankAccount {
    private static int id = 1000;
    private double balance;

    public BankAccount() {
        balance = 500;
        id += 1;
    }

    public void withdraw(double amount) throws WithdrawalException{
        if (amount > balance) {
            throw new WithdrawalException("Ошибка. Недостаточно средств.");
        } else if (amount <= 0) {
            throw new WithdrawalException("Ошибка. Сумма снятия должна быть больше 0.");
        } else {
            balance -= amount;
        }
    }

    public void proccessWithdrawal(BankAccount account, double amount) {
        try {
            withdraw(amount);
        } catch (WithdrawalException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Операция завершена.");
        }
    }
}
