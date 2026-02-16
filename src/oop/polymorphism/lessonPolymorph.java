package oop.polymorphism;
// Одна команда - разные результаты!
public class lessonPolymorph {
    public static void main(String[] args) {
        Person3 sam = new Employee3("Sam", "Amazon");
        sam.print(); // вызов реализации метода print из класса Employee
        System.out.println();

        Person3 bob = new Employee3("Bob", "Google");
        printPerson3(bob);
    }

    static void printPerson3(Person3 person) {
        person.print();
    }

}

class Person3 {
    private String name;

    Person3(String name) {this.name = name;}

    void print() {
        System.out.println("Name: " + name);
    }
}

class Employee3 extends Person3 {
    private String company;

    Employee3 (String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Company: " + company);
    }

}
