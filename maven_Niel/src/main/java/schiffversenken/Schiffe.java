package schiffversenken;
import java.util.ArrayList;
import java.util.Arrays;

public class Schiffe {

    ArrayList<ArrayList<Integer>> shipsKoordinaten = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> shipsKoordinatenSunken = new ArrayList<ArrayList<Integer>>();

    protected int lange;
    protected boolean sunk;
    protected String name;
    public Schiffe(int lange, String name) {
        this.lange = lange;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getLenght() {
        return lange;
    }

    public void setCoordinates(String C1, String C2) {
        int startNumber = Character.getNumericValue(C1.charAt(1));
        int endNumber = Character.getNumericValue(C2.charAt(1));

        int minNumber = Math.min(startNumber, endNumber);
        int maxNumber = Math.max(startNumber, endNumber);

        for (int i = minNumber; i <= maxNumber; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(Character.getNumericValue(C1.charAt(0)));
            sublist.add(i);
            shipsKoordinaten.add(sublist);
        }
    }

    public void checkHit() {
        // Trefferüberprüfung
    }
    public void getShipStatus() {
        // Den Schiffstatus abzurufen
    }
    public String getInfoCoordinates(int xCordinate, int yCordinate) {
        // Informationen über die Koordinaten abzurufen
        for (ArrayList<Integer> coordinates : shipsKoordinaten) {
            if(xCordinate == coordinates.get(0) && yCordinate == coordinates.get(1)) {
                return ("#");
            }
        }
        for (ArrayList<Integer> coordinates : shipsKoordinatenSunken) {
            if(xCordinate == coordinates.get(0) && yCordinate == coordinates.get(1)) {
                if(sunk){
                    return ("-");
                }
                else {
                    return ("?");
                }
            }
        }
        return("?");
    }


}
