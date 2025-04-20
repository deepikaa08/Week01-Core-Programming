import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=input.nextInt();
		System.out.print("Enter second number: ");
		int b=input.nextInt();
		System.out.print("Enter third number: ");
		int c=input.nextInt();
		int firstOp=a+b*c;
		int secondOp=a*b+c;
		int thirdOp=c+a/b;
		int fourthOp=a%b+c;
		System.out.println("The results of Int Operations are "+firstOp+", "+secondOp+", "+thirdOp+" and "+fourthOp);
	}
}

		
		