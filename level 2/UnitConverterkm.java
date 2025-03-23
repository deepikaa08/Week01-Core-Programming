import java.util.Scanner;
public class UnitConverterkm{
	public static double convertkm2miles(double km){
		double km2mile=0.621371;
		return km*km2mile;
	}
	public static double convertmile2km(double mile){
		double miles2km = 1.60934;
		return mile*miles2km;
	}
	public static double convertmeter2feet(double meter){
		double meters2feet = 3.28084;
		return meter*meters2feet;
	}
	public static double convertfeet2meters(double feet){
		double feet2meters = 0.3048;
		return feet*feet2meters;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter km: ");
		double km=input.nextDouble();
		System.out.print("Enter mile: ");
		double mile=input.nextDouble();
		System.out.print("Enter meter: ");
		double meter=input.nextDouble();
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();
		System.out.println();
		System.out.println(km+" km ="+convertkm2miles(km)+" miles");
		System.out.println(mile+" miles ="+convertmile2km(mile)+" km");
		System.out.println(meter+" meter ="+convertmeter2feet(meter)+" feet");
		System.out.println(feet+" feet ="+convertfeet2meters(feet)+" meter");
	}
}