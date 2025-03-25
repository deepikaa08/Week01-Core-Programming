import java.util.Scanner;
public class Fibonacci{
	public static void generateSeries(int n){
		int first=0, second=1;
		for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();
        if (numTerms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateSeries(numTerms);
        }
    }
}