import java.util.Scanner;
public class Temperature{
	public static double farenheitToCelsius(int farenheit){
		double result=(double)(farenheit-32)*5/9;
		return result;
	}
	public static double celsiusToFarenheit(int celsius){
		double result=(double)(celsius*1.8)+32;
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Choose (1) to calculate fahrenheit to celsius. \nChoose (2) to calculate celsius to fahrenheit: ");
		int n=input.nextInt();
		if(n==1){
			System.out.print("Enter fahrenheit: ");
			int farenheit=input.nextInt();
			double answer=farenheitToCelsius(farenheit);
			System.out.println(farenheit+" fahrenheit= "+answer+" celsius");
		}
		else if(n==2){
			System.out.print("Enter celsius: ");
			int celsius=input.nextInt();
			double answer=celsiusToFarenheit(celsius);
			System.out.println(celsius+" celsius= "+answer+" fahrenheit");
		}
		else{
			System.out.println("Invalid input!");
		}
	}
}
