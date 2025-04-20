import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double x=input.nextDouble();
		System.out.print("Enter second number: ");
		double y=input.nextDouble();
		double add=(double)x+y;
		double subtract=(double)x-y;
		double multiply=(double)x*y;
		double divide=(double)x/y;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+x+" and "+y+" is "+add+", "+subtract+", "+multiply+" and "+divide);
	}
}
