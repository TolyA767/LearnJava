package oop.practice;

public class Dog extends Animal {
    public Dog(String name, double age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Гав гав гав!!!");
    }

    @Override
    public TypeAnimal getType() {return TypeAnimal.MAMMAL;}
}
