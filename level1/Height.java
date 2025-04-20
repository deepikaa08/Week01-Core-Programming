import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter height in cm: ");
		double centiMeter=input.nextDouble();
		double inch=(double)centiMeter/2.54;
		double feet=(double)inch/12;
		System.out.println("Your height in cm is "+centiMeter+" while in feet is "+feet+" and inches is "+inch);
	}
}

		
	