import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius=input.nextDouble();
		System.out.print("Enter height: ");
		double height=input.nextDouble();
		double area=(double)3.14*radius*radius*height;
		System.out.println("Area of the circle is: "+area);
	}
}
