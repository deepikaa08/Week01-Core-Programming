import java.util.Scanner;
public class Positivenegative{
	public static int sign(int n){
		if(n<0)
			return -1;
		else if(n==0)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int result=sign(n);
		if(result==1)
			System.out.println("The number is positive");
		else if(result==0)
			System.out.println("The number is zero");
		else
			System.out.println("The number is negative");
	}
}
