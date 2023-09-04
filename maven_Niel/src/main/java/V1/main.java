package V1;
/*
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            String task = askTask();
            executeTask(task);
        }
    }


    public static void executeTask(String task){
        switch (task){
            case "1":
                newPerson();
                break;
            case "2":
                deletePerson();
                break;
            case "3":
                showList();
        }
    }

    public ArrayList<Object> getList() {
        return list;
    }

    public static void newPerson(){

        String Job = askJob();
        String name = askName();
        switch (Job){
            case "Direktor":
                list.add(new Direktor(name));
            case "Sekretaerin":
                list.add(new Sekretaerin(name));
            case "Lehrer":
                list.add(new Lehrer(name));
            case "Schueler":
                list.add(new Schueler(name));
            case "Sozialarbeiter":
                list.add(new Sozialarbeiter(name));
        }

    }

    public  static void deletePerson(){
        String name = askName();
        // Durchlaufe die Liste und entferne alle Objekte mit dem angegebenen Namen
        int index = 0;
        for (Object obj : list) {
            var mensch = (Human) obj;
            if(mensch.name == name){

            }
            index++;
        }

    }

    public  static String askTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was willst du machen?");
        System.out.println("1: Neue Person hinzufügen");
        System.out.println("2: Bestehende Person löschen");
        System.out.println("3: Liste anzeigen");
        String task = scanner.nextLine();
        return task;
    }
    public static String askJob(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist dein Beruf?");
        String job = scanner.nextLine();
        return job;
    }

    public static String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie ist dein Name?");
        String name = scanner.nextLine();
        return name;
    }
}
*/