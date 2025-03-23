import java.util.Scanner;
public class  SI{
	public static double si(double principle, double rate, int time){
		double si=(principle*rate*time)/100;
		return si;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter principle amount: ");
		double p=input.nextDouble();
		System.out.print("Enter rate: ");
		double r=input.nextDouble();
		System.out.print("Enter time in years: ");
		int t=input.nextInt();
		SI obj=new SI();
		double si=obj.si(p,r,t);
		System.out.println("Simple interest is: "+si);
	}
}
