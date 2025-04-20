import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter temperature in celsius: ");
		double celsius=input.nextDouble();
		double farenheit=(celsius*1.8)+32;
		System.out.println("The "+celsius+" celsius is "+farenheit+" farenheit");
	}
}
