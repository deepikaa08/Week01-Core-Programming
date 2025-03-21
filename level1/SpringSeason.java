import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter month number: ");
		int month=input.nextInt();
		System.out.print("Enter day number: ");
		int day=input.nextInt();
		if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) ||  (month == 5 && day >= 1 && day <= 31) ||  (month == 6 && day >= 1 && day <= 20)){
			System.out.println("It's Spring");
		}
		else
			System.out.println("It's not Spring");
	}
}

		