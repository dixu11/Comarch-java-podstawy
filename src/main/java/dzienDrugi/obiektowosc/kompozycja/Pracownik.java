package dzienDrugi.obiektowosc.kompozycja;

public class Pracownik {
    String imie;
    double pensja;

    public Pracownik(String imie, double pensja) {
        this.imie = imie;
        this.pensja = pensja;
    }

    public void podajSwojStan() {
        System.out.println("Imię: " + imie + " pensja: " + pensja + "zł");
    }
}
