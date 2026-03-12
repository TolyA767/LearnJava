package collections.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        String text = "Hello yellow banana green black hello hello banana max orange lemon green";
        String[] words = text.split(" ");
        Set<String> inuqeword = new HashSet<>();
        for (String w : words) {
            if (!w.isEmpty()) { // отброс пустых строк
                // Перевод в нижний регистр, чтобы Hello, HeLlo, hello читалось одинаковым словом
                inuqeword.add(w.toLowerCase());
            }
        }

        for (String w : inuqeword) {
            System.out.println(w);
        }

    }
}
