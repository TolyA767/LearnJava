package oop.polymorphism.practice;

class Dog extends Animal {
    public Dog(String name, double age, String typeanimal) {
        super(name, age, typeanimal);
    }

    @Override
    void sound() {
        System.out.println("Гав-гав-гав-гааввв-гавввв!!!");
        System.out.println("Ррррррррр-рррр!");
    }
}
