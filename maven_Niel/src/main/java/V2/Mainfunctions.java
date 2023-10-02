package V2;

import java.util.Scanner;

public class Mainfunctions {

    public void loop(){
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Wie heisst der Spieler?");
            String playerName = myObj.nextLine();
            System.out.println("Was ist der Spieler?");
            System.out.println("1.Goalie");
            System.out.println("2.Angreifer");
            System.out.println("3.Verteidiger");
            String position = myObj.nextLine();
        }
    }
}
