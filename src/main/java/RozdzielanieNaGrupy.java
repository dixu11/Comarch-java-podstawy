import java.util.Arrays;
import java.util.Random;

public class RozdzielanieNaGrupy {
    public static void main(String[] args) {
        String[] uczestnicy = {"Oleksi","Iga","Piotr","Agata",
                "Kacper S","Kacper W", "Tomasz"};
        String[] grupa1 = wylosujZeZbioru(uczestnicy, 3);
        String[] grupa2 = wylosujZeZbioru(uczestnicy, 2);
        String[] grupa3 = wylosujZeZbioru(uczestnicy, 2);

        String proj4 = "Sklep z artefaktami";
        String[] projekty = {"Gra w kości", "Quiz", "Stworek", proj4};
        String[] wylosowaneProjekty = wylosujZeZbioru(projekty, 3);

        Arrays.sort(wylosowaneProjekty);
        if (Arrays.binarySearch(wylosowaneProjekty, proj4) < 0) {
            main(null);
            System.out.println("Jeszcze raz");
            return;
        }

        System.out.println(Arrays.toString(grupa1));
        System.out.println(Arrays.toString(grupa2));
        System.out.println(Arrays.toString(grupa3));
        System.out.println(Arrays.toString(wylosowaneProjekty));
    }

    public static String[] wylosujZeZbioru(String[] pula , int iloscElementow) {
        Random random = new Random();
        String[] wylosowaneOsoby = new String[iloscElementow];
        for (int i = 0; i < iloscElementow; i++) {
            int indexOsoby = random.nextInt(pula.length);
            String osoba = pula[indexOsoby];
            if (osoba == null) {
                i--;
                continue;
            }
            pula[indexOsoby] = null;
            wylosowaneOsoby[i] = osoba;
        }
        return wylosowaneOsoby;
    }
}
