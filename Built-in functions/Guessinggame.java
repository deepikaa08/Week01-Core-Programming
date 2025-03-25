import java.util.Scanner;
public class Guessinggame{
	public static int generateNumber(int low, int high){
		return low+(int)(Math.random()*(high-low+1));
	}
	public static String getFeedback(Scanner input){
		System.out.print("Is the guess too high/too low/correct?");
		return input.nextLine().toLowerCase();
	}
	public static void playGame(){
		Scanner input=new Scanner(System.in);
		int low=1, high=100;
		boolean guessedCorrectly=false;
		 System.out.println("Think of a number between 1 and 100.");

        while (!guessedCorrectly) {
            int guess = generateNumber(low, high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback(input);
            if (feedback.equals("correct")) {
                System.out.println("Guessed your number: " + guess);
                guessedCorrectly = true;
            } 
			else if (feedback.equals("high")) {
                high = guess - 1;
            } 
			else if (feedback.equals("low")) {
                low = guess + 1;
            } 
			else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
    public static void main(String[] args) {
        playGame();
    }
}