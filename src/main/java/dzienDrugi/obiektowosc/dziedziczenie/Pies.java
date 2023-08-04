package dzienDrugi.obiektowosc.dziedziczenie;

public class Pies extends Zwierze {
    private String imie;
    private int wiek;

    public Pies(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void jedz() {
        super.jedz();
        System.out.println("Pies je psią karmę");
    }

    public void wydajDzwiek() {
        System.out.println("hau hau!");
    }
}
