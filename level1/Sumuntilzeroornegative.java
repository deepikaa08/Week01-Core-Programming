import java.util.Scanner;
public class Sumuntilzeroornegative{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double total=0.0;
		System.out.print("Enter numbers : ");
		double number=input.nextDouble();
		while(true){
			total+=number;
			System.out.print("Enter numbers : ");
		    number=input.nextDouble();
			if(number<=0){
				break;
			}
		}
		System.out.println(total);
	}
}