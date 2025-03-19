import java.util.Scanner;
public class Kilotomiles{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
		double kiloMeters=input.nextDouble();
		double mileS=kiloMeters*0.621371;
		System.out.println("The distance in miles is: "+mileS);
	}
}
