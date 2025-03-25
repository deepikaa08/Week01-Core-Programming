import java.util.Scanner;
public class GcdAndLcm{
	public static int getGCD(int a, int b){
		while (b!=0){
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static int getLCM(int a, int b){
		return(a*b)/ getGCD(a,b);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=input.nextInt();
		System.out.print("Enter number 2: ");
		int b=input.nextInt();
		int gcd=getGCD(a,b);
		int lcm=getLCM(a,b);
		System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
		System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
	}
}
