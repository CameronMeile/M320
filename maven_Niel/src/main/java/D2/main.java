package D2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class main {
    static Class Klasse = new Class();

    public static void main(String[] args) {
        while (true){
            askwhichStudent();
        }
    }
    private static void askwhichStudent() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wählen sie einen Studenten oder erstellen sie einene neuen");
        System.out.println("1. Neuer Student erstellen");
        System.out.println("2. Klassendurschnitt ausgeben");

        for (int i = 0; i < Klasse.size(); i++) {
            System.out.println((i+3)+". Wähle Student "+Klasse.getName(i)+" aus");
        }
        String number = myObj.nextLine();
        if(number.equals("1")) {
            System.out.println("Wie heisst der Student?");
            String name = myObj.nextLine();
            Student newStudent = new Student(name);
            Klasse.addStudent(newStudent);
        }
        else if(number.equals("2")){
            System.out.println(Klasse.getAverage());
        }
        else{
            loopStudent(parseInt(number)-3);
        }
    }

    private static void loopStudent(int Studentnumber) {
        while (true){
            System.out.println("Was wollen sie machen");
            System.out.println("1. Einen neuen Test hinzufügen");
            System.out.println("2. Noten durschnitt ausgeben");
            System.out.println("3. Zurück zur Schüler Übersicht");
            Scanner myObj = new Scanner(System.in);
            String number = myObj.nextLine();
            if(number.equals("1")){
                System.out.println("Gib die max Punktzahl an:");
                int maxpoints = parseInt(myObj.nextLine());
                System.out.println("Gib die erreichte Punktzahl an:");
                int points = parseInt(myObj.nextLine());
                Klasse.getStudent(Studentnumber).addTest(points, maxpoints);
            }
            if(number.equals("2")){
                System.out.println(Klasse.getStudent(Studentnumber).getAverage());
            }
            if(number.equals("3")){
                break;
            }
        }
    }
}
