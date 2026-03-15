package collections.usefulthings.set;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        // Удаление дубликатов из списка
        List<String> letters = Arrays.asList("a", "b", "s", "a", "v", "s", "l");
        Set<String> uniqueLetters = new HashSet<>(letters); // остаются уникальные
        List<String> backlist = new ArrayList<>(uniqueLetters); // обратно в список

    }
}
