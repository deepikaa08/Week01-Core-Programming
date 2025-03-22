import java.util.Scanner;
public class Bmi2D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number of persons:");
		int n=input.nextInt();
		input.nextLine();
		double details[][]=new double[n][3];
		String weightStatus[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of person "+(i+1)+":");
			System.out.print("Enter height in m:");
			details[i][0]=input.nextDouble();
			input.nextLine();
			while(details[i][0]<=0)
			{
				System.out.print("Invalid number.!Please enter a positive height:");
				details[i][0]=input.nextDouble();
				input.nextLine();
			}
			System.out.print("Enter weight in kg:");
			details[i][1]=input.nextDouble();
			input.nextLine();
			while(details[i][1]<=0)
			{
				System.out.print("Invalid number.!Please enter a positive weight:");
				details[i][0]=input.nextDouble();
				input.nextLine();
			}
		}
		input.close();
		for(int i=0;i<n;i++)
		{
                  details[i][2]=details[i][1]/(details[i][0]*details[i][1]);
			if(details[i][2]<=18.4)
				weightStatus[i]="Underweight";
			else if(details[i][2]>18.5&&details[i][3]<=24.9)
				weightStatus[i]="Normal";
			else if(details[i][2]>25.0&&details[i][3]<=39.9)
				weightStatus[i]="Overweight";
			else
				weightStatus[i]="Obese";	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nDetails of person "+(i+1));
			System.out.println("Height:"+details[i][0]);
			System.out.println("Weight:"+details[i][1]);
			System.out.println("BMI:"+details[i][2]);
			System.out.println("Weight Status:"+weightStatus[i]);
		}
	}
}