package oop.interfaces;

interface Movable {
    void move();
    // метод по умолчанию
    default void stop() {
        System.out.println("Останавливаемся!");
    }
}

class Car implements Movable {
    public void move() {
        System.out.println("Едем на машине");
    }
    // переопределяем метод по умолчанию
    public void stop() {
        System.out.println("Машина останавливается!");
    }

}
