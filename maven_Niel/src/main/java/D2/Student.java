package D2;
import java.util.ArrayList;

public class Student {
    static ArrayList<Test> tests = new ArrayList<Test>();
    private  String name;
    public Student(String newname){
        name = newname;
    }

    public String getName() {
        return name;
    }


    public static void addTest(int points, int maxpoints) {
        Test newTest = new Test(points, maxpoints);
        tests.add(newTest);
    }
    public static float getAverage(){
        float allNotes = 0f;
        for (int i = 0; i < tests.size(); i++) {
            allNotes += tests.get(i).calculateGrade();
        }
        return(allNotes / tests.size());
    }
}
