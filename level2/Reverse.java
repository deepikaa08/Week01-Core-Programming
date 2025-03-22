import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.close();
		int temp=number, count=0;
		while(temp!=0){
			count++;
			temp/=10;
		}
		int digit[]=new int[count];
		for(int i=0;i<count;i++){
			digit[i]=number%10;
			number/=10;
		}
		int reverse[]=new int[count];
		for(int i=0; i<count;i++){
			reverse[i]=digit[count-1-i];
		}
		System.out.print("The digits are ");
		for(int i=0;i<count;i++)
			System.out.print(reverse[count-1-i]);
	}
}
