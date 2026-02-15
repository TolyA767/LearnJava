package oop.inheritance.ban;

public class Person2 {
    private String name;

    Person2(String name){
        this.name = name;
        printPerson();
    }

    // Запрет переопределения
    final void printPerson(){
        System.out.println("Name: " + name);
    }

    // точка входа в программу
    public static void main (String args[]){
        Employee2 bob = new Employee2("Bob", "Google");
    }
}


class Employee2 extends Person2{
    private String company;

    Employee2(String name, String company){
        super(name);
        this.company = company;
        printEmployee2();
    }

    void printEmployee2(){
        System.out.println("Company: " + company);
    }
}
