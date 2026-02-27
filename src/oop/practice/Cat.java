package oop.practice;

public class Cat extends Animal{
    // Жизнь кошки (от 1 до 9)
    public int life;

    public Cat(String name, double age, int life) {
        super(name, age);
        if (life > 0 && life < 10) {this.life = life;}
        else {System.out.println("У кошек от 1 до 9 жизней!!!");}
    }

    @Override
    public void sound() {System.out.println("МЯУ-мяу-мяу-мяяяяуууу!");}

    @Override
    public TypeAnimal getType() {return TypeAnimal.MAMMAL;}
    // возвращаем жизнь кошки
    public int getLife() {return life;}
}
