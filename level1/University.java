import java.util.Scanner;
public class University{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter fee amount: ");
		int fee=input.nextInt();
		System.out.print("Enter discount amount: ");
		double discountPercent=input.nextDouble();
		double discount=(double)fee*(discountPercent/100);
		double discountFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountFee);
	}
}
