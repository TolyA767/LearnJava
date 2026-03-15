package collections.practice.vote;

import java.sql.SQLOutput;
import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> candidates = new HashMap<>();

        while (true) {
            System.out.println("Введите что хотите сделать: vote - голосовать, remove - удалить голос");
            String answer = in.nextLine().toLowerCase();

            if (answer.equals("remove")) {
                System.out.println("Введите имя человека, которого хотите удалить");
                String name = in.nextLine();
                if (candidates.containsKey(name)) {
                    candidates.remove(name);
                } else {
                    System.out.println("За данного кандидата не голосовали");
                }
            } else if (answer.equals("vote")) {
                System.out.println("Введите имя человека, за которого хотите голосовать");
                String vote = in.nextLine();
                if (vote.equalsIgnoreCase("exit") || vote.isEmpty()) {
                    System.out.println("Вы вышли из программы");
                    break;
                } // та самая проверку которую ты советовал, если строка из пробелов пропускаем просто
                if (vote.trim().isEmpty()) {
                    continue;
                }

                candidates.put(vote, candidates.getOrDefault(vote, 0) + 1);

            }
        }

        // Вывод общего списка, после завершения программы
        System.out.println("Список кандидатов:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Ищем победителя
        Collection<Integer> votes = candidates.values();
        int maxVote = 0;
        for (int v : votes) {
            if (v > maxVote) {
                maxVote = v;
            }
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() == maxVote) {
                System.out.println("Победитель: " + entry.getKey());
                System.out.println("Количество голосов: " + maxVote);
            }
        }

    }
}
