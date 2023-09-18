package maven_Niel.src.main.java.D2;

public class Test {

    int studentPoints;
    int maxPoints;

    public Test(int points, int maxpoints){
        studentPoints = points;
        maxPoints = maxpoints;
    }

    public void calculateGrade() {
        float grade = ((float) studentPoints / maxPoints) * 5 + 1;
        System.out.println("Grade: " + grade);
    }

}