import java.util.Scanner;
public class Naturalsumfor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int sum1=0;
		if(n>0){
			for(int i=1;i<=n;i++)
				sum1+=i;
			int sum2=n*(n+1)/2;
			if(sum1==sum2)
				System.out.println("Both are equal");
			else
				System.out.println("Both are not equal");
			System.out.println("Sum1: "+sum1+" and Sum2: "+sum2);
		}
		else
			System.out.println("Its not natural number");
	}
}
