import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int fact=1;
		while(n>0){
			fact*=n;
		    n--;
		}
		System.out.println("Factorial is: "+fact);
	}
}