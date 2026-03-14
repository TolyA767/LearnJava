package collections.practice.sitevisit;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        System.out.println("Введите любые строки");
        System.out.println("Для выхода из программы напишите exit или пустую строку");
        List<String> words = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            String text = in.nextLine();
            if (text.equalsIgnoreCase("exit") || text.isEmpty()) {
                System.out.println("Вы вышли из программы");
                break;
            }
            String[] rawWords = text.split("[\\s,!.?;\\-]+");
            for (int i = 0; i < rawWords.length; i++) {
                String w = rawWords[i].trim().toLowerCase();
                if (!w.isEmpty()) {
                    words.add(w);
                    uniqueWords.add(w);
                }
            }
        }

        System.out.println("Всего слов: " + words.size());
        System.out.println("Уникальных слов: " + uniqueWords.size());
        // Ищем самое популярное слово
        int maxCount = 0;
        String popularWord = null;

        for (String w : uniqueWords) {
            int count = Collections.frequency(words, w);
            if (count > maxCount) {
                maxCount = count;
                popularWord = w;
            }
        }
        System.out.println("Самое популярное слово: " + popularWord + "\n" +" Встречается: " + maxCount + " раз");

    }
}
