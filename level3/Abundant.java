import java.util.Scanner;
public class Abundant{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.nextLine();
		input.close();
		int sum=0;
		int n=number;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(sum>n)
			System.out.println(n+" is an Abundant number");
		else
			System.out.println(n+" is not an Abundant number");
	}
}
