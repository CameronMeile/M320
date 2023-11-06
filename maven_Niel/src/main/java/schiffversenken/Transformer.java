package schiffversenken;

public class Transformer {
    public String translateIntoUserCordinate(cordinate cordinate){
        char letter = '?';

        switch (cordinate.x) {
            case 1:
                letter = 'A';
                break;
            case 2:
                letter = 'B';
                break;
            case 3:
                letter = 'C';
                break;
            case 4:
                letter = 'D';
                break;
            case 5:
                letter = 'E';
                break;
            case 6:
                letter = 'F';
                break;
            case 7:
                letter = 'G';
                break;
        }
        return(letter + Integer.toString(cordinate.y));
    }

    public cordinate transformToCordinate(String x, String y){
        int intX = convertLetterToNumber(x);
        if (intX < 0 || intX > 8) {
            throw new NumberFormatException();
        }
        int intY = convertStringToNumber(y);
        cordinate cordinate = new cordinate();
        cordinate.setY(intY);
        cordinate.setX(intX);
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















































abstract class Vehicle {
    protected Workshop workShop1;
    protected Workshop workShop2;
    protected Vehicle (Workshop workShop1, Workshop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }
    abstract public void manufacture ();
}

class Car extends Vehicle {
    public Car (Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }
    @Override
    public void manufacture () {
        System.out.print ("Car ");
        workShop1.work ();
        workShop2.work ();
    }
}

class Bike extends Vehicle {
    public Bike (Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }
    @Override
    public void manufacture () {
        System.out.print ("Bike ");
        workShop1.work ();
        workShop2.work ();
    }
}

interface Workshop {
    abstract public void work ();
}

class Produce implements Workshop {
    @Override
    public void work () {
        System.out.print ("Produced");
    }
}

class Assemble implements Workshop {
    @Override
    public void work () {
        System.out.print (" And");
        System.out.println (" Assembled.");
    }
}

class BridgePattern {
    public static void main (String [] args) {
        Vehicle vehicle1 = new Car (new Produce (), new Assemble ());
        vehicle1.manufacture ();
        Vehicle vehicle2 = new Bike (new Produce (), new Assemble ());
        vehicle2.manufacture ();
    }
}

