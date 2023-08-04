package dzienDrugi.obiektowosc.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class ZwierzetaDemo {
    public static void main(String[] args) {
        Pies pies = new Pies("Bruno", 9);
        Kot kot = new Kot("Parszywek", 7);
//        pies.szczekaj();
        pies.jedz();
//        kot.miacz();


        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(pies);
        zwierzeta.add(kot);
        for (Zwierze zwierze : zwierzeta) {
           zwierze.jedz();
           zwierze.wydajDzwiek();
        }

        System.out.println("------------");
        Zwierze jakiesZwierze = new Pies("Pluto", 3);
        jakiesZwierze.wydajDzwiek();
        jakiesZwierze = new Kot("Mruczek", 5);
        jakiesZwierze.wydajDzwiek();



    }
}
