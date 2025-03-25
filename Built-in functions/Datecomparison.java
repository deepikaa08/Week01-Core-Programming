import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
public class Datecomparison{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first date(yyyy-MM-dd):");
		String firstDateInput=scanner.nextLine();
		System.out.print("Enter second date(yyyy-MM-dd):");
		String secondDateInput=scanner.nextLine();
		scanner.close();
		LocalDate firstDate=LocalDate.parse(firstDateInput);
		LocalDate secondDate=LocalDate.parse(secondDateInput);
		if(firstDate.isBefore(secondDate))
			System.out.println("The first date is before the second date.");
		else if(firstDate.isAfter(secondDate))
			System.out.println("The first date is after the second date.");
		else if(firstDate.isEqual(secondDate))
			System.out.println("The first date and seconds date are same.");
	}
}