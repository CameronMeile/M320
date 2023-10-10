package schiffversenken;
import java.util.ArrayList;

public class Player {
    protected String name;
    protected ArrayList<Schiffe> schiffeList = new ArrayList<Schiffe>();
    public Player(String name){
        this.name = name;
    }

    public void init() {
        input input = new input();
        ArrayList<String> nameList = shipsName();
        ArrayList<Integer> langeList = shipsLange();



        placerules();
        System.out.println("Platzierregel: SIe müssen Anfangs- und Schlusskorrdinaten eingeben, z.B C1,C4");
        // 1x Galeone platzieren

        System.out.println("Setzen Sie die Galeone Alpha:");
        for (int i = 0; i < nameList.size(); i++) {
            //spielfeld()
            placerules();
            System.out.println("Setzen Sie einen "+nameList.get(i)+". Sie ist" +shipsLange().get(i)+" Felder gross:");
            System.out.println("Setzen sie die erste Position:");
            String firstPosition = input.stringimput();
            System.out.println("Setzen sie die zweite Position:");
            String lastPosition = input.stringimput();
            while (!checkFitInField(firstPosition, lastPosition, shipsLange().get(i))){
                // spielfeld
                System.out.println("Ungültige Position Versuchen sie es errneut");
                placerules();
                System.out.println("Setzen Sie einen "+nameList.get(i)+". Sie ist " +shipsLange().get(i)+" Felder gross:");
                System.out.println("Setzen sie die erste Position:");
                firstPosition = input.stringimput();
                System.out.println("Setzen sie die zweite Position:");
                lastPosition = input.stringimput();
            }
        }
        System.out.println("Setzen Sie die Schalupe Gamma:");
    }
    public void menu() {

    }
    public void showEnemyfield() {

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
        if(!shipHasSpace(firstPOS1, lastPOS2)){
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

    private ArrayList<Integer> shipsLange(){
        ArrayList<Integer> langeList = new ArrayList<Integer>();
        langeList.add(4);
        langeList.add(3);
        langeList.add(3);
        langeList.add(2);
        langeList.add(2);
        langeList.add(2);
        return(langeList);
    }

    private ArrayList<String> shipsName(){
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Galeone");
        nameList.add("Zweimaster");
        nameList.add("Zweimaster");
        nameList.add("Schalupen");
        nameList.add("Schalupen");
        nameList.add("Schalupen");
        return(nameList);
    }


}
