package collections.usefulthings.list;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        // 1. Пустой список
        List<String> list = new ArrayList<>();

        // 2. Сразу с элементами
        List<String> names = new ArrayList<>(List.of("Sasha", "Tolya", "Anna", "Masha"));
        System.out.println(names);
        System.out.println(names.size());

        // 3. Из массива в список
        Integer[] arr = {3, 4, 2, 1, 5};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        System.out.println(numbers);

        // 4. Добавление сразу несколько элементов
        Collections.addAll(list, "One", "Two", "Three", "Four");

        // 5. Поиск максимума и минимума
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Максимум: " + max + "\n" + "Минимум: " + min);

        // 6. Сортировка
        Collections.sort(numbers); // естественный порядок
        System.out.println(numbers);
        Collections.sort(names);
        System.out.println(names);

        numbers.sort(Collections.reverseOrder()); // обратный порядок, перевернуть список
        System.out.println(numbers);

        // 7. Копирование списка
        List<Integer> copy = new ArrayList<>(numbers);
        System.out.println("Копия списка numbers: " + copy);

        // 8. Список обратно в массив
        String[] arrayNames = names.toArray(new String[0]);
        System.out.println("Массив: " + Arrays.toString(arrayNames));
    }
}
