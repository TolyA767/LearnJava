package oop.practice;

// Абстрактный класс животное
public abstract class Animal {
    private String name;
    private double age;
    private String typeAnimal;

    public Animal(String name, double age) {
        this.name = name;
        if (age > 0) {this.age = age;}
        else {System.out.println("Возраст должен быть больше 0!");}
    }

    // абстрактный метод издать звук
    public abstract void sound();

    // абстрактный класс который возвращает тип животного
    public abstract TypeAnimal getType();
}
