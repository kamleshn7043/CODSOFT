package in.kk.task1;
import java.util.Random;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int totalRounds = 0;
        int roundsWon = 0;
        String playAgain;

        System.out.println("Welcome");

        do
        {
            int randomNum = r.nextInt(100)+1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessedCorr = false;

            totalRounds++;

            System.out.println("You Can Choose a Number in B/W 1 to 100.");
            System.out.println("You have " + maxAttempts + " Attempts to Guess it!");

            while (attempts < maxAttempts)
            {
                System.out.print("\nAttempt " + (attempts + 1) + " - Enter Your Guees Number : ");
                int guess = sc.nextInt();
                attempts++;

                if (guess < randomNum)
                {
                    System.out.println("Too low.");
                }
                else if (guess > randomNum)
                {
                    System.out.println("Too high.");
                }
                else
                {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessedCorr = true;
                    roundsWon++;
                    break;
                }
            }

            if (!guessedCorr)
            {
                System.out.println("Out of attempts! The correct number was : " + randomNum);
            }

            System.out.print("\nDo you want to play another round? (yes/no) : ");
            sc.nextLine();
            playAgain = sc.nextLine().trim().toLowerCase();
        }
        while (playAgain.equals("yes"));

        
        System.out.println("Game Over!");
        System.out.println("Total Rounds Played : " + totalRounds);
        System.out.println("Rounds Won : " + roundsWon);
        System.out.println("Thank You For Playing!");

        sc.close();
    }
}
