package praktikum;

import java.util.Scanner;

public class lFifteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму покупки в копейках");

        int buy = in.nextInt();

        if (buy > 0 && buy <= 100000) {
            int rub = buy / 100;
            int kop = buy % 100;

            if (rub > 0)
                System.out.println(rub + " " + decRub(rub));

            if (kop > 0)
                System.out.println(kop + " " + decKop(kop));
        }
        else
            System.out.println("Диапазон от 0 до 100000!");

        in.close();
    }

    // Метод для окончания рублей
    public static String decRub(int num) {
        int last = num % 10;
        int lastTwo = num % 100;

        // Исключение для
        if (lastTwo >= 11 && lastTwo <= 14)
            return "рублей";

        // Для остальных чисел
        switch (last) {
            case 1: return "рубль";
            case 2: return "рубля";
            case 3: return "рубля";
            case 4: return "рубля";
            default: return "рублей";
        }
    }

    // Метод для окончания копеек
    public static String decKop(int num) {
        int lastDigit = num % 10;
        int lastTwoDigits = num % 100;

        // Исключение для 11-14
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "копеек";
        }

        // Для остальных чисел
        switch (lastDigit) {
            case 1: return "копейка";
            case 2: return "копейки";
            case 3: return "копейки";
            case 4: return "копейки";
            default: return "копеек";
        }

    }

}