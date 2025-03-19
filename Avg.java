import java.util.Scanner;
public class Avg{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double firstNumber=input.nextDouble();
		System.out.print("Enter second number: ");
		double secondNumber=input.nextDouble();
		System.out.print("Enter third number: ");
		double thirdNumber=input.nextDouble();
		double average=(firstNumber+secondNumber+thirdNumber)/3;
		System.out.println("The average is: "+average);
	}
}