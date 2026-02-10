package praktikum;

public class hEleven {
    protected double a;
    protected double b;
    protected double c;
    private double D;
    private double x1;
    private double x2;

    public hEleven(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void result() {
        D = b*b - 4*a*c;
        if (D == 0) {
            x1 = -b / (2*a);
            System.out.printf("Уравнение \n (%.3f)*X^2+(%.3f)*X" +
                    "+(%.3f)=0 имеет 1 вещественный корень: \n" +
                    "%.3f", a, b, c, x1);
        }

        else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2*a);
            x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.printf("Уравнение \n (%.3f)*X^2+(%.3f)*X" +
                    "+ (%.3f)=0 имеет 2 вещественных корня: \n" +
                    "%.3f \n %.3f", a, b, c, x1, x2);
        }
        else
            System.out.printf("Уравнение \n (%.3f)*X^2+(%.3f)*X " +
                    "+(%.3f)=0 не имеет вещественных корней \n", a, b, c);
    }
}
