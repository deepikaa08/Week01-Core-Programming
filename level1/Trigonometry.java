import java.util.Scanner;
public class Trigonometry{
	public static double[] func(double angle){
	double radian=angle*(Math.PI/180);
		double sine = Math.sin(radian);
		double cosine = Math.cos(radian);
		double tangent = Math.tan(radian);
		return new double[]{sine, cosine, tangent};
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter angle: ");
		double angle=input.nextDouble();
		double result[]=func(angle);
		System.out.println("The sine of the angle is "+result[0]+", cosine is "+result[1]+" and tangent is "+result[2]);
	}
}
