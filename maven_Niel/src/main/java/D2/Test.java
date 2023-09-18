package D2;

public class Test {

    int studentPoints;
    int maxPoints;

    public Test(int points, int maxpoints){
        studentPoints = points;
        maxPoints = maxpoints;
    }

    public float calculateGrade() {
        float grade = ((float) studentPoints / maxPoints) * 5 + 1;
        return(grade);
    }

}