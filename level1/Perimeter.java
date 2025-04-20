import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter perimeter of square: ");
		double perimeter=input.nextDouble();
		double side=(double)perimeter/4;
		System.out.println("The length of side is "+side+" whose perimeter is "+perimeter);
	}
}
