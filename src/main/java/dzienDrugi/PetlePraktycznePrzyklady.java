package dzienDrugi;

public class PetlePraktycznePrzyklady {
    public static void main(String[] args) {
        int numerPowtorzenia = 0;
        while(numerPowtorzenia < 10){ // wykonaj 10 razy
            System.out.println("Co chcesz zrobić?");
            System.out.println("Opcja 1");
            System.out.println("Opcja 2");
            System.out.println("Opcja 3");
            numerPowtorzenia++;
        }

        numerPowtorzenia = 0;
        while (numerPowtorzenia < 5) {
            System.out.println("Inny kod");
            numerPowtorzenia++;
        }

        for ( int i = 0  ; i<2 ; i++ ){
            System.out.println("Pętla");
        }
        for ( int i = 0  ; i<4 ; i++ ){
            System.out.println("For");
        }

    }
}
