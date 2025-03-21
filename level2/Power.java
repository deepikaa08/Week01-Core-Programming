import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		System.out.print("Enter power: ");
		int power=input.nextInt();
		int result=1;
		if(number>0&&power>0){
			for(int i=1;i<=power;i++){
				result*=number;
			}
		System.out.println(result);
		}
		else
			System.out.println("Invalid number");
	}
}

		