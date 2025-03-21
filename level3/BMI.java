import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight in kilograms: ");
		double weight=input.nextDouble();
		input.nextLine();
		System.out.print("Enter height in centimeters: ");
		double height=input.nextDouble();
		input.nextLine();
		input.close();
		double h=height/100;
		double bmi=weight/(h*h);
		System.out.print("Your BMI is "+bmi+". ");
		if(bmi<=18.4)
			System.out.println("You are underweight");
		else if(bmi>=18.5&&bmi<=24.9)
			System.out.println("You are normal");
		else if(bmi>=25.0&&bmi<=39.9)
			System.out.println("You are overweight");
		else
			System.out.println("You are obese");
	}
}
