package D2;
import java.util.ArrayList;
public class Class {
    ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
    public float getAverage(){
        float allNotes = 0f;
        for (int i = 0; i < students.size(); i++) {
            allNotes += students.get(i).getNotenschnitt();
        }
        return(allNotes / students.size());
    }
}
