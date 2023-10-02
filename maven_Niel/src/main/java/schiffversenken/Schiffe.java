package maven_Niel.src.main.java.schiffversenken;

public class Schiffe {
    protected int länge;
    protected int sunk;
    public Schiffe(int länge) {
        this.länge = länge;
    }
    public void checkFitInField(String firstPOS1, String lastPOS2) {
        if (firstPOS1 ==)
    }
    public void checkHit() {
        // Trefferüberprüfung
    }
    public void getShipStatus() {
        // Den Schiffstatus abzurufen
    }
    public void getInfoCoordinates() {
        // Informationen über die Koordinaten abzurufen
    }
    public static boolean isFirstLetterInRange(String str) {
        char firstLetter = str.charAt(0);
        return firstLetter >= 'A' && firstLetter <= 'G';

        char lastLetter = str.charAt(1);
        return lastLetter >= '1' && firstLetter <= '7';
    }
}
