package praktikum;

public class fNine {
    protected double P;

    public fNine(double perimeter) {
        P = perimeter;
    }

    public void result() {
        double p = P / 2;
        double a = P / 3;
        double square = Math.sqrt(p * Math.pow((p-a), 3));
        System.out.printf("Square is %.5f \n", square);
    }


}
