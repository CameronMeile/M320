package schiffversenken;
import java.util.Scanner;

public class input {
    public String stringimput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public void pressEnter(){
        System.out.println("Drücken sie Enter um fortzufahren");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }

    public int MenuInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try{
            int returnNumber = Integer.parseInt(input);
            return returnNumber;
        }
        catch(NumberFormatException e){
            return(5);
        }
    }

    public cordinate cordinateInput(){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while(true){
          System.out.println("Geben Sie zuerst die x Achse an (A-G)");
          String inputx = scanner.nextLine();
            System.out.println("Geben Sie die y Achse an (1-7)");
            String inputy = scanner.nextLine();
            try {
                Transformer transformer = new Transformer();
                return(transformer.transformToCordinate(inputx, inputy));

            } catch (NumberFormatException e) {
                System.out.println("Eingabe ist falsch");

            }
        }
    }



}




