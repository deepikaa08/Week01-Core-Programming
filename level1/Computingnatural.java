import java.util.Scanner;
public class Computingnatural{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int i=0;
		int sum1=0, sum2=0;
		if(n>0){
			while(i<=n){
				sum1+=i;
				i++;
			}
			sum2=n*(n+1)/2;
			System.out.println((sum1==sum2)?"Both sums are equal":"Both sums are not equal");
			System.out.println("Sum1: "+sum1+" and Sum2: "+sum2);
		}
		else
			System.out.println("Its not natural number");
	}
}
