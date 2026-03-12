package collections.comparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        var people = new ArrayList<Person>();
        Person tom = new Person("Tom", 17);
        Person alex = new Person("Alex", 24);
        Person max = new Person("Max", 15);
        Person sasha = new Person("Sasha", 43);
        Person dima = new Person("Dima", 32);
        Person dima2 = new Person("Dima", 38);
        Person tom2 = new Person("Tom", 48);
        Collections.addAll(people, tom, alex, max, sasha, dima, tom2, dima2);
        // Множественное сравнение, если имена совпадают, то сравниваем по возрасту
        Comparator<Person> totalComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        people.sort(totalComparator);
        for (var p : people) {
            p.print();
        }
        System.out.println();
        // Сортировка через интерфейс Comparable
        var people2 = new ArrayList<String>();
        people2.add("Tom");
        people2.add("Bob");
        people2.add("Sam");
        people2.sort(null);
        for(var p : people2){
            System.out.println(p);
        }

    }
}

class PersonNameComparator implements Comparator<Person> {
    // сортировка по имени
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}

class PersonAgeComparator implements Comparator<Person> {
    // сортировка по возрасту
    public int compare(Person a, Person b) {
        return a.getAge() - b.getAge();
    }
}

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.printf("Person: %s %d \n", name, age);
    }
}


