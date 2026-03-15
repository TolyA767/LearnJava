package collections.usefulthings.map;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        // подсчёт частоты
        Map<String, Integer> map = new HashMap<>();
        map.put("word", map.getOrDefault("word", 0) + 1);


    }
}
