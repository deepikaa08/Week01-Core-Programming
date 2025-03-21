import java.util.Scanner;
public class PowerWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.print("Enter power: ");
		int power=input.nextInt();
		int result=1;
		if(number>0&&power>0){
			int i=1;
			while(i<=power){
				result*=number;
				i++;
			}
		System.out.println(result);
		}
		else
			System.out.println("Invalid number");
	}
}