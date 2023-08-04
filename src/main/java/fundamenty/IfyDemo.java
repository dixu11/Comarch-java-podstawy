package fundamenty;

public class IfyDemo {
    public static void main(String[] args) {

        double ocenaProcent = 0.24;

        System.out.println("Dostałeś/aś " + ocenaProcent + "% z testu");
//        if(warunek) {
//            kod
//        }

        int ocena;
        if (ocenaProcent < 0.3) {
            ocena = 1;
        }else if(ocenaProcent < 0.4 ){
            ocena = 2;
        }else if(ocenaProcent < 0.55 ){
            ocena = 3;
        }else if(ocenaProcent < 0.70 ){
            ocena = 4;
        }else if(ocenaProcent <= 1 ) {
            ocena = 5;
        }else {
            System.out.println("Niepoprawnie podane dane");
            return; //przerywa program
        }

        System.out.println("Dostałeś/aś ocenę " + ocena);
        if (ocena == 1) {
            System.out.println("Nie zdane");
        } else {
            System.out.println("Zdane");
        }
    }
}
