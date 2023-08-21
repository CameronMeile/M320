package src;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_Q1 {
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
    
    public static int[] generateLotteryNumbers() {
        Random random = new Random();
        int[] lotteryNumbers = new int[6];
        
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = random.nextInt(49) + 1; // Generating numbers between 1 and 49
        }
        
        return lotteryNumbers;
    }
    
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