import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } 
            else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
            }

        } while (guess != number);

        sc.close();
    }
}
