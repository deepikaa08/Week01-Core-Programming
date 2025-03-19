import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius=input.nextDouble();
		double area=(double)3.14*radius*radius;
		System.out.println("Area of the circle is: "+area);
	}
}
