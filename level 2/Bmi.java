import java.util.Scanner;
public class Bmi{
	public static double calculatebmi(double kg, double height){
		double h=height/100;
		return kg/(h*h);
	}
	public static String status(double bmi){
		if (bmi<18.5)
			return "Underweight";
		else if(bmi>=18.5&&bmi<=24.9)
			return "Normal weight";
		else if(bmi>=25&&bmi<=29.9)
			return "Overweight";
		else
			return "Obese";
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double array[][]=new double[10][3];
		String result[]=new String[10];
		for(int i=0;i<10;i++){
			System.out.print("Enter weight of person "+(i+1)+": ");
			array[i][0]=input.nextDouble();
			System.out.print("Enter height of person "+(i+1)+": ");
			array[i][1]=input.nextDouble();
			array[i][2]=calculatebmi(array[i][0], array[i][1]);
			result[i]=status(array[i][2]);
		}
		System.out.println("Weight, Height, BMI, Status ");
		for(int i=0;i<10;i++){
			System.out.println(array[i][0]+"  "+array[i][1]+"  "+array[i][2]+"  "+result[i]);
		}
	}
}

		