package collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class MobilePhone {
    public static void main(String[] args) {
        Set<String> numbers = new HashSet<>();
        addNumber(numbers, "89274320851");
        addNumber(numbers, "89378540211");
        addNumber(numbers, "89274320851");
    }

    public static void addNumber(Set<String> array, String number) {
        if (array.contains(number)) {
            System.out.println("Номер " + number + " уже есть!");
        } else {
            array.add(number);
            System.out.println("Номер " + number + " был добавлен!");
        }
    }
}
