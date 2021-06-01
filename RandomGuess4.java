
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomGuess4 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        Scanner input = new Scanner(System.in);
        int randomNum = MIN + (int) (Math.random() * MAX);
        int guessCount = 0;
        int guess = 0;

        do {
            System.out.println("Enter a number between 1 and 10 >>");
            try {
                guess = input.nextInt();
                if (randomNum > guess)
                    System.out.println("Your number was " + guess + ". Your guess was too low!");
                if (randomNum < guess)
                    System.out.println("Your number was " + guess + ". Your guess was too high!");
                guessCount += 1;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input. Try again.");
            }

        } while (guess != randomNum);

        if (randomNum == guess)
            System.out.println("The computers number is " + randomNum + ". Your number was " + guess
                    + ". Your guess was correct!");
        System.out.println("Guess Count: " + guessCount);
    }
}
