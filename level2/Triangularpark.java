import java.util.Scanner;
public class Triangularpark{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter side 1 distance: ");
		double side1=input.nextDouble();
		System.out.print("Enter side 2 distance: ");
		double side2=input.nextDouble();
		System.out.print("Enter side 3 distance: ");
		double side3=input.nextDouble();
		double perimeter=side1+side2+side3;
		double numberofruns=perimeter/5000;
		System.out.println(" The total number of rounds the athlete will run is "+numberofruns+" to complete 5 km");
	}
}

