import java.util.Scanner;
public class Positivenegative{
	public static int isPositive(int number){
		return (number>0)? 1: (number==0)?0:-1;
	}
	public static int isEven(int number){
		return (number%2==0)?1:0;
	}
	public static int compare(int number1, int number2){
		if (number1>number2)
			return 1;
		else if(number1==number2)
			return 0;
		else 
			return -1;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int array[]=new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter number: ");
			array[i]=input.nextInt();
		}
		for(int i=0; i<5;i++){
			if(isPositive(array[i])==1){
				System.out.println(array[i]+" is positive and "+((isEven(array[i])==1)?"even":"odd"));
			}
			else if(isPositive(array[i])==-1)
				System.out.println(array[i]+" is negative");
			else
				System.out.println(array[i]+" is zero");
		}
	}
}
