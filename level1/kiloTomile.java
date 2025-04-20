import java.util.Scanner;
public class kiloTomile {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter kilometer: ");
		double km=input.nextDouble();
		double mile=(double)km*0.6;
		System.out.println("The total miles is "+mile+" mile for the given "+km+ "km");
	}
}
