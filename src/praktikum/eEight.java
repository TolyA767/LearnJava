package praktikum;

public class eEight {
    protected double tC;

    public eEight(double tC) {
        this.tC = tC;
    }

    public void result() {
        double tF = tC * 1.8 + 32;
        double tK = tC - 273.15;
        System.out.printf("%.2f %.2f \n", tF, tK);
    }
}
