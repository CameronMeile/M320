package schiffversenken;

import java.util.ArrayList;
import java.util.Arrays;

public class Schiffe {

    ArrayList<ArrayList<Integer>> shipsKoordinaten = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> shipsKoordinatenSunken = new ArrayList<ArrayList<Integer>>();

    protected int lange;
    protected boolean sunk;
    public Schiffe(int lange, int xPosition,int yPosisiton) {
        shipsKoordinaten.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        this.lange = lange;
    }

    public void checkHit() {
        // Trefferüberprüfung
    }
    public void getShipStatus() {
        // Den Schiffstatus abzurufen
    }
    public String getInfoCoordinates(int xCordinate, int yCordinate) {
        // Informationen über dieKoordinaten abzurufen
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

    public boolean getIfShipIsOnCordiante(int x,int y){

        return(false);
    }


}
