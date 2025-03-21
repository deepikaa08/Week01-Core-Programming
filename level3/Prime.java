import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.nextLine();
		input.close();
		boolean isPrime=true;
		if(number>0){
			for(int i=2;i<number;i++){
				if(number%i==0){
					isPrime=false;
					break;
				}
			}
		}
		else{
			isPrime=false;
		}
		if(isPrime)
			System.out.println(number+" is a Prime number");
		else
			System.out.println(number+" is not a Prime number");
	}
}
