package oop.practice;

public class Horse extends Animal implements Transportable {
    // Обычная скорость лошадки (без бега и быстрой ходьбы)
    private double normalSpeed;

    public Horse(String name, double age, double normalSpeed) {
        super(name, age);
        this.normalSpeed = normalSpeed;
        if (normalSpeed > 0) {this.normalSpeed = normalSpeed;}
        else {System.out.println("Скорость всегда > 0!");}
    }

    @Override
    public void sound() { System.out.println("Иго-го-го!!!"); }

    // Геттер (получить скорость лошадки)
    public double getNormalSpeed() { return normalSpeed; }

    @Override
    public void transport() {System.out.printf("Мы едем на лошади " +
            "со скоростью %.0f км/ч \n", normalSpeed);}
    @Override
    public TypeAnimal getType() {return TypeAnimal.MAMMAL;}
}
