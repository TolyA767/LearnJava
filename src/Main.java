import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 1 (код)
        System.out.println("Введите защитный код длиной 4!:");
        Scanner in = new Scanner(System.in);
        short code = in.nextShort();
        in.nextLine();
        if (code >= 1000 && code <= 9999) {
            short key = 147;
            short encrypted = (short) (code ^ key);
            System.out.printf("Зашифрованный код: %d \n", encrypted);
            short decrypted = (short) (encrypted ^ key);
            System.out.printf("Расшифрованный код: %d", decrypted);
        }
        else
            System.out.println("ОШИБКА! Код не длины 4!");

    }
}