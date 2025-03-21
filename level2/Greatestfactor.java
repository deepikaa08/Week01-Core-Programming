import java.util.Scanner;
public class Greatestfactor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		if(n>0){
			for(int i=n-1;i>1;i--){
				if(n%i==0){
					System.out.println(i);
					break;
				}
			}
		}
		else
			System.out.println("Invalid number");
	}
}