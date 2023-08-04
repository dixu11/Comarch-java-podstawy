package dzienDrugi.obiektowosc.kompozycja;

public class FirmaDemo2 {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Kacper", 8000);
        Pracownik pracownik2 = new Pracownik("Jan", 4000);
        Pracownik pracownik3 = new Pracownik("Anna", 5000);
        Firma firma = new Firma(pracownik3);
        firma.dodajPracownika(pracownik2);
        firma.dodajPracownika(pracownik1);
        firma.pokazPracownikow();

        Pracownik szef = firma.getSzef();
        szef.podajSwojStan();

    }
}
