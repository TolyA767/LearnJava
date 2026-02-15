package oop.inheritance.inher;

// Задача: "Городская транспортная система"
// Создать иерархию классов для разных видов транспорта в городе))

public class Vehicle {
    protected String brand;
    protected int year;
    protected int maxSpeed;

    protected Vehicle(String brand, int year, int maxSpeed) {
        this.brand = brand;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Information for vehicle:");
        System.out.printf("Brand: %s \n Year of manufacture: %d " +
                "\n Maximum speed: %d \n", brand, year, maxSpeed);
    }
}
