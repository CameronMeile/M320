package schiffversenken;
import java.io.Console;
import java.util.ArrayList;

public class Player {
    protected String name;
    protected ArrayList<Schiffe> schiffeList = new ArrayList<Schiffe>();
    public Player(String name){
        this.name = name;
    }

    public void init() {
        shipsInit();
        placerules();

        for (int i = 0; i < schiffeList.size(); i++) {
            cordinate[] firstApproach =  setSchiffFirstTime(schiffeList.get(i).getName(), schiffeList.get(i).getLenght());
            cordinate firstPosition = firstApproach[0];
            cordinate lastPosition = firstApproach[1];

            while (!checkFitInField(firstPosition, lastPosition, schiffeList.get(i).getLenght())){
                firstApproach =  setSchiffIfFailed(schiffeList.get(i).getName(), schiffeList.get(i).getLenght());
                firstPosition = firstApproach[0];
                lastPosition = firstApproach[1];
            }
            schiffeList.get(i).setCoordinates(firstPosition, lastPosition);
        }
    }
    public void menu(Player gegenspieler) {
        printMenuAuswahl();
    }

    private void printMenuAuswahl(){
        System.out.println("Sie sind am Zug");

    }

    public void showEnemyfield() {

    }

    private cordinate[] setSchiffFirstTime(String name, Integer length){
        yourPlayground();
        return(defaultsetSchiff(length, name));
    }

    private cordinate[] setSchiffIfFailed(String name, Integer Lenght) {
        yourPlayground();
        System.out.println("Ungültige Position Versuchen sie es erneut");
        return(defaultsetSchiff(Lenght, name));
    };

    private cordinate[] defaultsetSchiff(Integer Lenght, String name) {
        placerules();
        input input = new input();
        System.out.println("Setzen Sie einen "+name+", z.B (C4). Sie ist " +Lenght+" Felder gross:");
        System.out.println("Setzen sie die erste Position:");
        cordinate firstPosition = input.cordinateInput();
        System.out.println("Setzen sie die zweite Position:");
        cordinate lastPosition = input.cordinateInput();
        return new cordinate[]{firstPosition, lastPosition};
    };
    private void yourPlayground(){
        System.out.println("  A B C D E F G");
        for(int i=1; i<8; i++){
            String xLine = Integer.toString(i);
            for(int s=1; s<8; s++){
                xLine += " "+ getCordinateInfoFromShipsYourSide(s,i);
            }
            System.out.println(xLine);
        }
    }

    private String getCordinateInfoFromShipsYourSide(int x, int y){
        for(int i=0; i< schiffeList.size(); i++){
            String ShipCordinateString =schiffeList.get(i).getInfoCoordinates(x,y);
            if(!ShipCordinateString.equals("?"))
                return(ShipCordinateString);
        }
        return("?");
    }
    private void placerules(){

    }

    public boolean checkFitInField(cordinate firstPOS1, cordinate lastPOS2, int lange)
    {
        if(!distanceIsEnough(firstPOS1, lastPOS2, lange)){
            return(false);
        }
        if(!shipHasSpace(firstPOS1, lastPOS2)){
            return(false);
        }
        return(true);
    }

    private boolean distanceIsEnough(cordinate firPost, cordinate secPost, int lange){
        int diffFirstChar = Math.abs(firPost.x - secPost.x);
        if(diffFirstChar + 1 == lange) {
            return(true);
        }
        int diffSecoundChar = Math.abs(firPost.y - secPost.y);
        if(diffSecoundChar + 1 == lange) {
            return(true);
        }
        return(false);
    }

    private boolean shipHasSpace(cordinate pos1, cordinate pos2){
        int biggerposition;
        int smallerposition;
        int fixPosition;
        boolean fixPositionIsFirstPosition;
        if(pos1.x == pos2.x){
            biggerposition = Math.max(pos1.y,pos2.y);
            smallerposition = Math.min(pos1.y, pos2.y);;
            fixPosition = pos1.x;
            fixPositionIsFirstPosition = false;
        }
        else if(pos1.y == pos2.y) {
            biggerposition = Math.max(pos1.x, pos2.x);
            smallerposition = Math.min(pos1.x, pos2.x);
            fixPosition = pos1.y;
            fixPositionIsFirstPosition = true;
        }
        else return(false);
        for (int i = smallerposition-1; i < biggerposition+1; i++) {
            if(!checkIfFree(i, fixPosition, fixPositionIsFirstPosition)){
                return(false);
            }
            if(!checkIfFree(i, fixPosition -1, fixPositionIsFirstPosition)){
                return(false);
            }
            if(!checkIfFree(i, fixPosition+ 1, fixPositionIsFirstPosition)){
                return(false);
            }
        }
        return(true);
    }

    private boolean checkIfFree(int P1, int P2, boolean fixP1) {
        int xCordinate;
        int yCordinate;
        if(fixP1){
            xCordinate = P1;
            yCordinate = P2;
        }
        else{
            xCordinate = P2;
            yCordinate = P1;
        }
        for (Schiffe schiff : schiffeList) {
            if (schiff.getInfoCoordinates(xCordinate, yCordinate).equals("#")) {
                return false;
            }
        }
        return true;
    };


    private void shipsInit(){
        schiffeList.add(new galeone());
     /*   schiffeList.add(new zweimaster());
        schiffeList.add(new zweimaster());
        schiffeList.add(new schalupe());
        schiffeList.add(new schalupe());
        schiffeList.add(new schalupe());
      */
    }
}
