package dzienDrugi.obiektowosc.dziedziczenie;

public class Kot extends Zwierze{
    private String imie;
    private int wiek;

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void jedz() {
        System.out.println("kot je mokrą karmę");
    }

    public void wydajDzwiek(){
        System.out.println("Miał");
    }

}
