package dzienDrugi.obiektowosc.kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private Pracownik szef;
    private List<Pracownik> pracownicy = new ArrayList<>();

    public Firma(Pracownik szef) {
        this.szef = szef;
    }

    public void pokazPracownikow() {
        System.out.println("Szef: ");
        szef.podajSwojStan();
        System.out.println("Pracownicy:");
        for (Pracownik pracownik : pracownicy) {
            pracownik.podajSwojStan();
        }
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public Pracownik getSzef() {
        return szef;
    }
}
