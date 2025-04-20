import java.util.Scanner;
public class Triangle{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter height in cm: ");
		double height=input.nextDouble();
		System.out.print("Enter base in cm: ");
		double base=input.nextDouble();
		double areaCm=(double)0.5*base*height;
		double heightInch=(double)height/2.54;
		double baseInch=(double)base/2.54;
		double areaInch=(double)0.5*baseInch*heightInch;
		System.out.println("The area of triangle in cm is "+areaCm+" and in inches is "+areaInch);
	}
}
