package ru.yandex.practicum.codingpractice;

public class ElectronicDevice {
    protected String brand;
    protected double powerConsumption;
    protected boolean isOn;

    public ElectronicDevice (String brand, double powerConsumption) {
        isOn = false;
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    public void turnOn () {
        if (isOn) {
            System.out.println("Устройство в данный момент включено!");
        } else {
            isOn = true;
            System.out.println("Устройство включено.");
        }
    }
    public void turnOff () {
        if (!isOn) {
            System.out.println("Устройство в данный момент выключено!");
        } else {
            isOn = false;
            System.out.println("Устройство выключено.");
        }
    }
    public double getPowerConsumption () {
        return powerConsumption;
    }
}
