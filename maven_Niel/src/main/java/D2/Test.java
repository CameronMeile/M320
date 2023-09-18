package maven_Niel.src.main.java.D2;

public class Test {

    int studentPoints;
    int maxPoints;

    public void calculateGrade() {
        float grade = ((float) studentPoints / maxPoints) * 5 + 1;
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.studentPoints = 80;
        test.maxPoints = 100;
        test.calculateGrade();
    }
}