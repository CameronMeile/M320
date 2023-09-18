package D2;
import java.util.ArrayList;
public class Class {
    static ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
    public static float getAverage(){
        float allNotes = 0f;

        for (int i = 0; i < students.size(); i++) {
            allNotes += students.get(i).getAverage();
            System.out.println("Einzelen Noten: "+students.get(i).getAverage());
        }
        System.out.println("Anzahl Schüler:"+students.size());
        return(allNotes / students.size());
    }

    public static int size(){
        return(students.size());
    }

    public static String getName(int Studentnumber){
        return (students.get(Studentnumber).getName());
    }
    public static Student getStudent(int Studentnumber){
        return(students.get(Studentnumber));
    }
}
