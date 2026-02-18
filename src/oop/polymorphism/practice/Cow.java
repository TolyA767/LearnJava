package oop.polymorphism.practice;

class Cow extends Animal {
    protected String tag;

    public Cow(String name, double age, String typeanimal, String tag) {
        super(name, age, typeanimal);
        this.tag = tag;
    }

    @Override
    void sound() {
        System.out.println("Мууу. Муууу! МУуу");
    }

}
