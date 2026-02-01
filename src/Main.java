public class Main {
    public static void main(String[] args) {
        Person tolya  = new Person();
        tolya.name = "Anatoliy";
        tolya.age = 18;
        System.out.println(tolya.name);
        System.out.println(tolya.age);

        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 17;
        System.out.println(tom.name);
        System.out.println(tom.age);

        Person sasha = new Person();
        System.out.println(sasha.name); // null
        System.out.println(sasha.age); // 0
    }
}

class Person {
    String name;
    int age;

}