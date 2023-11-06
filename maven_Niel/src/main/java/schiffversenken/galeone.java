package schiffversenken;

public class galeone extends Schiffe implements CustomShipsMessage{
    public galeone() {
        super(4, "Galone");
    }
    public String hitMessage() {
        return("Zack, das hat gesessen! Du hast ein Schiff des Gegners getroffen!");
    }

    public String sinkMessage(){
        return("Untergang! Das Schiff des Gegners ist nicht mehr im Spiel!");
    }
}
