import java.util.Scanner;
public class Factors{
	public static int[] findfactor(int number){
		int count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0)
				count++;
		}
		int factors[]=new int[count];
		int index=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factors[index]=i;
				index++;
			}	
		}
		return factors;
	}
	public static int sumoffactors(int[] factors){
		int sum=0;
		for(int factor : factors)
			sum+=factor;
		return sum;
	}
	public static int productoffactors(int[] factors){
		int product=1;
		for(int number:factors)
			product*=number;
		return product;
	}
	public static int sumofsquares(int[] factors){
		int sum=0;
		for(int numbers:factors)
			sum+=Math.pow(numbers, 2);
		return sum;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int result[]=findfactor(number);
		System.out.println("The factors are ");
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+", ");
		System.out.println();
		System.out.println("Sum of factors: "+sumoffactors(result));
		System.out.println("Product of factors: "+productoffactors(result));
		System.out.println("Sum of square of factors: "+sumofsquares(result));
	}
}

