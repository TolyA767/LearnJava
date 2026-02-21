package oop.abstractclasses;

// производный класс прямоугольник
class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(int x, int y, int width, int height) {
        // вызываем конструктор абстрактного класса - родителя
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Обязательно должны реализовать абстрактный метод у производного класса!
    @Override
    public void print() {
        System.out.printf("Данная фигура: прямоугольник. \n " +
                "Верхний левый угол: x: %d y: %d \n Ширина: %.0f \n Высота: %.0f \n", x, y, width, height);
    }

    @Override
    public double getPerimeter() {
        return (this.x + this.y) * 2;
    }

    @Override
    public double getSquare() {
        return this.x * 2 + this.y * 2;
    }

}
