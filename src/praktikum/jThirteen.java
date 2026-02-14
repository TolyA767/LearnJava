package praktikum;
import java.util.Scanner;

public class jThirteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сторону a:");
        double a = in.nextDouble();
        System.out.println("Введите сторону b:");
        double b = in.nextDouble();
        System.out.println("Введите сторону c:");
        double c = in.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("треугольник равносторонний");
            } else if (a == b || a == c || b == c) {
                System.out.println("треугольник равнобедренный");
            } else {
                System.out.println("треугольник общего вида");
            }
        } else {
            System.out.println("треугольник не существует");
        }

        in.close();

    }
}
