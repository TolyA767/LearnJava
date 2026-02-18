package oop.polymorphism.practice;

public class Animal {
    protected String name;
    protected double age;
    protected String typeanimal;

    public Animal(String name, double age, String typeanimal) {
        this.name = name;
        this.age = age;
        this.typeanimal = typeanimal;
    }

    void sound() {
        System.out.println("У каждого животного свой звук");
    }

    static public void main(String[] args) {
        Animal[] animals = {new Cat("Barsik", 1.2, "cat"),
                new Dog("Sharik", 4.7, "dog"),
                new Cow("Milka", 6, "cow", "Yd54")
        };

        for (Animal animal : animals)
            animal.sound();
    }
}
