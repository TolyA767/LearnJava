package oop.abstractclasses;

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(3, 3, 15, 5);
        shape1.print();
        System.out.println("Площадь прямоугольника: " + shape1.getSquare());
        System.out.println();

        Shape shape2 = new Circle(5, 5, 6.5);
        shape2.print();
        System.out.println("Площадь круга: " + shape2.getSquare());
    }
}
