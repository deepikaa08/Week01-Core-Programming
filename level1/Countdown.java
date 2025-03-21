import java.util.Scanner;
public class Countdown{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		while(num>0){
			System.out.println(num);
			num=--num;
		}
	}
}
