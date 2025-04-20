import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double i=input.nextDouble();
		System.out.print("Enter second number: ");
		double j=input.nextDouble();
		double k=i;
		i=j;
		j=k;
		System.out.println("The Swapped numbers are "+i+" and "+j);
	}
}