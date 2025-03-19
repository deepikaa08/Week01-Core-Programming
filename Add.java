import java.util.Scanner;
public class Add {
	public static void main (String[] args) {
		Scanner x = new Scanner (System.in);
		System.out.print("Enter first number: "); 
		int a = x.nextInt();
		System.out.print("Enter second number: ");
		int b = x.nextInt();
		int c;
		c = a+b;
		System.out.println("Sum of the numbers is: " + c);
	}
}

