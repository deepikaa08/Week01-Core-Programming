import java.util.Scanner;
public class Calculator{
	public static int add(int a, int b){
		return a+b;
	}
	public static int subtraction(int a, int b){
		return a-b;
	}
	public static int multiplication(int a, int b){
		return a*b;
	}
	public static String division(int a, int b){
		if(b==0){
			return "error";
		}
		return String.valueOf(a/b);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=input.nextInt();
		System.out.print("Enter number 2: ");
		int b=input.nextInt();
		input.nextLine();
		System.out.print("Enter operation (+,-,*,/) : ");
		String operation=input.nextLine();
		switch (operation) {
            case "+":
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + subtraction(a, b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + multiplication(a, b));
                break;
            case "/":
                System.out.println(a + " / " + b + " = " + division(a, b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        input.close();
    }
}