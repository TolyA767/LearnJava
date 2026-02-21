package oop.abstractclasses;

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    Circle(int x, int y, double radius) {
        super(x,y);
        this.radius = radius;
    }

    // Обязательно должны реализовать абстрактный метод у производного класса
    @Override
    public void print() {
        System.out.printf("Данная фигура: круг. \n" +
                "Центр: x: %d y: %d \n Радиус: %.2f \n", x, y, radius);
    }

    @Override
    public double getPerimeter() { return 2 * PI * radius; }

    @Override
    public double getSquare() {
        return PI * Math.pow(radius, 2);
    }
}
