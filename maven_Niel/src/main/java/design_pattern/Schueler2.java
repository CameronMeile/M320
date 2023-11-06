package design_pattern;

class Schueler2 extends schueler {
    public Schueler2 (lernen fach1, lernen fach2) {
        super(fach1, fach2);
    }
    @Override
    public void lernen () {
        System.out.println ("Schueler2 lernt heute ");
        fach1.lernen();
        fach2.lernen();
    }
}