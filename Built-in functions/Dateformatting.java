import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
public class Dateformatting{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a date(yyyy-mm-dd):");
		String inputDate=scanner.nextLine();
		scanner.close();
		LocalDate date=LocalDate.parse(inputDate);
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("Date of format(dd-MM-yyyy):"+date.format(format1));
		System.out.println("Date of format(yyyy-MM-dd):"+date.format(format2));
		System.out.println("Date of format(EEE,MMM dd,yyyy):"+date.format(format3));
	}
}