import java.util.Scanner;
public class Weight{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds=input.nextDouble();
		double kilograms=(double)pounds*0.454;
		System.out.println(" The weight of the person in pound is "+pounds+" and in kg is "+kilograms);
	}
}