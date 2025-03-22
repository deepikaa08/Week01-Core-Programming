import java.util.Scanner;
public class Fizzbuzzarray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.close();
		String array[]=new String[number];
		for(int i=1;i<=number;i++){
			if(i%3==0&&i%5==0){
				array[i-1]="FizzBuzz";
			}
			else if(i%3==0){
				array[i-1]="Fizz";
			}
			else if(i%5==0){
				array[i-1]="Buzz";
			}
			else{
				array[i-1]=Integer.toString(i);
			}
		}
		System.out. println("The result array is: ");
		for(int i=0;i<number;i++){
			System.out.println("Position "+(i+1)+" is "+array[i]+" ");
		}
	}
}
