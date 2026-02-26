package oop.enumeration;

public class Calculator {
    static public void main(String[] args) {
        Operation sum = new Operation(OpType.ADD, 25, 30);
        System.out.println(sum);

        Operation minus = new Operation(OpType.SUBTR, 47, 18);
        System.out.println(minus);

        Operation mult = new Operation(OpType.MULT, 21, 17);
        System.out.println(mult);
    }
}
// Перечисление операций
enum OpType {
    ADD,
    MULT,
    SUBTR
}
// Класс который выполняет текущую операцию
class Operation {
    private OpType type;
    private int a;
    private int b;

    Operation(OpType type, int a, int b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    public int execute() {
        return switch(type) {
            case ADD -> a + b;
            case MULT -> a * b;
            case SUBTR -> a - b;
        };
    }
}
