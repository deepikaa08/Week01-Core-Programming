import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number of persons:");
		int n=input.nextInt();
		input.nextLine();
		double height[]=new double[n];
		double weight[]=new double[n];
		double bmi[]=new double[n];
		String weightStatus[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of person "+(i+1)+":");
			System.out.print("Enter height in m:");
			height[i]=input.nextDouble();
			input.nextLine();
			System.out.print("Enter weight in kg:");
			weight[i]=input.nextDouble();
			input.nextLine();
		}
		input.close();
		for(int i=0;i<n;i++)
		{
			bmi[i]=weight[i]/(height[i]*height[i]);
			if(bmi[i]<=18.4)
				weightStatus[i]="Underweight";
			else if(bmi[i]>18.5&&bmi[i]<=24.9)
				weightStatus[i]="Normal";
			else if(bmi[i]>25.0&&bmi[i]<=39.9)
				weightStatus[i]="Overweight";
			else 
				weightStatus[i]="Obese";	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nDetails of person "+(i+1));
			System.out.println("Height:"+height[i]);
			System.out.println("Weight:"+weight[i]);
			System.out.println("BMI:"+bmi[i]);
			System.out.println("Weight Status:"+weightStatus[i]);
		}
	}
}