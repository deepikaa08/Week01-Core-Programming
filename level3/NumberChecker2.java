import java.util.Scanner;
public class NumberChecker2{
	public static boolean primeNumber(int number){
		if (number<2)
			return false;
		for(int i=2; i<number; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean neonNumber(int number){
		int square=number*number;
		int sum=0;
		while(square>0){
			sum+=square%10;
			square/=10;
		}
		return sum==number;
	}
	public static boolean spyNumber(int number){
		int sum=0, product=1, temp=number;
		while(temp>0){
			int digit=temp%10;
			sum+=digit;
			product*=digit;
			temp/=10;
		}
		return sum==product;
	}
	public static boolean isAutomorphic(int number){
		int square=number*number;
		int temp=number;
		while(temp>0){
			if(square%10!=temp%10){
				return false;
			}
		}
		return true;
	}
	public static boolean buzzNumber(int number){
		return (number%7==0||number%10==7);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.println("Is prime number? "+primeNumber(number));
		System.out.println("Is neon number? "+neonNumber(number));
		System.out.println("Is spy number? "+spyNumber(number));
		System.out.println("Is automorphic number? "+isAutomorphic(number));
		System.out.println("Is buzz number? "+buzzNumber(number));
	}
}
