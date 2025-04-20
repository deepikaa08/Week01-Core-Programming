import java.util.Scanner;
public class Farenheittocelsius{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter temperature in farenheit: ");
		double farenheit=input.nextDouble();
		double celsiusResult=(farenheit-32)/1.8;
		System.out.println("The "+farenheit+" farenheit is "+celsiusResult+" celsius");
	}
}