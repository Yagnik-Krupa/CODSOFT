package java_task;
import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
    public static void main(String[] args) 
    {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int randomNumber;
        int attempts = 0;
        int userGuess;
        int score = 0;
        int rounds = 0;

        // Game loop
        while (true) 
        {

            randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("Round " + (rounds + 1) + ": Guess a number between " + min + " and " + max + ":");
            userGuess = scanner.nextInt();
            if (userGuess < min || userGuess > max) 
            {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            attempts++;
            if (userGuess == randomNumber) 
            {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                score += (11 - attempts);
                attempts = 0;
                rounds++;
                System.out.println("Do you want to play again? (yes/no)");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) 
                {
                    break;
                }

            } else if (userGuess < randomNumber) 
            {

                System.out.println("Too low! Try again.");

            } else 
            {
                System.out.println("Too high! Try again.");

            }
            if (attempts == 5)
             {
                System.out.println("You have reached the maximum number of attempts. The correct number was " + randomNumber + ".");
                attempts = 0;
                rounds++;
                System.out.println("Do you want to play again? (yes/no)");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) 
                {
                    break;
                }
            }

        }
        scanner.close();
        System.out.println("Your final score is: " + score);

    }

}