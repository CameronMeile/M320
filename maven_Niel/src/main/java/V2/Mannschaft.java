package maven_Niel.src.main.java.V2;
import java.util.ArrayList; // import the ArrayList class

public class Mannschaft {


    ArrayList<Spieler> spielers = new ArrayList<Spieler>(); // Create an ArrayList object

    public void addspieler(Spieler spieler) {
        spielers.add(spieler);
    }

    public  void spielen() {
        for (Spieler spieler : spielers) {
            spieler.spielen();
        }
    }

}