import java.util.Scanner;
public class Factorial{
	public static int recursion(int number){
		int temp=1;
		for(int i=1; i<=number; i++){
			temp*=i;
		}
		return temp;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int result=recursion(number);
		System.out.println("The factorial of "+number+" is : "+result);
	}
}
