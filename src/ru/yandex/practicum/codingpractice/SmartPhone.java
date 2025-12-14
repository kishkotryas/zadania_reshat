package ru.yandex.practicum.codingpractice;

public class SmartPhone extends SmartDevice{
    protected double screenSize;
    protected int cameraMP;

    public SmartPhone(String brand, double powerConsumption, double screenSize, int cameraMP) {
        super(brand, powerConsumption);
        this.screenSize = screenSize;
        this.cameraMP = cameraMP;
    }

    public void makeCall (String number) {
        System.out.println("Звоним на номер +7" + number + "...");
    }

    public void takePhoto () {
        System.out.println("Вы сделали фото!");
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Смартфон в данный момент включен!");
        } else {
            isOn = true;
            System.out.println("Смартфон включен.");
        }
    }
}
