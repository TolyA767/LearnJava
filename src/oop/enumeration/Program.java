package oop.enumeration;

public class Program {
    static public void main(String[] args) {
        DayTime cur = DayTime.MORNING;
        String message = getMessage(cur);
        System.out.println(message);

        DayTime cur2 = DayTime.EVENING;
        message = getMessage(cur2);
        System.out.println(message);
    }

    static String getMessage(DayTime daytime) {
        return switch(daytime) {
            case MORNING -> "Доброе утро!";
            case AFTERNOON -> "Добрый день!";
            case EVENING -> "Добрый вечер!";
            case NIGHT -> "Сладких снов!";
        };
    }
}

enum DayTime {
    MORNING,
    AFTERNOON,
    EVENING,
    NIGHT
}