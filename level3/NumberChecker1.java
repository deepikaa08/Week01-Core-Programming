import java.util.Scanner;
public class NumberChecker1{
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
	public static int[] reversedigits(int number){
		int digitcount= count(number);
		int digits[]= new int[digitcount];
		for(int i=0; i<digits.length; i++){
			digits[i]=number%10;
			number/=10;
		}
		return digits;
	}
	public static boolean compare(int number){
		int array1[]=digitsarray(number);
		int array2[]=reversedigits(number);
		if(array1==array2)
			return true;
		else 
			return false;
	}
	public static String palindrome(int number){
		int array1[]=digitsarray(number);
		int array2[]=reversedigits(number);
		if(array1==array2)
			return "It is palindrome";
		else
			return "It is not palindrome";
	}
	public static boolean duckNumber(int number){
		int digits[]= digitsarray(number);
		for(int i=0; i<digits.length; i++){
			if(digits[i]==0)
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.println("Number of digits: "+count(number));
		int arrays[]=digitsarray(number);
		System.out.println("Digits are: ");
		for(int i=0; i<arrays.length;i++){
			System.out.print(arrays[i]+" ");
		}
		System.out.println("\nAre the arrays equal?: "+compare(number));
		System.out.println("Is it a palindrome? "+palindrome(number));
		System.out.println("Is Duck Number? "+duckNumber(number));
	}
}