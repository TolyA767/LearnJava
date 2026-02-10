package praktikum;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class iTwelve {
    protected int y1;
    protected int m1;
    protected int d1;
    protected int y2;
    protected int m2;
    protected int d2;

    public iTwelve(int y1, int m1, int d1, int y2, int m2, int d2) {
        this.y1 = y1;
        this.m1 = m1;
        this.d1 = d1;
        this.y2 = y2;
        this.m2 = m2;
        this.d2 = d2;
    }

    public void result() {
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        if (date1.isBefore(date2)) System.out.println("BEFORE");
        else if (date1.isAfter(date2)) System.out.println("AFTER");
        else System.out.println("SAME");
    }
}
