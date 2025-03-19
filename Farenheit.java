import java.util.Scanner;
public class Farenheit{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter celsius: ");
		double celsius=input.nextDouble();
		double farenheit=(double)(celsius*(1.8))+32;
		System.out.println("The farenheit is "+farenheit);
	}
}
