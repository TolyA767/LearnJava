package oop.inheritance;

public class lesson {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "Ozon");
        bob.print();
        bob.infoWork();
    }
}

// Класс-наследник/подкласс/дочерний класс/производный класс
class Employee extends Person {

    private String company;

    // Мы можем расширять конструктор, добавляя свои данные и информацию
    Employee(String name, String company) {
        super(name);
        System.out.println("The name was created");
        this.company = company;
    }

    // выводим данные о компании + имя)
    void infoWork() {
        System.out.println("Company: " + company);
        System.out.println("Name: " + name); // можем т.к. поле name - protected
    }

    // Переопределение класса, допустим name - private.
    @Override
    void print() {
        super.print(); // вызываем метод print из класса Person которая выводит name
        System.out.println("Company: " + company);
    }
}

// Базовый класс/суперкласс/родительский класс
class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Name: " + name);
    }

}