import java.util.Scanner;
public class Unitconverterfarenheit{
	public static double convertfarhenheit2celsius(double farenheit){
		double farhenheit2celsius = (farenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	public static double convertcelsius2farhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertpounds2kilograms(double pound){
		double pounds2kilograms = 0.453592;
		return pound*pounds2kilograms;
	}
	public static double convertkilograms2pounds(double kg){
		double kilograms2pounds = 2.20462;
		return kg*kilograms2pounds;
	}
	public static double convertgallons2liters(double gallon){
		double gallons2liters = 3.78541;
		return gallon*gallons2liters;
	}
	public static double convertliters2gallons(double liter){
		double liters2gallons = 0.264172;
		return liter*liters2gallons;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter farenheit: ");
		double farenheit=input.nextDouble();
		System.out.print("Enter celsius: ");
		double celsius=input.nextDouble();
		System.out.print("Enter pound: ");
		double pound=input.nextDouble();
		System.out.print("Enter kg: ");
		double kg=input.nextDouble();
		System.out.print("Enter gallons: ");
		double gallon=input.nextDouble();
		System.out.print("Enter liters: ");
		double liter=input.nextDouble();
		System.out.println();
		System.out.println(farenheit+" farenheit ="+convertfarhenheit2celsius(farenheit)+" celsius");
		System.out.println(celsius+" celsius ="+convertcelsius2farhenheit(celsius)+" farenheit");
		System.out.println(pound+" pounds ="+convertpounds2kilograms(pound)+" kg");
		System.out.println(kg+" kg ="+convertkilograms2pounds(kg)+" pounds");
		System.out.println(gallon+" gallons ="+convertgallons2liters(gallon)+" liters");
		System.out.println(liter+" liters ="+convertliters2gallons(liter)+" gallons");
	}
}