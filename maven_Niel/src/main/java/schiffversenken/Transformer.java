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
}
