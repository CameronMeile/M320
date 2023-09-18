package D2;
import java.util.ArrayList;

public class Student {
    ArrayList<Test> tests = new ArrayList<Test>();

    public float getNotenschnitt(){
        float zahl = 0.7f;
        return(zahl);
    }
    public void addStudent(Test newTest) {
        tests.add(newTest);
    }
    public float getAverage(){
        float allNotes = 0f;
        for (int i = 0; i < tests.size(); i++) {
            allNotes += tests.get(i).calculateGrade();
        }
        return(allNotes / tests.size());
    }
}
