import java.util.Scanner;
public class Yard{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter distance in feet: ");
		double feet=input.nextDouble();
		double yard=(double)feet/3;
		double mile=(double)yard/1760;
		System.out.println("The distance in feet is "+feet+" and in yard is "+yard+" and in miles is "+mile);
	}
}
