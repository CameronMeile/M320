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

    public void setCordinates(String C1, String C2){
        char C1X = C1.charAt(0);
        int C1Xi = Character.getNumericValue(C1X);
        char C2X = C2.charAt(0);
        int C2Xi = Character.getNumericValue(C2X);
        char C1Y = C1.charAt(1);
        int C1Yi = Character.getNumericValue(C1Y);
        char C2Y = C2.charAt(1);
        int C2Yi = Character.getNumericValue(C2Y);

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
