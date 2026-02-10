package praktikum;

public class bFive {
    protected int day;

    public bFive(int day) {
        this.day = day;
    }

    public void result() {
        int years = day / 360;
        int months = (day - years*360) / 30;
        int days = (day - years*360 - 30*months);
        System.out.printf("Years: %d \n", years);
        System.out.printf("Months: %d \n", months);
        System.out.printf("Days: %d \n", days);

    }
}
