import java.util.Scanner;
public class Ageandheight{
	public static int findAge(int age1, int age2, int age3){
		return Math.min(age1, Math.min(age2, age3));
	}
	public static double findHeight(double h1,double h2, double h3){
		return Math.max(h1, Math.max(h2,h3));
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age[]=new int[3];
		double height[]=new double[3];
		System.out.print("Enter Amar's age: ");
		age[0]=input.nextInt();
		System.out.print("Enter Akbar's age: ");
		age[1]=input.nextInt();
		System.out.print("Enter Anthony's age: ");
		age[2]=input.nextInt();
		System.out.println();
		System.out.print("Enter Amar's height: ");
		height[0]=input.nextDouble();
		System.out.print("Enter Akbar's height: ");
		height[1]=input.nextDouble();
		System.out.print("Enter Anthony's height: ");
		height[2]=input.nextDouble();
		int resultAge=findAge(age[0],age[1],age[2]);
		double resultHeight=findHeight(height[0],height[1],height[2]);
		String youngest=(age[0]==resultAge)?"Amar":(age[1]==resultAge)?"Akbar":"Anthony";
		String tallest=(height[0]==resultHeight)?"Amar":(height[1]==resultHeight)?"Akbar":"Anthony";
		System.out.println("\nYoungest: "+youngest);
		System.out.println("Tallest: "+tallest);
	}
}
