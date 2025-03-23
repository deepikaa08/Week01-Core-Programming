import java.util.Scanner;
public class Naturalnumbersum{
	public static int sum(int number){
		int sum=0;
		for(int i=1;i<=number;i++)
			sum+=i;
		return sum;
	}
	public static int formula(int number){
		int summation=0;
		summation=number*(number+1)/2;
		return summation;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.print("The sum of natural numbers by recursion is: "+sum(number));
		System.out.print("\nThe sum of natural numbers by formulae is: "+formula(number));
	}
}
