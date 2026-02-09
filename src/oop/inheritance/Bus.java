package oop.inheritance;

public class Bus extends Vehicle {
    protected int passengerCapacity; // вместимость пассажиров
    protected String route; // информация об маршруте

    public Bus(String brand, int year, int maxSpeed, int passengerCapacity, String route) {
        super(brand, year, maxSpeed);
        this.passengerCapacity = passengerCapacity;
        this.route = route;
    }

    // Переопределяем метод
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Номер маршрута: %s \n", route);
    }
}