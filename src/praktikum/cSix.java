package praktikum;

public class cSix {
    protected int speedMa;
    protected int speedHr;
    protected int s;

    public cSix(int speedMa, int speedHr, int s) {
        this.speedMa = speedMa;
        this.speedHr = speedHr;
        this.s = s;
    }

    public void result() {
        int maxSpeed = speedMa + speedHr;
        int result = (s * 1000 * 3600) / (maxSpeed * 1000);
        System.out.printf("%d seconds \n", result);
    }
}
