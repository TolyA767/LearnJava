package collections.arraylist.task1;
/*
Задача 1.1: Создай ArrayList<String> с именами друзей (минимум 4 имени).
Выведи все имена в цикле.
Задача 1.2: Добавь новое имя в начало списка. Выведи список.
Задача 1.3: Удали имя, которое стоит на позиции 2. Выведи список.
Задача 1.4: Замени третье имя на "Друг". Выведи список.
Задача 1.5: Выведи размер списка.
*/

import java.util.ArrayList;

public class Lvl1 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        // 1.1
        friends.add("Ansar");
        friends.add("Bogdan");
        friends.add("Denis");
        friends.add("Ruslan");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(i + 1 + ": " + friends.get(i));
        }
        System.out.println();
        // 1.2
        friends.addFirst("Noname");
        // 1.3
        friends.remove(1);
        for (String friend : friends) {
            System.out.println(friend);
        }
        System.out.println();
        // 1.4
        friends.set(2, "Друг");
        for (String friend : friends) {
            System.out.println(friend);
        }
        System.out.println();
        // 1.5
        System.out.println("Размер массива friends = " + friends.size());
        System.out.println();
/*
Задача 2.1: Проверь, есть ли в списке имя "Петя". Если есть — выведи его индекс.
Задача 2.2: Найди последнее вхождение имени "Анна" (если оно есть в списке несколько раз).
Задача 2.3: Создай список чисел ArrayList<Integer> от 1 до 10.
Выведи все чётные числа из списка. Подсказка: % 2 == 0
*/
        // 2.1
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i) == "Петя") {
                System.out.println("Индекс: " + i);
            } else {
                continue;
            }
        }
        // 2.1
        int lastAnna = friends.lastIndexOf("Анна");
        if (lastAnna >0)
        System.out.println("Последнее вхождение имени Анна: " + lastAnna);


    }
}
