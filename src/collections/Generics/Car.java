package collections.Generics;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Это автомобиль " + model + " " + year + " года выпуска";
    }
}
