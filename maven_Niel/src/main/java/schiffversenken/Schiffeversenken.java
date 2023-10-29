package schiffversenken;

public class Schiffeversenken {
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    public void init(){
        player1.init();
        changePlayer("Player2");
        player2.init();
        changePlayer("Player1");
    }

    public void play(){
        while (!player1.hasLost() && !player2.hasLost()){
            player1.menu(player2);
            changePlayer("Player2");
            player1.menu(player1);
            changePlayer("Player1");
        }
    }
    public void showEnemyfield() {

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
