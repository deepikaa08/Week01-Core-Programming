import java.util.Scanner;
public class Maximumof3{
	public static int largest(int n1, int n2, int n3){
		return Math.max(n1, Math.max(n2,n3));
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int n1=input.nextInt();
		System.out.print("Enter number 2: ");
		int n2=input.nextInt();
		System.out.print("Enter number 3: ");
		int n3=input.nextInt();
		int result=largest(n1,n2,n3);
		System.out.println("The maximum of 3 numbers is "+result);
	}
}
