import java.util.Scanner;
public class Frequency{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=input.nextInt();
		input.nextLine();
		input.close();
		int temp=n,count=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		int digits[]=new int[count];
		int freq[]=new int[10];
		for(int i=0;i<count;i++)
		{
			digits[i]=n%10;
			n/=10;
			freq[digits[i]]++;
		}
		System.out.println("\nDigit Frequency");
		for(int i=0;i<10;i++)
		{
			if(freq[i]>0)
				System.out.println("Digit "+i+":"+freq[i]);
		}
	}
}