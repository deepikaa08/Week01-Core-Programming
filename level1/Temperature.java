import java.util.Scanner;
public class Temperature{
	public static double windchill(double temp, double windspeed){
		double speed = Math.pow(windspeed, 0.16);
		double chill=35.74+0.6215*temp+(0.4275*temp-35.75)*speed;
		return chill;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter temperature: ");
		double temp=input.nextDouble();
		System.out.print("Enter wind speed: ");
		double windspeed=input.nextDouble();
		double result=windchill(temp, windspeed);
		System.out.println("The wind chill temperature is "+result);
	}
}
