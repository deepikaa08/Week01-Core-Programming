import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter length: ");
		double length=input.nextDouble();
		System.out.print("Enter width: ");
		double width=input.nextDouble();
		double periMeter=(double)2*(length+width);
		System.out.println("Perimeter of rectangle is: "+periMeter);
	}
}