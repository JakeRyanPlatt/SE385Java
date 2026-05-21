import java.util.Scanner;

public class rpsGame {

    static int wins = 0;
    static int losses = 0;
    static int ties = 0;

    public static void Play(Scanner scanner) {
        String playAgain;

        // Outer do-while: keeps the game running until the player quits
        do {
            // Inner while: keeps prompting until a valid choice is entered
            String playerChoice = null;
            while (playerChoice == null) {
                System.out.print("\nPlease select Rock, Paper, or Scissors (or 'Q' to exit): ");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("q")) {
                    showResults();
                    return;
                }

                switch (input) {
                    case "rock":
                    case "paper":
                    case "scissors":
                        playerChoice = input;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                }
            }

            // Get bot's choice using botInfo
            String botChoice = botInfo.roller().toLowerCase();

            System.out.println("\nYou chose:  " + (playerChoice));
            System.out.println("Bot chose:  " + (botChoice));

            // Determine winner
            if (playerChoice.equals(botChoice)) {
                System.out.println("Result: It's a tie!");
                ties++;
            } else if (
                (playerChoice.equals("rock")     && botChoice.equals("scissors")) ||
                (playerChoice.equals("scissors") && botChoice.equals("paper"))   ||
                (playerChoice.equals("paper")    && botChoice.equals("rock"))
            ) {
                System.out.println("Result: You win!");
                wins++;
            } else {
                System.out.println("Result: You lose!");
                losses++;
            }

            System.out.print("\nPlay again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toLowerCase();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        showResults();
    }

    static void showResults() {
        System.out.println("\n===== Game Over =====");
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);
        System.out.println("=====================");
    }

   
}