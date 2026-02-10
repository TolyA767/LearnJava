package praktikum;

public class dSeven {
    protected double sofa;
    protected double suitcase;
    protected double trBag;
    protected double pict;
    protected double bask;
    protected double cardboard;
    protected double dog;

    private final int N = 100; // багаж
    private final int M = 150; // кладь


    public dSeven(double sofa, double suitcase, double trBag, double pict, double bask, double cardboard, double dog) {
        this.sofa = sofa;
        this.suitcase = suitcase;
        this.trBag = trBag;
        this.pict = pict;
        this.bask = bask;
        this.cardboard = cardboard;
        this.dog = dog;
    }

    public void result() {
        double baggage = sofa + suitcase + trBag + pict;
        double luggage = bask + cardboard + dog;

        if (baggage <= 20 && luggage <= 5) System.out.println("Penalty is 0 rub");

        // Переплата с кладью
        else if (baggage <= 20 && luggage > 5) {
            double overpay = (luggage - 5) * M;
            System.out.printf("Penalty is %.2f rub \n", overpay);
        }

        // Переплата багажа
        else if (baggage > 20 && luggage <= 5) {
            double overpay = (baggage - 20) * N;
            System.out.printf("Penalty is %.2f rub \n", overpay);
        }

        // Переплата и багажа и клади
        else if (baggage > 20 && luggage > 5) {
            double overpay = (luggage - 5) * M + (baggage - 20) * N;
            System.out.printf("Penalty is %.2f rub \n", overpay);
        }
    }

}
