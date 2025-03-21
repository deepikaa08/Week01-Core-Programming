import java.util.Scanner;
public class Sumuntilzero{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double total=0.0;
		System.out.print("Enter numbers : ");
		double number=input.nextDouble();
		while(number!=0){
			total+=number;
			System.out.print("Enter numbers : ");
		    number=input.nextDouble();
		}
		System.out.println(total);
	}
}
		
		
		