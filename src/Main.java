import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.println("Заполните массив любыми 10-ю цифрами:");
        for (int i = 0; i < nums.length; i++){
            int number = in.nextInt();
            nums[i] = number;
        }

        int largest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        System.out.println("Максимальное число массива nums: " + largest);
    }
}