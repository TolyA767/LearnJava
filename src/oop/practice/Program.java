package oop.practice;

public class Program {
    public static void main(String[] args) {
        System.out.println("ТЕСТ КОШКИ");
        Cat barsik = new Cat("Barsik", 1.3, 3);
        barsik.sound();
        System.out.println("У Барсика " + barsik.getLife() + " жизней");
        System.out.println("Животное барсик у нас " + barsik.getType());
        System.out.println();

        System.out.println("ТЕСТ ЛОШАДИ");
        Horse flash = new Horse("Flash", 4.5, 5);
        flash.sound();
        flash.transport();
        flash.getNormalSpeed();
        System.out.println("Животное Флэш у нас " + barsik.getType());

    }
}
