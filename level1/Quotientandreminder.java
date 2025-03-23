import java.util.Scanner;
public class Quotientandreminder{
	public static int[] findReminderandQuotient(int number, int divisor){
		int quotient=number/divisor;
		int reminder=number%divisor;
		return new int[]{quotient, reminder};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.print("Enter divisor: ");
		int divisor=input.nextInt();
		int result[]=findReminderandQuotient(number, divisor);
		System.out.print("The quotient is "+result[0]+" and the reminder is "+result[1]);
	}
}
