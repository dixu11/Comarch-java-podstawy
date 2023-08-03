import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random losownik = new Random();
        int losowa = losownik.nextInt(4) + 3; // 0-3 = 3-6
        int losowa2 = losownik.nextInt(3, 7); //3-6
        // 0.0 - 0% 1.0 - 100%
        double procent = losownik.nextDouble();
        System.out.println(losowa);
        System.out.println(losowa2);

        System.out.println(procent);
        int procentInt = (int) (procent * 100); //rzutowanie przy niezgodnych typach. uwaga na stratę danych!
       // long procentLong = Math.round(procentInt * 100); //z uwzględnieniem zaokrąglenia
        System.out.println("Wylosowano " + procentInt + " procent");
    }
}
