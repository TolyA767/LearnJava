package oop.hierarchy;

public class Program {
    public static void main(String[] args) {
        // Example upcasting:
        Object tom = new Person("Tom"); // преобразование от Person к Object
        Object sam = new Employee("Sam", "Yandex"); // от Employee к Object
        Object kate = new Client("Kate", "SberBank"); // от Client к Object
        Person bob = new Client("Bob", "VTB"); // от Client к Person
        Person alice = new Employee("Alice", "VK"); // от Employee к Person

    }

    static void printPerson(Person person) {
        // Объект person может быть: Person, Employee, Client. Мы проверяем что объект - сотрудник
        if (person instanceof Employee) {
            Employee emp = (Employee) person;
            System.out.println("Employee work in " + emp.getCompany());
        }
        else
            System.out.println("Person is not an Employee");
    }
}

// 1
class Person {
    private String name;
    String getName() {return name;}
    Person(String name){
        this.name=name;
    }
    void print(){
        System.out.printf("Person %s \n", name);
    }
}

// 2
class Employee extends Person{
    private String company;
    String getCompany() {
        return company;
    }
    Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    void print() {
        System.out.printf("Employee %s works in %s", getName(), getCompany());
    }

}

// 3
class Client extends Person{
    private String bank;
    String getBank(){return bank;}
    Client(String name, String bank) {
        super(name);
        this.bank=bank;
    }
    void print(){
        System.out.printf("Client %s has account in %s \n", getName(), bank);
    }
}
