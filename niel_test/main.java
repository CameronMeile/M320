package niel_test;

import java.util.Scanner;

public class main {

    static essen person = new essen();


    public static void main (String[] args)
    {
        Scanner essenfrage = new Scanner(System.in);  // Create a Scanner object
        while(true){
            System.out.println("Hunger:"+person.gethungerLevel());
            String essenAusgewählt =  essenAuswahl(essenfrage);
            esse(essenAusgewählt);
            nextloop();
        }
    }

    public static void nextloop() {
        person.sethungerLevel(10);
    }

    public static String essenAuswahl(Scanner essenfrage) {
        System.out.println("Was wollen sie essen?");
        String essen = essenfrage.nextLine();  // Read user input
        return essen;
    }

    public static void esse(String essenAusgewählt) {
        switch(essenAusgewählt) {
            case "Eis":
            person.eatEis();
            break;
            case "Pommes":
            person.eatPommes();
            break;
            case "Hamburger":
            person.eatHamburger();
            break;
            case "nix":
            break;
          }
          
    }

}
