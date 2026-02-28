package exceptionhandling;

public class Trycatchfinally {
    public static void main(String[] args) {
        printNum(1);
        printNum(3);

        try {
            Person tom = new Person("To", 21);
            tom.print();
        }
        catch(IllegalArgumentException illeg) {
            System.out.println(illeg.getMessage());
        }

    }

    static void printNum(int index) {
        String[] elements = {"5", "Adv", "g", "24", "oog", "2"};

        try {
            int result = Integer.parseInt(elements[index]);
            System.out.printf("По индексу %d стоит число %d \n", index, result);
        }
        // 2 типа непроверяемых исключений
        catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Выход за пределы");
        }
        catch (NumberFormatException num) {
            System.out.println("Невозможно буквы и знаки преобразовать в число!");
        }
    }

}
