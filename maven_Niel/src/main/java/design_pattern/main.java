package design_pattern;

public class main {

    public static void main(String[] args){
        schueler schueler1 = new Schueler1(new mathe(), new geschichte());
        schueler1.lernen();
        schueler schueler2 = new Schueler2(new chemie(), new mathe());
        schueler2.lernen();

    }
}
