import java.util.Scanner;
public class UnitPrice{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter unit price of item: ");
		double unitPrice=input.nextDouble();
		System.out.print("Enter quantity of items: ");
		double quantity=input.nextDouble();
		double totalPrice=unitPrice*quantity;
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price of item is "+unitPrice);
	}
}
