package projekty;

import java.util.Random;
import java.util.Scanner;

public class ProjektSklepZArtefaktami {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String bohater = "Joanna Odważna";
        int silaBohatera = random.nextInt(5);
        int obronaBohatera = 4 - silaBohatera;
        int monety = 25;
        System.out.println("Do sklepu przychodzi heros:");
        wyswietlOpisOsoby(bohater, silaBohatera, obronaBohatera, monety);

        String[] przedmioty = {"kamień filozoficzny", "różdżka", "złoty znicz"};
        String przedmiot = wylosujPrzedmiot(przedmioty);
        Integer[] koszty = {5, 10, 15};
        int kosztPrzedmiotu;
        int max;
        int obronaPrzedmiotu;
        int silaPrzedmiotu;
        String odpowiedz;
        int iloscLosowania = 3;
        for (int i = 0; i < iloscLosowania; i++) {
            przedmiot = wylosujPrzedmiot(przedmioty);
            kosztPrzedmiotu = wylosujKoszt(koszty);
            max = kosztPrzedmiotu / 5;
            obronaPrzedmiotu = random.nextInt(max + 1);
            silaPrzedmiotu = max - obronaPrzedmiotu;

            wyswietlOpisPrzedmiotu(przedmiot, obronaPrzedmiotu, silaPrzedmiotu, kosztPrzedmiotu);

            System.out.println("Czy chcesz sprzedać przedmiot czy nie?\nTAK\nNIE");

            odpowiedz = scanner.nextLine();
            if (odpowiedz.equals("TAK")) {
                if (monety >= kosztPrzedmiotu) {
                    monety = monety - kosztPrzedmiotu;
                    System.out.println("Kupiłaś przedmiot");
                    silaBohatera = silaBohatera + silaPrzedmiotu;
                    obronaBohatera = obronaBohatera + obronaPrzedmiotu;
                } else {
                    System.out.println("Masz za mało monet.");
                }
            }
            wyswietlOpisOsoby(bohater, silaBohatera, obronaBohatera, monety);
        }
        System.out.println("Bohater walczy z potworem");
        String potwor = "Ogr";
        int silaPotwora = random.nextInt(7);
        int obronaPotwora = 6 - silaPotwora;
        System.out.println("Imie: " + potwor);
        System.out.println("Siła: " + silaPotwora);
        System.out.println("Obraona: " + obronaPotwora);
        if (silaBohatera >= obronaPotwora){
            System.out.println("Bohater wygrywa!");
        }
        if (silaPotwora >= obronaBohatera) {
            System.out.println("Bohater ginie :(");
        }
    }

    public static String wylosujPrzedmiot(String[] pula) {
        Random random = new Random();
        int indexPrzedmiotu = random.nextInt(pula.length);
        String przedmiot = pula[indexPrzedmiotu];
        return przedmiot;
    }

    public static int wylosujKoszt(Integer[] pula) {
        Random random = new Random();
        int indexKosztu = random.nextInt(pula.length);
        int koszt = pula[indexKosztu];
        return koszt;
    }

    private static void wyswietlOpisOsoby(String bohater, int silaBohatera, int obronaBohatera, int monety) {
        System.out.println("Imię: " + bohater);
        System.out.println("Siła: " + silaBohatera);
        System.out.println("Obrona: " + obronaBohatera);
        System.out.println("Monety: " + monety);
    }

    private static void wyswietlOpisPrzedmiotu(String wylosowanyPrzedmiot, int obronaPrzedmiotu, int silaPrzedmiotu, int wylosowanyKoszt) {
        System.out.println("\n\nPrzedmiot na sprzedaż:");
        System.out.println("Nazwa: " + wylosowanyPrzedmiot);
        System.out.println("Siła: " + silaPrzedmiotu);
        System.out.println("Obrona: " + obronaPrzedmiotu);
        System.out.println("Cena: " + wylosowanyKoszt);
    }

/*public static int[] wylosujDanePrzedmiotu(Integer[] pula) {
        Random random = new Random();
        int[] danePrzedmiotu = new int[2];
        int indexKosztu = random.nextInt(pula.length);
        int koszt = pula[indexKosztu];
        int max = koszt / 5;
        int obronaPrzedmiotu = random.nextInt(max + 1);
        int silaPrzedmiotu = max - obronaPrzedmiotu;
        danePrzedmiotu[0] = koszt;
        danePrzedmiotu[1] = obronaPrzedmiotu;
        danePrzedmiotu[2] = silaPrzedmiotu;
        return danePrzedmiotu;
    }*/
}
