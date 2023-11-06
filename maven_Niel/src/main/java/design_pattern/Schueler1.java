package design_pattern;

class Schueler1 extends schueler {
    public Schueler1 (lernen fach1, lernen fach2) {
        super(fach1, fach2);
    }
    @Override
    public void lernen () {
        System.out.println("Schueler1 lernt");
        fach1.lernen();
        fach2.lernen();
    }
}
