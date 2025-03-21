import java.util.Scanner;
public class Digit{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		input.nextLine();
		input.close();
		int count=0;
		int number=n;
		while(number!=0){
			int digit=number%10;
			count+=1;
			number/=10;
		}
		System.out.println("The number of digits in "+n+" is "+count);
	}
}