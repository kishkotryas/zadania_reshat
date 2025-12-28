package ru.yandex.practicum.codingpractice;

public class Main {
    public static void main (String [] args) {
        Animal[] array =
                {
                        new Cat("Шуля", 2),
                        new Cat("Евгеша", 4),
                        new Dog("Барон", 3),
                        new Dog("Пират", 7),
                        new Parrot("Ларри", 1)
                };
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Mammal) {
                Mammal mammal = (Mammal) array[i];
                mammal.produceMilk();
            }
            if (array[i] instanceof Bird) {
                Bird bird = (Bird) array[i];
                bird.fly();
            }
            if (array[i] instanceof Dog) {
                Dog dog = (Dog) array[i];
                dog.bark();
            }
            if (array[i] instanceof Cat) {
                Cat cat = (Cat) array[i];
                cat.meow();
            }
            if (array[i] instanceof Parrot) {
                Parrot parrot = (Parrot) array[i];
                parrot.talk();
            }
        }
    }
}

