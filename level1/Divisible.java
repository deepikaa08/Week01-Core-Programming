import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		double number=input.nextDouble();
		String result=(number%5==0)?"Yes":"No";
		System.out.println("Is the number "+number+" divisible by 5? "+result);
	}
}
