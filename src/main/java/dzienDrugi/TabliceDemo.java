package dzienDrugi;

import java.util.Random;

public class TabliceDemo {

    public static void main(String[] args) {
        int liczba = 10;
        int[] liczby = new int[10];
        //przy tym sposobie inicjalizacji tablicy wszystkie wartości ustawiają się na domyślne:
        //dla liczb 0, dla obiektów null, dla boolean false
        liczby[1] = 123;
        //System.out.println(liczby[1]);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            liczby[i] = random.nextInt(1, 100);
        }
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            int przegladanaLiczba = liczby[i];
            System.out.println(liczby[i]);
            if (przegladanaLiczba < 25) {
                suma += przegladanaLiczba;
            }
        }

        //Pętla for-each pozwala na przeglądanie zbiorów element po elemencie (nie wiemy z jakiej pozycji pochodził element
        //więc nie jesteśmy w stanie modyfikować zbioru)
        for(int przegladana : liczby){
            System.out.println(przegladana);
            if (przegladana < 25) {
                suma += przegladana;
            }
        }

        // fori / iter - skróty do generowania pętli w intelliJ


        System.out.println("Suma to: " + suma);
    }

}
