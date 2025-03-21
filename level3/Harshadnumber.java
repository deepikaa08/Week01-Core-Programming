import java.util.Scanner;
public class Harshadnumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.nextLine();
		input.close();
		int sum=0;
		int n=number;
		while(number!=0){
			int digit=number%10;
			sum+=digit;
			number/=10;
		}
		if(n%sum==0)
			System.out.println(n+" is a Harshad Number");
		else
			System.out.println(n+" is a Harshad Number");
	}
}
