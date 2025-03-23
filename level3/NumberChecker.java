import java.util.Scanner;
public class NumberChecker{
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
	public static int sum(int number){
		int sum1=0;
		int[] digits=digitsarray(number);
		for(int n: digits){
			sum1+=n;
		}
		return sum1;
	}
	public static int sumofsquare(int number){
		int sumsquare=0;
		int[] digits=digitsarray(number);
		for(int n:digits){
			sumsquare+=Math.pow(n,2);
		}
		return sumsquare;
	}
	public static boolean harshad(int number){
		int sum2=sum(number);
		return number%sum2==0;
	}
	public static int[][] frequency(int number){
		int digits[]= digitsarray(number);
		int frequency[]=new int[10];
		for(int n:digits){
			frequency[n]++;
		}
		int count=0;
		for(int i=0; i<10;i++){
			if(frequency[i]>0)
				count++;
		}
		int[][] freqarray=new int[count][2];
		int index=0;
		for(int i=0; i<10;i++){
			if(frequency[i]>0){
				freqarray[index][0]=i;
				freqarray[index][1]=frequency[i];
				index++;
			}
		}
		return freqarray;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.println("Number of digits: "+count(number));
		System.out.println("Digits are: "+Arrays.toString(digitsarray(number)));
		System.out.println("Sum of digits: "+sum(number));
		System.out.println("Sum of squares of digits: "+sumofsquare(number));
		System.out.println("IS harshad number? "+harshad(number));
		System.out.println("Frequency of digits is: ");
		int[][] freq=frequency(number);
		for(int i=0;i<freq.length;i++){
			System.out.println("Digit "+freq[i][0]+" appears "+freq[i][1]+" times.");
		}
	}
}
