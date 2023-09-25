package maven_Niel.src.main.java.V2;

public class Angreifer extends Spieler {
    public Angreifer(String name) {
        super(name);
    }

    void jogTraining() {
        System.out.println("Ich trainiere Joggen");
    }
    void spielen() {
        System.out.println("Ich bin ein Angreifer und spiele");
    }
}
