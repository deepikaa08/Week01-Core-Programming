import java.util.Scanner;
public class Heightandage{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age[]= new int[3];
		double height[]=new double[3];
		System.out.println("Enter Amar's age: ");
		age[0]=input.nextInt();
		System.out.println("Enter Akbar's age: ");
		age[1]=input.nextInt();
		System.out.println("Enter Anthony's age: ");
		age[2]=input.nextInt();
		if((age[0]<age[1])&&(age[0]<age[2])){
			System.out.println("Amar's the youngest");
		}
		else if((age[1]<age[0])&&(age[1]<age[2]))
			System.out.println("Akbar's the youngest");
		else
		System.out.println("Anthony's the youngest");
		System.out.println("Enter Amar's height: ");
		height[0]=input.nextDouble();
		System.out.println("Enter Akbar's height: ");
		height[1]=input.nextDouble();
		System.out.println("Enter Anthony's height: ");
		height[2]=input.nextDouble();
		if((height[0]>height[1])&&(height[0]>height[2])){
			System.out.println("Amar's the tallest");
		}
		else if((height[1]>height[0])&&(height[1]>height[2]))
			System.out.println("Akbar's the tallest");
		else
			System.out.println("Anthony's the tallest");
	}
}