import java.util.Scanner;
public class Maxdigitsdynamic{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int maxDigit=10;
		int digit[]=new int[maxDigit];
		int index=0;
		while(number!=0){
			int lastDigit=number%10;
			digit[index]=lastDigit;
			index++;
			number/=10;
			if(index==maxDigit){
				maxDigit+=10;
				int temp[]=new int[maxDigit];
				for(int i=0;i<index;i++)
					temp[i]=digit[i];
				digit=temp;
			}
		}
		int largest=-1, secondLargest=-1;
		for(int i=0;i<index; i++){
			if(digit[i]>largest){
				secondLargest=largest;
				largest=digit[i];
			}
			else if(digit[i]>secondLargest&&digit[i]!=largest){
				secondLargest=digit[i];
			}
		}
		System.out.println("largest number is "+largest);
		if(secondLargest!=-1)
			System.out.println("The second largest number is "+secondLargest);
		else
			System.out.println("All the numbers are the same");
	}
}
