package praktikum;
import java.util.Scanner;
public class kFourteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите координаты 1 вершины:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Введите координаты 2 вершины:");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.println("Введите координаты 3 вершины:");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double eps = 1e-9;
        if (a + b > c && a + c > b && b + c > a) {
            if (Math.abs(a - b) < eps && Math.abs(b - c) < eps) {
                System.out.println("треугольник равносторонний");
            } else if (Math.abs(a - b) < eps || Math.abs(a - c) < eps ||
                    Math.abs(b - c) < eps) {
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
