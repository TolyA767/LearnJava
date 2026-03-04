package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>(12); // ТИП справа можно не указывать

        // 1. Добавление в список
        people.add("Tom");
        Collections.addAll(people, "Sasha", "Dasha", "Lena", "Dasha", "Vadik"); // множественное добавление
        people.add("Leo");
        people.add(1, "Max"); // вставить между 2-мя элементами
        people.addFirst("Alina"); // добавляем в самое 1 место
        people.addLast("Anatoliy"); // добавить в конец списка


        // 2. Получение элемента по индексу
        String firstpeople = people.get(0);
        System.out.println("1 человек в списке это: " + firstpeople);
        String lastpeople = people.get(2);
        System.out.println("Последний человек в списке это: " + lastpeople);

        // 3. Изменение элемента
        people.set(0, "Sara"); // заменяем элемент с индексом 0 на Sara

        // 4. Удаление элементов со списка
        people.remove("Max"); // удаление по значению (первое вхождение)
        people.remove(0); // удаление по индексу (вернет удаленный элемент)

         // 5. Узнать размер списка
        int len = people.size();
        System.out.println("Размер списка равен: " + len);

        // 6. Проверка, есть ли элемент
        boolean hasLeo = people.contains("Leo");

        // 7. Узнать индекс элемента
        int index = people.indexOf("Dasha"); // первое вхождение
        int lastIndex = people.lastIndexOf("Dasha"); // последнее вхождение


    }
}
