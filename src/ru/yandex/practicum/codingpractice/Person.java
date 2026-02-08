package ru.yandex.practicum.codingpractice;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        try {
            setName(name);
            setAge(age);
            System.out.println("Человек " + name + " с возрастом " + age + " лет успешно создан!");
        } catch (InvalidAgeException invalidAgeException) {
            invalidAgeException.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 150) {
            throw new InvalidAgeException("Ошибка! Некорректный возраст.");
        } else {
            this.age = age;
        }
    }
}
