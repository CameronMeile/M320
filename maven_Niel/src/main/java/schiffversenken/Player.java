package schiffversenken;
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
            String[] firstApproach =  setSchiffFirstTime(schiffeList.get(i).getName(), schiffeList.get(i).getLenght()).split("\\|");;
            String firstPosition = firstApproach[0];
            String lastPosition = firstApproach[1];

            while (!checkFitInField(firstPosition, lastPosition, schiffeList.get(i).getLenght())){
                 String Approach =  setSchiffIfFailed(schiffeList.get(i).getName(), schiffeList.get(i).getLenght());
                 firstPosition = Approach.split("|")[0];
                 lastPosition = Approach.split("|")[1];

            }
            schiffeList.get(i).setCoordinates(firstPosition, lastPosition);
        }
    }
    public void menu() {

    }
    public void showEnemyfield() {

    }

    private String setSchiffFirstTime(String name, Integer Lenght){
        input input = new input();
        yourPlayground();
        placerules();
        System.out.println("Setzen Sie einen "+name+", z.B (C4). Sie ist " +Lenght+" Felder gross:");
        System.out.println("Setzen sie die erste Position:");
        String firstPosition = input.stringimput();
        System.out.println("Setzen sie die zweite Position:");
        String lastPosition = input.stringimput();
        return firstPosition+"|"+lastPosition;
    };

    private String setSchiffIfFailed(String name, Integer Lenght) {
        input input = new input();
        yourPlayground();
        System.out.println("Ungültige Position Versuchen sie es erneut");
        placerules();
        System.out.println("Setzen Sie einen "+name+", z.B (C4). Sie ist " +Lenght+" Felder gross:");
        System.out.println("Setzen sie die erste Position:");
        String firstPosition = input.stringimput();
        System.out.println("Setzen sie die zweite Position:");
        String lastPosition = input.stringimput();
        return firstPosition+"|"+lastPosition;
    };
    private void yourPlayground(){
        System.out.println("  A B C D E F G");
        for(int i=0; i<7; i++){
            String xLine = Integer.toString(i+1);
            for(int s=0; s<7; s++){
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
    private void printA_G(){
        System.out.println("  A B C D E F G");
    }

    private void placerules(){

    }

    public boolean checkFitInField(String firstPOS1, String lastPOS2, int lange)
    {
        if (!isFirstLetterInRange(firstPOS1) && !isFirstLetterInRange(lastPOS2)){
            return(false);
        }
        if(!isSecoundLetterinRange(firstPOS1) && !isSecoundLetterinRange(lastPOS2)){
            return (false);
        }
        if(!distanceIsEnough(firstPOS1, lastPOS2, lange)){
            return(false);
        }
        if(shipHasSpace(firstPOS1, lastPOS2)){
            return(false);
        }
        return(true);
    }

    public boolean isFirstLetterInRange(String str) {
        char firstLetter = str.charAt(0);
        return firstLetter >= 'A' && firstLetter <= 'G';
    }

    public boolean isSecoundLetterinRange(String str) {

        if (str.length() > 1) {
            char secondChar = str.charAt(1);
            if (Character.isDigit(secondChar) && secondChar >= '1' && secondChar <= '7') {
                return(true);
            }
        }
        return(false);
    }

    private boolean distanceIsEnough(String firPost, String secPost, int lange){
        char firstCharOFfirPost = firPost.charAt(0);
        char secCharOFsecPost = secPost.charAt(0);
        int diffFirstChar = Math.abs( firstCharOFfirPost - secCharOFsecPost);
        if(diffFirstChar + 1 == lange) {
            return(true);
        }
        char secoundCharOFfirPost = firPost.charAt(1);
        char secoundCharOFsecPost = secPost.charAt(1);
        int diffSecoundChar = Math.abs( secoundCharOFsecPost - secoundCharOFfirPost);
        System.out.println(diffSecoundChar+secoundCharOFsecPost+secoundCharOFfirPost);
        if(diffSecoundChar + 1 == lange) {
            return(true);
        }
        return(false);
    }

    private boolean shipHasSpace(String pos1, String pos2){
        char pos1Char1 = pos1.charAt(0);
        char pos1Char2 = pos1.charAt(1);
        char pos2Char1 = pos2.charAt(0);
        char pos2Char2 = pos2.charAt(1);
        int biggerposition;
        int smallerposition;
        int fixPosition;
        boolean fixPositionIsFirstPosition;
        if(pos1Char1 == pos2Char1){
            biggerposition = Math.max(Character.getNumericValue(pos1Char2), Character.getNumericValue(pos2Char2));
            smallerposition = Math.min(Character.getNumericValue(pos1Char2), Character.getNumericValue(pos2Char2));;
            fixPosition = pos1Char1;
            fixPositionIsFirstPosition = true;
        }
        else if(pos1Char2 == pos2Char2) {
            biggerposition = Math.max(Character.getNumericValue(pos1Char1), Character.getNumericValue(pos2Char1));
            smallerposition = Math.min(Character.getNumericValue(pos1Char1), Character.getNumericValue(pos2Char1));;
            fixPosition = pos1Char2;
            fixPositionIsFirstPosition = false;
        }
        else return(false);
        for (int i = smallerposition-1; i < biggerposition+1; i++) {
            if(!checkIfFree(i, fixPosition, fixPositionIsFirstPosition)) return(false);
            if(!checkIfFree(i, fixPosition -1, fixPositionIsFirstPosition)) return(false);
            if(!checkIfFree(i, fixPosition+ 1, fixPositionIsFirstPosition)) return(false);
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
            if (!schiff.getInfoCoordinates(xCordinate, yCordinate).equals("#")) {
                return false;
            }
        }
        return true;
    };


    private void shipsInit(){
        schiffeList.add(new Galeone());
        schiffeList.add(new Zweimaster());
        schiffeList.add(new Zweimaster());
        schiffeList.add(new Schalupe());
        schiffeList.add(new Schalupe());
        schiffeList.add(new Schalupe());
    }


}
