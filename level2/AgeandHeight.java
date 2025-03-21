import java.util.Scanner;
public class AgeandHeight{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Amar's age: ");
		int a=input.nextInt();
		System.out.print("Enter Akbar's age: ");
		int b=input.nextInt();
		System.out.print("Enter Anthony's age: ");
		int c=input.nextInt();
		if(a<b&&a<c)
			System.out.println("Amar is the youngest");
		else if(b<a&&b<c)
			System.out.println("Akbar is the youngest");
		else
			System.out.println("Anthony is the youngest");
		System.out.print("Enter Amar's height in centimeters: ");
		double x=input.nextDouble();
		System.out.print("Enter Akbar's height in centimeters: ");
		double y=input.nextDouble();
		System.out.print("Enter Anthony's height in centimeters: ");
		double z=input.nextDouble();

		if(x>y&&x>z)
			System.out.println("Amar is the tallest");
		else if(y>x&&y>z)
			System.out.println("Akbar is the tallest");
		else
			System.out.println("Anthony is the tallest");
	}
}
