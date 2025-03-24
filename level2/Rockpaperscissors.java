import java.util.Scanner;
public class Rockpaperscissors{
	public static String getComputerChoice(){
		int choice=(int)(Math.random()*3);
		return (choice==0) ? "Rock" : (choice==1) ? "Paper" : "Scissors" ;
	}
	public static String getWinner(String user, String computerChoice){
		if(user.equals(computerChoice)){
			return "Draw";
		}
		else if((user.equals("Rock")&&computerChoice.equals("Scissors"))||(user.equals("Paper")&&computerChoice.equals("Rock"))||(user.equals("Scissors")&&computerChoice.equals("Paper"))){
			return "User";
		}
		else{
			return "Computer";
		}
	}
	public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userWinPercent = (userWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;

        String[][] stats = {
            {"Total Games", String.valueOf(totalGames)},
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws)},
            {"User Win %", String.format("%.2f%%", userWinPercent)},
            {"Computer Win %", String.format("%.2f%%", computerWinPercent)}
        };

        return stats;
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nGame Results:");
        System.out.println("-------------------------------------------------");
        System.out.println("Game No | User Choice | Computer Choice | Winner");
        System.out.println("-------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%7s | %11s | %15s | %6s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // Method to display final stats
    public static void displayStats(String[][] stats) {
        System.out.println("\nFinal Statistics:");
        System.out.println("----------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s | %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of games
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] gameResults = new String[numGames][4];
        int userWins = 0, computerWins = 0, draws = 0;

        // Game loop
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.nextLine().trim();

            // Validate user input
            while (!userChoice.equalsIgnoreCase("Rock") &&
                   !userChoice.equalsIgnoreCase("Paper") &&
                   !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid choice! Enter Rock, Paper, or Scissors: ");
                userChoice = scanner.nextLine().trim();
            }

            userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase(); // Formatting
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            // Update counts
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            // Store results
            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        scanner.close(); // Close scanner

        // Display results and stats
        displayResults(gameResults);
        String[][] stats = calculateStats(userWins, computerWins, draws, numGames);
        displayStats(stats);
    }
}