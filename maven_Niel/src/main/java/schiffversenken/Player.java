package maven_Niel.src.main.java.schiffversenken;

public class Player {
    protected String name;
    public Player(String name){
        this.name = name;
    }

    public void init() {
        input input = new input();
        System.out.println("Platzierregel: SIe müssen Anfangs- und Schlusskorrdinaten eingeben, z.B C1,C4");
        // 1x Galeone platzieren
        System.out.println("Setzen Sie die Galeone Alpha:");
        String firstPosition = input.stringimput();
        String lastPosition = input.stringimput();


        // 2x Zweimaster platzieren
        System.out.println("Setzen Sie den Zweimaster Alpha:");

        System.out.println("Setzen Sie die Zweimaster Beta:");

        // 3x Schalupen platzieren
        System.out.println("Setzen Sie die Schalupe Alpha:");

        System.out.println("Setzen Sie die Schalupe Beta:");

        System.out.println("Setzen Sie die Schalupe Gamma:");
    }
    public void menu() {

    }
    public void showEnemyfield() {

    }
}
