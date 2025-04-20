import java.util.Scanner;
public class Totalincome{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter salary: ");
		double salary=input.nextDouble();
		System.out.print("Enter bonus: ");
		double bonus=input.nextDouble();
		double totalincome=salary+bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence the total income is INR "+totalincome);
	}
}
