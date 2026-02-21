package oop.abstractclasses;

abstract class Shape {
    int x;
    int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // абстрактный метод который выводит в терминал какие-то данные)
    abstract void print();
    // абстрактный метод для периметра
    abstract double getPerimeter();
    // абстрактный метод для площади
    abstract double getSquare();
}
