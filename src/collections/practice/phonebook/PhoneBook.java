package collections.practice.phonebook;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие (цифру от 1 до 6):");
            System.out.println("1.Добавить номер\n2.Удалить номер\n3.Найти номер по имени\n" +
                    "4.Найти имя по номеру\n5.Посмотреть все контакты\n6.Завершить программу");
            String answer = in.nextLine();
            if (answer.equals("1")) {
                System.out.println("Введите имя:");
                String name = in.nextLine().trim();
                System.out.println("Введите номер:");
                String number = in.nextLine().trim();
                add(phoneBook, name, number);
            } else if (answer.equals("2")) {
                System.out.println("Введите имя человека, номер которого надо удалить");
                String name = in.nextLine().trim();
                remove(phoneBook, name);
            } else if (answer.equals("3")) {
                System.out.println("Введите имя человека, чей номер надо найти");
                String name = in.nextLine().trim();
                searchName(phoneBook, name);
            } else if (answer.equals("4")) {
                System.out.println("Введите номер человека, чьё имя надо найти");
                String number = in.nextLine().trim();
                searchNumber(phoneBook, number);
            } else if (answer.equals("5")) {
                System.out.println("Список телефонной книжки:");
                allContacts(phoneBook);
            } else if (answer.equals("6")) {
                break;
            } else {
                System.out.println("Вы вввели неправильное значение, попробуйте заново!");
            }
        }
    }

    // 1.
    static void add(Map<String, String> phoneBook, String name, String number) {
        if (phoneBook.containsValue(number)) {
            System.out.println("Вы не можете добавить номер " + number + " он уже есть в книжке");
            return;
        } else if (phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
            System.out.printf("Номер для имени %s был успешно обновлён. Текущий номер: %s \n", name, number);
        } else {
            phoneBook.put(name, number);
            System.out.printf("Имя %s с номером %s был успешно добавлен!\n", name, number);
        }

    }

    // 2.
    static void remove(Map<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            String number = phoneBook.get(name);
            phoneBook.remove(name);
            System.out.printf("Имя %s с номером %s успешно удалён в телефонной книги \n", name, number);
        } else {
            System.out.println("Данного имени нету в телефонной книжке!");
        }

    }

    // 3.
    static void searchName(Map<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            System.out.printf("Номер %s: %s\n", name, phoneBook.get(name));
        } else {
            System.out.println("Данного имени нету в телефонной книжке");
        }
    }

    // 4.
    static void searchNumber(Map<String, String> phoneBook, String number) {
        if (phoneBook.containsValue(number)) {
            System.out.printf("Имя владельца номера %s: \n", number);
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        } else {
            System.out.printf("%s нету в телефонной книжке \n", number);
        }
    }

    // 5.
    static void allContacts(Map<String, String> phoneBook) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
