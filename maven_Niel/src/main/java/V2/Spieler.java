package maven_Niel.src.main.java.V2;

public class Spieler {
    private String name;

    public Spieler(String name) {
        this.name = name;
    }

    void zeigeName() {
        System.out.println(name);
    }

    void spielen() {
        System.out.println("Ich spiele");
    }
}
