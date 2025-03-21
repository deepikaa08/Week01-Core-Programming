import java.util.Scanner;
public class Factorialfor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.println("Factorial is: "+fact);
	}
}