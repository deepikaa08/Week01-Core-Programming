import java.util.Scanner;
public class SmallandLarge{
	public static int[] findSmallAndLarge(int number1, int number2, int number3){
		int smallest=Math.min(number1, Math.min(number2, number3));
		int largest=Math.max(number1, Math.max(number2, number3));
		return new int[]{smallest, largest};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1=input.nextInt();
		System.out.print("Enter number 2: ");
		int number2=input.nextInt();
		System.out.print("Enter number 3: ");
		int number3=input.nextInt();
		int result[]=findSmallAndLarge(number1, number2, number3);
		System.out.println("Smallest number: "+result[0]);
		System.out.println("Largest number: "+result[1]);
	}
}
