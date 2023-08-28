package src;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This class represents a simple lottery game.
 */
public class C_Q1 {
    /**
     * The main method of the program.
     * It generates lottery numbers, prompts the user to enter their numbers, and checks for matches.
     * Finally, it displays the results to the user.
     */
    public static void main(String[] args) {
        int[] lotteryNumbers = generateLotteryNumbers();
        int[] userNumbers = getUserNumbers();

        System.out.println("Lottery numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("Your numbers: " + Arrays.toString(userNumbers));

        int matchedNumbers = countMatchingNumbers(lotteryNumbers, userNumbers);

        System.out.println("Matched numbers: " + matchedNumbers);

        if (matchedNumbers == lotteryNumbers.length) {
            System.out.println("Congratulations! You won the jackpot!");
        } else {
            System.out.println("Better luck next time!");
        }
    }

    /**
     * Generates an array of 6 random lottery numbers between 1 and 49.
     *
     * @return the array of lottery numbers
     */
    public static int[] generateLotteryNumbers() {
        Random random = new Random();
        int[] lotteryNumbers = new int[6];

        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = random.nextInt(49) + 1; // Generating numbers between 1 and 49
        }

        return lotteryNumbers;
    }

    /**
     * Prompts the user to enter their 6 numbers between 1 and 49.
     *
     * @return the array of user numbers
     */
    public static int[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];

        System.out.println("Enter your 6 numbers (between 1 and 49):");

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        return userNumbers;
    }

    /**
     * Counts the number of matching numbers between two arrays.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return the number of matching numbers
     */
    public static int countMatchingNumbers(int[] arr1, int[] arr2) {
        int count = 0;

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}