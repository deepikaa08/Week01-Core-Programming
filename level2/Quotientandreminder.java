import java.util.Scanner;
public class Quotientandreminder{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double firstNumber=input.nextDouble();
		System.out.print("Enter second number: ");
		double secondNumber=input.nextDouble();
		double quotient=firstNumber/secondNumber;
		double reminder=firstNumber%secondNumber;
		System.out.println("The quotient is "+quotient);
		System.out.println("The reminder is "+reminder);
	}
}
