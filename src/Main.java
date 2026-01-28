import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int a = in.nextInt();

        System.out.println("Введите число 2:");
        int b = in.nextInt();
        in.nextLine();

        System.out.println("Выберите арифметическую операцию:");
        System.out.println(" 1 - (+) \n 2 - (-) \n 3 - (*) \n 4 - (/)");
        String operation = in.nextLine();

        switch (operation) {
            case "1":
                System.out.printf("%d + %d = %d", a, b, a + b);
                break;
            case "2":
                System.out.printf("%d - %d = %d", a, b, a - b);
                break;
            case "3":
                System.out.printf("%d * %d = %d", a, b, a * b);
                break;
            case "4": {
                if (b != 0)
                    System.out.printf("%d / %d = %d", a, b, a / b);
                else
                    break;
            }
        }
    }
}