package maven_Niel.src.main.java.V2;

import java.util.Scanner;
public class main {
    private static final Mannschaft mannschaft = new Mannschaft();

    public static void main (String[] args)
    {
        loop();
        mannschaft.spielen();
    }

    private static void loop() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        for (int i = 0; i < 4; i++) {
            System.out.println("Was ist der Name des Spielers?");
            String name = scanner.nextLine();  // Read user input
            System.out.println("Was für eine Position hat dein Spieler? (Goalie, Verteidiger, Angreifer)");
            String position = scanner.nextLine();  // Read user input
            switch (position) {
                case "Goalie" -> {
                    System.out.println("Wie gross ist der Goalie?");
                    String koerperGroesse = scanner.nextLine();  // Read user input
                    Goalie goalie = new Goalie(name, Double.parseDouble(koerperGroesse));
                    mannschaft.addspieler(goalie);
                }
                case "Verteidiger" -> {
                    Verteidiger verteidiger = new Verteidiger(name);
                    mannschaft.addspieler(verteidiger);
                }
                case "Angreifer" -> {
                    Angreifer angreifer = new Angreifer(name);
                    mannschaft.addspieler(angreifer);
                }
                default -> {
                    System.out.println("Invalid position");
                    i = i -1;
                }
            }

        }
    }
}