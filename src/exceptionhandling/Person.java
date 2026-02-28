package exceptionhandling;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        // ну тут все понятно по сообщению выбрасываемом при исключении
        if (name.length() < 3) throw new IllegalArgumentException("Длина имени начинается от 3 букв");
        if (age < 1 || age > 110) throw new IllegalArgumentException("Некорректный возраст: " + age);
        this.name = name;
        this.age = age;
    }
    void print() {System.out.printf("Name: %s \n Age: %s \n", name, age);}
}
