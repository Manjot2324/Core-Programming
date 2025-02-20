import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();  

        String[][] gameResults = playGames(numGames, scanner);

        System.out.println("Game Results:");
        displayGameResults(gameResults);

        String[][] stats = calculateStats(gameResults);
        System.out.println("\nStatistics:");
        displayStats(stats);
    }

    public static String getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors") || 
                   userChoice.equals("paper") && computerChoice.equals("rock") || 
                   userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "player";
        } else {
            return "computer";
        }
    }

    public static String[][] playGames(int numGames, Scanner scanner) {
        String[][] results = new String[numGames][2];
        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i+1) + " - Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            System.out.print("Game " + (i+1) + " - Enter computer's choice (rock, paper, or scissors): ");
            String computerChoice = scanner.nextLine().toLowerCase();

            String winner = getWinner(userChoice, computerChoice);
            results[i][0] = winner;
            results[i][1] = computerChoice;
        }
        return results;
    }

    public static void displayGameResults(String[][] gameResults) {
        System.out.println("Game No. | Player's Result | Computer's Choice");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "       | " + gameResults[i][0] + "         | " + gameResults[i][1]);
        }
    }

    public static String[][] calculateStats(String[][] gameResults) {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < gameResults.length; i++) {
            if (gameResults[i][0].equals("player")) {
                playerWins++;
            } else if (gameResults[i][0].equals("computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        double playerPercentage = ((double) playerWins / gameResults.length) * 100;
        double computerPercentage = ((double) computerWins / gameResults.length) * 100;

        String[][] stats = new String[2][2];
        stats[0][0] = "Player Wins: " + playerWins;
        stats[0][1] = "Player Win Percentage: " + playerPercentage + "%";
        stats[1][0] = "Computer Wins: " + computerWins;
        stats[1][1] = "Computer Win Percentage: " + computerPercentage + "%";

        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player Stats:");
        System.out.println(stats[0][0]);
        System.out.println(stats[0][1]);
        System.out.println("Computer Stats:");
        System.out.println(stats[1][0]);
        System.out.println(stats[1][1]);
    }
}
