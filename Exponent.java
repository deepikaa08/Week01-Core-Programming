import java.util.Scanner;
public class Exponent{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter base number: ");
		double base=input.nextDouble();
		System.out.print("Enter exponent number: ");
		double power=input.nextDouble();
		double expo=Math.pow(base,power);
		System.out.println("The final number is: "+expo);
	}
}