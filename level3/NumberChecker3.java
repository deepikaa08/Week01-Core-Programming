import java.util.Scanner;
public class NumberChecker3{
	public static int countFactor(int number){
		int count=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				count++;
			}
		}
		return count;
	}
	public static int[] factors(int number){
		int size=countFactor(number);
		int array[]=new int[size];
		int index=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				array[index++]=i;
			}
		}
		return array;
	}
	public static int maxFactor(int number){
		int factor[]=factors(number);
		return factor[factor.length-2];
	}
	public static int sumOffactors(int number){
		int sum=0;
		for(int n: factors(number)){
			sum+=n;
		}
		return sum;
	}
	public static int productOffactors(int number){
		int product=1;
		for(int n: factors(number)){
			product*=n;
		}
		return product;
	}
	public static int cubeproduct(int[] factors){
		int cubeprod=1;
		for(int i=0; i<factors.length; i++){
			cubeprod*=Math.pow(factors[i],3);
		}
		return cubeprod;
	}
	public static boolean perfectNumber(int number){
		int sum=0;
		int factor[]=factors(number);
		for(int i=0; i<(factor.length-1); i++){
			sum+=factor[i];
		}
		return sum==number;
	}
	public static boolean abundantNumber(int number){
		int sum=0;
		int factor[]=factors(number);
		for(int i=0; i<(factor.length-1); i++){
			sum+=factor[i];
		}
		return sum>number;
	}
	public static boolean deficientNumber(int number){
		int sum=0;
		int factor[]=factors(number);
		for(int i=0; i<factor.length-1; i++)
			sum+=factor[i];
		return sum<number;
	}
	public static int factorial(int number){
		int fact=1;
		for(int i=1; i<=number; i++)
			fact*=i;
		return fact;
	}
	public static boolean strongNumber(int number){
		int sum=0, temp=number;
		while(temp>0){
			sum+=factorial(temp%10);
			temp/=10;
		}
		return sum==number;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int factorsarray[]= factors(number);
		System.out.print("Factors are: ");
		for(int n:factorsarray)
			System.out.print(n+" ");
		System.out.println();
		System.out.println("The greatest factor is: "+maxFactor(number));
		System.out.println("The sum of factors is: "+sumOffactors(number));
		System.out.println("The product of factors is: "+productOffactors(number));
		System.out.println("The product of cubes of factors is: "+cubeproduct(factorsarray));
		System.out.println("Is a perfect number? "+perfectNumber(number));
		System.out.println("Is an abundant number? "+abundantNumber(number));
		System.out.println("Is a deficient number? "+deficientNumber(number));
		System.out.println("Is a strong number? "+strongNumber(number));
	}
}
