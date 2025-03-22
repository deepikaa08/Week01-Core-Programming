import java.util.Scanner;
public class Maxdigits{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int digit[]=new int[10];
		int index=0;
		while(number!=0){
			int lastDigit=number%10;
			digit[index]=lastDigit;
			index++;
			number/=10;
			if(index==10){
			break;
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
