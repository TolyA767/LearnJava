package collections.dictionary;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Program {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Мама", "+79278417445");
        phoneBook.put("Папа", "+79176543669");
        phoneBook.put("Друг", "+79374745117");

        // Получаем номер друга, метод get
        String friend = phoneBook.get("Друг");
        System.out.println("Номер друга " + friend);
        // Проверяем есть ли номер подруги, кстати containsKey - быстрый O(1)
        if (phoneBook.containsKey("Подруга")) {
            System.out.println("Номер подруги " + phoneBook.get("Подруга"));
        } else {
            System.out.println("Номер подруги отсутствует");
        }
        System.out.println("Количество номеров в телефонной книжке: " + phoneBook.size());
        // Удаляем номер друга (по ключу)
        phoneBook.remove("Друг");
        System.out.println("Количество номеров в телефонной книжке после удаления друга: " + phoneBook.size());
        // Возвращаем множество всех ключей (имён телефонной книжки)
        System.out.println("Люди, которые есть в нашей телефонной книжке:");
        Set<String> users = phoneBook.keySet();
        for (String u : users) {
            System.out.println(u);
        }
        System.out.println();

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Анатолий", 18);
        ages.put("Александр", 26);
        ages.put("Ильнар", 39);
        ages.put("Ильдар", 41);
        ages.put("Ильназ", 5);
        System.out.println("Вывод имён и возрастов:");
        // Вывод словаря в консоль, самый частый способ
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}