package collections.practice.sitevisit;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<String> sites = new ArrayList<>();
        Set<String> uniqueIp = new HashSet<>();

        System.out.println("Введите сайт, который посетили и ваш IP-адрес в формате: страница, ip");
        System.out.println("Для выхода из программы введите exit");
        Scanner in = new Scanner(System.in);
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("exit")) {
                break;
            }
            String[] data = answer.split(",");
            if (data.length < 2) {
                System.out.println("Ошибка, введите 2 значения через запятую");
                continue;
                }
            String page = data[0].trim();
            String ip = data[1].trim();

            sites.add(page);
            uniqueIp.add(ip);
        }

        System.out.println("Удалось собрать " + sites.size() + " посещений сайтов");
        for (String s : sites) {
            System.out.println(s);
        }
        System.out.println("Удалось собрать " + uniqueIp.size() + " уникальных айпи адресов");
        for (String i : uniqueIp) {
            System.out.println(i);
        }

    }
}
