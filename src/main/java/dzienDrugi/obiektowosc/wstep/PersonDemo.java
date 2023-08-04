package dzienDrugi.obiektowosc.wstep;

import java.util.Random;

public class PersonDemo {

    public static void main(String[] args) {
        int liczba = 123123123; //typ prymitywny
        String text = new String("c"); //typ referencyjny
        int[] liczby = new int[]{1, 2, 3}; //typ referencyjny
        Random random = new Random(); //typ referencyjny

        //typ nazwa = wartosc;

        Osoba jan = new Osoba();
        jan.imie = "jan";
        jan.wiek = 30;

        Osoba janina = new Osoba();
        janina.imie = "Janina";
        janina.wiek = 35;

        Osoba joanna = new Osoba();
        joanna.imie = "Joanna";
        joanna.wiek = 25;

        jan = janina;
        janina.wiek = 50;

//        System.out.println(jan.imie);
//        System.out.println(jan.wiek);
//        System.out.println(janina.imie);
//        System.out.println(janina.wiek);
//        System.out.println(joanna.imie);
//        System.out.println(joanna.wiek);
        jan.przywitajSie();
        janina.przywitajSie();
        joanna.przywitajSie();

      //  jan.obchodzUrodziny();
//        jan.przywitajSie();

        System.exit(0);
        Osoba[] osoby = {jan, janina, joanna};
        for (Osoba osoba : osoby) {
            if (osoba.wiek > 30) {
                continue;
            }
            osoba.przywitajSie();
        }
    }

}
