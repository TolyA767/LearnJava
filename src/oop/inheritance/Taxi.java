package oop.inheritance;

import java.beans.PropertyEditorSupport;

public class Taxi extends Vehicle {
    private double price;
    private boolean isAvailable;
    private String name;

    public Taxi(String brand, int year, int maxSpeed, double price, boolean isAvailable, String name) {
        super(brand, year, maxSpeed);
        this.price = price;
        this.isAvailable = isAvailable;
        this.name = name;
    }

    public void calculatePrice(double distance) {
        if (isAvailable) {
            double result = price * distance;
            System.out.printf("Стоимость поездки на %.2fкм: %.2fрублей \n",
                    distance, result); }
        else
            System.out.println("Такси на выезде, попробуйте позже!!");
    }

    // Переопределяем метод
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Имя таксиста: " + name);
        System.out.printf("Доступность: %b \n", isAvailable);
        System.out.printf("Цена: %.0f \n", price);
    }
}
