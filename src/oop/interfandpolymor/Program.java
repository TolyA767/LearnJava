package oop.interfandpolymor;

public class Program {
    public static void main(String[] args) {
        // пример с TextFile
        TextFile file = new TextFile("content.txt", "Hello World");
        System.out.println("Печать файла " + file.getName());
        file.print();

        // разрешения конфликта default-методов
        file.foo();  // Вызовет Printable.super.foo() -> "Foo2"

        // полиморфизм
        System.out.println("\n Полиморфизм ");
        processAsFile(file);
        processAsPrintable(file);

        // наследования интерфейсов
        System.out.println("\n Наследование интерфейсов ");
        Calc calc = new Calc("2", "3", "4");
        processAsAB(calc);     // Можно передавать как AB
        processAsC(calc);      // Можно передавать как C

        // Интерфейс C включает в себя AB
        C cRef = calc;
        cRef.sum();   // метод из AB
        cRef.mult();  // метод из C
    }

    static void processAsFile(File f) {
        System.out.println("Обработка как File: " + f.getName());
    }

    static void processAsPrintable(Printable p) {
        System.out.print("Обработка как Printable: ");
        p.print();
    }

    static void processAsAB(AB ab) {
        System.out.print("Обработка как AB: ");
        ab.sum();
    }

    static void processAsC(C c) {
        System.out.print("Обработка как C: ");
        c.sum();
        c.mult();
    }
}

// Интерфейсы
interface File {
    String getName();
    default void foo() {
        System.out.println("Foo1 from File");
    }
}

interface Printable {
    void print();
    default void foo() {
        System.out.println("Foo2 from Printable");
    }
}

// Класс с разрешением конфликта
class TextFile implements File, Printable {
    private String name;
    private String text;

    TextFile(String name, String text) {
        this.name = name;
        this.text = text;
    }

    // убираем конфликт default-методов
    public void foo() {
        Printable.super.foo();  // Выбираем реализацию из Printable
        // Можно было бы: File.super.foo() или своя реализация метода foo (переопределить)
    }

    public String getName() { return this.name; }
    public void print() { System.out.println(text); }
}

// Иерархия интерфейсов
interface AB {
    void sum();
}

interface C extends AB {
    void mult();
}

// Класс реализует производный интерфейс
class Calc implements C {
    private String A, B, C;

    public Calc(String A, String B, String C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void sum() {
        System.out.println("A + B = " + (A + B)); // Строковая конкатенация
    }

    public void mult() {
        System.out.println("A * B * C = " + A + B + C); // Просто для различия)
    }
}