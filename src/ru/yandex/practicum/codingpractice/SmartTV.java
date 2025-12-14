package ru.yandex.practicum.codingpractice;

public class SmartTV extends SmartDevice{
    protected double screenSize;
    protected double smartOS;

    public SmartTV(String brand, double powerConsumption, double screenSize) {
        super(brand, powerConsumption);
        smartOS = 14.0;
        this.screenSize = screenSize;
    }

    public void installApp (String appName) {
        if (smartOS < 15.0) {
            System.out.println("Невозможно установить приложение " + appName + ". Обновите вашу ОС!");
        } else {
            System.out.println("Приложение " + appName + " успешно установлено.");
        }
    }

    public void updateOS () {
        if (smartOS == 15.0) {
            System.out.println("Нет доступных обновлений.");
        } else {
            smartOS = 15.0;
            System.out.println("Обновление прошло успешно! Текущая версия: 15.0");
        }
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Телевизор в данный момент включен!");
        } else {
            isOn = true;
            System.out.println("Телевизор включен.");
        }
    }
}
