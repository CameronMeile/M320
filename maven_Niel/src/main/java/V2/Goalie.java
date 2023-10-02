package maven_Niel.src.main.java.V2;

public class Goalie extends Spieler {
    private Double koerperGroesse;

    public Goalie(String name, Double koerperGroesse) {
        super(name);
        this.koerperGroesse = koerperGroesse;
    }

    void spielen() {
        System.out.println("Ich bin ein Goalie und spiele und bin " + koerperGroesse + " gross");
    }
}
