package schiffversenken;

public class Schiffeversenken {
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    public void init(){
        changePlayer("Player1");
        player1.init();
        changePlayer("Player2");
        player2.init();
        changePlayer("Player1");
    }
    public void play(){
        while (!player1.hasLost() && !player2.hasLost()){
            player1.menu(player2);
            if(player1.hasLost() || player2.hasLost()) break;
            changePlayer("Player2");
            player2.menu(player1);
            if(player1.hasLost() || player2.hasLost()) break;
            changePlayer("Player1");
        }
        if(player1.hasLost()){
            System.out.println("Player1 hat verloren. Player2 gewonnen");
        }
        else System.out.println("Player2 hat verloren. Player1 gewonnen");
    }

    public void changePlayer(String name){
        input input = new input();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < 5000; i++) {
            System.out.println("");
        }

        System.out.println("Der Spieler wird gewechselt");
        System.out.println("Gib das Gerät "+name);
        System.out.println("Drücke Enter falls du "+name+" bist");
        input.stringimput();
    }
}
