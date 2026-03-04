package collections.Generics;

public class Generics {
    public static void main(String[] args) {
        Example<Car, String> example = new Example<>();

        Car car1 = new Car("BMW M5", 2023);
        Car car2 = new Car("Toyota", 2017);
        Car car3 = new Car("Mercedes Benz", 2025);

        example.addToString(car1, "Fantastic!!!");
        example.addToString(car2, "Nice");
        example.addToString(car3, "Great!!");

        System.out.println(example.getString());
    }
}
