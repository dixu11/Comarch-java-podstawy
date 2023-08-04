package dzienDrugi.obiektowosc.wstep;

public class Osoba {

    //cechy - zmienne
    String imie;
    int wiek;

    //zachowania - metody
    void przywitajSie() {
        System.out.println("Nazywam się " + imie + " mam " + wiek + " lat");
    }

    void obchodzUrodziny() {
        wiek++;
    }

}
