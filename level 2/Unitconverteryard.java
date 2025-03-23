import java.util.Scanner;
public class Unitconverteryard{
	public static double convertyards2feet(double yard){
		double yards2feet = 3;
		return yard*yards2feet;
	}
	public static double convertfeet2yard(double feet){
		double feet2yards = 0.333333;
		return feet*feet2yards;
	}
	public static double convertmeter2inches(double meter){
		double meters2inches = 39.3701;
		return meter*meters2inches;
	}
	public static double convertinches2meters(double inch){
		double inches2meters = 0.0254;
		return inch*inches2meters;
	}
	public static double convertinches2cm(double inch){
		double inches2cm = 2.54;
		return inch*inches2cm;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter yard: ");
		double yard=input.nextDouble();
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();
		System.out.print("Enter meter: ");
		double meter=input.nextDouble();
		System.out.print("Enter inch: ");
		double inch=input.nextDouble();
		System.out.println();
		System.out.println(yard+" yard ="+convertyards2feet(yard)+" feet");
		System.out.println(feet+" feet ="+convertfeet2yard(feet)+" yard");
		System.out.println(meter+" meter ="+convertmeter2inches(meter)+" inches");
		System.out.println(inch+" inches ="+convertinches2meters(inch)+" meter");
		System.out.println(inch+" inches ="+convertinches2cm(inch)+" cm");
	}
}