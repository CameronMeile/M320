package schiffversenken;
import java.util.ArrayList;
import java.util.Arrays;

public class Schiffe {
    boolean wasss = false;

    ArrayList<cordinate> shipsKoordinaten = new ArrayList<cordinate>();
    ArrayList<cordinate> shipsKoordinatenSunken = new ArrayList<cordinate>();

    protected int lange;

    public boolean isSunk() {
        return sunk;
    }

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

    public void setCoordinates(cordinate C1, cordinate C2) {
        int minNumber = 0;
        int maxNumber = 0;
        boolean ifXfixed = false;
        if(C1.y == C2.y){
            minNumber = Math.min(C1.x, C2.x);
            maxNumber = Math.max(C1.x, C2.x);
        }
        if(C1.x == C2.x){
            minNumber = Math.min(C1.y, C2.y);
            maxNumber = Math.max(C1.y, C2.y);
            ifXfixed = true;
        }

        for (int i = minNumber; i <= maxNumber; i++) {
            cordinate Cordinate = new cordinate();
            if(ifXfixed){
                Cordinate.setX(C1.x);
                Cordinate.setY(i);
            }else{
                Cordinate.setX(i);
                Cordinate.setY(C1.y);
            }
            shipsKoordinaten.add(Cordinate);
        }
    }

    public String checkHit(cordinate cordinate) {
        // Trefferüberprüfung
        if(getInfoCoordinates(cordinate.x, cordinate.y).equals("*")){
            shipsKoordinaten.removeIf(cord -> {
                wasss = true;
                if (cord.checkCordinate(cordinate.x, cordinate.y))   {
                    shipsKoordinatenSunken.add(cord);
                    return true;
                }
                return false;
            });
            if(shipsKoordinaten.size() == 0){
                sunk = true;
                return("gesunken");
            }
            return("getroffen");
        }
        return("");
    }
    public void getShipStatus() {
        // Den Schiffstatus abzurufen
    }
    public String getInfoCoordinates(int xCordinate, int yCordinate) {
        // Informationen über die Koordinaten abzurufen
        for (cordinate coordinates : shipsKoordinaten) {
            if(coordinates.checkCordinate(xCordinate, yCordinate))  {
                return ("*");
            }
        }
        for (cordinate coordinates : shipsKoordinatenSunken) {
            if(coordinates.checkCordinate(xCordinate,yCordinate)) {
                if(sunk){
                    return ("#");
                }
                else {
                    return ("O");
                }
            }
        }
        return("?");
    }


}
