package dzienDrugi.obiektowosc.dziedziczenie;

public abstract class Zwierze {


    public Zwierze(){
        System.out.println("Tworzy się zwierze");
    }

    public void jedz() {
        System.out.println("Zwierze sobie je");
    }

    public abstract void wydajDzwiek();
}
