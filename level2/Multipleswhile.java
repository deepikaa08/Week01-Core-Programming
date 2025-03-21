import java.util.Scanner;
public class Multipleswhile{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		if(n>0&&n<100){
			int i=100;
			while(i>1){
				if(i%n==0)
					System.out.println(i);
			i--;
			}
		}
		else
			System.out.println("Invalid Number");
	}
}