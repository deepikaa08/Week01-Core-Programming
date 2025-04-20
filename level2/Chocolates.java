import java.util.Scanner;
public class Chocolates{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int numberOfchocolates=input.nextInt();
		System.out.print("Enter number of students: ");
		int numberOfstudents=input.nextInt();
		int getsChocolate=numberOfchocolates/numberOfstudents;
		int remainingChocolate=numberOfchocolates%numberOfstudents;
		System.out.println("The number of chocolates each child gets is "+getsChocolate+" and the number of remaining chocolates are "+remainingChocolate);
	}
}

