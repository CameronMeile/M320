package schiffversenken;
import java.util.ArrayList;
import java.util.Arrays;

public class Schiffe {

    ArrayList<cordinate> shipsKoordinaten = new ArrayList<cordinate>();
    ArrayList<cordinate> shipsKoordinatenSunken = new ArrayList<cordinate>();

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
                System.out.println(C1.x + "" + i);

            }else{
                Cordinate.setX(i);
                Cordinate.setY(C1.y);
                System.out.println(i + "" + C1.y);

            }
            shipsKoordinaten.add(Cordinate);
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
        for (cordinate coordinates : shipsKoordinaten) {
            if(coordinates.checkCordinate(xCordinate, yCordinate))  {
                return ("#");
            }
        }
        for (cordinate coordinates : shipsKoordinatenSunken) {
            if(coordinates.checkCordinate(xCordinate,yCordinate)) {
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
