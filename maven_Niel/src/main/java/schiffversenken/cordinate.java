package schiffversenken;

public class cordinate {
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean checkCordinate(int thisx, int thisy){
    if(thisx == x && thisy == y){
        return(true);
    }
    return(false);
    };
}