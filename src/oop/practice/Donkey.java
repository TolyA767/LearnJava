package oop.practice;

public class Donkey extends Animal implements Transportable {
    // Скорость ослика
    private double normalSpeed;

    public Donkey(String name, double age, double normalSpeed) {
        super(name, age);
        this.normalSpeed = normalSpeed;
        // Проверка что ввели корректную скорость
        if (normalSpeed > 0) {this.normalSpeed = normalSpeed;}
        else {System.out.println("Скорость всегда > 0!");}
    }

    // звук ослика
    @Override
    public void sound() {System.out.println("Иаа-иииааа!");}

    // геттер
    public double getNormalSpeed() {return normalSpeed; }

    @Override
    public void transport() {System.out.printf("Мы едем на ослике со " +
            "скоростью %.0f км/ч \n", normalSpeed);}
    @Override
    public TypeAnimal getType() {return TypeAnimal.MAMMAL;}
}
