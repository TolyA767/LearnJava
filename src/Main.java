import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        System.out.println(anna.cnt);
        Person olya = new Person("Olya");
        System.out.println(olya.cnt);

        int res = Calculator.Sum(5, 10);
        System.out.println(res);

        Date curDate = new Date();
        System.out.println(curDate);
    }
}

class Person {
    String name;
    static int cnt = 0;

    Person(String name) {
        this.name = name;
        cnt += 1;
    }
}

class Calculator {

    static int Sum(int a, int b) {
        return a + b;
    }

    int Sum2(int a, int b) {
        return a + b;
    }
}