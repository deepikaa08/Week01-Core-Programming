import java.util.Scanner;
public class EmployeeBonus{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary=input.nextInt();
		System.out.print("Enter year of service: ");
		int year=input.nextInt();
		if(year>5){
			double bonus=(double)(0.05*salary)+salary;
		    System.out.println("The bonus is "+bonus);
		}
		else
			System.out.println("Not eligible");
	}
}