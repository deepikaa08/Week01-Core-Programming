import java.util.Scanner;
public class Switchcase{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first=input.nextInt();
		input.nextLine();
		System.out.print("Enter second number: ");
		int second=input.nextInt();
		input.nextLine();
		System.out.print("Enter operator (+,-,*,/): ");
		String op=input.nextLine();
		input.close();
		switch (op)
		{
			case "+":
				int add=first+second;
				System.out.println("The addition of "+first+" and "+second+" is "+add);
				break;
			case "-":
				int sub=first-second;
				System.out.println("The subtraction of "+first+" and "+second+" is "+sub);
				break;
			case "*":
				int mul=first*second;
				System.out.println("The multiplication of "+first+" and "+second+" is "+mul);
				break;
			case "/":
				if(second==0){
					System.out.println("Error in division");
				}
				else{
					int div=first/second;
					System.out.println("The division of "+first+" and "+second+" is "+div);
				}
				break;
			default:
				System.out.println("Invalid operator");
		}
	}
}
