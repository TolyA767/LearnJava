package oop.enumeration;

public class EnumMethods {
    public static void main(String[] args) {
        // 1. values() - возвращает массив всех констант в перечислении

        DayTime2[] dts = DayTime2.values();
        for(DayTime2 dt: dts){
            System.out.println(dt);
        }

        // 2. ordinal() - возвращает индекс определённой константы
        DayTime2 current = DayTime2.AFTERNOON;
        System.out.println(current.ordinal());
    }
}
enum DayTime2{

    MORNING,
    AFTERNOON,
    EVENING,
    NIGHT
}
