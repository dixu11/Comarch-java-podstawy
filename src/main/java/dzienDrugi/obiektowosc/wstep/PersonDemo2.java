package dzienDrugi.obiektowosc.wstep;

public class PersonDemo2 {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3};
        int[] liczby2 = liczby;
        liczby2[0] = 100;
        System.out.println(liczby[0]);



        Osoba osoba1 = new Osoba();
        osoba1.imie = "jan";
        osoba1.wiek = 30;

        Osoba osoba2 = new Osoba();
        osoba2.imie = "Janina";
        osoba2.wiek = 35;

        Osoba osoba3 = new Osoba();
        osoba3.imie = "Joanna";
        osoba3.wiek = 25;

        osoba1 = osoba2;

        osoba2.wiek = 50;

        osoba1.przywitajSie();
        osoba2.przywitajSie();
        osoba3.przywitajSie();

        System.out.println(osoba1);
        System.out.println(osoba2);
        System.out.println(osoba3);
    }
}
