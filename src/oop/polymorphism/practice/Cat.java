package oop.polymorphism.practice;

class Cat extends Animal {

    public Cat(String name, double age, String typeanimal) {
        super(name, age, typeanimal);
    }

    // Переопределяем метод звука для кошки
    @Override
    void sound() {
        System.out.println("Мяу-мяу-мяу-мяу-мяу-мяуууууууууу!!!");
    }
}
