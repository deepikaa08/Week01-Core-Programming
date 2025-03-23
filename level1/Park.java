import java.util.Scanner;
public class Park{
	public static double rounds(double s1, double s2, double s3){
		double perimeter=(s1+s2+s3)/1000;
		double r=perimeter/5;
		return r;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter side 1 in meters: ");
		double s1=input.nextDouble();
		System.out.print("Enter side 2 in meters: ");
		double s2=input.nextDouble();
		System.out.print("Enter side 3 in meters: ");
		double s3=input.nextDouble();
		Park obj=new Park();
		double total=obj.rounds(s1,s2,s3);
		System.out.println("The number of rounds the man needs to take is "+total);
	}
}
