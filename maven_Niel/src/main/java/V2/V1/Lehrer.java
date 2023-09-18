package maven_Niel.src.main.java.V2.V1;

public class Lehrer extends Human{
    String name;
    Sekretaerin sekretaerin = new Sekretaerin("Lisa");
    Schueler schueler = new Schueler("Linus");

    public Lehrer(String name) {
        super(name);
    }

}
