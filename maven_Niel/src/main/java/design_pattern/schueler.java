package design_pattern;

abstract public class schueler {
    protected lernen fach1;
    protected lernen fach2;
    protected schueler (lernen fach1, lernen fach2) {
        this.fach1 = fach1;
        this.fach2 = fach2;
    }
    abstract public void lernen ();

}
