package ru.yandex.practicum.codingpractice;

public class SmartDevice extends ElectronicDevice{
    protected boolean isHasWifi;
    protected boolean isHasBluetooth;

    public SmartDevice(String brand, double powerConsumption) {
        super(brand, powerConsumption);
        isHasWifi = false;
        isHasBluetooth = false;
    }

    public void connectToWifi () {
        if (isHasWifi) {
            System.out.println("Устройство уже подключено к интернету!");
        } else {
            isHasWifi = true;
            System.out.println("Устройство успешно подключено к интернету.");
        }
    }

    public void connectToBluetooth () {
        if (isHasBluetooth) {
            System.out.println("Устройство уже подключено к блютуз!");
        } else {
            isHasBluetooth = true;
            System.out.println("Устройство успешно подключено к блютуз.");
        }
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Умное устройство в данный момент включено!");
        } else {
            isOn = true;
            System.out.println("Умное устройство включено.");
        }
    }
}
