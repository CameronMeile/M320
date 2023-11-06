package schiffversenken;

public class schalupe extends Schiffe implements CustomShipsMessage{
        public schalupe() {
            super(2,"Schalupe");
        }

    public String hitMessage() {
        return("Volltreffer! Du hast dem Schiff des Gegners Schaden zugefügt!");
    }

    public String sinkMessage(){
        return("Aus dem Spiel! Du hast das Schiff des Gegners auf den Meeresgrund geschickt!");
    }
}
