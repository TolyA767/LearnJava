package praktikum;

public class aFour {
    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;
    protected double x3;
    protected double y3;

    public aFour(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void result() {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double perimeter = a + b + c;
        System.out.printf("Perimeter is: %.4f \n", perimeter);

        double p = perimeter / 2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Square is: %.4f \n", square);
    }

}
