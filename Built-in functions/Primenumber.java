import java.util.Scanner;
public class Primenumber{
	public static boolean checkPrime(int number){
		for(int i=2; i<number; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		boolean result=checkPrime(number);
		System.out.println("Is "+number+" a prime number? "+result);
	}
}
