package praktikum;

public class gTen {
    protected int ageKolya;
    protected int ageMisha;

    public gTen(int ageKolya, int ageMisha) {
        this.ageKolya = ageKolya;
        this.ageMisha = ageMisha;
    }

    public void result() {
        double average = ((double) ageMisha + ageKolya) / 2;
        double dev1 = Math.abs(average - ageKolya);
        double dev2 = Math.abs(average - ageMisha);
        System.out.printf("Average: %.4f \n", average);
        System.out.printf("Devation 1: %.4f \n", dev1);
        System.out.printf("Devation 2: %.4f \n", dev2);
    }
}
