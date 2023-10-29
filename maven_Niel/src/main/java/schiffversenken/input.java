package schiffversenken;
import java.util.Scanner;

public class input {
    public String stringimput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public cordinate cordinateInput(){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while(!(x > 0 && x < 8)){
          System.out.println("Geben Sie zuerst die x Achse an (A-G)");
          String input = scanner.nextLine();
          x = convertLetterToNumber(input);
        }
        while(!(y > 0 && y < 8)){
            System.out.println("Geben Sie die y Achse an (1-7)");
            String input = scanner.nextLine();
            try {
                y = convertStringToNumber(input);
            } catch (NumberFormatException e) {
            }
        }
        cordinate cordinate = new cordinate();
        cordinate.setY(y);
        cordinate.setX(x);
        return(cordinate);
    }


    public static int convertStringToNumber(String str) throws NumberFormatException {
        int number = Integer.parseInt(str);
        if (number < 0 || number > 8) {
            throw new NumberFormatException();
        }
        return number;
    }

    public static int convertLetterToNumber(String letter) {
        switch (letter) {
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
            case "D":
                return 4;
            case "E":
                return 5;
            case "F":
                return 6;
            case "G":
                return 7;
            default:
                return 8; // Für alle anderen Eingaben geben wir 8 zurück
        }
    }
}
