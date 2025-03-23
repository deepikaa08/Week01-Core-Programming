import java.util.Scanner;
public class NumberCheck{
	public static int count(int number){
		return String.valueOf(number).length();
	}
	public static int[] digitsarray(int number){
		int digitcount= count(number);
		int digits[]= new int[digitcount];
		for(int i=(digitcount-1); i>=0; i--){
			digits[i]=number%10;
			number/=10;
		}
		return digits;
	}
	public static boolean duckNumber(int number){
		int digits[]= digitsarray(number);
		for(int i=0; i<digits.length; i++){
			if(digits[i]==0)
				return true;
		}
		return false;
	}
	public static boolean armStrong(int number){
		int digits[]= digitsarray(number);
		int numDigits= digits.length;
		int sum=0, temp=number;
		for(int i=0;i<digits.length; i++){
			sum+=Math.pow(digits[i], numDigits);
		}
		return sum==temp;
	}
	public static int[] largest(int[] digits){
		int largest=Integer.MIN_VALUE, secondlargest=Integer.MIN_VALUE;
		for(int i=0; i<digits.length;i++){
			if(digits[i]>largest){
				secondlargest=largest;
				largest=digits[i];
			}
			else if(digits[i]>secondlargest&&digits[i]!=largest){
				secondlargest=digits[i];
			}
		}
		return new int[]{largest, secondlargest};
	}
	public static int[] smallest(int[] digits){
		int smallest=Integer.MAX_VALUE, secondsmallest=Integer.MAX_VALUE;
		for(int i=0; i<digits.length; i++){
			if(digits[i]<smallest){
				secondsmallest=smallest;
				smallest=digits[i];
			}
			else if(digits[i]<secondsmallest&&digits[i]!=smallest){
				secondsmallest=digits[i];
			}
		}
		return new int[]{smallest, secondsmallest};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int digitCount=count(number);
		System.out.println("The number of digits is: "+digitCount);
		int array[]=digitsarray(number);
		System.out.println("Digits are: ");
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Is Duck Number? "+duckNumber(number));
		System.out.println("Is Armstrong Number? "+armStrong(number));
		int largestnumber[]=largest(array);
		System.out.println("Largest: "+largestnumber[0]);
		System.out.println("Second Largest: "+largestnumber[1]);
		int smallestnumber[]=smallest(array);
		System.out.println("Smallest: "+smallestnumber[0]);
		System.out.println("Second Smallest: "+smallestnumber[1]);
		input.close();
	}
}

		
	