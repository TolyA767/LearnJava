package oop.inheritance.inher;

public class Maintest {
    public static void main(String[] args) {
        System.out.println("===== 1. Information about car =====");
        Vehicle car = new Vehicle("BMW", 2024, 250);
        car.displayInfo();

        System.out.println("====== 2. Information about bus =====");
        Bus nefaz = new Bus("NefAZ-5299", 2023, 120, 28, "the village Mihaylovka");
        nefaz.displayInfo();

        System.out.println("===== 3. Information about taxi =====");

        // Класс-наследник
        Taxi bob = new Taxi("Lada Granta", 2012, 200,
                24.63, true, "Bob");

        bob.displayInfo();
        bob.calculatePrice(25);

    }
}
