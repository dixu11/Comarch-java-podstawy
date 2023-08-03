public class ZmienneDemo {
    public static void main(String[] args) {
        String nazwaProduktu = "Lodówka";
        double cenaProduktu = 1599;
        int iloscRat = 12;
        double cenaKostkarki = 100;
        System.out.println( nazwaProduktu + " sprzedajemy bez watu");
        System.out.println("Sprzęt: " + nazwaProduktu.toUpperCase());
        System.out.println("Cena: " + cenaProduktu + "zł");
        System.out.println("Ilość rat: "  + iloscRat);
        System.out.println("Cena jednej raty: " + cenaProduktu / iloscRat);
        double cenaLodowkiZKostkarka = cenaProduktu + cenaKostkarki;
        System.out.println("Cena wersji z kostkarką " + cenaLodowkiZKostkarka + "zł");
        System.out.println("Cena jednej raty z kostkarką " + cenaLodowkiZKostkarka / iloscRat);

        cenaProduktu = 1100;
      //  cenaProduktu = cenaProduktu * 1.23;
        cenaProduktu *= 1.23;
        nazwaProduktu = "Kuchenka";
        System.out.println(nazwaProduktu + " (cena z vat 23%)");
        System.out.println("Sprzęt: " + nazwaProduktu);
        System.out.println("Cena: " + cenaProduktu + "zł");
        System.out.println("Ilość rat: 12");
        System.out.println("Cena jednej raty: " + cenaProduktu / 12.0);
        System.out.println("Cena wersji z okapem " + (cenaProduktu + 150) + "zł");
        boolean mozliwaSprzedazNaWieleRat = cenaProduktu > 1000;
        System.out.println("Możliwa sprzedaz na 24 raty: " + mozliwaSprzedazNaWieleRat);

        //liczby całkowite = byte, short, int, long
        //liczby dizesiętne = float, double
        //znaki = char (+String)
        //logiczne = boolean
    }
}
