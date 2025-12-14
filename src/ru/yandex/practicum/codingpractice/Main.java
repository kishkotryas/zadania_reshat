package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        SmartPhone iphone = new SmartPhone("Iphone", 4500, 5.6, 16);
        SmartTV tv = new SmartTV("Philips", 3500, 55.5);

        iphone.turnOn();
        iphone.makeCall("92247688399");
        iphone.turnOn(); // пробуем включить если айфон уже включен
        iphone.takePhoto();
        iphone.turnOff();
        iphone.connectToWifi();

        tv.turnOn();
        tv.installApp("YouTube");
        tv.updateOS();
        tv.installApp("YouTube");
        tv.turnOn(); // пробуем включить если тв уже включен
        tv.updateOS(); // пробуем обновить когда тв уже обновлен
        tv.turnOff();
    }
}

