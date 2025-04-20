import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a=input.nextDouble();
		System.out.print("Enter second number: ");
		double b=input.nextdouble();
		System.out.print("Enter third number: ");
		double c=input.nextDouble();
		double firstOp=a+b*c;
		double secondOp=a*b+c;
		double thirdOp=c+a/b;
		double fourthOp=a%b+c;
		System.out.println("The results of Int Operations are "+firstOp+", "+secondOp+", "+thirdOp+" and "+fourthOp);
	}
}