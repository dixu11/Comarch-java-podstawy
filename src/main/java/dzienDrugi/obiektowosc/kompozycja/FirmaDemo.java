package dzienDrugi.obiektowosc.kompozycja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirmaDemo {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan", 4000);
        Pracownik pracownik2 = new Pracownik("Anna", 5000);
        pracownik1.podajSwojStan();
        pracownik2.podajSwojStan();



        String[] tab = {"a", "b"};
        System.out.println(Arrays.toString(tab));




        List<String> pracownicy = new ArrayList<>();
        System.out.println(pracownicy.size());
        pracownicy.add("Jan");
        pracownicy.add("Anna");
        pracownicy.add("Kacper");
      //  pracownicy.add(23);

        String element3 =  pracownicy.get(2);
        System.out.println(element3);


//        System.out.println(pracownicy.size());
//        pracownicy.remove("Jan");
//        pracownicy.add(0,"Julia");
//        System.out.println(pracownicy);
//        System.out.println(pracownicy.size());
    }
}
